Nama 	: Muhammad Zidane Azhar
NIM 	: 5311421064

Teknik Heuristik Search
1.	Pelajari class EightPuzzleSearch, EightPuzzleSpace, dan Node
Jawab:
-	EightPuzzleSearch merupakan proses pencarian solusi dalam teka teki delapan angka. Algoritma pencarian seperti BFS, DFS dll. Digunakan untuk mencari urutan Gerakan yang akan memindahkan ubin ubin teka teki ke posisi yang tepat.
-	EightPuzzleSpace merupakan ruang keadaan dari teka teki delapan angka. Dimana semua kemungkinan konfigurasi papan teka teki yang mungkin terjadi selama proses pencarian solusi. Setiap simpul mewakili keadaan papan teka teki pada suatu titik tertentu dalam pencarian solusi.
-	Node merupakan struktur data yang mewakili simpul dalam strktur data yang digunakan selama pencarian. Setiap node biasanya berisi informasi seperti keadaan papan teka teki, informasi tentang langkah-langkah yang telah diambil untuk mencapai tujuan, dan informasi lain yang diperlukan untuk memandu algoritma pencarian.
Berikut merupakan hasil dari percobaan EightPuzzleSearch dan EightPuzzleSPace
Root: 1 2 3 7 8 4 6 0 5
Solution found
 1 2 3 7 8 4 6 0 5
 1 2 3 7 8 4 0 6 5
 1 2 3 0 8 4 7 6 5
 1 2 3 8 0 4 7 6 5
Dalam kasus 8-puzzle dari keadaan awal '1 2 3 7 8 4 6 0 5' menuju goal state '1 2 3 8 0 4 7 6 5', algoritma pencarian berhasil menemukan solusi dengan serangkaian langkah yang tepat dan terurut. Keberhasilan ini menunjukkan efektivitas algoritma heuristik yang digunakan dalam menavigasi melalui kemungkinan perpindahan ubin untuk mencapai goal state.
2.	Ubahlah initial dan goal state dari program di atas sehingga bentuk initial dan goal statenya Gambar 8. Kemudian tentukan langkah-langkah mana saja sehingga puzzlenya mencapai goal state. Analisa dan bedakan dengan solusi pada point 1.
Jawab 
Root: 1 2 3 4 5 6 7 8 0
Pada percobaan 2 ini menggunakan initial state pada 8-puzzle yaitu 3 1 2 4 7 5 6 8 0 dan menggunakan goal state 1 2 3 4 0 8 5 6 7 dan pada keadaan ini tidak menemukan solusi untuk mengubah initial menjadi goal state. Hal ini dikarenakan sifat alami dari 8-puzzle yang mana tidak semua keadaan awal dapat diselesaikan. Kemudian pada kasus ini memiliki initial yang jumlah inversinya ganjil yang menunjukan bahwa ubin yang berada diatas memiliki nomor yang lebih kecil dibandingkan dengan ubin dibawahnya, maka pada keadaan ini tidak dapa diubah menjadi goal state

3.	Ubahlah initial dan goal state dari program di atas sehingga bentuk initial dan goal statenya Gambar 5.9. Kemudian tentukan langkah-langkah mana saja sehingga puzzlenya mencapai goal state. Analisa dan bedakan dengan solusi pada point 1 dan 2.
Jawab 
Root: 1 5 3 4 6 8 2 7 0
Pada percobaan 3 ini menggunakan initial state pada 8-puzzle yaitu 7 6 5 8 0 4 1 2 3 dan menggunakan goal state 1 5 3 4 6 8 2 7 0 algoritma heuristic tidak dapat mecapai goal state yang disebabkan jumlah langkah yang dibutuhkan untuk menyelesaikan keadaan awal dapat menjadi tak terbatas, membuat pencarian solusi tidak memungkinkan atau terlalu rumit untuk dieksekusi. Oleh karena itu, faktor kesulitan struktural yang kompleks dalam keadaan awal menjadi penyebab utama kegagalan algoritma dalam menemukan solusi dalam 8-puzzle yang tidak dapat diselesaikan.
4.	Ubahlah initial dan goal state dari program di atas sehingga bentuk initial dan goal statenya Gambar 5.10. Kemudian tentukan langkah-langkah mana saja sehingga puzzlenya mencapai goal state. Analisa dan bedakan dengan solusi pada point 1, 2, dan 3.
Jawab 
Root: 1 2 3 4 5 6 7 8 0


Solution found
 1 2 3 4 5 6 7 8 0
 1 2 3 4 5 6 7 0 8
 1 2 3 4 0 6 7 5 8
 1 2 3 4 6 0 7 5 8
 1 2 0 4 6 3 7 5 8
 1 0 2 4 6 3 7 5 8
 0 1 2 4 6 3 7 5 8
 4 1 2 0 6 3 7 5 8
 4 1 2 6 0 3 7 5 8
 4 1 2 6 5 3 7 0 8
 4 1 2 6 5 3 0 7 8
 4 1 2 0 5 3 6 7 8
 0 1 2 4 5 3 6 7 8
 1 0 2 4 5 3 6 7 8
 1 2 0 4 5 3 6 7 8
 1 2 3 4 5 0 6 7 8
 1 2 3 4 0 5 6 7 8

Pada percobaan 4 ini menggunakan initial state pada 8-puzzle yaitu 1 2 3 4 5 6 7 8 0 dan menggunakan goal state 1 2 3 4 0 5 6 7 8 algoritma heuristic dapat mencapai goal state dengan menggunakan langkah langkah sebanyak 17 langkah yang dilakukan untuk mencapai goal state dari initial state dan menjujukan seberapa kompleks algoritma untuk menemukan solusi pada kondisi tersebut.

5.	Ubahlah initial dan goal state dari program dan class-class di atas sehingga bentuk initial dan goal statenya Gambar 5.11. Kemudian tentukan langkah-langkah mana saja sehingga puzzlenya mencapai goal state.
Jawab 
Pada percobaan kali ini kita menggunaka permisalan sebagai suatuhal yang mempermudah dalam percobaan yaitu dengan mengubah huruf menjadi angka seperti A=1, B=2, C=3, D=4, E=5, F=6, G=7, H=8, I=0.
Root: 4 2 5 1 6 7 8 3 0

Pada percobaan 2 ini menggunakan initial state pada 8-puzzle yaitu 4 2 5 1 6 7 8 3 0dan menggunakan goal state 1 8 7 2 0 6 3 4 5 dan pada keadaan ini tidak menemukan solusi untuk mengubah initial menjadi goal state. Hal ini karena perbedaan struktur antara initial dan goal state yang mempengaruhi permutasi angka-angka di papan puzzle. Dalam penyelesaian 8-puzzle, tidak semua susunan angka bisa diselesaikan dalam bentuk goal state tertentu. Dalam kasus ini, konfigurasi awal memiliki kompleksitas permutasi yang sangat jauh dari goal state sehingga algoritma tidak mampu menemukan solusi. Ini menandakan bahwa ada perbedaan permutasi yang sangat signifikan antara initial dan goal state yang tidak dapat diselesaikan oleh algoritma dalam jumlah langkah yang masuk akal. Ini adalah hasil dari perbedaan posisi yang signifikan antara angka-angka di initial dan goal state, yang membuat pencarian solusi sangat sulit bahkan untuk algoritma heuristik.
