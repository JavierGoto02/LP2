package Ejercicio3;
import java.util.Random;
/**
 *
 * @author Grupo 1 - Laboratorio 6
 */


public class Ejercicio3 {

    public static void main(String[] args) {
        Random numrand = new Random();
        int cantnotasmes = 0;
        int notarand;
        int[][] cantnotas = new int[120][3];
        int contadornota = 0;
        for(int dias = 0; dias < 30; dias++){
            for(int empleado = 0; empleado < 4; empleado++){
                notarand = numrand.nextInt(5);
                cantnotas[contadornota][0] = empleado + 1;
                cantnotas[contadornota][1] = notarand;
                contadornota++;
                cantnotasmes += notarand;
            }
        }
        
        int[][] listanotas = new int[cantnotasmes][3];
        // listanotas[n][0] = numero vendedor
        // listanotas[n][1] = numero producto
        // listanotas[n][2] = valor total del producto
        int contlista = 0;
        int numprod, totprec;
        for(contadornota = 0; contadornota < 120; contadornota++){
            if(cantnotas[contadornota][1] != 0){
                for(int contaux = 0; contaux < cantnotas[contadornota][1]; contaux++){
                    listanotas[contlista][0] = cantnotas[contadornota][0];
                    numprod = numrand.nextInt(5) + 1;
                    listanotas[contlista][1] = numprod;
                    totprec = numrand.nextInt(21) + 1;
                    listanotas[contlista][2] = totprec;
                    contlista++;
                }
            }
        }
        
        
        int[][] ventatotales = new int[4][5];
        
        for(contlista = 0; contlista < listanotas.length; contlista++){
            int fila = listanotas[contlista][0] - 1;
            int columna = listanotas[contlista][1] - 1;
            ventatotales[fila][columna] += listanotas[contlista][2];
        }
        

        
        int[] ventavendedor = new int[4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                ventavendedor[i] += ventatotales[i][j];
            }
        }
        
        int[] ventaproducto = new int[5];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                ventaproducto[j] += ventatotales[i][j];
            }
        }
        
        
        System.out.printf("\t%s\t%s\t%s\t%s\t%s\n","ven1", "ven2", "ven3", "ven4", "totprod");
        for(int i = 0; i < 5; i++){
            System.out.printf("%s%d\t%d\t%d\t%d\t%d\t%d\n", "prod", i+1, ventatotales[0][i], ventatotales[1][i], ventatotales[2][i], ventatotales[3][i], ventaproducto[i]);
        }
        System.out.printf("%s\t%d\t%d\t%d\t%d\n", "totvend", ventavendedor[0], ventavendedor[1], ventavendedor[2], ventavendedor[3]);

    }
    
}
