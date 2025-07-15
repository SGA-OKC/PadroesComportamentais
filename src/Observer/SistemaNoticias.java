package Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaNoticias {

    private List<Assinantes> assinantes = new ArrayList<Assinantes>();

    public static void adicionar(Assinantes o) {

        assinantes.add(o);
    }

    public static void notificar(String msg) {
        for (Assinantes o : assinantes) o.update(msg);
    }
}