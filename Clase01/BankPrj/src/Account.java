/**
 * Clase Account creada para el ejercicio 2 nivel 3.
 * @author Andrés Méndez Juanias
 */
public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt){
        this.balance += amt;
    }

    public void withdraw(double amt){
        double temp = this.balance - amt;
        this.balance = temp < 0? this.balance: temp;
    }

    public double getBalance() {
        return balance;
    }

}
