package com.example.singleton;

public class SingletonPatternTest {

    public static void main(String[] args) {
        System.out.println("--- Singleton Pattern Test ---");
        System.out.println("Attempting to get the first logger instance...");
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        System.out.println("\nAttempting to get the second logger instance...");
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        System.out.println("\nAttempting to get the third logger instance...");
        Logger logger3 = Logger.getInstance();
        logger3.log("This is the third log message.");

        System.out.println("\n--- Verifying Instances ---");
        System.out.println("logger1 hashcode: " + logger1.hashCode());
        System.out.println("logger2 hashcode: " + logger2.hashCode());
        System.out.println("logger3 hashcode: " + logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\nSuccess: logger1, logger2, and logger3 point to the same instance.");
        } else {
            System.out.println("\nFailure: logger1, logger2, and logger3 point to different instances!");
        }

        // Test logging from different references to ensure they use the same logger
        System.out.println("\n--- Further Logging Tests ---");
        logger1.log("Message from logger1 reference.");
        logger2.log("Message from logger2 reference.");

        ServiceA serviceA = new ServiceA();
        serviceA.doSomething();

        ServiceB serviceB = new ServiceB();
        serviceB.doSomethingElse();

        System.out.println("\n--- Test Complete ---");
    }
}

class ServiceA {
    private Logger logger = Logger.getInstance();

    public void doSomething() {
        logger.log("ServiceA is performing an operation.");
    }
}

class ServiceB {
    private Logger logger = Logger.getInstance();

    public void doSomethingElse() {
        logger.log("ServiceB is doing something else.");
    }
}
