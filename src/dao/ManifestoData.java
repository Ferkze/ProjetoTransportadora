
package dao;

import java.sql.PreparedStatement;
import model.Manifesto;


public class ManifestoData extends DataSource {
    public ManifestoData() throws Exception{}
    public boolean incluir(Manifesto obj)
            throws Exception{
        String sql = "Insert into tabManifestos "+
                "values (?)";
        PreparedStatement ps;
        ps = getDataSource().
                prepareStatement (sql);
        ps.setString(1, obj.getFilialOrigem());
        int registros = ps.executeUpdate();
        if(registros>0)return true;
        else return false;
    }

    private Object getDataSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
