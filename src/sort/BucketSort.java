package sort;

import java.util.*;
public class BucketSort {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor:");
        int n = entrada.nextInt();
        
        int [] sort = preencheVetor(n); 
 
        System.out.println("Antes: " + Arrays.toString(sort));
        Bucket(sort, n);
        System.out.println("Depois:  " + Arrays.toString(sort));
        entrada.close();
        
    }
    
    public static void Bucket(int[] vetor, int n) {
        int [] bucket = new int[n+1];
 
        for (int i = 0; i< bucket.length; i++) {
            bucket[i] = 0;
        }
 
        for (int i = 0; i < vetor.length; i++) {
            bucket[vetor[i]]++;
        }
        int pos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                vetor[pos++] = i;
            }
        }
    }
    
    private static int[] preencheVetor(int n){
        int vetor[] = new int[n];
        Random gerar = new Random();
        for(int i = 0; i < n; i++){
            vetor[i] = gerar.nextInt(n);
        }
                
        return vetor;
    }
   
}
