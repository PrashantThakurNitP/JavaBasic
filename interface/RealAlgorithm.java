public class RealAlgorithm implements ComplexAlgorithm {

    @Override
    public Double complexAlgorithm(int number1, int number2) {
        // TODO Auto-generated method stub
        return Math.pow(number1, number2);
    }

    @Override
    public void print() {
        System.out.println("Real method created inside iterface");
    }
}
