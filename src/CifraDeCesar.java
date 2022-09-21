import java.util.ArrayList;
import java.util.List;

public class CifraDeCesar {

    public static List<String> ALFABETO = new ArrayList<String>();
    public String mensagem;
    public int seed;
    
    public CifraDeCesar(String mensagem, int seed) {
        this.mensagem = mensagem;
        this.seed = seed;
        // this.ALFABETO.addAll()
        //  {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}
    }

    public String mensagemCifrada() {
        String novaMensagem ="";
        for (int i = 0; i < mensagem.length(); i++) {
            int indexOriginal = ALFABETO.indexOf(mensagem.charAt(i));
            novaMensagem += ALFABETO.get(indexOriginal + seed);
        }
        return novaMensagem;
    }
    
}
