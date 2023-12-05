package es1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utente utente=new Utente();
        ArrayList<Utente> utentes = new ArrayList<>();

       Scanner ute=new Scanner(System.in);
       System.out.println("dimmi un numero: ");
       int num=ute.nextInt();
       ute.nextLine();
       System.out.println("dimmi una parola: ");
       String parola=ute.nextLine();




       System.out.println("questo è il numero  "+ num + "  questa la parola  " + parola);

       






    }
}