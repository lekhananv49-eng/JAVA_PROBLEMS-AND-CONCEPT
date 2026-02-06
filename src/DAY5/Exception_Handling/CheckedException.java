package DAY5.Exception_Handling;

// COMPILE-TIME-EXCEPTION
// Example: 
// 1.IOException
// 2. FileNotFoundException
// 3.ClassNotFoundException
// 4.InterruptedException

class DownloadTask extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Downloading" + (i * 10) + "%");
                Thread.sleep(500);
            }
            System.out.println("Download Completed");
        } catch (InterruptedException e) {
            System.out.println("Download stopped");
        }
    }
}

public class CheckedException {

    public static void main(String[] args) throws InterruptedException {
        DownloadTask t = new DownloadTask();
        t.start();

        Thread.sleep(6000);
        System.out.println("User clicked CANCEL");
        t.interrupt();
    }
}
