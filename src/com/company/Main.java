package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        for (int i =1; i < 5; i++) {
            try {
                System.out.println("счет = " + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitExceptoin b) {
                try {
                    bankAccount.withDraw((int)  +  bankAccount.getAmount());
                } catch (LimitExceptoin ex) {
                    ex.printStackTrace();

                }

            }
        }

    }

}








