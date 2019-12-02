
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Veiculo;

public class VeiculoData extends DataSource {
    public VeiculoData() throws Exception {
    }

    public Veiculo inserir(Veiculo v) throws Exception {
        String sql = "INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES (?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, v.getDesc());
        ps.setString(2, v.getNumeroPlaca());
        int res = ps.executeUpdate();
        if (res > 0) {
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            v.setId(keys.getInt(1));
        }
        return v;
    }

    public boolean editar(Veiculo v) throws Exception {
        String sql = "UPDATE tbl_Veiculo SET dsVeiculo = ?, nrPlaca_Veiculo = ? WHERE IdVeiculo = ?";
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
        String sql = "SELECT IdVeiculo, dsVeiculo, nrPlaca_Veiculo FROM tbl_Veiculo WHERE IdVeiculo = ?";
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

    public ArrayList<Veiculo> buscarTudo() throws Exception {
        String sql = "SELECT IdVeiculo, dsVeiculo, nrPlaca_Veiculo FROM tbl_Veiculo;";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet r = ps.executeQuery();
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        while (r.next()) {
            Veiculo v = new Veiculo(r.getInt(1), r.getString(2), r.getString(3));
            veiculos.add(v);
        }
        return veiculos;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "UPDATE tbl_Manifesto SET IdVeiculo = null  WHERE IdVeiculo = ?";
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
