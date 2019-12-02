
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Manifesto;
import model.Veiculo;

public class ManifestoData extends DataSource {
    public ManifestoData() throws Exception {
    }

    public Manifesto inserir(Manifesto obj) throws Exception {
        String sql = "INSERT INTO tbl_Manifesto (nmFilial_Origem, nmFilial_Destino) VALUES (?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, obj.getFilialOrigem());
        ps.setString(2, obj.getFilialDestino());
        int res = ps.executeUpdate();
        if (res > 0) {
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            obj.setId(keys.getInt(1));
            
            ArrayList<Veiculo> av = obj.getVeiculos();
            for(int i = 0; i < av.size(); i++) {
                adicionarVeiculo(obj.getId(), av.get(i).getId());
            }
        }
        return obj;
    }

    public boolean editar(Manifesto obj) throws Exception {
        Connection c = getConnection();
        String sql = "UPDATE tbl_Manifesto SET nmFilial_Origem = ?, nmFilial_Destino = ? WHERE IdManifesto = ?";

        PreparedStatement ps = c.prepareStatement(sql);
        ps = c.prepareStatement(sql);
        ps.setString(1, obj.getFilialOrigem());
        ps.setString(2, obj.getFilialDestino());
        ps.setInt(3, obj.getId());
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Manifesto buscar(int id) throws Exception {
        String sql = "SELECT IdManifesto, nmFilial_Origem, nmFilial_Destino FROM tbl_Manifesto WHERE IdManifesto = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultados = ps.executeQuery();
        Manifesto m = new Manifesto();
        if (resultados.next()) {
            m.setId(resultados.getInt(1));
            m.setFilialOrigem(resultados.getString(2));
            m.setFilialDestino(resultados.getString(3));
        }
        

        return m;
    }
    public ArrayList<Manifesto> buscarTudo() throws Exception {
        String sql = "SELECT TOP 100 IdManifesto, nmFilial_Origem, nmFilial_Destino FROM tbl_Manifesto";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet r = ps.executeQuery();
        ArrayList<Manifesto> manifestos = new ArrayList<>();
        while (r.next()) {
            Manifesto m = new Manifesto(r.getInt(1), r.getString(2), r.getString(3));
            manifestos.add(m);
        }
        return manifestos;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "UPDATE tbl_CTRCManifesto SET IdManifesto = null  WHERE IdManifesto = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        sql = "DELETE FROM tbl_Manifestos WHERE IdManifesto = ?";
        ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    //VEICULOS DO MANIFESTO
    

    public boolean adicionarVeiculo(int id, int idVeiculo) throws Exception {
        String sql = "INSERT INTO tbl_ManifestoVeiculo (IdManifesto, IdVeiculo) VALUES (?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setInt(2, idVeiculo);
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean removerVeiculo(int id, int idVeiculo) throws Exception {
        String sql = "DELETE FROM tbl_ManifestoVeiculo WHERE IdManifesto = ? AND IdVeiculo = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setInt(2, idVeiculo);
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Veiculo> buscarVeiculos(int id) throws Exception {
        String sql = "SELECT v.IdVeiculo, v.dsVeiculo, v.nrPlaca_Veiculo FROM tbl_ManifestoVeiculo JOIN tbl_Veiculo v ON v.IdVeiculo = IdManifesto WHERE IdManifesto = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet r = ps.executeQuery();
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        while (r.next()) {
            Veiculo v = new Veiculo(r.getInt(1), r.getString(2), r.getString(3));
            veiculos.add(v);
        }
        return veiculos;
    }
}
