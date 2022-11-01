public class MyThread5 implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    MyThread5(String name) {
        thrd = new Thread(this,name);
        suspended = false;
        stopped = false;
    }

    public static MyThread5 createAndStart(String name) {
        MyThread5 myThrd = new MyThread5(name);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting");
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i%10) ==0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }
    synchronized void  mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

class Suspend {
    public static void main(String[] args) {
        MyThread5 mt1 = MyThread5.createAndStart("My Thread");

        try {
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Stopping thread");
            mt1.mystop();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread Interrerupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
