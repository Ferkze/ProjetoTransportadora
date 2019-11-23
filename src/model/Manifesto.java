
package model;

public class Manifesto {
    
   private int id;
   private String placaVeiculo;
   private String filialOrigem ;
   private String filialDestino;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the placa
     */
    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    /**
     * @return the filialOrigem
     */
    public String getFilialOrigem() {
        return filialOrigem;
    }

    /**
     * @param filialOrigem the filialOrigem to set
     */
    public void setFilialOrigem(String filialOrigem) {
        this.filialOrigem = filialOrigem;
    }

    /**
     * @return the filialDestino
     */
    public String getFilialDestino() {
        return filialDestino;
    }

    /**
     * @param filialDestino the filialDestino to set
     */
    public void setFilialDestino(String filialDestino) {
        this.filialDestino = filialDestino;
    }

    public Manifesto() {
    }

    public Manifesto(int id, String placaVeiculo, String filialOrigem, String filialDestino) {
        this.id = id;
        this.placaVeiculo = placaVeiculo;
        this.filialOrigem = filialOrigem;
        this.filialDestino = filialDestino;
    }
     
}
