package AbstractFactory;

public class FabricaToyota implements Ifabricadecarros {

    @Override
    public IcarroSedan criacarrosedan() {
        return new Corolla();
    }

    @Override
    public IcarroSuv criacarrosuv() {
        return new CorollaCross();
    }

   
    
}
