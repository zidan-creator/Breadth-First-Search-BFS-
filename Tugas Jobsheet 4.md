Tugas Jobsheet 4

1. Tentukan bagaimana algoritma BFS di atas dapat menentukan node ke 8, 6, dan 7.
Jawab
(3,d=0) (4,d=1) (2,d=1) (5,d=2) (6,d=2) (1,d=2) (7,d=3) (8,d=3)

Hasil diatas menggunakan format (node, d=jarak) jadi untuk
(3, d=0): Ini adalah node awal dari pencarian, jadi jaraknya adalah 0.
(4, d=1): Node 4 adalah tetangga langsung dari node 3. Jaraknya adalah 1.
(2, d=1): Node 2 juga merupakan tetangga langsung dari node 3. Jaraknya juga 1.
(5, d=2): Node 5 terhubung dengan node 4 (jarak 1 dari node 3) dalam satu langkah lagi
sehingga jaraknya adalah 2.
(6, d=2): Node 6 juga terhubung dengan node 4 (juga jarak 1 dari node 3) dalam satu langkah lagi
sehingga jaraknya adalah 2.
(1, d=2): Node 1 terhubung dengan node 2 (jarak 1 dari node 3) dalam dua langkah
sehingga jaraknya adalah 2.
(7, d=3): Node 7 terhubung dengan node 5 (jarak 2 dari node 3) dalam satu langkah lagi
sehingga jaraknya adalah 3.
(8, d=3): Node 8 terhubung dengan node 6 (jarak 2 dari node 3) dalam satu langkah lagi
sehingga jaraknya juga adalah 3.

Di mana jarak yang ditunjukkan adalah jarak minimum dari node n3 ke setiap node lain dalam grafmengikuti jalur terpendek sesuai dengan struktur adjacency list yang telah ditentukan sebelumnya

2. Ubahlah method static void main sehingga bentuk tree seperti Gambar 4.4 dapat dibentuk. 
    Kemudian tentukan bagaimana algoritma BFS dapat menemukan node 5. 
Jawab
(3,d=0) (1,d=1) (2,d=2) (4,d=2) (5,d=3) (6,d=3) (7,d=3) (8,d=3) (9,d=4) (10,d=4) (11,d=4) (12,d=4)
dengan demikian bahwa node 5 ditemukan setelah node 4 dengan jarak 3 dari node awala(node 3) dengan cara
menjelajahi graf secara terstruktur dimana urutanya yaitu menjelajah node 3, node 1, node 2 dan node 4
sesuai dengan node 5 dalam alur BFS 
3. Ubahlah method static void main sehingga bentuk tree seperti Gambar 4.5 dapat dibentuk.
    Kemudian tentukan bagaimana algoritma BFS dapat menemukan node 9.
Jawab
node 9 dapat ditemukan setelah node node sebelumnya dieksplorasi terlebih dahulu sebelum mencapai node 9.
node-node ini diurutkan berdasarkan jarak dari node awa, kemudian node 9 akan ditemukan setelah node 1 dan node 4 dengan 
jarak 2 dari node awala (6), dan kemudian diikuti oleh node-node yang terhubung ke node 9 dalam alur bfs.
