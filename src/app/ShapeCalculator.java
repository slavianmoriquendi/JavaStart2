package app;

public class ShapeCalculator {
    private static final String APP_NAME = "KALKULATOR KSZTAŁTÓW V1.0";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        CalculatorControl calculatorControl = new CalculatorControl();
        calculatorControl.calculatorLoop();

    }
}
