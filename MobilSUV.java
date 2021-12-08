package konsumsibbm;



public final class MobilSUV extends BBM {
    
    //Atribut
    private double suv = 12, solo_banten = 660, solo_bandung = 532, mobilC = 57, mobilD = 62;
    
    //Isi method abstract tampilHasil() u/ mobil C & D
    public void tampilHasil(){
    
        double min_SoloBanten = this.solo_banten / this.suv;
        Math.ceil(min_SoloBanten);

        double min_SoloBdg = this.solo_bandung / this.suv;        
        Math.ceil(min_SoloBdg);
        
        double waktuC = Math.round(this.solo_banten/this.mobilC * 100.0) / 100.0;
        double waktuD = Math.round(this.solo_bandung/this.mobilD * 100.0) / 100.0;


        System.out.println("Mobil C | SUV | Kecepatan: " + this.mobilC + " km/jam | Solo - Banten: " + this.solo_banten " km | Bahan Bakar Minimal: " + min_SoloBanten + " L | Waktu Tempuh: " + waktuC + " Jam");
        System.out.println("Mobil D | SUV | Kecepatan: " + this.mobilD + " km/jam | Solo - Bandung: " + this.solo_bandung + " km | Bahan Bakar Minimal: " + min_SoloBdg + " L | Waktu Tempuh: " + waktuD + " Jam");
        
    }

    //Method Getter u/ Output
    public void gettampilHasil(){

        this.tampilHasil();
        
    }
    
}