package Encapsulation.Account;

public class AccountAccess {
    public static void main(String[] args) {
        Account account =new Account();
        account.setName("raju");
        account.setAcc_no(182045678);
        account.setEmail("fgsdgfs@gmail.com");
        System.out.println(account.getName() + " "+ account.getAcc_no() + " " + account.getEmail());
    }



    }

