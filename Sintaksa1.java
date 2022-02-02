import java.util.Scanner;

public class Sintaksa1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
/* Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se ivice prostorije
ucitavaju preko konzole. (Za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika
i da nema prozora i vrata)
 */
        System.out.print("Uneti visinu zida: ");
        int visina = scanner.nextInt();
        System.out.print("Uneti duzinu zida: ");
        int duzina = scanner.nextInt();
        System.out.print("Uneti sirinu zida: ");
        int sirina = scanner.nextInt();

        // racuna povrsinu sabiranjem povrsine plafona i zidova
        int povrsina = 2*(duzina * visina) + 2*(sirina * visina) + (duzina*sirina);
        System.out.print("Povrsina prostorije je: " + povrsina);
    }
}
