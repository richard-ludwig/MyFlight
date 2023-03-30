import java.util.ArrayList;

public class GerenciadorCompanhias {
    private ArrayList<CompanhiaAerea> empresas;
    public void add(CompanhiaAerea cia){
        if (empresas == null){
            empresas = new ArrayList<>();
            empresas.add(cia);
        }
    }
    public ArrayList<CompanhiaAerea> listarTodas(){
        for (CompanhiaAerea cia: this.empresas) {

        }

        }
    }
}
