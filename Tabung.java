package bangunruang;



public class Tabung extends BangunRuang {

    //Atribut
    public double jarijari;
    public double tinggi;
    private final double phi = 3.14;
    
    //Method Hitung Luas
    public double hitungVolume() {
        double Volume = this.phi * this.jari.jari*this.jarijari * this.tinggi;
        return Volume;
    }
    
    //Method Hitung Keliling
    public double hitungLuasPermukaan() {
 	   double LuasP = 2 * this.phi*this.jarijari * this.jarijari+this.tinggi;
 	   return LuasP;
    }
    
}