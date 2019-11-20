
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Veiculo;

public class VeiculosData extends DataSource {
    public VeiculosData() throws Exception {
    }

    public boolean inserir(Veiculo obj) throws Exception {
        String sql = "INSERT INTO tbl_Veiculos (dsVeiculo, nrPlaca_Veiculo) VALUES (?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, obj.getDesc());
        ps.setString(2, obj.getNumeroPlaca());
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(Veiculo obj) throws Exception {
        String sql = "UPDATE FROM tbl_Veiculos (nrPlaca_Veiculo, nmFilial_Origem) VALUES (?, ?, ?) WHERE IdVeiculo = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, obj.getDesc());
        ps.setString(2, obj.getNumeroPlaca());
        ps.setInt(3, obj.getId());
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Veiculo buscar(int id) throws Exception {
        String sql = "SELECT (IdVeiculo, dsVeiculo, nrPlaca_Veiculo) FROM tbl_Veiculos WHERE IdVeiculo = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultados = ps.executeQuery();
        Veiculo m = new Veiculo();
        if (resultados.next()) {
            m.setId(resultados.getInt(1));
            m.setDesc(resultados.getString(2));
            m.setNumeroPlaca(resultados.getString(3));
        }
        closeConnection();
        return m;
    }

    public ArrayList<Veiculo> buscarTudo(int limit) throws Exception {
        String sql = "SELECT (IdVeiculo, dsVeiculo, nrPlaca_Veiculo) FROM tbl_Veiculos LIMIT ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, limit);
        ResultSet r = ps.executeQuery();
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        while (r.next()) {
            Veiculo m = new Veiculo(r.getInt(1), r.getString(2), r.getString(3));
            veiculos.add(m);
        }
        closeConnection();
        return veiculos;
    }

    public ArrayList<Veiculo> deletar(int id) throws Exception {
        String sql = "DELETE FROM tbl_Veiculos WHERE IdVeiculo = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet r = ps.executeQuery();
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        while (r.next()) {
            Veiculo m = new Veiculo(r.getInt(1), r.getString(2), r.getString(3));
            veiculos.add(m);
        }
        closeConnection();
        return veiculos;
    }
}
