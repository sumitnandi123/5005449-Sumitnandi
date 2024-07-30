import java.util.Scanner;

public class RemoteControl {
    private Command lightOnCommand;
    private Command lightOffCommand;

    public void setLightOnCommand(Command lightOnCommand) {
        this.lightOnCommand = lightOnCommand;
    }

    public void setLightOffCommand(Command lightOffCommand) {
        this.lightOffCommand = lightOffCommand;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Enter 'on' to turn the light on, 'off' to turn the light off, or 'exit' to quit:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("on")) {
                lightOnCommand.execute();
            } else if (input.equalsIgnoreCase("off")) {
                lightOffCommand.execute();
            } else if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Invalid command. Please enter 'on', 'off', or 'exit'.");
            }
        }
        scanner.close();
    }
}
