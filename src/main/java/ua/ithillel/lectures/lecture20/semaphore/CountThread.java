package ua.ithillel.lectures.lecture20.semaphore;

import lombok.AllArgsConstructor;

import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class CountThread implements Runnable {

    CommonResource resource;
    Semaphore semaphore;
    String name;

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(name + " acquires resource");
            for (int i = 0; i < 5; i++) {
                resource.setX(resource.getX() + 1);
                System.out.println(this.name + " : " + resource.getX());
                Thread.sleep(100);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        semaphore.release();
        System.out.println(this.name + " releases resource");
    }
}
