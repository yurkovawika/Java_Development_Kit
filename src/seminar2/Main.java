package seminar2;


//Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender,
// и далее вызывался метод developGUI(), не изменяя существующие интерфейсы, только код основного класса.

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Developer back = new Backender("Skott");
        Developer front = new Frontender("Mike");
        Developer full = new FullStack("Tom");


        List<Developer> developers = new ArrayList<>();
        developers.add(back);
        developers.add(front);
        developers.add(full);

        for( Developer dev : developers){
            developGUIWork(dev);
        }


    }

     static void developGUIWork(Developer dev) {
        if (dev instanceof Frontender) {
            ((Frontender) dev).developGUI();
        } else {
            System.out.println(dev.getClass().getSimpleName()+ " не умеет создавать графический интерфейс!");
        }

    }
}

// Проверить, что будет , если в Developer записать обьект Frontender