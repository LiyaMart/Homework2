package Homework2;

public class Car extends Vehicle {
    
    protected int fuelCapacity; // емкость топливного бака

    public Car(int id, String brand, String model, int year, int fuelCapacity) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Уникальный идентификатор " + super.id + "\n" + "Марка " + super.brand + "\n" + "Модель " + super.model + "\n" + "Год выпуска " + super.year + "\n" + "Объем топливного бака " + this.fuelCapacity);       
    }

    @Override
    void startEngine() {
        System.out.println("Запуск двигателя");
    }

    @Override
    void stopEngine() {
        System.out.println("Остановка двигателя");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Увеличение скорости на " + (speed));
    }

    @Override
    void brake() {
        System.out.println("Прекращение движения автомобиля");
    }
    
    // Метод для заправки транспортного средства (увеличения уровня топлива)

    void refuel(int liters, int currentFuelLevel) {
        if ((liters+currentFuelLevel) > fuelCapacity) {
            System.out.println("Уровень топлива в баке " + fuelCapacity + ". Топливный бак заполнен!");
        } else {
             System.out.println("Уровень топлива в баке " + (liters+currentFuelLevel));
        }
    }
}
