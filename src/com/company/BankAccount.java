package com.company;

public class BankAccount extends LimitExceptoin {
    private double amount;

    public BankAccount(String message, double remainingAmount) {
        super(message, remainingAmount);
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }

    public void  deposit(double sum) {
        this.amount=(amount+sum);

    }

    public void  withDraw(int sum){
            if (amount< sum){
                try {
                    throw new LimitExceptoin("Сумма на снатье больше чем остаток на счете",
                            +this.getAmount());
                } catch (LimitExceptoin b) {
                    System.out.println(b.getMessage()+this.amount);

                }
            }
        }
    }













