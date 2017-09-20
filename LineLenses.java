/**
 * Created by Администратор on 20.09.2017.
 */
public class LineLenses implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new PartLenses();
    }
}
