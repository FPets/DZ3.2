public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 71;
        double height = 1.7;
        double bmi = service.calculate(weight,height);
        System.out.println("BMI Index:");
        System.out.printf("%.1f",bmi);
    }
}