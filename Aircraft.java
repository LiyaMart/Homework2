package Homework2;

public class Aircraft extends Vehicle implements Flyable {

    protected int maxAltitude; // максимальная высота полета
    protected boolean isFlying = false; // флаг состояния полета

    public void isFlying() {
        System.out.println(this.isFlying);
    }
        

    public Aircraft(int id, String brand, String model, int year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
    }

    @Override
    void displayInfo() {
        System.out.println("Уникальный идентификатор " + super.id + "\n" + "Марка " + super.brand + "\n" + "Модель " + super.model + "\n" + "Год выпуска " + super.year + "\n" + "Максимальная высота полета " + this.maxAltitude); 
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
        System.out.println("Прекращение движения самолета");
    }

    public void takeOff(){
        System.out.println("Взлет самолета");
        isFlying = true;
    }

    public void land(){
        System.out.println("Посадка самолета");
        isFlying = false;
    }
}
    