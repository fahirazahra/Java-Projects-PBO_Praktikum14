package bangunruang;



public class Bola extends BangunRuang {

    //Atribut
    public double jarijari;
    private final double phi = 3.14;
    
    //Method Hitung Luas
    public double hitungVolume() {
        double Volume = 4/3 * this.phi * this.jarijari*this.jarijari*this.jarijari;
        return Volume;
    }
    
    //Method Hitung Keliling
    public double hitungLuasPermukaan() {
 	   double LuasP = 4 * this.phi * this.jarijari*this.jarijari;
 	   return LuasP;
    }
    
}