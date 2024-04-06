package seminar2;

public class Frontender extends Developer implements Backendable,Frontendable {


    @Override
    public void doBackendWork() {
        System.out.println("Моя не уметь...");
    }

    @Override
    public void doFrontenddWork() {
        System.out.println("Работа выполнена");
    }
    Frontender(String name){
        super(name);

    }

    public void developGUI(){
        System.out.println("Графический интерфейс создан.");
    }



}
