import java.util.Scanner;
public class STOPWATCH {
        private long startTime;
        private long endTime;
        private boolean running;

        public void start() {
            if (!running) {
                startTime = System.currentTimeMillis();
                running = true;
                System.out.println("Stopwatch started.");
            } else {
                System.out.println("Stopwatch is already running.");
            }
        }

        public void stop() {
            if (running) {
                endTime = System.currentTimeMillis();
                running = false;
                System.out.println("Stopwatch stopped.");
            } else {
                System.out.println("Stopwatch is not running.");
            }
        }

        public long getElapsedTime() {
            if (running) {
                return System.currentTimeMillis() - startTime;
            } else {
                return endTime - startTime;
            }
        }

        public static void main(String[] args) {
            Stopwatch stopwatch = new Stopwatch();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Stopwatch Program");
            System.out.println("Enter 'start' to start the stopwatch or 'end' to stop it:");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("start")) {
                stopwatch.start();
            } else if (input.equalsIgnoreCase("end")) {
                stopwatch.stop();
            } else {
                System.out.println("Invalid input. Exiting program.");
                scanner.close();
                return;
            }

            if (!stopwatch.running) {
                long elapsedTime = stopwatch.getElapsedTime();
                System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
            }

            scanner.close();
        }
    }


    