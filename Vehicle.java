public class Vehicle {
    public int position;
    public int time;

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


    public  void  move(){
        System.out.println("gogogo!");

    }

    public void move(int speed,int time){
        position = 0;
        this.speed = speed;
        this.time = time;
        position = speed * time;
        System.out.println("现在位置是：" + position);
    }

    public void speedUp(){
        System.out.println("冲冲冲！");
    }

    public void speedDown(){
        System.out.println("慢一点！");
    }

    public Vehicle(String name){
        this.name = name;
        speed = 0;

        System.out.println(name + " " + "初始速速为：" + speed);

    }

    public void speed(int speedUp,int speedDown){
        this.speed = 0;
        this.speed = speed + speedUp - speedDown;

        System.out.println("现在速度是：" + speed);
    }


}
