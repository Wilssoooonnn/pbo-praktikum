## Pertanyaan dan Jawaban tentang Upcasting, Downcasting, dan Koleksi Heterogen di Java

### 1. Apakah Upcasting Dapat Dilakukan dari Suatu Class terhadap Class Lain yang Tidak Memiliki Relasi Inheritance?
Tidak, upcasting tidak dapat dilakukan antara dua kelas yang tidak memiliki relasi inheritance (tidak berada dalam hierarki yang sama). Upcasting hanya memungkinkan ketika suatu objek dari subclass di-cast ke tipe superclass-nya, baik secara implisit maupun eksplisit. Jika tidak ada relasi inheritance, maka objek dari satu kelas tidak bisa dianggap sebagai objek dari kelas lainnya.

### 2. Dari 2 Baris Kode Program Berikut, Manakah Proses Upcasting yang Tepat? Jelaskan
```java
Pegawai pegawai1 = new Dosen();
Pegawai pegawai1 = (Pegawai) new Dosen();
```
