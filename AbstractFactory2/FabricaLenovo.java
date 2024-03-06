package AbstractFactory2;

public class FabricaLenovo implements IfabricaNotebook{

    @Override
    public Inotecomum CriaNotebookComum() {
       return new Ideapad();
    }

    @Override
    public Inotegamer CriaNotebookGamer() {
        return new Legion5();
    }
    
}
