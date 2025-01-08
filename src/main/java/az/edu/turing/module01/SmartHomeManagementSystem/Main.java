package az.edu.turing.module01.SmartHomeManagementSystem;

public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome(5, 5);

        User user1 = new User("Rena", "Mehdiyeva", "rena@gmail.com", "password123");
        User user2 = new User("Ali", "Aliyev", "ali@gmail.com", "password456");

        smartHome.addUser(user1);
        smartHome.addUser(user2);

        Device light = new Device(1, "Living Room Light", Device.DeviceType.LIGHT);
        Device thermostat = new Device(2, "Bedroom Thermostat", Device.DeviceType.THERMOSTAT);

        smartHome.addDevice(light);
        smartHome.addDevice(thermostat);

        light.turnOn();
        thermostat.turnOff();

        smartHome.getDeviceStatus(1);

        smartHome.removeDevice(light);

        smartHome.removeUser(user1);
    }
}
