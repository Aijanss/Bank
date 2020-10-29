package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(int amount) {
        this.amount = amount;
    }

    public BankAccount() {

    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount = (amount + sum);
    }

    public int withDraw(int sum)throws LimitExceptoin {
        if (amount < sum) {
            try {
                throw new LimitExceptoin("введеная сумм больше чем " +
                        "остаток на счете!\nОстаток на счете = " + amount
                        + "\nВведенная сумма = " + sum, amount);
            } catch (LimitExceptoin b) {
                System.out.println(b.getMessage() + this.amount);
            }
        }
                amount -= sum;
                return sum;
            }
}















