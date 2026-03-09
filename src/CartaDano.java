public class CartaDano {
    private String name;
    private int custo;
    private int dano;
    
    public CartaDano(String name, int custo, int dano){
    this.name=name;
    this.custo=custo;
    this.dano=dano;
    }

    public void usar(Inimigo inimigo){
        inimigo.receberDano(this.dano);
    }
}
