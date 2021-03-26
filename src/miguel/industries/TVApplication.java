package miguel.industries;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TVApplication {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl(television);
        int userRemote;
        boolean stop = true;

        System.out.println(television.toString());
        while (stop) {
            try {
                do {
                    remoteMenu();
                    userRemote = scanner.nextInt();

                    stop = executeRemote(television, remoteControl, userRemote, true);
                }while (stop);
            } catch (InputMismatchException e) {
                System.err.println("Please Input Between Number 1 - 6");
                scanner.nextLine();
            }
        }

    }

    private static boolean executeRemote(Television television, RemoteControl remoteControl, int userRemote, boolean stop) {
        switch (userRemote) {
            case 1 -> {
                remoteControl.powerButton();
                System.out.println("\nPower Button Pressed");
                System.out.println(television.toString());
            }
            case 2 -> {
                remoteControl.volumeUpByHalf();
                System.out.println("\nVolume Up by 50% Button Pressed");
                System.out.println(television.toString());
            }
            case 3 -> {
                remoteControl.volumeDownByHalf();
                System.out.println("\nVolume Down by 50% Button Pressed");
                System.out.println(television.toString());
            }
            case 4 -> {
                remoteControl.channelUpButton();
                System.out.println("\nChannel Up Button Pressed");
                System.out.println(television.toString());
            }
            case 5 -> {
                remoteControl.channelDownButton();
                System.out.println("\nChannel Down Button Pressed");
                System.out.println(television.toString());
            }
            case 6 -> {
                System.out.println("\nGoing Outside...");
                stop = false;
            }
            default -> System.out.println("No button Pressed!");
        }
        return stop;
    }

    private static void remoteMenu() {
        System.out.println("\nPress a Button on the Remote Control");
        System.out.println("1. Power 2. Volume Up by 50% 3. Volume Down by 50% 4. Channel Up 5. Channel Down " +
                "6. Stop watching TV and go outside");
    }
}
