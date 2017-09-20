/**
 * Created by Администратор on 20.09.2017.
 */
public class AssemblyLine implements IAssemblyLine{

    private PartBezel partBezel;
    private PartLenses partLenses;
    private PartArches partArches;



    public AssemblyLine(PartArches partArches, PartLenses partLenses, PartBezel partBezel) {
        this.partArches = partArches;
        this.partLenses = partLenses;
        this.partBezel = partBezel;
    }

    public PartBezel getPartBezel() {
        return partBezel;
    }

    public void setPartBezel(PartBezel partBezel) {
        this.partBezel = partBezel;
    }

    public PartLenses getPartLenses() {
        return partLenses;
    }

    public void setPartLenses(PartLenses partLenses) {
        this.partLenses = partLenses;
    }

    public PartArches getPartArches() {
        return partArches;
    }

    public void setPartArches(PartArches partArches) {
        this.partArches = partArches;
    }

    @Override
    public IProduct assemblyProduct(IProduct glasses) {

        glasses.installBezelPart(partBezel);
        glasses.installLensesPart(partLenses);
        glasses.installArchesPart(partArches);
        return glasses;
    }
}
