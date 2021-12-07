package bangunruang;



public abstract class BangunRuang {    
    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
    public void tampilHasil(){
        System.out.println("Volumenya: " + this.hitungVolume());
        System.out.println("Luas Permukaannya: " + this.hitungLuasPermukaan());
    }

}