
package model;

import java.util.ArrayList;

public class Manifesto {

    private int id;
    private ArrayList<Veiculo> veiculos;
    private String filialOrigem;
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

    public ArrayList<Veiculo> getVeiculos() {
        return this.veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public void removeVeiculo(int index) {
        if (index < this.veiculos.size()) {
            this.veiculos.remove(index);
        } else {
            System.out.print("Tentou remover item "+index+" inexistente");
        }
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
        this.veiculos = new ArrayList<Veiculo>();
    }

    public Manifesto(int id, String filialOrigem, String filialDestino) {
        this.id = id;
        this.filialOrigem = filialOrigem;
        this.filialDestino = filialDestino;
        this.veiculos = new ArrayList<Veiculo>();
    }

    public Manifesto(int id, String filialOrigem, String filialDestino, ArrayList<Veiculo> veiculos) {
        this.id = id;
        this.filialOrigem = filialOrigem;
        this.filialDestino = filialDestino;
        this.veiculos = new ArrayList<Veiculo>();
        this.veiculos.addAll(veiculos);
    }

}
