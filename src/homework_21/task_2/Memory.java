package homework_21.task_2;

public class Memory extends Component{

    public Memory(String brand, String model) {
        super(brand, model);
    }

    public String toString(){
        return "Memory" + this.getBrand() + this.getModel();
    }


}
