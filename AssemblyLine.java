
/**
 * Created by Администратор on 20.09.2017.
 */
public class AssemblyLine implements IAssemblyLine{

    private ILineStep lineBezel;
    private ILineStep lineLenses;
    private ILineStep lineArches;

    public AssemblyLine(ILineStep lineBezel, ILineStep lineLenses, ILineStep lineArches) {
        this.lineBezel = lineBezel;
        this.lineLenses = lineLenses;
        this.lineArches = lineArches;
    }

    @Override
    public IProduct assemblyProduct(IProduct glasses) {
        lineBezel.buildProductPart();
        lineLenses.buildProductPart();
        lineArches.buildProductPart();

        glasses.installBezelPart(PartBezel);
        glasses.installLensesPart(PartLenses);
        glasses.installArchesPart(PartArches);
        return glasses;
    }
}
