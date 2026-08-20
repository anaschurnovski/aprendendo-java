package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte02 {

    static void main() {

//        byte idade = 18;
//
//        if (idade >= 18) {
//
//        System.out.println("pode comprar bebida");
//     } else {
//            System.out.println("não pode");
//        }

        byte idade = 16;
        String categoria;

        // < 15 - infantil
        // >= 15 && < 18 - juvenil
        // >= 18 - adulto

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
