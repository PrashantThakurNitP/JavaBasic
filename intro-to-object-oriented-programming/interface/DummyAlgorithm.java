public class DummyAlgorithm implements ComplexAlgorithm {

    @Override
    public Double complexAlgorithm(int number1, int number2) {

        return Double.valueOf(number1 + number2);
    }

}
