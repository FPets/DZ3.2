public class BmiService {
    public double calculate(double weight, double hight) {
        double result;
        if (weight >= 1) {
            result = weight / hight / hight;
        } else {
            result = 0;
        }
        return result;
    }
}
