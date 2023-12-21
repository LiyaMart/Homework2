package Homework2;

public class Boat extends Vehicle implements Swimmable {

    protected int maxSpeed; // максимальная скорость на воде 
    protected boolean isSailing = false; // флаг состояния движения по воде

    public Boat(int id, String brand, String model, int year, int maxSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
    }

    public void isSailing() {
        System.out.println(this.isSailing);;
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

    @Override
    void displayInfo() {
        System.out.println("Уникальный идентификатор " + super.id + "\n" + "Марка " + super.brand + "\n" + "Модель " + super.model + "\n" + "Год выпуска " + super.year + "\n" + "Максимальная скорость на воде " + maxSpeed );
    }

    public void startSwimming(){
       System.out.println("Начало движения лодки по воде");
       isSailing = true;
    }
    
    public void stopSwimming(){
        System.out.println("Прекращение движения лодки по воде");
        isSailing = false;
    };
}
