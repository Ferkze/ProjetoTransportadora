
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Veiculo;

public class VeiculoData extends DataSource {
    public VeiculoData() throws Exception {
    }

    public boolean inserir(Veiculo v) throws Exception {
        String sql = "INSERT INTO tbl_Veiculos (dsVeiculo, nrPlaca_Veiculo) VALUES (?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, v.getDesc());
        ps.setString(2, v.getNumeroPlaca());
        int registros = ps.executeUpdate();
        
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(Veiculo v) throws Exception {
        String sql = "UPDATE tbl_Veiculos SET nrPlaca_Veiculo = ?, nmFilial_Origem = ? WHERE IdVeiculo = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, v.getDesc());
        ps.setString(2, v.getNumeroPlaca());
        ps.setInt(3, v.getId());
        int registros = ps.executeUpdate();
        
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Veiculo buscar(int id) throws Exception {
        String sql = "SELECT IdVeiculo, dsVeiculo, nrPlaca_Veiculo FROM tbl_Veiculos WHERE IdVeiculo = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultados = ps.executeQuery();
        Veiculo v = new Veiculo();
        if (resultados.next()) {
            v.setId(resultados.getInt(1));
            v.setDesc(resultados.getString(2));
            v.setNumeroPlaca(resultados.getString(3));
        }
        
        return v;
    }

    public ArrayList<Veiculo> buscarTudo(int limit) throws Exception {
        if (limit == 0)
            limit = 10;
        String sql = "SELECT IdVeiculo, dsVeiculo, nrPlaca_Veiculo FROM tbl_Veiculos LIMIT ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, limit);
        ResultSet r = ps.executeQuery();
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        while (r.next()) {
            Veiculo v = new Veiculo(r.getInt(1), r.getString(2), r.getString(3));
            veiculos.add(v);
        }
        
        return veiculos;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "UPDATE tbl_CTRCs_Manifestos SET IdVeiculo = null  WHERE IdVeiculo = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        sql = "DELETE FROM tbl_Veiculos WHERE IdVeiculo = ?";
        c = getConnection();
        ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        int registros = ps.executeUpdate();
        
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
}
