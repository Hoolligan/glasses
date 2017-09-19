/**
 * Created by Администратор on 20.09.2017.
 */
public class PartBezel implements IProductPart {

    private int idNumber;

    public PartBezel(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
