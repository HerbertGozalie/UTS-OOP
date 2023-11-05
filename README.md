# UTS-OOP
Perbedaan array, arraylist, dan vector
ArrayList, Vector, dan Array adalah tiga jenis struktur data yang digunakan untuk menyimpan kumpulan elemen di Java. Berikut adalah perbedaan antara ketiganya:
- Array: Kumpulan elemen dengan ukuran tetap dan tipe data yang sama. Setelah dibuat, ukuran array tidak dapat diubah.
- ArrayList: Array dinamis yang dapat bertambah atau berkurang ukurannya sesuai kebutuhan. Tidak bersifat sinkronisasi, artinya tidak aman untuk thread. Kapasitas array akan bertambah sebesar 50% dari ukuran array saat ini jika jumlah elemen melebihi kapasitasnya.
- Vector: Array dinamis yang dapat bertambah atau berkurang ukurannya sesuai kebutuhan. Bersifat sinkronisasi, artinya aman untuk thread. Kapasitas array akan bertambah sebesar 100% dari ukuran array saat ini jika jumlah elemen melebihi kapasitasnya.
Secara singkat, ArrayList lebih cepat dan efisien daripada Vector, tetapi Vector aman untuk thread. Jika keamanan thread tidak menjadi masalah, ArrayList umumnya lebih disukai daripada Vector.

Jelaskan masing-masing access modifer dalam java
Access modifier dalam Java digunakan untuk mengatur tingkat aksesibilitas dari class, method, atau variabel. Berikut adalah masing-masing access modifier dalam Java:
- Public: Anggota dari class yang dideklarasikan sebagai public dapat diakses dari mana saja, baik dari dalam class itu sendiri maupun dari luar class itu.
- Private: Anggota dari class yang dideklarasikan sebagai private hanya dapat diakses dari dalam class itu sendiri.
- Protected: Anggota dari class yang dideklarasikan sebagai protected dapat diakses dari dalam class itu sendiri, dari subclass, dan dari package yang sama.
- Default: Jika tidak ada access modifier yang digunakan, maka secara default anggota dari class adalah tipe default beserta package-nya, namun tidak bisa diakses dari luar dari package itu sendiri.
Perlu diingat bahwa access modifier hanya dapat digunakan pada class, method, atau variabel. Selain itu, access modifier juga dapat digunakan pada level class dan package.

Sebutkan dan jelaskan class relationship (Aggregration, Composisition, dan Association) dalam java
Class relationship dalam Java adalah hubungan khusus antara berbagai jenis class. Terdapat tiga jenis hubungan class dalam Java, yaitu:
- Association: Hubungan antara dua class yang saling terkait, di mana satu class memiliki referensi ke class lain. Association dapat dibagi menjadi dua jenis, yaitu Aggregation dan Composition.
- Aggregation: Hubungan antara dua class di mana satu class memiliki referensi ke class lain, tetapi class tersebut dapat berdiri sendiri tanpa class lainnya.
- Composition: Hubungan antara dua class di mana satu class memiliki referensi ke class lain, dan class tersebut tidak dapat berdiri sendiri tanpa class lainnya.
Perlu diingat bahwa hubungan class dalam Java sangat penting untuk memahami bagaimana objek dalam program bekerja bersama dan berkomunikasi satu sama lain. Selain itu, hubungan class juga membantu dalam mengurangi duplikasi kode dan meminimalkan bug dalam program.
