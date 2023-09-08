public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 71;
        double height = 1.84;
        int bmi = service.calculate(mass, height);
        System.out.println(bmi);

    }
}