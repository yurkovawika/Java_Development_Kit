package seminar4;

import java.util.ArrayList;
import java.util.List;

public class WorkerRepository {
    private final List<Worker> workers;

    public WorkerRepository() {
        this.workers = new ArrayList<>();
    }

    public void printRepository(){
        for (Worker worker : workers){
            System.out.println(worker);
            System.out.println();
        }
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }

    public Worker findById(String id){
        return workers.stream().filter(worker -> worker.getId().equals(id)).findFirst().orElse(null);
    }

    public List<String> getPhoneByName(String name){
        return workers.stream().filter(worker -> worker.getName().equals(name)).toList()
                .stream().map(Worker::getPhone).toList();
    }

    public List<Worker> getWorkerByWorkingExperience(int stage){
        return workers.stream().filter(worker -> worker.getWorkExperience() == stage).toList();
    }
}
