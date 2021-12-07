package bangunruang;



public class Balok extends BangunRuang {

    //Atribut
    public double panjang;
    public double lebar;
    public double tinggi;
    
    //Method Hitung Luas
    public double hitungVolume() {
        double Volume = this.panjang * this.lebar * this.tinggi;
        return Volume;
    }
    
    //Method Hitung Keliling
    public double hitungLuasPermukaan() {
 	   double LuasP = 2 * this.panjang*this.lebar + this.panjang*this.tinggi + this.lebar*this.tinggi;
 	   return LuasP;
    }
    
}