# PASKAL — Perpustakaan Haikal

PASKAL (Perpustakaan Haikal) adalah aplikasi perpustakaan digital berbasis Java Desktop (Swing) yang digunakan untuk mengelola dan membaca koleksi buku dalam format PDF secara terstruktur dan terkontrol.

Nama **PASKAL** terinspirasi dari **Blaise Pascal**, tokoh penting dalam sejarah ilmu pengetahuan dan pemikiran logis. Pemilihan nama ini merepresentasikan pendekatan aplikasi yang sistematis, terorganisasi, dan berbasis logika dalam pengelolaan informasi literatur.

## Fitur Utama
- Sistem login dengan **role pengguna**
  - **Admin**: menambah dan menghapus buku
  - **User**: membaca buku
- Daftar koleksi buku PDF
- Panel detail buku berbasis HTML
- Pembaca PDF terintegrasi (tidak membuka aplikasi eksternal)
- Fitur zoom in, zoom out, dan fit to window pada PDF
- Splash screen saat aplikasi dijalankan
- Logout dan manajemen sesi pengguna
- Aplikasi dapat dijalankan sebagai **JAR** dan **EXE portable**

## Teknologi yang Digunakan
- Java SE (Swing)
- NetBeans GUI Builder
- PDFBox
- Launch4j (porting ke EXE)
- HTML rendering menggunakan `JTextPane`

## Struktur Peran Pengguna
| Role  | Akses |
|------|------|
| Admin | Tambah buku, hapus buku, baca PDF |
| User  | Baca PDF |

## Lisensi
Proyek ini dibuat untuk keperluan pembelajaran dan pengembangan pribadi.
