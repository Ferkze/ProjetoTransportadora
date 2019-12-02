
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Cliente;

public class ClienteData extends DataSource {
    public ClienteData() throws Exception {
    }

    public boolean inserir(Cliente r) throws Exception {
        String sql = "INSERT INTO tbl_Cliente (nome, endereco, cidade, uf, cnpj, cpf, telefone) VALUES (?, ?, ?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, r.getNome());
        ps.setString(2, r.getEndereco());
        ps.setString(3, r.getCidade());
        ps.setString(4, r.getUf());
        ps.setString(5, r.getCnpj());
        ps.setString(6, r.getCpf());
        ps.setString(7, r.getTelefone());
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(Cliente r) throws Exception {
        String sql = "UPDATE tbl_Cliente SET nome = ?, endereco = ?, cidade = ?, uf = ?, cnpj = ?, cpf = ?, telefone = ? WHERE IdCliente = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, r.getNome());
        ps.setString(2, r.getEndereco());
        ps.setString(3, r.getCidade());
        ps.setString(4, r.getUf());
        ps.setString(5, r.getCnpj());
        ps.setString(6, r.getCpf());
        ps.setString(7, r.getTelefone());
        ps.setInt(8, r.getId());
        int registros = ps.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Cliente buscar(int id) throws Exception {
        String sql = "SELECT IdCliente, nome, endereco, cidade, uf, cnpj, cpf, telefone FROM tbl_Cliente WHERE IdCliente = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet resultados = ps.executeQuery();
        Cliente r = new Cliente();
        if (resultados.next()) {
            r.setId(resultados.getInt(1));
            r.setNome(resultados.getString(2));
            r.setEndereco(resultados.getString(3));
            r.setCidade(resultados.getString(4));
            r.setUf(resultados.getString(5));
            r.setCnpj(resultados.getString(6));
            r.setCpf(resultados.getString(7));
            r.setTelefone(resultados.getString(8));
        }

        return r;
    }

    public ArrayList<Cliente> buscarTudo(int limit) throws Exception {
        if (limit == 0)
            limit = 10;
        String sql = "SELECT IdCliente, nome, endereco, cidade, uf, cnpj, cpf, telefone FROM tbl_Cliente LIMIT ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, limit);
        ResultSet rs = ps.executeQuery();
        ArrayList<Cliente> remetentes = new ArrayList<>();
        while (rs.next()) {
            Cliente r = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8));
            remetentes.add(r);
        }

        return remetentes;
    }

    public boolean deletar(int id) throws Exception {
        String sql = "UPDATE tbl_ClienteCTRC SET IdCliente = null WHERE IdCliente = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        sql = "DELETE FROM tbl_Cliente WHERE IdCliente = ?";
        PreparedStatement ps2 = c.prepareStatement(sql);
        ps2.setInt(1, id);
        int registros = ps2.executeUpdate();

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
}
