package homework_21.task_2;

public class Computer {

    private Processor processor;
    private Memory memory;
    Storage storage;

    public Computer(Storage storage) {
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

    public Storage getStorage() {
        return storage;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Processor getProcessor() {
        return processor;
    }
}
