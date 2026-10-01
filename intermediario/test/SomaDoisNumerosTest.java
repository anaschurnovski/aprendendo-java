package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.SomaDoisNumeros;

public class SomaDoisNumerosTest {
    static void main() {
        SomaDoisNumeros somaDoisNumeros = new SomaDoisNumeros();

        int multiplica = somaDoisNumeros.somaDoisNumeros02(2,2) * 4;

        System.out.println(multiplica);
    }

}
