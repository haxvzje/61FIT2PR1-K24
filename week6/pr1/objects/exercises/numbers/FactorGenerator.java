package week6.pr1.objects.exercises.numbers;

public class FactorGenerator {
    private int factorNumber;
    private int currentFactorNumber = 2;

    public FactorGenerator(int factorNumber) {
        this.factorNumber = factorNumber;
    }

    public int getNumberToFactor() {
        return this.factorNumber;
    }

    public int getCurrentFactor() {
        return this.currentFactorNumber;
    }

    public int nextFactor() {
        while (this.factorNumber % this.currentFactorNumber != 0) {
            this.currentFactorNumber++;
        }
        this.factorNumber /= this.currentFactorNumber;
        return this.currentFactorNumber;
    }

    public boolean hasMoreFactors() {
        return this.factorNumber > 1;
    }

    public String toString() {
        return "FactorGenerator[numberToFactor=" + this.getNumberToFactor() + ",currentFactor=" + this.getCurrentFactor() + "]";
    }
}