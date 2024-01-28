/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import cbrknnmeningitis.Meningitis;
 
public class ConnectionSetting
{
       private String user;
       private String pwd;
       private String server;
       private String dbname;

      public ConnectionSetting()
      {

      }

      public ConnectionSetting(String user, String pwd, String server,String db)
      {
        this.user = user;
        this.pwd = pwd;
        this.server = server;
        this.dbname  = db;
      }

      public String getUser() {
        return user;
      }

      public String getServer()
      {
        return server;
      }

      public String getPwd()
      {
        return pwd;
       }

    public String getDbName() {
        return dbname;
    }






      




}
