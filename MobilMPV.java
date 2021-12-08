package konsumsibbm;



public final class MobilMPV extends BBM {
    
    //Atribut
    private double mpv = 14, solo_banyuwangi = 541, solo_jember = 433, mobilE = 64, mobilF = 53;
    
    //Isi method abstract tampilHasil() u/ mobil E & F
    public void tampilHasil(){
    
        double min_SoloBanyuwangi = this.solo_banyuwangi / this.mpv;
        Math.ceil(min_SoloBanyuwangi);

        double min_SoloJember = this.solo_jember / this.mpv;        
        Math.ceil(min_SoloJember);

        double waktuE = Math.round(this.solo_banyuwangi/this.mobilE * 100.0) / 100.0;
        double waktuF = Math.round(this.solo_jember/this.mobilF * 100.0) / 100.0;


        System.out.println("Mobil E | MPV | Kecepatan: " + this.mobilE + " km/jam | Solo - Banyuwangi: " + this.solo_banyuwangi " km | Bahan Bakar Minimal: " + min_SoloBanyuwangi + " L | Waktu Tempuh: " + waktuE + " Jam");
        System.out.println("Mobil F | MPV | Kecepatan: " + this.mobilF + " km/jam | Solo - Jember: " + this.solo_jember + " km | Bahan Bakar Minimal: " + min_SoloJember + " L | Waktu Tempuh: " + waktuF + " Jam");
        
    }

    //Method Getter u/ Output
    public void gettampilHasil(){

        this.tampilHasil();
        
    }
    
}