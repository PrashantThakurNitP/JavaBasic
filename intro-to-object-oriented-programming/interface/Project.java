public class Project {

    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        Double val1 = algorithm.complexAlgorithm(2, 32);
        System.out.println(val1);
        algorithm.print();

        ComplexAlgorithm algorithm1 = new RealAlgorithm();
        Double val2 = algorithm1.complexAlgorithm(2, 32);
        System.out.println(val2);
        algorithm1.print();

    }

}
