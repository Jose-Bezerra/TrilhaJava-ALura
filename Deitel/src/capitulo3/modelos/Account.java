package capitulo3.modelos;

public class Account {

    private String name; //variável de instância
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) { // Validação, se o balance for menor que 0.0
            //a variável de instância balance manterá seu valor inicial padrão 0.0
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

    public void withdraw (double withdrawAmount) {
        if ( withdrawAmount < this.balance) {
           this.balance -= withdrawAmount;

        } else {
            System.out.println( "Withdraw amount exceeded account balance");;

        }
    }
}
