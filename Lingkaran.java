package bangundatar;



public class Lingkaran extends BangunDatar {

    //Atribut
    public double jarijari;
    private final double phi = 3.14;
    
    //Method Hitung Luas
    public double hitungLuas(){
        double Luas = this.phi * this.jarijari*this.jarijari;
        return Luas;
    }
    
    //Method Hitung Keliling
    public double hitungKeliling(){
 	   double Keliling = 2 * this.phi * this.jarijari;
 	   return Keliling;
    }
    
}