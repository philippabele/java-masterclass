package section10lists.autoboxingchallenge;

public class Main {

    public static void main(String[] args) {

        Customer peter = new Customer("Peter Pan", 2000.0);
        System.out.println(peter);

        Bank bank = new Bank("Monopoly");
        bank.addNewCustomer("Micky", 300);
        System.out.println(bank);

        bank.addTransactions("Micky", -20);
        bank.addTransactions("Micky", 30);
        bank.addTransactions("Micky", 40);
        bank.addTransactions("Micky", -50);
        bank.addTransactions("Micky", 60);
        bank.addTransactions("Micky", -70);

        bank.printStatement("Micky");
    }

}
