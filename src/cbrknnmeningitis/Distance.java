/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbrknnmeningitis;

/**
 *
 * @author acer
 */
public class Distance
{
    public static double euclideanDistance(MeningitisData mDataCases,MeningitisData mNewDataCases,double bobot)
    {
        double d=0.0;
       
        
        for(int i=0;i<mDataCases.getAttributeCount();i++)
        {
           d+= (Math.pow((mDataCases.getAttribute(i).getWeight().getW() *(mDataCases.getValues(i)  - mNewDataCases.getValues(i))),2));
        }
        return Math.sqrt(d/bobot);
    }
}
