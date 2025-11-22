public class SensorLogger {

    public static void log(Double temp) {
        System.out.println("Logged temperature: " + temp);
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.5;
        Double wrapperTemp = 40.2;

        log(primitiveTemp);  // auto-box
        log(wrapperTemp);

        double read = wrapperTemp; // auto-unbox
        System.out.println("Read back: " + read);
    }
}
