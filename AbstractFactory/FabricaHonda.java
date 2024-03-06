package AbstractFactory;

public class FabricaHonda implements Ifabricadecarros{

    @Override
    public IcarroSedan criacarrosedan() {
        return new Civic();
    }

    @Override
    public IcarroSuv criacarrosuv() {
        return new Hrv();
    }


    
}
