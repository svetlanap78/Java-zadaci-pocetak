package Domaci.Ponedeljak27_12_21;

public class DuplaPetlja {
    public static void main(String[] args) {
        System.out.println("Ispis dana u nedelji za 3 nedelje");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Week: " + i);
            for (int x = 1; x <= 7; x++) {
                System.out.println("Day: " + x);
            }
        }
    }
}
