public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("Application Running");

        // Check if both references point to same object
        if (logger1 == logger2) {
            System.out.println("Only One Logger Instance Exists");
        } else {
            System.out.println("Multiple Instances Created");
        }
    }
}