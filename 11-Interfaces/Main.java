public class Main {
    public static void main(String[] args) {
        TV t1 = new TV(4);
        t1.on();
        t1.displayInfo();
        t1.channelUp();
        t1.volumeUp();
        t1.displayInfo();
    }
}
