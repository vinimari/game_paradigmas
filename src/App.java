import java.util.Scanner;
import classes.MakeTurn;

public class App {

    /*
     * Integrantes:
     * Márcio Vinícius GRR20204089 
     * Gabriela Marques GRR20190638
     */
    public static void main(String[] args) throws Exception {
        displayWelcome();
        MakeTurn.onSetBoard();
    }

    public static void displayWelcome() {
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║                                  ║");
        System.out.println("║     Bem-vindo ao Jogo das        ║");
        System.out.println("║           Fake News!             ║");
        System.out.println("║                                  ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║                                  ║");
        System.out.println("║   ♦  Prepare-se para acabar  ♦   ║");
        System.out.println("║    ♦ com as notícias falsas ♦    ║");
        System.out.println("║                                  ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║   By: Márcio Vinícius            ║");
        System.out.println("║       Gabriela Marques           ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.println("Pressione Enter para começar o jogo...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║                                  ║");
        System.out.println("║         Jogo Iniciado            ║");
        System.out.println("║                                  ║");
        System.out.println("╚══════════════════════════════════╝");
    }
}
