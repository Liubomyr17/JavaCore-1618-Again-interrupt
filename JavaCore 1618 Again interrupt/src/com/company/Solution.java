package com.company;

/*

1618 Again interrupt
Create a TestThread thread.
In the main method, create a thread instance, run it, and then interrupt it using the interrupt () method.

Requirements:
1. The TestThread class must be inherited from Thread.
2. The TestThread class must have a public void run method.
3. The main method must create an object of type TestThread.
4. The main method must call the start method of an object of type TestThread.
5. The main method should call an interrupt method on an object of type TestThread.


 */

import java.util.ArrayList;
import java.util.List;



public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread tst = new TestThread();
        tst.start();
        Thread.sleep(1000);
        tst.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {

        public void run() {
            while (true) {
                System.out.println("I'am Thread second");
                if (isInterrupted())
                    break;
            }
        }
    }
}





