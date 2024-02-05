public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;  // Масса тела в килограммах
        double height = 1.87;  // Рост в метрах
        int bodyMassIndex = service.calculate(weight, height);
        System.out.println("Индекс массы тела равен"+" "+ bodyMassIndex);
    }
}