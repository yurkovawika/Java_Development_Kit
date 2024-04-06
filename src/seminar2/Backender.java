package seminar2;

public class Backender extends Developer implements Backendable, Frontendable {


    @Override
    public void doBackendWork() {
        System.out.println("Работа выполнена");
    }

    @Override
    public void doFrontenddWork() {
        System.out.println("Моя не уметь...");


    }

    public Backender(String name){
        super(name);
    }
}
