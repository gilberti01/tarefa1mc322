
public class Heroi {
    private String name;
    private int life;
    private int escudo;
    private int energia;

    public Heroi(String name, int life, int escudo, int energia){
        this.name=name;
        this.life=life;
        this.escudo=escudo;
        this.energia=energia;
    }

    public void receberDano(int dano){
        this.life-=Math.max(1,dano-escudo);
    }

    public void ganharEscudo(int escudo){
        this.escudo+=escudo;
    }

    public void alteraEnergia(int custo){
        this.energia-=custo;
    }

    public int getEnergia(){
        return this.energia;
    }

    public boolean estaVivo(){
        return (this.life>0); 
    }

    public void showStatus(){
        System.out.println(this.name + " status:");
        System.out.println("Life: " + this.life);
        System.out.println("Energy: " + this.energia);
    }

    public void setShield(int value){
        this.escudo=value;
    }

    public void setName(String name){
        this.name=name;
    }
}
