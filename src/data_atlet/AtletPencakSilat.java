
package data_atlet;

public class AtletPencakSilat {
    //atribut 
    String Nama;
    int usia;
    
    //construktor
    public AtletPencakSilat(String Nama, int usia) {
        this.Nama = Nama;
        this.usia = usia;
    }
    
    //accessor
    public String getNama() {
        return Nama;
    }

    public int getUsia() {
        return usia;
    }
    
    //mutator

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    //polymorphism
    public void displayInfo() {
        System.out.println("Nama: "+Nama);
        System.out.println("Usia: "+usia);
    }
    
}
