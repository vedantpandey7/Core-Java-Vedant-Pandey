public class Question3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + i);
                
            }
        });
        thread.start();
        System.out.println("Main thread is running...");
    }
}
