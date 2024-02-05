public class BmiService {
    public int calculate(int weight, double height) {
        int bodyMassIndex;
        bodyMassIndex = (int) (weight / (height * height));
        return bodyMassIndex;
    }
}
