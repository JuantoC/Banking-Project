package com.mycompany.bankingsystem;

import java.util.ArrayList;

public class BankingSystem {

    private ArrayList<Person> peopleRegister;
    private ArrayList<Account> accountsRegister;

    public BankingSystem() {
        peopleRegister = new ArrayList<>();
        accountsRegister = new ArrayList<>();
    }

    public void addPerson(Person person) {
        peopleRegister.add(person);
    }

    public void addAccount(Account account) {
        accountsRegister.add(account);
    }

    public void showPeople() {
        for (Person p : peopleRegister) {
            System.out.println(p.getName() + " - Doc: " + p.getDocument());
        }
    }

    public void showAccounts() {
        for (Account a : accountsRegister) {
            System.out.println("Cuenta de doc " + a.getOwnerDocument()
                    + " | Saldo: " + a.getBalance());
        }
    }

    private Account findAccountById(int accountId) {
        for (Account acc : accountsRegister) {
            if (acc == null) continue;
            if (acc.getAccountId() == accountId) {
                return acc;
            }
        }
        return null;
    }


    public void transferMoney(int amount, int fromAccountId, int toAccountId) {
        Account from = findAccountById(fromAccountId);
        Account to = findAccountById(toAccountId);

        if (from == null || to == null) {
            System.out.println("Cuenta/s no encontradas");
            return;
        }

        if (!from.checkBalance(amount)) {
            System.out.println("Fondos insuficientes");
            return;
        }

        from.withdrawBalance(amount);
        to.depositBalance(amount);

        System.out.println("Transferencia exitosa");
    }

}
