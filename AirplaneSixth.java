package Airplans;

public class AirplaneSixth extends AirplaneThree {
    // Метод класу AirplaneSixth, який викликає метод з зовнішнього класу AirplaneThree
    public AirplaneSixth(double speed, int passenger, String model) {
        super(speed, passenger, model);
    }
    void methodSixth() {
        getModel();  // Виклик методу з класу AirplaneThree
        System.out.println("method sixth");

    }

    // Метод для тестування внутрішнього класу AirplaneSixthDemo
    void test() {
        AirplaneSixthDemo demo = new AirplaneSixthDemo();  // Створення об'єкта внутрішнього класу
        demo.methodSixthDemo();  // Виклик методу внутрішнього класу
    }

    // Внутрішній клас AirplaneSixthDemo
    class AirplaneSixthDemo {
        // Метод внутрішнього класу, який виводить повідомлення та викликає метод зовнішнього класу
        void methodSixthDemo() {
            System.out.println("method sixthDemo does something");
            methodSixth();  // Виклик методу зовнішнього класу AirplaneSixth
        }
    }

}
