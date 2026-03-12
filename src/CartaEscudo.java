public class CartaEscudo {
    private String name;
    private int custo;
    private int escudo;
    
    public CartaEscudo(String name, int custo, int escudo){
    this.name=name;
    this.custo=custo;
    this.escudo=escudo;
    }

    public void usar(Heroi heroi){
        heroi.ganharEscudo(this.escudo);
        heroi.alteraEnergia(this.custo);
    }

    public void showStatus(){
        System.out.println(this.name + " (" + this.escudo + " defense, -" + this.custo + " energy)");
    }

    public int getCusto(){
        return this.custo;
    }
}
