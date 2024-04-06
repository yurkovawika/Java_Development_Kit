package seminar2;

public class FullStack extends  Developer implements  Backendable,Frontendable{
    @Override
    public void doBackendWork() {
        System.out.println("Работа выполнена");
    }

    @Override
    public void doFrontenddWork() {
        System.out.println("Работа выполнена");
    }
    public FullStack(String name){
        super(name);
    }
}
