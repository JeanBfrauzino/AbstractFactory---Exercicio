package AbstractFactory2;

public class main {
    public static void main(String[] args) {
        IfabricaNotebook Acer = new FabricaAcer();
       Inotecomum Aspire3 = Acer.CriaNotebookComum();
        Aspire3.ExibeInfoNoteComum();
    }
}
