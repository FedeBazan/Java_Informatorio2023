package caballero;

import java.text.DecimalFormat;

public class Ej05RestalosProhibidoMenoresACeros {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.00");
        double numDec[]={2.1,1.8,3.6,0.1};
        double numDec2[]={1.2,8.1,6.3,1.0};
        double numRes[]= new double [4];

        for (int i=0;i<numDec.length;i++){
            numRes[i]=numDec[i]-numDec2[i];
        }
        for (int i=0;i<numRes.length;i++){
            System.out.println(formato.format(numRes[i]));
        }
    }
}