package homework_21.task_2;

public class Storage extends Component{

    public Storage(String brand, String model) {
        super(brand, model);
    }

    public String toString() {
        return "Storage [Brand: " + getBrand() + ", Model: " + getModel() + "]";
    }
}
