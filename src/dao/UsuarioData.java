
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Usuario;;

public class UsuarioData extends DataSource {
    public UsuarioData() throws Exception {
    }
    
    public Usuario buscar(String apelido) throws Exception {
        String sql = "SELECT IdUsuario, apelido, senha FROM tbl_Usuario WHERE apelido = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, apelido);
        ResultSet rs = ps.executeQuery();
        Usuario u = new Usuario();
        if (rs.next()) {
            u.setId(rs.getInt(1));
            u.setApelido(rs.getString(2));
            u.setSenha(rs.getString(3));
        }
        return u;
    }
    
    public Usuario inserir(Usuario u) throws Exception {
        String sql = "INSERT INTO tbl_Usuario (apelido, senha) VALUES (?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, u.getApelido());
        ps.setString(2, u.getSenha());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            u.setId(rs.getInt(1));
            System.out.println(u.getId());
            System.out.println(u.getApelido());
            System.out.println(u.getSenha());
        }
        return u;
    }
    
    public boolean deletar(int id) throws Exception {
        String sql = "DELETE FROM tbl_Usuario WHERE IdUsuario= ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, id);
        int registros = ps.executeUpdate ();
        
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean editar(Usuario u) throws Exception {
        String sql = "UPDATE tbl_Usuario SET apelido = ?, senha = ? WHERE IdUsuario = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, u.getApelido());
        ps.setString(2, u.getSenha());
        ps.setInt(3, u.getId());
        int registros = ps.executeUpdate ();
        
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
}