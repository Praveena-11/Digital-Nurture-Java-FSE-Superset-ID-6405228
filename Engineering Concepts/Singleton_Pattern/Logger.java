package Singleton_Pattern;
public class Logger {
    // Step 1: Create a private static instance
    private static Logger instance;

    // Step 2: Make the constructor private so no external instantiation is allowed
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Logging method for demonstration
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

