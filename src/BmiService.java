public class BmiService {
    public double calculate(double a, double b) {
        double result;
        if (a>=1) {
            result = a/(b*2);
        }else { result= 0;
        }
        return result;
    }
}
