package ua.ithillel.lectures.lecture20.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangeDemo {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(new PutThread(exchanger)).start();
        new Thread(new GetThread(exchanger)).start();
    }

    static class PutThread implements Runnable {

        Exchanger<String> exchanger;
        String message;

        public PutThread(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            this.message = "Hello Java";
        }

        @Override
        public void run() {
            try {
                message = exchanger.exchange(message);
                System.out.println("PutThread has received : " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class GetThread implements Runnable {

        Exchanger<String> exchanger;
        String message;

        public GetThread(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            this.message = "Hello World";
        }

        @Override
        public void run() {
            try {
                message = exchanger.exchange(message);
                System.out.println("GetThread has received : " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
