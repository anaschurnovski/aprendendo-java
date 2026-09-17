package flamingo.aprendendo.basico.revisaoarray;

public class Array05 {
    static void main() {

        int [][] diasDosMeses = new int [12][];

        diasDosMeses [0] = new int[31]; // jan
        diasDosMeses [1] = new int[28]; // fev
        diasDosMeses [2] = new int[31]; // mar
        diasDosMeses [3] = new int[30]; // abr
        diasDosMeses [4] = new int[31]; // mai
        diasDosMeses [5] = new int[30]; // jun
        diasDosMeses [6] = new int[31]; // jul
        diasDosMeses [7] = new int[31]; // ago
        diasDosMeses [8] = new int[30]; // set
        diasDosMeses [9] = new int[31]; // out
        diasDosMeses [10] = new int[30]; // nov
        diasDosMeses [11] = new int[31]; // dez

        for (int i = 0 ; i < diasDosMeses.length; i++) {
            System.out.println("------------------------------------------");
            for (int l = 0 ; l < diasDosMeses[i].length; l++) {
                diasDosMeses [i][l] = l + 1;
                System.out.println(diasDosMeses [i][l]);
            }

        }
    }
}

