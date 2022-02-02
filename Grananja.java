import java.util.Scanner;

public class Grananja {
    static Scanner scanner = new Scanner(System.in);
    /* Napisati program koji proverava da li je uneti broj paran.
    Ukoliko jeste,program treba da ispise poruku:Broj je paran, ukoliko nije,program treba da ispise poruku
    broj je neparan
     */
    public static void main(String[] args) {
        System.out.print("Uneti broj: ");
        int broj = scanner.nextInt();

        if(broj % 2 == 0){
            System.out.println("Broj je paran.");
        }
        else {
            System.out.println("Broj je neparan.");
        }
    }
}
