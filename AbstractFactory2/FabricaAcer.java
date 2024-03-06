package AbstractFactory2;

public class FabricaAcer implements IfabricaNotebook {

    @Override
    public Inotecomum CriaNotebookComum() {
        return new Aspire3();
    }

    @Override
    public Inotegamer CriaNotebookGamer() {
        return new Nitro5();
    }
    
}
