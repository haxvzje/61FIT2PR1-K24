package week6.pr1.objects.exercises.vehicle;

public class Car {

    private final int efficiency;
    private double fuel;

    public Car(int efficiency) {
        this.efficiency = efficiency;
        this.fuel = 0;
    }

    public void drive(double distance) {
        this.fuel -= distance / this.efficiency;
    }

    public void addGas(double ammout) {
        this.fuel+=ammout;
    }

    public double getGasInTank() {
        return this.fuel;
    }

    public int getFuelEfficiency() {
        return this.efficiency;
    }

    @Override
    public String toString() {
        return "Car[fuelEfficiency=" + this.getFuelEfficiency() + ", amountOfFuel=" + this.getGasInTank() + "]";
    }
}
