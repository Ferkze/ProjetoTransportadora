
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.CTRC;

public class CTRCData extends DataSource {
    public CTRCData() throws Exception {
    }

    public boolean inserir(CTRC obj) throws Exception {
        String sql = "INSERT INTO tbl_CTRCs (nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES (?, ?, ?, ?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, obj.getNomeReme());
        ps.setString(2, obj.getNomeDest());
        ps.setString(3, obj.getDataEmissao());
        ps.setInt(4, obj.getPeso());
        ps.setFloat(5, obj.getValor());
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(CTRC obj) throws Exception {
        String sql = "UPDATE FROM tbl_CTRCs (nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES (?, ?, ?, ?, ?) WHERE IdCtrc = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, obj.getNomeReme());
        ps.setString(2, obj.getNomeDest());
        ps.setString(3, obj.getDataEmissao());
        ps.setInt(4, obj.getPeso());
        ps.setFloat(5, obj.getValor());
        ps.setInt(6, obj.getId());
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public CTRC buscar(int id) throws Exception {
        String sql = "SELECT (IdCtrc, nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) FROM tbl_CTRCs WHERE IdCtrc = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultados = ps.executeQuery();
        CTRC ctrc = new CTRC();
        if (resultados.next()) {
            ctrc.setId(resultados.getInt(1));
            ctrc.setNomeReme(resultados.getString(2));
            ctrc.setNomeDest(resultados.getString(3));
            ctrc.setDataEmissao(resultados.getString(4));
            ctrc.setPeso(resultados.getInt(5));
            ctrc.setValor(resultados.getFloat(6));
        }
        closeConnection();
        return ctrc;
    }

    public ArrayList<CTRC> buscarTudo(int limit) throws Exception {
        if (limit == 0)
            limit = 10;
        String sql = "SELECT (IdCtrc, nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) FROM tbl_CTRCs LIMIT ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, limit);
        ResultSet r = ps.executeQuery();
        ArrayList<CTRC> ctrcs = new ArrayList<>();
        while (r.next()) {
            CTRC ctrc = new CTRC(r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getInt(5),
                    r.getFloat(6));
            ctrcs.add(ctrc);
        }
        closeConnection();
        return ctrcs;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "DELETE FROM tbl_CTRCs WHERE IdCtrc = ?";
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
