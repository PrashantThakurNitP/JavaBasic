
public class Recipe1 extends AbstractRecipe {
    @Override
    public void getReady() {
        System.out.println("get ready");
    }

    @Override
    public void doTheDish() {
        System.out.println("do the disk");

    }

    @Override
    public void cleanup() {
        System.out.println("cleanup");

    }

}
