/**
 * <b>Descripción: </b>Clase test para la prueba de la calse Account. 
 *
 * @author Andrés Méndez Juanias
 */
public class TestAccount {

    public static void main(String args[]){
        Account account = new Account(100.0);
        account.deposit(50.0);
        account.withdraw(147.0);
        System.err.println("Final account balance is: " + account.getBalance());
    }
}