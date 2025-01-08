package az.edu.turing.module01.SmartHomeManagementSystem;

public class SmartHome {
    private User[] users;
    private Device[] devices;
    private int userCount;
    private int deviceCount;

    public SmartHome(int maxUsers, int maxDevices) {
        this.users = new User[maxUsers];
        this.devices = new Device[maxDevices];
        this.userCount = 0;
        this.deviceCount = 0;
    }
    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount++] = user;
            System.out.println("User added: " + user.getFirstName() + " " + user.getLastName());
        } else {
            System.out.println("Cannot add user. Maximum capacity reached.");
        }
    }

    public void removeUser(User user) {
        for (int i = 0; i < userCount; i++) {
            if (users[i] == user) {
                users[i] = users[userCount - 1]; // Replace with last user
                users[userCount - 1] = null; // Remove reference
                userCount--;
                System.out.println("User removed: " + user.getFirstName() + " " + user.getLastName());
                return;
            }
        }
        System.out.println("User not found.");
    }

    // Methods to manage devices
    public void addDevice(Device device) {
        if (deviceCount < devices.length) {
            devices[deviceCount++] = device;
            System.out.println("Device added: " + device.getName());
        } else {
            System.out.println("Cannot add device. Maximum capacity reached.");
        }
    }

    public void removeDevice(Device device) {
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i] == device) {
                devices[i] = devices[deviceCount - 1]; // Replace with last device
                devices[deviceCount - 1] = null; // Remove reference
                deviceCount--;
                System.out.println("Device removed: " + device.getName());
                return;
            }
        }
        System.out.println("Device not found.");
    }

    public Device getDeviceStatus(int id) {
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getId() == id) {
                System.out.println("Device status: " + (devices[i].getStatus() ? "ON" : "OFF"));
                return devices[i];
            }
        }
        System.out.println("Device not found.");
        return null;
    }
}

