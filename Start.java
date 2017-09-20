/**
 * Created by Администратор on 20.09.2017.
 */
public class Start {

    public static void main(String[] args) {
        LineBezel lineBezel= new LineBezel();
        LineLenses lineLenses = new LineLenses();
        LineArches lineArches = new LineArches();

        AssemblyLine assemblyLine = new AssemblyLine(LineBezel, LineLenses, LineArches);
        Glasses glasses = (Glasses)assemblyLine.assemblyProduct(new Glasses());
    }

}
