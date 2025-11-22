@FunctionalInterface
interface LightAction {
    void execute();
}
public class SmartLightSystem {
    public static void main(String[] args) {

        // Lambda for motion-triggered lights
        LightAction motionLight = () -> System.out.println("Lights ON: Motion detected!");

        // Lambda for evening time lights
        LightAction eveningLight = () -> System.out.println("Lights DIM: Evening mode activated.");

        // Lambda for voice command lights
        LightAction voiceLight = () -> System.out.println("Lights ON: Voice command executed.");

        // Execute light actions
        motionLight.execute();
        eveningLight.execute();
        voiceLight.execute();
    }
}

