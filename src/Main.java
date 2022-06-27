import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        String [] planetas = { "venus", "marte", "jupiter", "saturno" };
        String textoFinal = "";
        for (int i = 0; i < planetas.length; i ++) {
            textoFinal =  textoFinal + planetas[i];
            textoFinal = textoFinal + " ";
        }
        System.out.println( textoFinal);
    }
}