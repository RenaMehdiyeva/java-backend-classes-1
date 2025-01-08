package az.edu.turing.module01.SmartHomeManagementSystem;

public class Device {

    public enum DeviceType { LIGHT, THERMOSTAT, CAMERA, DOORBELL }

    private int id;
    private String name;
    private boolean status;
    private DeviceType deviceType;

    public Device(int id, String name, DeviceType deviceType) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deviceType = deviceType;
    }

    public void turnOn() {
        status = true;
        System.out.println(name + " is now ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(name + " is now OFF.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }
}
