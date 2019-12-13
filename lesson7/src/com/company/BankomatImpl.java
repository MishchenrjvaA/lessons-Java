package com.company;

public interface BankomatImpl {

    boolean checkPin (String cardID, String pin );
    float getBallance();
    void getCash (float cash);
    void addCash(float cash);
    void reject();

}
