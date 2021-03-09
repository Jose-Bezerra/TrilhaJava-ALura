package capitulo3.bank;

public class Account {

    private String name; //variável de instância
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) { // Validação, se o balance for menor que 0.0
            //a variável de instância balance manterá seu valro inicial padrão 0.0
            this.balance = balance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }
}
