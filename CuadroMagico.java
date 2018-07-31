/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadromagico;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CuadroMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int i,j,x, cont=1, n;
      boolean si=false;
      Scanner leer = new Scanner(System.in);  
       do{
            System.out.println("Ingresa el tamaño de la matriz");
            n= leer.nextInt();
            if(n%2 !=0 || n==1 & n>=3 ){
                 
                  si=true;
              
            }else{
                System.out.println("Numero no valido");           
            } 
        }while(si!=true);
      int cuadro[][]=new int[n][n];
      x=n*n;
      i=0;
      j=(n-1)/2;
      cuadro[i][j]=cont;
       
      while(cont<x){
          if(i-1 >=0){
              if(j+1 <n){
                  if(cuadro[i-1][j+1]==0){
                  i=i-1;
                  j=j+1;
                  cont=cont+1;
                  cuadro[i][j]=cont;
                  }else{
                  i=i+1;
                  cont=cont+1;
                  cuadro[i][j]=cont;
                  }
              }else{
                if(cuadro[i-1][0]==0){
                i=i-1;
                j=0;
                cont=cont+1;
                cuadro[i][j]=cont;
                }
              }    
          }else{
              if(j+1<n){
              
                  if(cuadro[n-1][j+1]==0){
                  i=n-1;
                  j=j+1;
                  cont=cont+1;
                    cuadro[i][j]=cont;      
                  }
              }else{
              i=i+1;
              cont=cont+1;
              cuadro[i][j]=cont;
              }
          }
      }   
    //Imprimir matriz    
       System.out.println("CUADRO MAGICO");
       for(i=0;i<n;i++){
       for(j=0;j<n;j++){
        System.out.print(" "+cuadro[i][j]);  
       }
       System.out.println();
       }
    
    }
    
}
