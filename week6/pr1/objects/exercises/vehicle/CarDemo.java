package week6.pr1.objects.exercises.vehicle;

public class CarDemo {

    public static void main(String[] args) {
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);
        double gasLeft = myHybrid.getGasInTank();
        System.out.println(myHybrid.toString());
        System.out.println(gasLeft);
    }
}
