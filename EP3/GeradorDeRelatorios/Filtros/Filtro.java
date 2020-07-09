package GeradorDeRelatorios.Filtros;

import java.io.PrintWriter;
import GeradorDeRelatorios.*;

public interface Filtro {
       
    public int filtrar(PrintWriter out, Object argFiltro, Produto[] produtos, int format_flags);

}