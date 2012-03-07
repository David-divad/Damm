package org.deiv.test;  
     
import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.JUnitCore;

public class TestBatery {  
      
    public static void main(String[] args)
    {
        org.junit.runner.JUnitCore.runClasses( TestBatery.class ); 
    }

    @BeforeClass  
    public static void setUpClass() throws Exception
    {  
        //Inicialización general de variables, escritura del log...  
    }  
          
    @AfterClass  
    public static void tearDownClass() throws Exception
    {  
        //Liberación de recursos, escritura en el log...  
    }
          
    @Before  
    public void setUp()
    {  
        //Inicialización de variables antes de cada Test  
    }  
          
    @After  
    public void tearDown()
    {  
        //Tareas a realizar después de cada test  
    }  
          
    @Test  
    public void comprobarAccion()
    {  
        //creamos el entorno necesario para la prueba  
        //Usamos alguna de las funciones arriba descritas   
        //para realizar la comprobación  
    }  
          
    public void funcionAuxiliar() 
    {  
        //tareas auxiliares  
    }  
          
}  

