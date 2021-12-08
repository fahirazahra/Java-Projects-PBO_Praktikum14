package konsumsibbm;



public final class MobilSedan extends BBM {
    
    //Atribut
    private double Sedan = 10, solo_kudus = 157, solo_jkt = 536, mobilA = 60, mobilB = 65;
    
    //Isi method abstract tampilHasil() u/ mobil A & B
    public void tampilHasil(){
    
        double min_SoloKudus = this.solo_kudus / this.Sedan;
        Math.ceil(min_SoloKudus);

        double min_SoloJkt = this.solo_jkt / this.Sedan;        
        Math.ceil(min_SoloJkt);

        double waktuA = Math.round(this.solo_kudus/this.mobilA * 100.0) / 100.0;
        double waktuB = Math.round(this.solo_jkt/this.mobilB * 100.0) / 100.0;


        System.out.println("Mobil A | Sedan | Kecepatan: " + this.mobilA + " km/jam | Solo - Kudus: " + this.solo_kudus " km | Bahan Bakar Minimal: " + min_SoloKudus + " L | Waktu Tempuh: " + waktuA + " Jam");
        System.out.println("Mobil B | Sedan | Kecepatan: " + this.mobilB + " km/jam | Solo - Jakarta: " + this.solo_jkt + " km | Bahan Bakar Minimal: " + min_SoloJkt + " L | Waktu Tempuh: " + waktuB + " Jam");
        
    }

    //Method Getter u/ Output
    public void gettampilHasil(){

        this.tampilHasil();
        
    }
    
}