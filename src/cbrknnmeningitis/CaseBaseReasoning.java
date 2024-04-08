/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbrknnmeningitis;

import db.CasesDBManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fiqih Amrullah
 */
public class CaseBaseReasoning 
{
    private MeningitisData newcases;
    private Meningitis datameningitis;
    
    private double totalweight;

    public CaseBaseReasoning(MeningitisData newcases) 
    {
        this.newcases = newcases;
    }
    
    private void loadWeightsAndData()
    {
        CasesDBManager cdbm = new CasesDBManager();        
        List<ParameterAttribute> listattribute =  cdbm.loadAttributeWeights();
        
        for(int i=0;i<listattribute.size();i++)
        {
            totalweight += listattribute.get(i).getWeight().getW();
        }
        totalweight *= totalweight;
        datameningitis = cdbm.loadListAllCases();
        for(int i=0;i<datameningitis.getDataCount();i++)
        {
            datameningitis.getData(i).setListAttribute(listattribute);
        }
    }
    
    public MeningitisData caseRetrieve(int k)
    {
        loadWeightsAndData();
        for(int i=0;i<datameningitis.getDataCount();i++)
        {
            double sim=Distance.euclideanDistance(datameningitis.getData(i), newcases,totalweight);
          //  sim = sim/totalweight;
           // System.out.println(sim);
            datameningitis.getData(i).setSimilarity(sim);
        }
        
        KNN knn = new KNN(datameningitis);      
        knn.classify(k);        
        return knn.getBestMatch();
    }
    
    public void retain()
    {
        
    }
}
