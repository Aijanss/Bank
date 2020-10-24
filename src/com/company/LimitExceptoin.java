package com.company;

public class LimitExceptoin extends Exception {
    private double remainingAmount;

    public LimitExceptoin(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }


    public double getRemainingAmount() {
        return getRemainingAmount();
    }

    }

