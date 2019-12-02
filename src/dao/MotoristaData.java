
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Motorista;

public class MotoristaData extends DataSource {
    public MotoristaData() throws Exception {
    }

    public boolean inserir(Motorista m) throws Exception {
        String sql = "INSERT INTO tbl_Motorista (nome, sexo, telefone) VALUES (?, ?, ?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, m.getNome());
        ps.setString(2, m.getSexo());
        ps.setString(3, m.getTelefone());
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(Motorista m) throws Exception {
        String sql = "UPDATE tbl_Motorista SET nome = ?, sexo = ?, telefone = ? WHERE IdMotorista = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, m.getNome());
        ps.setString(2, m.getSexo());
        ps.setString(3, m.getTelefone());
        ps.setInt(4, m.getId());
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Motorista buscar(int id) throws Exception {
        String sql = "SELECT IdMotorista, nome, sexo, telefone FROM tbl_Motorista WHERE IdMotorista = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultados = ps.executeQuery();
        Motorista m = new Motorista();
        if (resultados.next()) {
            m.setId(resultados.getInt(1));
            m.setNome(resultados.getString(2));
            m.setSexo(resultados.getString(3));
            m.setTelefone(resultados.getString(4));
        }

        return m;
    }

    public ArrayList<Motorista> buscarTudo(int limit) throws Exception {
        if (limit == 0)
            limit = 10;
        String sql = "SELECT IdMotorista, nome, sexo, telefone FROM tbl_Motorista LIMIT ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, limit);
        ResultSet r = ps.executeQuery();
        ArrayList<Motorista> motoristas = new ArrayList<>();
        while (r.next()) {
            Motorista m = new Motorista(r.getInt(1), r.getString(2), r.getString(3), r.getString(4));
            motoristas.add(m);
        }

        return motoristas;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "UPDATE tbl_CTRC SET IdMotorista = null WHERE IdMotorista = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        sql = "DELETE FROM tbl_Motorista WHERE IdMotorista = ?";
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
