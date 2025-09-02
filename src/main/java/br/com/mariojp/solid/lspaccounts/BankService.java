package br.com.mariojp.solid.lspaccounts;

public class BankService {

    public void processWithdrawal(Account account, double amount) {
        if (account instanceof Withdrawable) {
            ((Withdrawable) account).withdraw(amount);
        }
    }

    public void processDeposit(Account account, double amount) {
        account.deposit(amount);
    }
}