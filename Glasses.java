/**
 * Created by Администратор on 20.09.2017.
 */
public class Glasses implements IProduct{

    private IProductPart partBezel;
    private IProductPart partLenses;
    private IProductPart partArches;



    @Override
    public void installBezelPart(IProductPart productPart) {
        this.partBezel = partBezel;

    }

    @Override
    public void installLensesPart(IProductPart productPart) {
        this.partLenses = partLenses;

    }

    @Override
    public void installArchesPart(IProductPart productPart) {
        this.partArches = partArches;

    }
}
