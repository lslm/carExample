

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Vermelho", "GXS2222");

        carro1.setAnoDeFabricacao("2023");

        System.out.println("A cor do carro é " + carro1.getCor());
        System.out.println("A placa do carro é " + carro1.getPlaca());
        System.out.println("O ano de fabricação do carro é " + carro1.getAnoDeFabricacao());
    }
}