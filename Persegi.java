package bangundatar;



public class Persegi extends BangunDatar {
    
    //Atribut
    public double sisi;
    
    //Method Hitung Luas
    public double hitungLuas(){
        double Luas = this.sisi * this.sisi;
        return Luas;
    }
    
    //Method Hitung Keliling
    public double hitungKeliling(){
        double Keliling = 4 * this.sisi;
        return Keliling;
    }
    
}