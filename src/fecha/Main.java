
package fecha;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int day,month,year;
        
       //Crear objeto fecha1 sin parámetros.
       
       Date fecha1=new Date();
       
       //Mostrar fecha1 en formato corto.
       
       System.out.print(fecha1.corta()+"\n");

       //Crear objeto fecha2 pidiendo los parámetros al usuario por teclado.
       
       System.out.println(" *-----------------------------------------* ");
     /*  System.out.print("Escribe una fecha entre 1-1-1900 y el 31-12-2050: \nDía: ");
       day=sc.nextInt();
       
       System.out.print("Mes: ");
       month=sc.nextInt();
       
       System.out.print("year: ");
       year=sc.nextInt();      

       Date fecha2 = new Date(day,month,year);
   */     Date fecha2 = new Date(4,8,1952);
   /*    
       
       //Mostrar fecha2 en formato corto.
       
       
       System.out.print("fecha 2: "+fecha2.corta());
       if (fecha2.validMonth()==true)System.out.println("\n\n**** fecha2 validaMonth()ok****");
       System.out.print("fecha 2: "+fecha2.corta()+"\n");
  */     /*
       Crear un tercer objeto fecha3 con parámetros incorrectos (Ejemplo
       12-14-2017). Mostrar fecha3 en formato corto.
       */
       
       Date fecha3 = new Date(12,14,2017);
       
       //Cambiar con los métodos set fecha3 a 1-1-2016
       
       fecha3.setDay(30);
       fecha3.setMonth(2);
       fecha3.setYear(2016); 
       
       //Utilizar método anterior sobre fecha3 y mostrar fecha en formato corto
       
       System.out.print("\nfecha 3: "+fecha3.corta()+"\n");
       
       //Cambiar con los métodos set fecha3 a 1-3-2016.
       
       fecha3.setDay(1);
       fecha3.setMonth(3);
       fecha3.setYear(2016);
       
       //Utilizar método anterior sobre fecha3 y mostrar fecha en formato corto
       
       System.out.print("fecha 3: "+fecha3.corta()+"\n");
       
        System.out.println("\nComparar fecha 3 y fecha2 con los métodos menorQue y mostrar los resultados.");
        
        if (fecha3.igualQue(fecha2)==true){
            System.out.print("=> Fecha 3 es igual a fecha2");
        }else{
            System.out.print("=> Fecha 3 NO es igual a fecha2");
        }

        System.out.println("\n\nComparar fecha1 y fecha2 con el método igualQue y mostrar el resultado.");
        
        if (fecha1.igualQue(fecha2)==true){
            System.out.println("=> Fecha 1 es igual a fecha2");
        }else{
            System.out.println("=>Fecha 1 NO es igual a fecha2");
        }
        
        System.out.println("\nComprobar si el año de fecha2 es bisiesto");
        
        if (fecha2.bisiesto()==true){
            System.out.println("El año fecha2 SI es bisiesto");
        }else{
            System.out.println("El año fecha2 NO es bisiesto");
        }
        
            
        System.out.println("\nMuestra el número de días del mes 2 y del mes 3 de fecha2 utilizando el método diasMes.");
       
        System.out.printf("=> Días en fecha2 en el mes2=%d, y en el mes3=%d \n\n ",fecha2.daysInAMonth(2),fecha2.daysInAMonth(3));
    
       /*
       Cambiar la fecha a 30-4-2016 de fecha1 utilizando los métodos set e
        incrementar con un día con el método siguiente. Mostrar a
        continuación la fecha en formato corto.
       */
       
       fecha1.setDay(30);
       fecha1.setMonth(3);
       fecha1.setYear(2016);
        
       System.out.print("fecha 1: "+fecha1.corta()+"\n");
       
       //Agregar un día a fecha1
       fecha1.siguiente();
       
       System.out.print("fecha 1: "+fecha1.corta()+"\n");
       
       //restar un día a  fecha1
       fecha1.anterior();
       
       System.out.print("fecha 1: "+fecha1.corta()+"\n");
       
       System.out.print("\nPor último comparar fecha1 y fecha 3 con el método mayorQue() y "+
        "mostrar cuál de las 2 fechas es mayor.\n\n");
       
       //Estos valores se modifican para hacer las comparaciones más adelante
       fecha1.setDay(1);
       fecha1.setMonth(1);
       fecha1.setYear(1904);
       
       fecha3.setDay(1);
       fecha3.setMonth(3);
       fecha3.setYear(2016);
       
       //Estas fechas se muestran para poder confirmar que las comparaciones más adelante son ciertas
       System.out.print("fecha 1: "+fecha1.corta()+"\n");
       System.out.print("fecha 3: "+fecha3.corta()+"\n\n");
       
       //Comparacion de fechas mayorQue
       
       if (fecha1.mayorQue(fecha3)==true){
           System.out.println("=> fecha1 es mayor que fecha3");
       }else{
           System.out.println("=> fecha1 NO es mayor que fecha3");
       }
       
       //Comparacion de fechas menorQue
       if (fecha1.menorQue(fecha3)==true){
           System.out.println("=> fecha1 es menor que fecha3");
       }else{
           System.out.println("=> fecha1 NO es menor que fecha3");
       }
       fecha1.setDay(29);
       fecha1.setMonth(11);
       fecha1.setYear(2017);
       
       System.out.print("fecha 1: "+fecha1.corta()+"\n");
       System.out.print("fecha 2: "+fecha2.corta()+"\n");
       System.out.print("fecha 3: "+fecha3.corta()+"\n");
       System.out.print(fecha1.diasTranscurridos()+"\n");
       System.out.print(fecha1.diaSemana()+"\n");
       System.out.print(fecha1.larga()+"\n");
       if (fecha1.bisiesto()==true){
            System.out.println("El año de fecha1 SI es bisiesto");
        }else{
            System.out.println("El año de fecha1 NO es bisiesto");
        }
    }
    
    
}
