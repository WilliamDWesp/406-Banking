package Accounts.BankAccounts.Debt;

import Accounts.BankAccounts.Accounts;

public abstract class DebtAccounts extends Accounts{


    public DebtAccounts(String ID, String cusID, double balance, String openDate){
        super(ID, cusID, balance, openDate);
    }

}