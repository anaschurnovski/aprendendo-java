package flamingo.aprendendo.basico;

public class OperadoresParte05 {
    static void main() {

        /*
        * = atribuição simples
        * += somar e atribuir
        * -= subtrair e atribuir
        * *= multiplicar e atribuir
        * /= dividir e atribuir
        * */

        double totalCompra = 0;

        totalCompra += 50;
        totalCompra += 100;
        totalCompra += 50;

        totalCompra /= 2;



        System.out.printf("Tota da compra = %.2f", totalCompra);
    }
}
