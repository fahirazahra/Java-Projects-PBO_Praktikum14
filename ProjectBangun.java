package bangundatar;


public class ProjectBangun {

  public static void main(String[] args) {
        
        //Persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        System.out.println("Persegi ini memiliki ukuran sisi sebesar " + persegi.sisi + " cm");
        persegi.tampilHasil();
        
        //Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jarijari = 12;
        System.out.println("Lingkaran ini berjari-jari sebesar " + lingkaran.jarijari + " cm");
        lingkaran.tampilHasil();
        i
        //Persegi Panjang
        PersegiPanjang PP = new PersegiPanjang();
        PP.panjang = 2;
        PP.lebar = 3;
        System.out.println("Persegi Panjang ini memiliki panjang sebesar " + PP.panjang + " cm, dan lebar sebesar " + PP.lebar + " cm");
        
    }
    
}