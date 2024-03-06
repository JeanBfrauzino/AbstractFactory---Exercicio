package AbstractFactory2;

public class FabricaDell implements IfabricaNotebook{

    @Override
    public Inotecomum CriaNotebookComum() {
        return new Inspiron3520();
    }

    @Override
    public Inotegamer CriaNotebookGamer() {
        return new Vostro3520();
    }
    
}
