package gaji;
public class PM extends Gaji {
    private int bonus,tunjangan,bonus5,bonus10;
    
    public PM (){
        bonus = 450000;
        bonus5 = 225000;
        bonus10 = 700000;
        tunjangan = 6000000;        
    }
    public int GajiTot(){
        return (tunjangan)+(bonus)+super.getGaji()+super.getBonus();
    }
    public int GajiTot5(){
        return (tunjangan)+(bonus)+super.getGaji()+super.getBonus5()+super.getBonus();
    }
    public int GajiTot10(){
        return (tunjangan)+(bonus10)+super.getGaji()+super.getBonus5()+super.getBonus();
    }
}
