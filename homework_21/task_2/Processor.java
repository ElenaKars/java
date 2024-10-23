package homework_21.task_2;

public class Processor extends Component {

    public Processor(String brand, String model) {
        super(brand, model);
    }
    public String toString(){
        return "Processor" + this.getBrand() + this.getModel();
    }

}
