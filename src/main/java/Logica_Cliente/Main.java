/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;


import Logica_Negocio.MergeSort;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author 1061767208
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] randomArray= IntStream.generate( () -> new Random().nextInt(10000)).limit(10000).toArray();
      int n= randomArray.length;
      long inicio=System.currentTimeMillis();
      MergeSort.mergeSort(randomArray,n);
      long fin=System.currentTimeMillis();
      double tiempo= (double) (fin-inicio);
      System.out.println("Tiempo en milisegundos" + tiempo);
      System.out.println("El tiempo que se demoro fue:"+"\t"+tiempo/1000+"\t"+"En segundos");
   
    }
    
}
