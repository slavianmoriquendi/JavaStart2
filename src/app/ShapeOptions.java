package app;

import exception.NoSuchShapeException;

public enum ShapeOptions {
    CIRCLE(1, "KOŁO"), TRIANGLE(2, "TRÓJKĄT"), RECTANGLE(3, "KWADRAT"),EXIT(4,"WYJDŹ");

    private final int value;
    private String description;

    ShapeOptions(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }
    static ShapeOptions createFromInt(int option) throws NoSuchShapeException {
        try{
            return ShapeOptions.values()[option-1];
        }catch (ArrayIndexOutOfBoundsException e){
            throw new NoSuchShapeException("Nie ma kształtu o takim id " + option);
        }
    }
}
