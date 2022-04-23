package com.myproject;


import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DataframeTest extends TestCase  {
      /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DataframeTest( String testName )
    {

        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Dataframe.class );
    }

    public void ConstructorTest(){
        Object[][] dataframe = new Object[2][2] ;
        ArrayList<String> colonne_name = new ArrayList<>() ;
        ArrayList<String> colonne_type = new ArrayList<>() ;

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                dataframe[i][j] = i ;
            }
        }
        colonne_name.add("A");
        colonne_name.add("B");

        colonne_type.add("int");  
        colonne_type.add("int"); 
        
        int n_c = 2;
        int n_l = 2;  

        float b = (float) 0.1 ; 

        ArrayList<Object> elements = new ArrayList<>() ;
        for (int i = 0; i < n_l; i++) {
            for (int j = 0; j < n_c; i++) {
                elements.add( dataframe[i][j]) ;
            }
        Dataframe df = new Dataframe(colonne_name, elements) ;
        boolean diff=true;
        for (int j = 0; j < n_l; j++) {
            for (int j2 = 0; j2 < n_c ; j2++) {
                if(diff&&(dataframe[j][j2]!=df.getDataframe()[j][j2]))
                {
                    diff=false;
                }
            }
        }

    }
}
}
