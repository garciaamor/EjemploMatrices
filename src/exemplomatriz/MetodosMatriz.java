package exemplomatriz;

import javax.swing.JOptionPane;

public class MetodosMatriz {
    int[][]notas=new int[3][4];
    float[]notasMedias=new float[3];
    float []mediaModulos= new float [4];
    String [] nomes={"aa","bb","cc"};
    String [] modulos={"Prog","CD","BD","LM"};
    // se puede cargar asi la matriz: int [][]notaM={{7,9,5,4},{5,5,5,5},{6,7,8,9}};
    public void cargarMatriz(){
     for (int f=0;f<notas.length;f++)
         for(int c=0;c<notas[f].length;c++)
                 notas[f][c]=pedirNota();
    }
    public void amosarMatriz(){
        calcularMediaNotas();
        for (int f=0;f<notas.length;f++){
            
         for(int c=0;c<notas[f].length;c++)
            
        System.out.print(notas[f][c]+"  ");
          System.out.println("\n");
        }
            }
    public void amosarMediaMatriz(){
        calcularMediaNotas();
        for (int f=0;f<notas.length;f++){
            
         for(int c=0;c<notas[f].length;c++)
            
        System.out.print(notas[f][c]+"  ");
          System.out.println("   nota media del alumno :    "+notasMedias[f]+"\n");
          //System.out.println(notasMedias[f]+" es la nota media \n" );
        }
            }
    public int pedirNota(){
        int resultado;
        do{
            resultado=Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota"));
            if (resultado<1||resultado>10)
                JOptionPane.showMessageDialog(null, "Introduce una nota valida (entre 1 y 10)");
        } while (resultado<1||resultado>10);
        return resultado;
    }
    public void calcularMediaNotas(){
        for(int f=0;f<notas.length;f++){
            float acumulador=0;
            for(int c=0;c<notas[f].length;c++){
             acumulador=acumulador+notas[f][c];
            }
            notasMedias[f]= acumulador/notas[f].length;
            }      
    }
    public void calcularMediaModulos(){
            for(int f=0;f<notas.length;f++){
           
            for (int c=0;c<notas[f].length;c++){
                
              mediaModulos[c]=mediaModulos[c]+notas[f][c];      
            }  }
            for (int c=0;c<mediaModulos.length;c++){
                mediaModulos[c]=mediaModulos[c]/notas.length;
                System.out.println("nota media del modulo  "+mediaModulos[c]);
                
            }
}
    public void amosarTodo(){
        String acumulador="";
        
        for (int f=0;f<modulos.length;f++){
            System.out.println("   "+ modulos[f]);
            acumulador="";
            
            for (int c=0;c<nomes.length;c++){
               acumulador="";
                System.out.println(nomes[c]);
          }
            System.out.println("\n");
        }
      }
    
}

    
