
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.ClientesReme;

public class ClientesRemeData extends DataSource {
    public ClientesRemeData() throws Exception {
    }

    public boolean inserir(ClientesReme r) throws Exception {
        String sql = "INSERT INTO tbl_ClienteReme (nmCli_Rementente, nmEndereco, nmCidade, nmUF, cnpjCliente, cpfCliente, nmTelefone) VALUES (?, ?, ?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, r.getNome());
        ps.setString(2, r.getEndereco());
        ps.setString(3, r.getCidade());
        ps.setString(4, r.getUf());
        ps.setString(5, r.getCnpjCliente());
        ps.setString(6, r.getCpfCliente());
        ps.setString(7, r.getTelefone());
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(ClientesReme r) throws Exception {
        String sql = "UPDATE FROM tbl_ClienteReme (nmCli_Rementente, nmEndereco, nmCidade, nmUF, cnpjCliente, cpfCliente, nmTelefone) VALUES (?, ?, ?, ?) WHERE IdCli_Reme = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, r.getNome());
        ps.setString(2, r.getEndereco());
        ps.setString(3, r.getCidade());
        ps.setString(4, r.getUf());
        ps.setString(5, r.getCnpjCliente());
        ps.setString(6, r.getCpfCliente());
        ps.setString(7, r.getTelefone());
        ps.setInt(8, r.getId());
        int registros = ps.executeUpdate();
        closeConnection();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public ClientesReme buscar(int id) throws Exception {
        String sql = "SELECT IdCli_Reme, nmCli_Rementente, nmEndereco, nmCidade, nmUF, cnpjCliente, cpfCliente, nmTelefone FROM tbl_ClienteReme WHERE IdCli_Reme = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultados = ps.executeQuery();
        ClientesReme r = new ClientesReme();
        if (resultados.next()) {
            r.setId(resultados.getInt(1));
            r.setNome(resultados.getString(2));
            r.setEndereco(resultados.getString(3));
            r.setCidade(resultados.getString(4));
            r.setUf(resultados.getString(5));
            r.setCnpjCliente(resultados.getString(6));
            r.setCpfCliente(resultados.getString(7));
            r.setTelefone(resultados.getString(8));
        }
        closeConnection();
        return r;
    }

    public ArrayList<ClientesReme> buscarTudo(int limit) throws Exception {
        if (limit == 0)
            limit = 10;
        String sql = "SELECT IdCli_Reme, nmCli_Rementente, nmEndereco, nmCidade, nmUF, cnpjCliente, cpfCliente, nmTelefone FROM tbl_ClienteReme LIMIT ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, limit);
        ResultSet rs = ps.executeQuery();
        ArrayList<ClientesReme> remetentes = new ArrayList<>();
        while (rs.next()) {
            ClientesReme r = new ClientesReme(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            remetentes.add(r);
        }
        closeConnection();
        return remetentes;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "DELETE FROM tbl_ClienteReme WHERE IdCli_Reme = ?";
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
