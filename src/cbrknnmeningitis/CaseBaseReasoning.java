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
 * @author acer
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
    
    public MeningitisData caseRetrieve()
    {
        loadWeightsAndData();
        for(int i=0;i<datameningitis.getDataCount();i++)
        {
            double sim=Distance.euclideanDistance(datameningitis.getData(i), newcases,totalweight);
          //  sim = sim/totalweight;
          //  System.out.println(totalweight);
            datameningitis.getData(i).setSimilarity(sim);
        }
        
        KNN knn = new KNN(datameningitis);
        int k=4;
        knn.classify(k);        
        return knn.getBestMatch();
    }
    
    public void retain()
    {
        
    }
}
