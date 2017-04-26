package gaji;
public class SE extends Gaji {
    private int bonus, tunjangan;

    public SE (){
        bonus = 300000;
        tunjangan = 5500000;        
    }
    public int GajiTot(){
        return (tunjangan)+(bonus)+super.getGaji()+super.getBonus();
    }
    public int GajiTot5(){
        return (tunjangan)+(bonus)+super.getGaji()+super.getBonus5()+super.getBonus();
    }
}
