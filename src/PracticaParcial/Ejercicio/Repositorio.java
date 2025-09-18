package PracticaParcial.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Exportable> repo;

    public Repositorio (){
        this.repo = new ArrayList();
    }

    public void addExportable(Exportable e){
        this.repo.add(e);
    }

    public void imprimerExportables(){
        for(Exportable e : repo){
            System.out.println("Info Exportable: "+e.exportar());
        }
    }
}
