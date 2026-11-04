class Computer{
    private String cpu="Core i7";
    private String ram="16GB";
    private String hdd="2TB";
    private String color="White";
    private String power="500W";

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("CPU: "+cpu);
        System.out.println("RAM: "+ram);
        System.out.println("HDD: "+hdd);
        System.out.println("Color: "+color);
        System.out.println("Power: "+power);
    }
}
class Monitor{
    private String size="24inch";
    private String color="Black";
    private String power="45W";

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("Size: "+size);
        System.out.println("Color: "+color);
        System.out.println("Power: "+power);
    }
}
class PersonalComputer{
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor){
        this.computer=computer;
        this.monitor=monitor;
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}
public class Homework5{
    public static void main(String[] args) {
        Computer computer = new Computer();
        Monitor monitor = new Monitor();
        PersonalComputer pc = new PersonalComputer(computer, monitor);
        pc.turnOn();
        pc.printInfo();
    }
}