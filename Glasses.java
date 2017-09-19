/**
 * Created by Администратор on 20.09.2017.
 */
public class Glasses implements IProduct{

    private PartBezel partBezel;
    private PartLenses partLenses;
    private PartArches partArches;

    public Glasses(PartBezel partBezel, PartLenses partLenses, PartArches partArches) {
        this.partBezel = partBezel;
        this.partLenses = partLenses;
        this.partArches = partArches;
        System.out.println("Очки собраны");
    }

    @Override
    public void installBezelPart(IProductPart productPart) {
        System.out.println(partBezel);

    }

    @Override
    public void installLensesPart(IProductPart productPart) {
        System.out.println(partLenses);

    }

    @Override
    public void installArchesPart(IProductPart productPart) {
        System.out.println(partArches);

    }
}
