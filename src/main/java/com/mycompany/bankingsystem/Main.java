package com.mycompany.bankingsystem;

public class Main {

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        // Personas
        Person ana = new Person("Ana", "1997/10/28", "Trans", 200, 1001);
        Person pablo = new Person("Pablo", "1994/01/31", "Male", 450, 1002);
        Person laura = new Person("Laura", "1990/07/15", "Female", 380, 1003);
        Person martin = new Person("Martin", "1988/11/05", "Male", 500, 1004);
        Person julieta = new Person("Julieta", "2001/03/22", "Female", 320, 1005);
        Person tomas = new Person("Tomas", "1999/12/10", "Male", 410, 1006);

        // Cuentas
        Account account1 = new Account(500.0, 1001); // Ana
        Account account2 = new Account(1200.0, 1002); // Pablo
        Account account3 = new Account(300.0, 1003); // Laura
        Account account4 = new Account(800.0, 1004); // Martin
        Account account5 = new Account(950.0, 1005); // Julieta
        Account account6 = new Account(150.0, 1006); // Tomas

        bank.addPerson(ana);
        bank.addPerson(pablo);
        bank.addPerson(laura);
        bank.addPerson(martin);
        bank.addPerson(julieta);
        bank.addPerson(tomas);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);
        bank.addAccount(account6);
    }
}
