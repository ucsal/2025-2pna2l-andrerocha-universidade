import br.com.mariojp.solid.lspaccounts.*;

public class Main {
    public static void main(String[] args) {
        BankService service = new BankService();

        CheckingAccount checking = new CheckingAccount();
        SavingsAccount savings = new SavingsAccount();

        checking.deposit(500);
        savings.deposit(1000);

        
        service.processWithdrawal(checking, 200);

        System.out.println("Saldo conta corrente: " + checking.getBalance());
        System.out.println("Saldo poupança: " + savings.getBalance());
    }
}