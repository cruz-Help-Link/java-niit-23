public class Device {
    String type;
    String deviceName;
    int cost;

    @Override
    public String toString() {
        return "Device [" + "Type = " + type + ", Device name = '" + deviceName  + ']';
    }

    public Device(String type, String deviceName, int cost) {
        this.type = type;
        this.deviceName = deviceName;
        this.cost = cost;
    }
}