package rmiclient;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmicommon.Account;

public class Main {

    public static void main(String[] args) throws Exception {
        //Registry registry = LocateRegistry.getRegistry("172.18.137.4", 1099);
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
        Account account1 = (Account)registry.lookup("account1");
        Account account2 = (Account)registry.lookup("account2");
        System.out.println("crediting 1000 on account1...");
        float result = account1.credit(1000);
        account2.credit(100);
        //System.out.println((java.net.InetAddress.getLocalHost()).toString());

        transfert(account2, account1, 50);
        
        System.out.println("credit operation returned "+result);


















        
    }
    public static void transfert(Account account1,Account account2, float amount)throws Exception{
        float res1=account1.debit(amount);
        float res2=account2.credit(amount);
    };

}
