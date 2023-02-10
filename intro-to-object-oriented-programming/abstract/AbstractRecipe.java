
public abstract class AbstractRecipe {

    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }
    /*
     * syntaticaly it is allowed to create abstract class without any abstract
     * method.
     * abstract class can also extend another abstract class -> in that case it
     * donot need to provide impementation for abstarct methof in parent class.
     * 
     * we can also have non abstarct method aswell as variable in abstract class
     */

    public abstract void getReady();

    public abstract void doTheDish();

    public abstract void cleanup();

    // preparation

    // recipe

    // cleanup

}
