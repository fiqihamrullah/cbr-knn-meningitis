/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbrknnmeningitis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 

/**
 *
 * @author acer
 */
public class MeningitisData  implements Serializable,Comparable<MeningitisData> 
{
    private List<ParameterAttribute> listattribute;
    private List<Double> values;
    private String typeofmeningitis;
    private int ID;
    private double sim;
    
    public MeningitisData(int ID) 
    {
        sim =0.0;        
        this.listattribute = new ArrayList<ParameterAttribute>();
        this.values = new ArrayList<Double>();
        this.ID = ID;
     
    }
    
    public void setListAttribute(List<ParameterAttribute> listattribute)
    {
        this.listattribute = listattribute;
    }

    public int getID() 
    {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    } 
    
    public void setSimilarity(double sim)
    {
        this.sim = sim;
    } 
    
    public void setTypeofMeningitis(String typeofmeningitis) 
    {
        this.typeofmeningitis = typeofmeningitis;
    }

    public String getTypeofMeningitis() 
    {
        return typeofmeningitis;
    }  
    
    
    public void addData(ParameterAttribute pa,double value)
    {
        if (pa!=null)
        {
          listattribute.add(pa);
        }
        values.add(new Double(value));
    }
    
    public ParameterAttribute getAttribute(int i)
    {
        return listattribute.get(i);
    }
    
    public double getValues(int i)
    {
        return values.get(i);
    }
    
    public int getAttributeCount()
    {
        return listattribute.size();
    }

    public List<ParameterAttribute> getListAttribute() 
    {
        return listattribute;
    }

    public double getSim()
    {
        return sim;
    }
    
    
     @Override
     public int compareTo(MeningitisData md) 
    {
        return new Double(this.getSim()).compareTo(md.getSim());     
    }
    
    
    
    
}

