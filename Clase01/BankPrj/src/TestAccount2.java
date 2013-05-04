/**
 *
 * @author Andrés Méndez Juanias
 */
public class TestAccount2 {

    public static void main(String args[]){
        Account ac = new Account(100.0);
        ac.balance = ac.balance + 47.0;
        ac.balance = ac.balance -150.0;
        System.err.println("Final account balance is: " + ac.balance);
    }
}
