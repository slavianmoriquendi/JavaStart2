package app;

import exception.NoSuchShapeException;
import io.DataPrinter;
import io.DataReader;
import model.Shape;

import java.util.InputMismatchException;

public class CalculatorControl {
    private DataPrinter dataPrinter = new DataPrinter();
    private DataReader dataReader = new DataReader(dataPrinter);

    public void calculatorLoop() {
        ShapeOptions shapeOptions;
        do {
            optionPrint();
            shapeOptions = getShape();
            switch (shapeOptions){
                case CIRCLE:
                    giveAreaAndPerimeter(dataReader.readAndCreateCircle());
                    break;
                case RECTANGLE:
                    giveAreaAndPerimeter(dataReader.readAndCreateRectangle());
                    break;
                case TRIANGLE:
                    giveAreaAndPerimeter(dataReader.readAndCreateTriangle());
                    break;
                case EXIT:
                    dataPrinter.print("Koniec programu");
                    break;
                default:
                    dataPrinter.print("Nie ma takiej opcji");
            }
        }while (shapeOptions!= ShapeOptions.EXIT);

    }
    private void giveAreaAndPerimeter(Shape shape){
        double area = shape.calculateArea();
        double perimeter = shape.calculatePerimeter();
        dataPrinter.print("Pole wynosi: " + area + " a obwód jest równy "+ perimeter);
    }

    private void optionPrint() {
        dataPrinter.print("Wybierz kształt: ");
        for (ShapeOptions shapes : ShapeOptions.values()) {
            dataPrinter.print(shapes.toString());
        }
    }

    private ShapeOptions getShape() {
        boolean shapeOptionOk = false;
        ShapeOptions shapeOption = null;
        while (!shapeOptionOk) {
            try {
                shapeOption = ShapeOptions.createFromInt((int) dataReader.numberImput());
                shapeOptionOk = true;
            } catch (NoSuchShapeException e) {
                dataPrinter.print("Nie ma takiego kształtu");
            } catch (InputMismatchException e) {
                dataPrinter.print("Wprowadzono nieprawidłowy typ danych, podaj ponownie: ");
            }
        }
        return shapeOption;

    }
}