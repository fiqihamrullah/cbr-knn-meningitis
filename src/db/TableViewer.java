/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 package db;
import cbrknnmeningitis.Meningitis;
import cbrknnmeningitis.MeningitisData;
import cbrknnmeningitis.ParameterAttribute;
import java.util.List;
import javax.swing.table.DefaultTableModel;
 
public class TableViewer 
{
      public static DefaultTableModel ConvertMengitisListToTableModel()
      {
       DefaultTableModel dtm=null;
       String header[] =null;// new String[]{"No","Kriteria","Nilai","Bobot"};
     /*  if (showBobot)
       {
         header=  new String[]{"No","Kriteria","Nilai","Bobot"};       
       }else{*/
         header=  new String[]{"No","Kriteria","Nilai" };        
     //  }
       String row[] = new String[]{"Sex","Wbc","Pmn","bloodgl","GL","PR","REDS","White","Gram","Culture"};
       Object[][] data = new Object[row.length][4];
       for(int i=0;i<data.length;i++)
       {
          data[i][0] = i+1;
          data[i][1] = row[i]; 
          data[i][2] = "0.0";
         /// if (showBobot)
          {
        ///   data[i][3] = "0.0";
          }
          
       }

       dtm = new DefaultTableModel(data, header);       
       return dtm;       
       
   }
      
      public static DefaultTableModel ConvertWeightsListToTableModel( List<ParameterAttribute> listpa)
      {
       DefaultTableModel dtm=null;
       String header[] =null;      
       header=  new String[]{"No","Atribut","Nilai" }; 
       
       Object[][] data = new Object[listpa.size()][3];
       for(int i=0;i<listpa.size();i++)
       {
          data[i][0] = i+1;
          data[i][1] = listpa.get(i).getName(); 
          data[i][2] = listpa.get(i).getWeight().getW();        
       }
       dtm = new DefaultTableModel(data, header);       
       return dtm;       
       
   }
      
      public static DefaultTableModel ConvertMengitisCaseToTableModel(Meningitis meningitis)
      {
       DefaultTableModel dtm=null;             
       String header[] = new String[]{"No","Sex","Wbc","Pmn","Bloodgl","GL","PR","REDS","White","Gram","Culture","Meningitis"};
       Object[][] data = new Object[meningitis.getDataCount()][header.length];
       for(int i=0;i<meningitis.getDataCount();i++)
       {
          data[i][0] = i+1;
          MeningitisData md= meningitis.getData(i);
          for(int j=0;j<md.getAttributeCount();j++) 
          { 
              data[i][j+1] = md.getValues(j);
             // System.out.println(  data[i][j] );
          }
          
          data[i][11] =  md.getTypeofMeningitis();
         
          
       }

       dtm = new DefaultTableModel(data, header);       
       return dtm;       
       
   }
    
}
