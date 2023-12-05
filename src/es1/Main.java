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

          String[] lista=new String[num];
          lista[num-1]=parola;


        for (int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }





       System.out.println("questo è il numero  "+ num + "  questa la parola  " + parola);

       






    }
}