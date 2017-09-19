/**
 * Created by Администратор on 20.09.2017.
 */
public class PartLenses implements IProductPart {

    private String name;

    public PartLenses(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
