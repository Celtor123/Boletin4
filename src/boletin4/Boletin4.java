
package boletin4;

public class Boletin4 {
 
public int clientes(int polvo,int patacas){
    int persoas = patacas/3 + (2*polvo)/3;
    return persoas;
}
    public void engadirPolbo(int x){
      polvo=polvo+ x;
        
    }
    public void engadirPatacas(int x){
        this.patacas=patacas+x;
    }
    public void amosarPolbo(){
      
       System.out.println("temos "+polvo+"kg de polvo");
    }
    public void amosarPatacas(){
  
        System.out.println("temos "+patacas+"kg de patacas");
    }
   
    public static void main(String[] args) {
        Boletin4 dfg= new Boletin4();
        System.out.println(dfg.clientes(2, 1) );
        dfg.amosarPatacas();
        dfg.amosarPolbo();
         dfg.engadirPatacas(4);
         dfg.engadirPolbo(3);
         
       
    }
    
}

// Un restaurante galego, especializado en polbo con patacas, pídenos que lle deseñemos   
//un método co que se poda saber cantos clientes poden atender coa materia prima que teñen no almacen .
//O método recibe a cantidade de polbo e patacas, en kilos, e devolve o número de clientes que pode atender o restaurante .
//Tendo en conta que por cada 3 persoas , o restaurante utiliza 2 kg de polbo e 1 de patacas. 
//  Na clase creada anteriormente implementa, tamén, os seguintes métodos : 
//
//   public void engadirPolbo(int x ) . Engade x kg de polbo a os xa existentes
//   public void engadirPatacas ( int x) . Engade x kg de patacas  ''       ''           
//   public void amosarPolbo( ) . Amosa por pantalla os kg de polbo que ten no almacen
//   public void amosarPatacas ( ) .  ''        ''       ''              ''   ''    patacas   ''     ''       ''            