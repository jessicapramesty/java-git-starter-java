# Java Git Starter

Contoh proyek Java sederhana menggunakan Maven dan Java 17.

## Menjalankan

Pastikan Java 17+ dan Maven terpasang, lalu jalankan:

```bash
mvn package
java -cp target/classes com.example.App
```

## Isi proyek

- `App.java`: titik masuk aplikasi.
- `Calculator.java`: contoh class dengan method penjumlahan, pengurangan, perkalian, dan pembagian (melempar `IllegalArgumentException` jika pembagi nol).
