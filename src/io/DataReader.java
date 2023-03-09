package io;

import model.Circle;
import model.Rectangle;
import model.Triangle;

import java.util.Scanner;

public class DataReader {
    DataPrinter dataPrinter = new DataPrinter();
    Scanner sc = new Scanner(System.in);
    public DataReader(DataPrinter dataPrinter) {
        this.dataPrinter = dataPrinter;
    }
    public double numberImput() {
        try {
            return sc.nextDouble();
        } finally {
            sc.nextLine();
        }
    }
    public Circle readAndCreateCircle(){
        dataPrinter.print("Podaj promień koła");
        return new Circle(numberImput());
    }
    public Triangle readAndCreateTriangle(){
        dataPrinter.print("Podaj kolejne boki trójkąta");
        return new Triangle(numberImput(),numberImput(),numberImput());
    }
    public Rectangle readAndCreateRectangle(){
        dataPrinter.print("Podaj boki prostokąta");
        return new Rectangle(numberImput(),numberImput());
    }
}