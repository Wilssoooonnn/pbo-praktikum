## Pertanyaan dan Jawaban tentang Upcasting, Downcasting, dan Koleksi Heterogen di Java

### 1. Apakah Upcasting Dapat Dilakukan dari Suatu Class terhadap Class Lain yang Tidak Memiliki Relasi Inheritance?
Tidak, upcasting tidak dapat dilakukan antara dua kelas yang tidak memiliki relasi inheritance (tidak berada dalam hierarki yang sama). Upcasting hanya memungkinkan ketika suatu objek dari subclass di-cast ke tipe superclass-nya, baik secara implisit maupun eksplisit. Jika tidak ada relasi inheritance, maka objek dari satu kelas tidak bisa dianggap sebagai objek dari kelas lainnya.

### 2. Dari Dua Baris Kode Program Berikut, Manakah Proses Upcasting yang Tepat? Jelaskan
```java
Pegawai pegawai1 = new Dosen();
Pegawai pegawai1 = (Pegawai) new Dosen();
```
Proses Upcasting yang Tepat Ada Pada Baris Pertama, Adalah
```java
Pegawai pegawai1 = new Dosen();
```
Karena Proses Dilakukan Secara Implisit

### 3. Apa Fungsi Keyword InstanceOF?
Keyword instanceOf digunakan untuk mengidentifikasi apakah sebuah object merupakan instance dari suatu class/interface

### 4. Apa yang Dimaksud Heterogenous Collection?
Heterogenous adalah kumpulan object yang terdiri dari berbagai tipe atau class yang berbeda

### 5. Sebuah object diinstansiasi dari class Pegawai. Kemudian dilakukan downcasting menjadi object bertipe Dosen. Apakah hal ini dapat dilakukan? Lakukan percobaan untuk membuktikannya. 
Hal tersebut dapat dilakukan tetapi hal tersebut tidak bisa dilakukan secara implisit, percobaan sudah dilakukan pada praktikum 2.4 Object Casting pada langkah nomer 10
