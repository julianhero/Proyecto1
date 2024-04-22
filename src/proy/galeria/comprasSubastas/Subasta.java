package proy.galeria.comprasSubastas;

import java.util.HashMap;
import java.util.Map;

import proy.galeria.inventario.Pieza;
import proy.galeria.propietariosCompradores.Comprador;

public class Subasta 
{
	private Pieza pieza;
    private Double valorInicial;
    private Double valorMinimo;
    private int fechaInicio;
    private int fechaFin;
    private Comprador compradorGanador;
    private Double ofertaGanadora;
    private Map<Comprador, Double> ofertas;

    public Subasta(Pieza pieza, Double valorInicial, Double valorMinimo, int fechaInicio, int fechaFin) {
        this.pieza = pieza;
        this.valorInicial = valorInicial;
        this.valorMinimo = valorMinimo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ofertas = new HashMap<>();
    }

    public void agregarOferta(Comprador comprador, Double oferta) {
        ofertas.put(comprador, oferta);
    }

    public void determinarGanador() {
        Comprador ganador = null;
        Double ofertaGanadora = valorInicial;

        for (Map.Entry<Comprador, Double> entrada : ofertas.entrySet()) {
            if (entrada.getValue() > ofertaGanadora) {
                ofertaGanadora = entrada.getValue();
                ganador = entrada.getKey();
            }
        }

        if (ofertaGanadora >= valorMinimo) {
            compradorGanador = ganador;
            this.ofertaGanadora = ofertaGanadora;
        }
   
    }
}
