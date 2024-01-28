/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbrknnmeningitis;

/**
 *
 * @author acer
 */
public class ParameterAttribute
{
    private String name;
    private Weight weight;

    public ParameterAttribute(String name) 
    {
        this.name = name;
    } 
    
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight)
    {
        this.weight = new Weight();
        this.weight.setW(weight);
    }

    public String getName() 
    {
        return name;
    }

    public Weight getWeight() 
    {
        return weight;
    }
    
    
}
