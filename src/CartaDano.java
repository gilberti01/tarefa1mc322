public class CartaDano {
    private String name;
    private int custo;
    private int dano;
    
    public CartaDano(String name, int custo, int dano){
    this.name=name;
    this.custo=custo;
    this.dano=dano;
    }

    public void usar(Inimigo inimigo, Heroi heroi){
        inimigo.receberDano(this.dano);
        heroi.alteraEnergia(this.custo);
    }

    public void showStatus(){
        System.out.println(this.name + " (" + this.dano + " damage, -" + this.custo + "energy)");
    }
}
