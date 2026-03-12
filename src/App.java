import java.util.Scanner;

public class App {

    public static void main(String[] args){
        
        Heroi heroi = new Heroi("Nome", 199, 0, 5);
        Inimigo inimigo = new Inimigo("IFGW", 100, 0,7);
        CartaDano espada = new CartaDano("Espada", 5, 10);
        CartaDano tapa = new CartaDano("Tapa", 2, 3);
        CartaEscudo escudo = new CartaEscudo("Escudo", 4, 6);
        CartaEscudo escudoQuebrado = new CartaEscudo("Escudo Quebradao", 2, 2);

        

        System.out.println("Enter your name to begin battle:");

        Scanner entrada = new Scanner(System.in);

        String name = entrada.nextLine();


        System.out.println("You encountered " + inimigo.getName() + "!");
        System.out.println("Press enter to start the duel!");
        System.out.println("You will regenerate 2 points of energy each turn");
        String placeholder = entrada.nextLine();

        heroi.setName(name);

        heroi.showStatus();
        System.out.println("-----------------------");
        inimigo.showStatus();
        System.out.println("-----------------------");
    
        
        while(true){

            heroi.setShield(0);

            System.out.println("Select a number to choose your action (an invalid entry will skip your turn)");

            System.out.print("1: ");
            espada.showStatus();
            System.out.print("2: ");
            tapa.showStatus();
            System.out.print("3: ");
            escudo.showStatus();
            System.out.print("4: ");
            escudoQuebrado.showStatus();

            int action = entrada.nextInt();

            while(true){
                if(action == 1){
                    //usa espada
                    if(heroi.getEnergia()>=espada.getCusto()){
                        espada.usar(inimigo,heroi);
                        break;
                    }else{
                        System.out.print("Insuficient energy, choose another action!");
                    }
                }else if(action == 2){
                    //usa tapa
                }else if(action == 2){
                    //usa escudo
                }else if(action == 2){
                    //usa escudo quebrado
                }else{
                    System.out.print("Invalid entry, turn skipped!");
                    break;
                }
            }

            if(!inimigo.estaVivo()){
                //print You Win!
                //+n points
                break;
            }

            //print inimigo.getName() attacked! -inimigo.getDano() life

            if(!heroi.estaVivo()){
                //print You Lose!
                break;
            }
        }

        entrada.close();

    }
}

