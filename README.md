# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

1. Program ini memiliki dua kelas utama: `AtletPencakSilat` sebagai superclass dan `AtletPencakSilatKota` sebagai subclass yang mewarisi atribut dan metode dari superclass.

2. Kelas `AtletPencakSilat` memiliki atribut `nama` dan `usia` dengan konstruktor, accessor, dan mutator untuk mengakses dan mengubah nilai atribut.

3. Kelas `AtletPencakSilatKota` merupakan subclass dari `AtletPencakSilat`, sehingga memiliki atribut tambahan `kota`. Method `displayInfo()` di kelas ini di-override untuk menampilkan informasi dari superclass serta informasi kota atlet.

4. Kelas `Program` berfungsi sebagai kelas utama (main class) yang akan dijalankan oleh JVM.

5. Pada tahap awal, program akan menginisialisasi array `atletArray` untuk menyimpan objek `AtletPencakSilatKota`.

6. Program akan meminta input data atlet (nama, usia, dan kota) menggunakan objek `Scanner` dan melakukan validasi agar nama tidak boleh kosong (menggunakan perulangan while).

7. Selanjutnya, program akan membuat objek `AtletPencakSilatKota` berdasarkan data yang diinputkan dan menyimpannya di dalam array `atletArray`.

8. Setelah proses pendataan selesai, program akan menampilkan data atlet yang telah diinputkan beserta kategorinya (senior atau junior) menggunakan perulangan for each dan method `displayInfo()` yang di-override di kelas `AtletPencakSilatKota`.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `AtletPencakSilat`, `AtletPencakSIlatKota`, dan `program` adalah contoh dari class.
```bash
public class AtletPencakSilat {
    ...
}

public class AtletPencakSIlatKota extends AtletPencakSilat {
    ...
}

public class program {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `atletArray[i] = new AtletPencakSIlatKota(Nama, usia, kota);
```` adalah contoh membuat objek AtletPencakSIlatKota menggunakan construktor.

```bash
atletArray[i] = new AtletPencakSIlatKota(Nama, usia, kota);
```

3. **Atribute** adalah variabel yang ada dalam class. Pada kode ini, `Nama` , `usia` dan `kota` adalah contoh atribut.
```bash
String Nama;
int usia;
String kota;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `AtletPencakSilat` dan `AtletPencakSIlatKota`.

```bash
public AtletPencakSilat(String Nama, int usia) {
        this.Nama = Nama;
        this.usia = usia;
}

 public AtletPencakSIlatKota(String Nama, int usia, String kota) {
        super(Nama, usia);
        this.kota = kota;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setUsia` adalah contoh method mutator.

```bash
public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getUsia`, `getKota` adalah contoh method accessor.

```bash
public String getNama() {
        return Nama;
    }

    public int getUsia() {
        return usia;
    }

public String getKota(){
        return kota;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini saya tidak memakai nya.

```bash
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `AtletPencakSilat` mewarisi `AtletPencakSIlatKota` dengan sintaks `extends`.

```bash
public class AtletPencakSIlatKota extends AtletPencakSilat {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding.

```bash
 public void displayInfo() {
        System.out.println("Nama: "+Nama);
        System.out.println("Usia: "+usia);
    }

 @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kota: "+kota);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else`.

```bash
if (atlet.getUsia() >= 20){
            System.out.println("Kategori: Senior");
        }else{
            System.out.println("Kategori: Junior");
        }
        System.out.println();
        }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i= 0; i < atletArray.length; i++){
            System.out.println("\nData Atlet " + (i + 1));
            System.out.println("Nama: ");
            String Nama = input.nextLine();

for (AtletPencakSIlatKota atlet : atletArray)
     atlet.displayInfo();
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk meminta input data atlet (nama, usia, dan kota) 

```bash
Scanner input = new Scanner(System.in);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `AtletPencakSIlatKota[] atletArray = new AtletPencakSIlatKota[2];` adalah contoh penggunaan array.

```bash
AtletPencakSIlatKota[] atletArray = new AtletPencakSIlatKota[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
while(Nama.trim().isEmpty()){
             System.out.println("Nama tidak boleh kosong. SIlahkan masukkan nama atlet.");
             System.out.println("nama: ");
             Nama = input.nextLine();
         }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    0    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **95** |

## Pembuat

Nama: Riko Danu Agung
NPM: 2110010216
