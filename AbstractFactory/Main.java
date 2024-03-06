package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Ifabricadecarros Corolão = new FabricaHonda();
        IcarroSuv carro2 = Corolão.criacarrosuv();
        carro2.exibirInformaçõesSUV();       
    }
}
