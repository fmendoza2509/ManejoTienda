/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import manejotienda.Productos;
import manejotienda.Tienda;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joao
 */
public class TestProductos {
    
   
    
    public TestProductos() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    @Test
    public void AgregarTest(){
        Productos pr = new Productos();
        Tienda tn = new Tienda("001","ricas","galletas ricas de nestle",6);
        assertTrue(pr.Agregar(tn),"Error" );
    }
}
