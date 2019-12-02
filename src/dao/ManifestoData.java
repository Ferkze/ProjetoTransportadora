
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Manifesto;

public class ManifestoData extends DataSource {
    public ManifestoData() throws Exception {
    }

    public boolean inserir(Manifesto obj) throws Exception {
        String sql = "INSERT INTO tbl_Manifesto (nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES (?, ?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, obj.getPlacaVeiculo());
        ps.setString(2, obj.getFilialOrigem());
        ps.setString(3, obj.getFilialDestino());
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(Manifesto obj) throws Exception {
        String sql = "UPDATE FROM tbl_Manifesto (nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES (?, ?, ?) WHERE IdManifesto = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, obj.getPlacaVeiculo());
        ps.setString(2, obj.getFilialOrigem());
        ps.setString(3, obj.getFilialDestino());
        ps.setInt(4, obj.getId());
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Manifesto buscar(int id) throws Exception {
        String sql = "SELECT IdManifesto, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino FROM tbl_Manifesto WHERE IdManifesto = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultados = ps.executeQuery();
        Manifesto m = new Manifesto();
        if (resultados.next()) {
            m.setId(resultados.getInt(1));
            m.setPlacaVeiculo(resultados.getString(2));
            m.setFilialOrigem(resultados.getString(3));
            m.setFilialDestino(resultados.getString(4));
        }
        closeConnection();
        return m;
    }

    public ArrayList<Manifesto> buscarTudo(int limit) throws Exception {
        if (limit == 0)
            limit = 10;
        String sql = "SELECT IdManifesto, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino FROM tbl_Manifesto LIMIT ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, limit);
        ResultSet r = ps.executeQuery();
        ArrayList<Manifesto> manifestos = new ArrayList<>();
        while (r.next()) {
            Manifesto m = new Manifesto(r.getInt(1), r.getString(2), r.getString(3), r.getString(4));
            manifestos.add(m);
        }
        closeConnection();
        return manifestos;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "DELETE FROM tbl_Manifesto WHERE IdManifesto = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
}
