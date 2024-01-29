public class Cycle {
    public static void main(String[] args) {
        int bicycles = 10;

        int totalWheels = 47;

        int wheelsPerBicycle = 2;

        int tricycles = (totalWheels - (bicycles * wheelsPerBicycle)) / (wheelsPerBicycle - 1);

        System.out.println("The Cycle shop has " + tricycles + " tricycles.");
    }
}
