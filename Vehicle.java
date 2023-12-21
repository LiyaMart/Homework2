package Homework2;

public abstract class Vehicle {

    protected int id; // уникальный идентификатор
    protected String brand; // марка
    protected String model; // модель
    protected int year; // год выпуска
      
    // Контруктор класса Vehicle
  
    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Абстрактный метод для запуска двигателя 
    abstract void startEngine();

    // Абстрактный метод для остановки двигателя 
    abstract void stopEngine();

    // Абстрактный метод для увеличения скорости на указанное значение 
    abstract void accelerate(int speed);

    // Абстрактный метод для прекращение движения 
    abstract void brake();

    // Абстрактный метод для вывода информации о транспортном средстве
    abstract void displayInfo();
}