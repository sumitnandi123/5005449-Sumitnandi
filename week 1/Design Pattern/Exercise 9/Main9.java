public class Main9 {
    public static void main(String[] args) {
        // Create the receiver
        Light livingRoomLight = new Light();

        // Create command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create the invoker
        RemoteControl remote = new RemoteControl();
        remote.setLightOnCommand(lightOn);
        remote.setLightOffCommand(lightOff);

        // Start remote control to listen for user input
        remote.start();
    }
}
