package seminar4;
import java.util.UUID;

public class Worker {
    private final String ID = UUID.randomUUID().toString().substring(0, 4);
    private final String name;
    private final String phone;
    private final int workExperience;

    public Worker(String name, String phone, int workExperience) {
        this.name = name;
        this.phone = phone;
        this.workExperience = workExperience;
    }

    public String getId(){
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return String.format("Worker ID: %s\tName: %s\tPhone: %s\tWork experience: %d\n"
                , ID, name, phone, workExperience);
    }
}