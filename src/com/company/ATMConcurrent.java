package com.company;

import java.util.HashMap;

public class ATMConcurrent {
    HashMap<String, Integer> accountMap;

    public ATMConcurrent() {
        accountMap = new HashMap<>();
        accountMap.put("23PMK1234", 12000);
        accountMap.put("26PM312Y4", 15000);
        accountMap.put("13PMK1O3G", 20000);
    }

    public void checkBalance(Client client) {
        int amount = accountMap.get(client.getAccountID());
        System.out.printf("%s has %d amount of money\n", client.getClientName(), amount);
    }

    public void withDraw(Client client) {
        int currentBalance = accountMap.get(client.getAccountID());
        int newBalance = currentBalance - client.getWithDrawAmount();
        accountMap.put(client.getAccountID(), newBalance);
        System.out.printf("Current account balance of %s is %d\n", client.getClientName(), newBalance);
    }

    synchronized public void atmOperation(Client client) {
        checkBalance(client);
        try {
            Thread.sleep(client.getWaitAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        withDraw(client);
    }
}

class Client extends Thread {
    ATMConcurrent atm;
    private final String accountID;
    private final String name;
    private int withDrawAmount;
    private int waitAmount;

    public Client(ATMConcurrent atm, String accountID, String name) {
        this.atm = atm;
        this.accountID = accountID;
        this.name = name;
    }

    @Override
    public void run() {
        atm.atmOperation(this);
    }

    public void setWithDrawAmount(int withDrawAmount) throws Exception {
        int currentBalance = atm.accountMap.get(getAccountID());
        if (currentBalance < withDrawAmount) {
            throw new Exception("Withdraw amount should be less than the current balance");
        }
        this.withDrawAmount = withDrawAmount;
    }

    public void setWaitAmount(int waitAmount) {
        this.waitAmount = waitAmount;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getClientName() {
        return name;
    }

    public int getWaitAmount() {
        return waitAmount;
    }

    public int getWithDrawAmount() {
        return withDrawAmount;
    }
}






