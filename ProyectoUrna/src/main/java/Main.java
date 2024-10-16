import urna.Urna;

public class Main {
    public static void main(String[] args) {

        int nb = Integer.parseInt(args[0]);
        int nn = Integer.parseInt(args[1]);
        Urna urna = new Urna(nn, nb);
        System.out.println(urna);
        while (urna.totalBolas() > 1) {
            Urna.ColorBola color1 = urna.extraerBola();
            Urna.ColorBola color2 = urna.extraerBola();
            if (color1 == color2) {
                urna.ponerBlanca();
            } else {
                urna.ponerNegra();
            }
        }
        System.out.println(urna);
        //Si el número de bolas es menor igual siempre queda una bola blanca
        //En otro caso bola negra

    }
}