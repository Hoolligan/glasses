/**
 * Created by Администратор on 20.09.2017.
 */
public class PartArches implements IProductPart {

    private String material;

    public PartArches(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
