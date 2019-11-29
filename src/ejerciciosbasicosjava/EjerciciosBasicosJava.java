
package ejerciciosbasicosjava;

/**
 *
 * @author Ruben Juarez
 */
public class EjerciciosBasicosJava {
    //ejercicio1
    public boolean fiestaArdillas(int numBellotas,boolean finDeSemana){
        if(finDeSemana){
        return true;
        }
    if(numBellotas>=40&& numBellotas<=60){
    return true;
    }
    return false;
    }
    //ejercicio2
    public int multa (int velocidad,boolean birthday){
    if (birthday){// si es mi cumple el guardia me quita 5 de velocidad
      velocidad -=5;
    }
    if (velocidad<=60){
      return 0;
    }
    if (velocidad > 60 && velocidad <=80){
      return 1;
    }
        return 2;// el resto de casos ,que son que voy a mas de 80
    }
    //ejercicio3
    public boolean vanidad (int n) {
    if (n % 11 == 0 || n% 11==1){
         return true;
    }
    return false;
 }
  // ejercicio4
  public boolean contesta (boolean matinal,boolean madre,boolean dormido){
 if(dormido){
      return false;
}
 if (matinal&&madre){
 return true;
 }
 return true;
  }
  // ejercicio5
  public boolean menorPor10(int a, int b, int c){
 if (Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10){
 return true;
 }
 return false;
  }
  
  // ejercicio6
  public boolean digitoIgual(int a, int b){
  int aIzq = a / 10;
  int aDer = a% 10;
  int bIzq = b/ 10;
  int bDer = b % 10;
  if(aIzq == bIzq || aIzq == bDer || aDer == bIzq || aDer == bDer){
      return true;
  }
  return false;
  }
  // ejercicio 7
  public boolean multiploMultiple(int numero){
   if(numero% 3 == 0 && numero% 5 ==0){ // el numero es  multiplo de 3 y de 5
       return false;
   }
    if (numero % 3 == 0 || numero % 5 == 0){ //el número es múltiplo de 3 ó
                                             //de 5 pero no de los dos, porque si
                                             //fuera de los dos se habría salido ya en el anterior if 
   return true;
   }
   
   return false;
  }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
          System.out.print (ejercicios.fiestaArdillas(30, false));
          System.out.print (ejercicios.fiestaArdillas(50, true));
          System.out.print (ejercicios.fiestaArdillas(70, true));
        
        // testeo el ejercicio 2
          System.out.print (ejercicios.multa(60, false));
          System.out.print (ejercicios.multa(65, false));
          System.out.print (ejercicios.multa(65, true));
           
           // testeo ejercicio 3
          System.out.print (ejercicios.vanidad(22));
          System.out.print (ejercicios.vanidad(23));
          System.out.print (ejercicios.vanidad(24));
           
           // testeo ejercicio 4
          System.out.print (ejercicios.contesta(false,false,false));  
          System.out.print (ejercicios.contesta(false,false,true));  
          System.out.print (ejercicios.contesta(true,false,false)); 
          
          // testeo ejercicio 5
          System.out.print ("menorPor10(1,7,11)"+ ejercicios.menorPor10(1, 7, 11));
          System.out.print ("menorPor10(1,7,10)"+ ejercicios.menorPor10(1, 7, 10));
          System.out.print ("menorPor10(11,1,7)"+ ejercicios.menorPor10(11, 1, 7));
          
          // testeo ejercicio 6 
          System.out.println("digitoIgual (12, 23) " + ejercicios.digitoIgual(12, 23) ); 
          System.out.println("digitoIgual (12, 43) " + ejercicios.digitoIgual(12, 43) );
          System.out.println("digitoIgual (12, 44) " + ejercicios.digitoIgual(12, 44) );
          
          //testeo ejercico 7
          
          System.out.println("multiploMultiple(3) " + ejercicios.multiploMultiple(3) );
          System.out.println("multiploMultiple(10) " + ejercicios.multiploMultiple(10) );
          System.out.println("multiploMultiple(15) " + ejercicios.multiploMultiple(15) );
    }
    
    
}
