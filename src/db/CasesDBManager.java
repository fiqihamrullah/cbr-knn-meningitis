/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import cbrknnmeningitis.Meningitis;
import cbrknnmeningitis.MeningitisData;
import cbrknnmeningitis.ParameterAttribute;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fiqih Amrullah
 */
public class CasesDBManager 
{
   private Database db;

    public CasesDBManager() 
    {
        
    } 
    
    public List<ParameterAttribute> loadAttributeWeights()
    {
        List<ParameterAttribute> listpa = new ArrayList<ParameterAttribute>();
        String sql = "select * from `weight`";
        Database db = new Database();
        ResultSet rs = db.ExecuteQuery(sql);
        try {
            while (rs.next()) 
            {
                ParameterAttribute pa  = new ParameterAttribute(rs.getString("name_of_attribute"));
                pa.setWeight(rs.getDouble("value"));
                listpa.add(pa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CasesDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listpa;
    }
    
    public Meningitis loadListAllCases()
    {
        Meningitis meningitisdata = new  Meningitis();
        String sql = "select * from `case`";
        Database db = new Database();
        ResultSet rs = db.ExecuteQuery(sql);
      
        try
        {
         while (rs.next()) 
         {
            
               MeningitisData md = new MeningitisData(rs.getInt("id_case"));              
               md.setTypeofMeningitis(rs.getString("abm"));              
               
               sql = "select * from casedetail where id_case=" + md.getID() + " order by id_casedetail asc";
               System.out.println(sql);
               db = new Database();
               ResultSet rsx = db.ExecuteQuery(sql);
               while(rsx.next())
               {
                   
                  ParameterAttribute pa = new ParameterAttribute(rsx.getString("name_of_attribute"));                    
                  md.addData(pa, rsx.getDouble("value"));
               }
               
               meningitisdata.addData(md);
         }
         
         
         
         
         
         }catch(SQLException ex) 
         {
            System.out.println("Error : " + ex.getMessage());
         }
        return meningitisdata;
    }   
    
    public void saveWeights(List<ParameterAttribute> listpa)
    {
        db = new Database();
        for(int i=0;i<listpa.size();i++)
        {
            String sql = "insert into weight(name_of_attribute,value) ";
            sql += "values('" + listpa.get(i).getName() + "'," +  listpa.get(i).getWeight().getW() + ")";
            db.Execute(sql);
        }
    }
      
    public void saveCase(MeningitisData objcase)
    {
        try 
        {
            String sql = "insert into `case`(abm)values('" + objcase.getTypeofMeningitis() + "')";             
            db = new Database();
            db.Execute(sql);
            sql = "select * from `case` order by id_case desc";   
            ResultSet rs = db.ExecuteQuery(sql);
            rs.first();
            int idkasus = rs.getInt(1);
            objcase.setID(idkasus);
            
            for(int i=0;i<objcase.getAttributeCount();i++)
            {
                sql="insert into casedetail(id_case,name_of_attribute,value) values";
                sql+="(" + objcase.getID() + ",'" + objcase.getAttribute(i).getName() + "',";            
                sql += "'" + objcase.getValues(i) + "')";    
                db.Execute(sql);
            }
        } catch (SQLException ex) 
        {
            Logger.getLogger(CasesDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
    
    public void deleteCase(MeningitisData md)
    {
        String sql = "delete from `case` where id_case=" + md.getID();
        db = new Database();
        db.Execute(sql);
        
        sql = "delete from casedetail where id_case=" +  md.getID();
        db.Execute(sql);
    }
    
}
