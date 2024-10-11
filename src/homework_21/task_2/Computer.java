package homework_21.task_2;

public class Computer {

    public Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.storage = storage;
        this.memory = new Memory("toshiba", "V100");
        this.processor = new Processor("Intel", "2345");
    }


    public void displayInfo(){
        System.out.println("Processor " + processor.getBrand() + processor.getModel());
        System.out.println("Memory " + memory.getBrand() + memory.getModel());
        System.out.println("Processor " + processor.getBrand() + processor.getModel());
        System.out.println("storage " + storage.getBrand() + storage.getModel());

    }
}
