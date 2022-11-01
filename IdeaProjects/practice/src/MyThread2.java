public class MyThread2 implements Runnable{
    Thread thrd;

    MyThread2(String name){
        thrd = new Thread(this,name);
    }

    public static MyThread2 createAndStart(String name){
        MyThread2 myThrd = new MyThread2(name);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run(){
        System.out.println(thrd.getName() + " starting");
        try{
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class JoinThreads {
    public static void main(String[] args){
        System.out.println("Main thread starting");

        MyThread2 mt1 = MyThread2.createAndStart("Child #1");
        MyThread2 mt2 = MyThread2.createAndStart("Child #2");
        MyThread2 mt3 = MyThread2.createAndStart("Child #3");

           try {
               mt1.thrd.join();
               System.out.println("Child #1 joined.");
               mt2.thrd.join();
               System.out.println("Child #2 joined.");
               mt3.thrd.join();
               System.out.println("Child #3 joined");
           }
           catch (InterruptedException exc) {
               System.out.println("Main thread interrupted.");
           }

        System.out.println("Main thread ending.");
    }
}
