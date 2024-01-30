/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbrknnmeningitis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fiqih Amrullah
 */
public class Meningitis
{
    private List<MeningitisData> listdata;
     public Meningitis() 
    {
        listdata = new ArrayList<MeningitisData>();
    }
     
     public void addData(MeningitisData mdata)
     {
         listdata.add(mdata);
     }
    
    public List<MeningitisData> getListMeningitisData()
    {
        return listdata;
    }
     
     public int getDataCount()
     {
         return listdata.size();
     }
     
     public MeningitisData getData(int i)
     {
         return listdata.get(i);
     }
    
    
}
