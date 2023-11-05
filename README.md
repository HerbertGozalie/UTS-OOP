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

## Pengenalan inheritance

Inheritance adalah salah satu pilar penting dalam Pemrograman Berorientasi Objek (OOP). Ini adalah mekanisme dalam Java di mana satu kelas diizinkan untuk mewarisi fitur (field dan metode) dari kelas lain. Dalam Java, Inheritance berarti membuat kelas baru berdasarkan kelas yang sudah ada. Kelas yang mewarisi dari kelas lain dapat menggunakan kembali metode dan field dari kelas tersebut. Selain itu, Anda juga dapat menambahkan field dan metode baru ke kelas saat ini.

Inheritance merupakan sebuah feature yang sangat berguna. kita dapat mendefinisikan kelas ke berbagai model seperti lingkaran, kotak dan segitiga. dan kelas-kelas ini memiliki kesamaan fitur dan untuk menghindari redudansi kita dapat menggunakan inheritance untuk menjaga sistem tetap mudah di mengerti

## Mengapa kita menggunakan Inheritance ?

**Code Reusability** : Kode yang ditulis di Superclass bersifat umum bagi semua subclass. Kelas anak dapat langsung menggunakan kode kelas induk.

**Method Overriding** : method overriding dapat dicapai dengan implementasi dari Inheritance. inheritance merupakan salah satu cara java untuk mencapai ***Run Time Polymorphism***

**Abstraction :** sebuah konsep dimana kita tidak harus menyediakan seluruh detail dan ini dicapai dengan menggunakan inheritance. **Abstraction** hanya menampilkan fungsi saja kepada user

## Class, Object, dan Methods
Class, object, dan methods adalah konsep dasar dalam pemrograman berorientasi objek (OOP) di Java. Berikut adalah penjelasan singkat mengenai ketiga konsep tersebut:
- Class adalah cetak biru atau blueprint dari object. Class digunakan hanya untuk membuat kerangka dasar. Yang akan kita pakai nanti adalah hasil cetakan dari class, yakni object.
- Object atau objek adalah hasil cetak dari class, atau bisa juga disebut hasil konkrit dari class. Sebuah object dari class akan memiliki seluruh ciri-ciri class, termasuk property dan method-nya.
- Method adalah kumpulan program yang mempunyai nama. Method menentukan perilaku objek, yakni apa yang terjadi ketika objek itu dibuat serta berbagai operasi yang dapat dilakukan objek sepanjang hidupnya.

## Encapsulation
Encapsulation dalam Java adalah mekanisme untuk menyembunyikan detail implementasi dari suatu class dari akses luar dan hanya mengekspos antarmuka publik yang dapat digunakan untuk berinteraksi dengan class tersebut. Dalam Java, encapsulation dicapai dengan mendeklarasikan variabel instance dari suatu class sebagai private, yang berarti variabel tersebut hanya dapat diakses di dalam class itu sendiri. Untuk memungkinkan akses dari luar class, metode publik yang disebut getter dan setter didefinisikan, yang digunakan untuk mengambil dan mengubah nilai variabel instance, masing-masing. Dengan menggunakan getter dan setter, class dapat menegakkan aturan validasi data sendiri dan memastikan bahwa keadaan internalnya tetap konsisten. Manfaat dari encapsulation antara lain meningkatkan modularitas dan maintainability, memungkinkan abstraksi data, memudahkan penambahan metode dan variabel baru, dan mendukung prinsip berorientasi objek.
