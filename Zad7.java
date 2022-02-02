package Domaci.Pastebin;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {

        //7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
Scanner sc = new Scanner(System.in);

        System.out.println("Unesite datum rodjenja: ");
        int datum=sc.nextInt();
        System.out.println("Unesite mesec rodjenja npr: januar");
        String mesec = sc.next();
String pl = "Vas horoskopski znak je ";

if (mesec.equals("mart") && datum >= 21) {
    System.out.println(pl + "Ovan");
}else if (mesec.equals("april") && datum <= 19) {
    System.out.println( pl + "Ovan");
} else if (mesec.equals("april") && datum >= 20) {
    System.out.println(pl + "Bik");
}else if (mesec.equals("maj") && datum<=20){
    System.out.println(pl + "Bik");
}else if (mesec.equals("maj") && datum<=22){
    System.out.println(pl + "Blizanac");
}else if (mesec.equals("jun") && datum<=21){
    System.out.println(pl + "Blizanac");
}else if (mesec.equals("jun") && datum>=22){
    System.out.println(pl + "Rak");
}else if (mesec.equals("jul") && datum<=22){
    System.out.println(pl + "Rak");
}else if (mesec.equals("jul") && datum>=23){
    System.out.println(pl + "Lav");
}else if (mesec.equals("avgust") && datum<=22){
    System.out.println(pl + "Lav");
}else if (mesec.equals("avgust") && datum>=23){
    System.out.println(pl + "Devica");
}else if (mesec.equals("septembar") && datum<=22){
    System.out.println(pl + "Devica");
}else if (mesec.equals("septembar") && datum>=23){
    System.out.println(pl + "Vaga");
}else if (mesec.equals("oktobar") && datum<=23){
    System.out.println(pl + "Vaga");
}else if (mesec.equals("oktobar") && datum>=24){
    System.out.println(pl + "Skorpija");
}else if (mesec.equals("novembar") && datum<=22){
    System.out.println(pl + "Skorpija");
}else if (mesec.equals("novembar") && datum>=23){
    System.out.println(pl + "Strelac");
}else if (mesec.equals("decembar") && datum<=21){
    System.out.println(pl + "Strelac");
}else if (mesec.equals("decembar") && datum>=22){
    System.out.println(pl + "Jarac");
}else if (mesec.equals("januar") && datum<=20){
    System.out.println(pl + "Jarac");
}else if (mesec.equals("januar") && datum>=21){
    System.out.println(pl + "Vodolija");
}else if (mesec.equals("februar") && datum<=19){
    System.out.println(pl + "Vodolija");
}else if (mesec.equals("februar") && datum>=20){
    System.out.println(pl + "Riba");
}else if (mesec.equals("mart") && datum<=20){
    System.out.println(pl + "Riba");
}

    }
}
