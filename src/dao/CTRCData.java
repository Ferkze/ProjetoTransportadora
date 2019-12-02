
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.CTRC;
import model.Cliente;
import model.Manifesto;
import model.Motorista;

public class CTRCData extends DataSource {
    public CTRCData() throws Exception {
    }

    public boolean inserir(CTRC obj) throws Exception {
        String sql = "INSERT INTO tbl_CTRC (dtEmissao, qtPesoFrete, vlFrete, IdClienteDest, IdClienteReme, IdMotorista) VALUES (?, ?, ?, ?, ?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, obj.getDataEmissao());
        ps.setInt(2, obj.getPeso());
        ps.setFloat(3, obj.getValor());
        ps.setInt(4, obj.getDestinatario().getId());
        ps.setInt(5, obj.getRemetente().getId());
        ps.setInt(6, obj.getMotorista().getId());
        int registros = ps.executeUpdate();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(CTRC obj) throws Exception {
        String sql = "UPDATE tbl_CTRC SET dtEmissao = ?, qtPesoFrete = ?, vlFrete = ?, IdClienteDest = ?, IdClienteReme = ?, IdMotorista = ? WHERE IdCtrc = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, obj.getDataEmissao());
        ps.setInt(2, obj.getPeso());
        ps.setFloat(3, obj.getValor());
        ps.setInt(4, obj.getDestinatario().getId());
        ps.setInt(5, obj.getRemetente().getId());
        ps.setInt(6, obj.getMotorista().getId());
        ps.setInt(7, obj.getId());
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public CTRC buscar(int id) throws Exception {
        String sql = "SELECT IdCtrc, dtEmissao, qtPesoFrete, vlFrete, \n"+
            "cd.IdCliente,cd.nome,cd.endereco,cd.cidade,cd.uf,cd.telefone,cd.cnpj,cd.tipo_organizacao,cd.cpf,cd.sexo,\n"+
            "cr.IdCliente,cr.nome,cr.endereco,cr.cidade,cr.uf,cr.telefone,cr.cnpj,cr.tipo_organizacao,cr.cpf,cr.sexo, \n"+
            "m.IdMotorista,m.nome,m.sexo,m.telefone FROM tbl_CTRC c \n" +
            "JOIN tbl_Cliente cd ON cd.IdCliente = c.IdClienteDest \n" +
            "JOIN tbl_Cliente cr ON cr.IdCliente = c.IdClienteReme \n" +
            "JOIN tbl_Motorista m ON m.IdMotorista = c.IdMotorista \n" +
            "WHERE IdCtrc = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet r = ps.executeQuery();
        CTRC ctrc = new CTRC();
        if (r.next()) {
            ctrc.setId(r.getInt(1));
            ctrc.setDataEmissao(r.getString(2));
            ctrc.setPeso(r.getInt(3));
            ctrc.setValor(r.getFloat(4));
            ctrc.setcDest(new Cliente(r.getInt(5), r.getString(6), r.getString(7), r.getString(8), r.getString(9), r.getString(10), r.getString(11), r.getString(12), r.getString(13), r.getString(14)));
            ctrc.setRemetente(new Cliente(r.getInt(15), r.getString(16), r.getString(17), r.getString(18), r.getString(19), r.getString(20), r.getString(21), r.getString(22), r.getString(23), r.getString(24)));
            ctrc.setMotorista(new Motorista(r.getInt(25), r.getString(26), r.getString(27), r.getString(28)));
        }

        return ctrc;
    }

    public ArrayList<CTRC> buscarTudo(int limit) throws Exception {
        if (limit == 0)
            limit = 10;
        String sql = "SELECT IdCtrc, dtEmissao, qtPesoFrete, vlFrete FROM tbl_CTRC LIMIT ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, limit);
        ResultSet r = ps.executeQuery();
        ArrayList<CTRC> ctrcs = new ArrayList<>();
        while (r.next()) {
            CTRC ctrc = new CTRC(r.getInt(1), r.getString(2), r.getInt(3), r.getFloat(4));
            ctrcs.add(ctrc);
        }

        return ctrcs;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "UPDATE tbl_CTRCManifesto SET IdCtrc = null WHERE IdCtrc = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        sql = "DELETE FROM tbl_CTRCs WHERE IdCtrc = ?";
        ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // MANIFESTOS 
    public boolean adicionarManifesto(int id, int idManifesto) throws Exception {
        String sql = "INSERT INTO tbl_CTRCManifesto(IdCtrc, IdManifesto) VALUES (?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setInt(2, idManifesto);
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean removerManifesto(int id, int idManifesto) throws Exception {
        String sql = "DELETE FROM tbl_CTRCManifesto WHERE IdManifesto = ? AND IdCtrc = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setInt(2, idManifesto);
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Manifesto> buscarManifestos(int id) throws Exception {
        String sql = "SELECT m.IdManifesto, m.nmFilial_Origem, m.nmFilial_Destino FROM tbl_CTRCManifesto cm JOIN tbl_Manifesto m ON m.IdManifesto = cm.IdManifesto WHERE IdCtrc = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet r = ps.executeQuery();
        ArrayList<Manifesto> manifestos = new ArrayList<>();
        while (r.next()) {
            Manifesto m = new Manifesto(r.getInt(1), r.getString(2), r.getString(3));
            manifestos.add(m);
        }
        return manifestos;
    }
    
}
