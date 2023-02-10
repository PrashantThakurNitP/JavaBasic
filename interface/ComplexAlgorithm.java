public interface ComplexAlgorithm {
    /*
     * usage of interface
     * If project want to outsource source something while it continue to work on it
     * for that it can create interface for it
     * 
     * User of this can start using it using a dummy algoritm/ dummy impementation
     * of it
     * 
     * if it is completed then we just need to change
     * 
     * ComplexAlgorithm algorithm = new DummyAlgorithm();
     * to
     * 
     * ComplexAlgorithm algorithm = new RealAlgorithm();
     * 
     * hence interface provide way to communicate between different project
     * 
     * it establishes the communication aggrement/contract between two casses
     * talking to each other
     * 
     * Note:
     * An iterface interface2 can extend another interface interface2
     * 
     * if concrete class want to implement interface2 then it need to impemnts both
     * method
     * 
     * abstarct class can only implemet some of method defined in (interface 1 ,
     * interface2)
     * 
     * abstract clss implementationAbstarct implements iterface2{
     * public void method1()
     * //method 2 not implemnted and it is allowed beacuse it is abstarct class
     * }
     * 
     * Note
     * in interface variable declared acts as constants and we cannot change value,
     * we need to assign vaue to variable created otherwise it will not be allowed
     * 
     * After java8 we can create real implementation inside interface
     * 
     * 
     */
    default void print() {
        System.out.println("Default method created inside iterface");
    }
    /*
     * if class implenting this interface donot provide implementation of above
     * default
     * method it will get defaut implentations
     * 
     * if overidden in child class ovverriden implementation will persist
     * 
     * providing default method in interface is useful when we want to add new
     * method so that issue donot come in external party code
     */
    /*
     * inteface is useful when we have two system talking to each other and we want
     * to establish communication pattern within them
     */
    /*
     * with abstract class we provide high level details we leave implentation
     * detail to subclass we want to ensure that all subclass meet the structure
     * 
     * to be abe to use abstract class we use inheritance ie is a relationship exist
     * between subclass ans superclass
     * 
     * there is no real relationship except syntax look same
     * 
     * in interface we cannot call method as private everything is public
     * in abstarct class we can have private method
     * 
     * in interface we cannot have variable whose value can change
     * 
     * in abstract class we can have all type of variable similar to class
     * 
     * class can implements multiple interfaces but you cannot extends multipe
     * abstarct class we cannot inherit from two superclass
     */

    Double complexAlgorithm(int number1, int number2);

}
