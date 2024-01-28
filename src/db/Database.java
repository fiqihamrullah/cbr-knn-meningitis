/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import cbrknnmeningitis.Meningitis;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

 
public class Database
{
    private ConnectionSetting cs;
    private Connection con;

    public Database()
    {
       cs= new ConnectionSetting("root", "","jdbc:mysql://localhost:3306/cbrmeningitis?autoReconnect=true&useSSL=false","");
       try
       {
        Class.forName("com.mysql.jdbc.Driver");
        con =(Connection) DriverManager.getConnection(cs.getServer()+cs.getDbName(), cs.getUser(),cs.getPwd());
       }catch(ClassNotFoundException ex)
       {
           System.out.println("Error:" + ex.getMessage());
       }catch(SQLException ex){
             System.out.println("Error:" + ex.getMessage());
       }
       
    }

    public void Execute(String sql)
    {
        Statement st = null;
        try{
        st =(Statement) con.createStatement();
        st.execute(sql);
        }catch(SQLException ex){
            System.out.println("Execute Error : " +  ex.getMessage());
        }
    }

    public ResultSet ExecuteQuery(String sql){
        Statement st = null;
         ResultSet rs = null;
        try{
        st =(Statement) con.createStatement();
        st.execute(sql);
           rs = st.getResultSet();

        }catch(SQLException ex){
            System.out.println("Execute Error : " +  ex.getMessage());
        }
          return rs;
    }

    public int GetRecordCount(ResultSet rs){
        int baris=0;
        try{
        while(rs.next()){
            baris++;
        }
        }catch(SQLException e){
            System.out.println("GetrecordCount : " + e.getMessage());
        }
        return baris;
    }

    public ConnectionSetting getConnectionSetting() {
        return cs;
    }

}
