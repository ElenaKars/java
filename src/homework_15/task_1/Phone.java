package homework_15.task_1;

public class Phone {
        String brand;
        String operatingSystem;
        int storageCapacity;

        public Phone(String brand, String operatingSystem, int storageCapacity) {
            this.brand = brand;
            this.operatingSystem = operatingSystem;
            this.storageCapacity = storageCapacity;
        }
        public void showTheInfo() {
            System.out.println("Телефон: " + brand + ", ОС: " + operatingSystem + ", Память: " + storageCapacity + "ГБ");
        }
    }

