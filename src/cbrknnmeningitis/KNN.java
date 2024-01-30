/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbrknnmeningitis;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Fiqih Amrullah
 */
public class KNN 
{
    private Meningitis  meningitisdata ;

    public KNN( Meningitis meningitisdata) 
    {
        this.meningitisdata = meningitisdata;
    }
    
    
    
    public void classify(int k)
    {
        Collections.sort(meningitisdata.getListMeningitisData());
        
         HashMap<String,Integer> map = new HashMap<String,Integer>();
          ValueComparator bvc =  new ValueComparator(map);
        TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(bvc);

        for(int i=0;i<k;i++)
        {
            String nama = meningitisdata.getData(i).getTypeofMeningitis();
            if (map.containsKey(nama)) 
            {
                int n = map.get(nama).intValue();
                n++;
                map.put(nama, n);
            }else{
               map.put(nama, 1); 
            }
            
        }   

        System.out.println("unsorted map: "+map);
        sorted_map.putAll(map);
        System.out.println("results: "+sorted_map);
    }
    
    
    public MeningitisData getBestMatch(){
        return meningitisdata.getData(0);
    }
    
    class ValueComparator implements Comparator<String>
    {
    Map<String, Integer> base;
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    
        @Override
    public int compare(String a, String b) {
        if (base.get(a) <= base.get(b)) {
            return -1;
        } else {
            return 1;
        }  
    }
}
}
