package bangundatar;



public class PersegiPanjang extends BangunDatar {

    //Atribut
    public double panjang;
    public double lebar;
    
    //Method Hitung Luas
    public double hitungLuas(){
        double Luas = this.panjang * this.lebar;
        return Luas;
    }
    
    //Method Hitung Keliling
    public double hitungKeliling(){
 	   double Keliling = 2 * this.panjang+this.lebar;
 	   return Keliling;
    }
}