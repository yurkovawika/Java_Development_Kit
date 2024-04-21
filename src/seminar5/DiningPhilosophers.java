package seminar5;


import java.util.concurrent.Semaphore;

public class DiningPhilosophers {

    public static void main(String[] args) {
        int numPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Semaphore table = new Semaphore(numPhilosophers - 1);

        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, table);
            new Thread(philosophers[i]).start();
        }
    }
    // Класс философа.
    static class Philosopher implements Runnable {
        private final int id;
        private final Semaphore table;

        public Philosopher(int id, Semaphore table) {
            this.id = id;
            this.table = table;
        }

        // Метод для размышления.
        private void think() {
            System.out.println("Философ " + id + " размышляет");
            try {
                Thread.sleep(500); // время уделенное на размышление
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Метод для приема пищи.
        private void eat() {
            System.out.println("Философ " + id + " ест");
            try {
                Thread.sleep(500); // Время уделенное на поглощение пищи.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                think();
                try {
                    table.acquire(); // Захват стола с условием сколько максимум может быть за столом (i).
                    eat();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    table.release(); // Стол свободен.
                }
            }
        }
    }
}
