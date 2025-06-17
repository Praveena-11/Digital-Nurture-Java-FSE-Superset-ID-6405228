package SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        // Get the Logger instance multiple times
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("First log message.");
        logger2.log("Second log message.");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger exists.");
        } else {
            System.out.println("Different instances detected (this should not happen).");
        }
    }
}
