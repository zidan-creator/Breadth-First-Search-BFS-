import java.util.Vector;
class Node {
     int[] state = new int[9];
     int cost;
     Node parent = null;
     Vector<Node> successors = new Vector<Node>();
     Node(int s[], Node parent) {
         this.parent = parent;
         for (int i = 0; i < 9; i++) state[i] = s[i];
     }
     public String toString() {
         String s = "";
         for (int i = 0; i < 9; i++) {
         s = s + state[i] + " "; }
         return s;
     }

     public boolean equals(Object node) {
         Node n = (Node)node;
         boolean result = true;
         for (int i = 0; i < 9; i++) {
         if (n.state[i] != state[i]) result = false; }
         return result;
     }
     Vector<Node> getPath(Vector<Node> v) {
         v.insertElementAt(this, 0);
         if (parent != null) v = parent.getPath(v);
         return v;
 }
 Vector<Node> getPath() {
 return getPath(new Vector<Node>()); 
 }
}

public class EightPuzzleSearch {
     EightPuzzleSpace space = new EightPuzzleSpace();

     Vector<Node> open = new Vector<Node>();
     Vector<Node> closed = new Vector<Node>();
     int h1Cost(Node node) {
         int cost = 0;
         for (int i = 0; i < node.state.length; i++) {
         if (node.state[i] != i) cost++; }
         return cost;
     }
     int h2Cost(Node node) {
         int cost = 0;
         int state[] = node.state;
         for (int i = 0; i < state.length; i++) {
             int v0 = i, v1 = state[i];
            /*tidak menghitung ubin yang kosong */
             if (v1 == 0) continue; 
             int row0 = v0 / 3, col0 = v0 % 3, row1 = v1 / 3, col1 = v1 % 3;
             int c=(Math.abs(row0-row1)+Math.abs(col0-col1));
             cost += c; 
     }
     return cost;
 }
/*boleh diubah dengan memakai heuristic h1 atau h2 */
    int hCost(Node node) { 
        return h2Cost(node);
 }
 
 Node getBestNode(Vector nodes) {
     int index = 0, minCost = Integer.MAX_VALUE;
     for (int i = 0; i < nodes.size(); i++) {
         Node node = (Node)nodes.elementAt(i);
         if (node.cost < minCost) {
         minCost = node.cost;
         index = i; } }
     Node bestNode = (Node)nodes.remove(index);
     return(bestNode);
}
 int getPreviousCost(Node node) {
     int i = open.indexOf(node);
     int cost = Integer.MAX_VALUE;
     if (i != -1) {
     cost = open.get(i).cost; }
     else {
     i = closed.indexOf(node);
     if (i != -1) cost = closed.get(i).cost; }
     return(cost);
 }
 void printPath(Vector path) {
    for (int i = 0; i < path.size(); i++) {
     System.out.print(" " + path.elementAt(i) + "\n"); }
 }
 void run() {
     Node root = space.getRoot();
     Node goal = space.getGoal();
     Node solution = null;
     open.add(root);
     System.out.print("\nRoot: " + root + "\n\n");
     while (open.size() > 0) {
         Node node = getBestNode(open);
         int pathLength = node.getPath().size();
         closed.add(node);
         if (node.equals(goal)) { 
            solution = node; 
            break; 
}
 Vector<Node> successors = 
                space.getSuccessors(node);
 for (int i = 0; i < successors.size(); i++) {
    Node successor = successors.get(i);
    int cost = hCost(successor)+pathLength+1;
    int previousCost;
    previousCost = getPreviousCost(successor);
    boolean inClosed;
    inClosed = closed.contains(successor);
    boolean inOpen = open.contains(successor);
 
if(!(inClosed||inOpen)||cost<previousCost) 
{
       if(inClosed) closed.remove(successor);
       if (!inOpen) open.add(successor);
       successor.cost = cost;
       successor.parent = node;
       }
    }
 }
 // new TreePrint(getTree(root));
 if (solution != null) {
 Vector path = solution.getPath();
 System.out.print("\nSolution found\n");
 printPath(path); 
 }
}
 
 public static void main(String args[]) { 
    // melakukan pencarian
    new EightPuzzleSearch().run();
 }
}
