package week6.pr1.objects.exercises.numbers;

public class FactorPrinter {
    public static void main(String[] args) {
        FactorGenerator firstNumber = new FactorGenerator(150);
		System.out.println(firstNumber);
		System.out.println(firstNumber.nextFactor());
		System.out.println(firstNumber);

        FactorGenerator secondNumber = new FactorGenerator(150);
        while (secondNumber.hasMoreFactors()) {
            System.out.print(secondNumber.nextFactor() + " ");
        }
    }
}
