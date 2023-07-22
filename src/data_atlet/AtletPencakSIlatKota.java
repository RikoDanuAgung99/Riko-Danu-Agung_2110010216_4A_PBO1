
package data_atlet;

//inheritance
public class AtletPencakSIlatKota extends AtletPencakSilat{
    //atributtambahan
    String kota;
    
    //construktor
    public AtletPencakSIlatKota(String Nama, int usia, String kota) {
        super(Nama, usia);
        this.kota = kota;
    }
    
    //acessor
    public String getKota(){
        return kota;
    }
    
    //polymorphism
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kota: "+kota);
    }
    
}
