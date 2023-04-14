public class BmiService {
    public double calculate(double weight, double hight) {
        double result;
        if (weight >= 1) {
            result = weight / (hight * 2);
        } else {
            result = 0;
        }
        return result;
    }
}
