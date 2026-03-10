import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args){
        
        Heroi heroi = new Heroi("Nome", 199, 0, 5);
        Inimigo inimigo = new Inimigo("IFGW", 100, 0,7);
        CartaDano espada = new CartaDano("espadao", 5, 10);
        CartaDano tapa = new CartaDano("quertapatomatapa", 2, 3);
        CartaEscudo escudo = new CartaEscudo("escudao", 4, 6);
        CartaEscudo escudoQuebrado = new CartaEscudo("quebradao", 2, 2);

        

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
    
        
        while (inimigo.getLife()>0){

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

            int skip = entrada.nextInt();
            if (skip!=0){
                System.out.println("Attack options:");
            
                System.out.println("Press 1 for ");
            }
        }

        entrada.close();

    }
}

