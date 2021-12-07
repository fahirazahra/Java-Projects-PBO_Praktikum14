package bangundatar;



public abstract class BangunDatar {    
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    }

}