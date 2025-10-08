package week6.pr1.objects.exercises.banking;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount benson = new BankAccount("Benson", 117.25);
        BankAccount mathew = new BankAccount("Mathew", 20);

        System.out.println(benson.toString());
        System.out.println(mathew.toString());

        benson.deposit(3);
        System.out.println(benson.toString());

        mathew.transfer(benson, 37);
        System.out.println(benson.toString());
        System.out.println(mathew.toString());
    }
}
