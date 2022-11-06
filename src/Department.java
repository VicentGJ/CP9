import java.util.ArrayList;

public class Department extends Dependency{

    private int maxCant;
    private ArrayList<Worker> workers;

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public int getMaxCant() {
        return maxCant;
    }

    public void setMaxCant(int maxCant) {
        this.maxCant = maxCant;
    }

    public Department(String name) {
        super(name);
    }
}
