public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Car("100", 5);
        vehicles[1] = new Truck("Volvo", 1000);
        vehicles[2] = new Car("Honda", 4);
        vehicles[3] = new Truck("Ford", 800);

        // 使用循环调用各种交通工具的方法
        for (Vehicle vehicle : vehicles) {
            vehicle.move(10, 2);
        }

    }
}
