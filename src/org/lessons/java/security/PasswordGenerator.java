package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String name;
        String surnname;
        String PreferColor;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        Scanner input = new Scanner(System.in);
        Scanner inte = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        name = input.nextLine();
        System.out.println("Inserisci il tuo cognome: ");
        surnname = input.nextLine();
        System.out.println("Inserisci il tuo colore preferito: ");
        PreferColor = input.nextLine();
        System.out.println("Inserisci il tuo giorno di nascita: ");
        dayOfBirth = inte.nextInt();
        System.out.println("Inserisci il tuo mese di nascita: ");
        monthOfBirth = inte.nextInt();
        System.out.println("Inserisci il tuo anno di nascita: ");
        yearOfBirth = inte.nextInt();

        input.close();
        inte.close();

        int passwordNamber = dayOfBirth + monthOfBirth + yearOfBirth;
        String password = name + "-" + surnname + "-" + PreferColor + "-" + passwordNamber;

        System.out.println(password);

    }

}
