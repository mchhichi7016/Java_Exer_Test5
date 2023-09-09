public class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name) {
        this.name = name;
        this.speed = 0;
    }

    public void move(int speedUp, int speedDown) {
        speed = speed + speedUp - speedDown;
        System.out.println(name + " 现在的速度是：" + speed);
    }
}
