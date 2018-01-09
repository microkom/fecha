/*
Crea una clase Date con atributos para el día, el month y el año de la
fecha e incluye los siguientes métodos:
     
 */
package fecha;

public class Date {
    private int day;
    private int month;
    private int year;
    
   
    //Constructor sin parámetros con el 1-1-1900 como fecha por defecto
    public Date(){
        this.day=1;
        this.month=1;
        this.year=1990;
    }
    
    //Constructor con los parámetros con día, month y año.
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
        valida();
    }
    
    // Métodos set y get para los 3 atributos.
   public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }
    
    //bisiesto(): indicará si el año de la fecha es bisiesto o no.
    public boolean bisiesto(){
        boolean leapYear=false;
        if ((this.year%4 ==0)&&(this.year%100 !=0)){
            leapYear=true;
         }else{
            if ((this.year%400==0) && (this.year%100 ==0)){
                 leapYear=true;
            }else{
                 leapYear=false;
            }
        }
        return leapYear;
    }    
    
    /* diasMes(int month): devolverá el número de días del mes que se le
    indique (para el año de la fecha). */
    public int diasMes(int oneMonth){
        int days=0;
        if (verifyNumberOfDaysPerMonth()==true)
            days=daysInAMonth(oneMonth);
        return days;
    }
    
    public int daysInAMonth(int month){
        int dayMonth=0;
        switch (month){
            case 4:dayMonth=30;break;
            case 6:dayMonth=30;break;
            case 9:dayMonth=30;break;
            case 11:dayMonth=30;break;
            case 1:dayMonth=31;break;
            case 3:dayMonth=31;break;
            case 5:dayMonth=31;break;
            case 7:dayMonth=31;break;
            case 8:dayMonth=31;break;
            case 10:dayMonth=31;break;
            case 12:dayMonth=31;break;
            case 2:if (bisiesto()==true) dayMonth=29;else dayMonth=28;break;
            default: dayMonth=17;
        }
    return dayMonth;
    }
	
    //Validar meses
    public boolean validMonth(){
        boolean monthOk=false;
        if (this.month>0 && this.month <=12) monthOk=true;
            return monthOk;
    }
	
    //verificar que el número de días si son los que tiene el mes
    public boolean verifyNumberOfDaysPerMonth(){
        boolean numberOk=true;
        if(validMonth()==true){
            if (this.month==2){
                if (this.day>0 && this.day<=28){ 
                    numberOk=true;
                }else if (this.day>0 && this.day<=29 && bisiesto()==true){ 
                    numberOk=true;
                }else{
                    numberOk=false;
                }
            }
            if (this.month==4 || this.month==6 || this.month==9 || this.month==11){
                if (this.day >0 || this.day<=30){
                    return numberOk=true;
                }else{
                    return numberOk=false;
                }
            }else{
                if (this.day>0 || this.day <=31){
                    return numberOk=true;
                }
            }
        }else{
            numberOk=false;
        }
        return numberOk;
    }
    
    /*
    valida(): comprobará si la fecha es correcta (entre el 1-1-1900 y el
    31-12-2050); si el día no es correcto, lo pondrá a 1; si el mes no es
    correcto, lo pondrá a 1; y si el año no es correcto, lo pondrá a 1900.
    Será un método auxiliar (privado). Este método se llamará en el
    constructor con parámetros. */
    
    public void valida(){
        if (!(this.year>=1900 && this.year<= 2050))
            this.year=1900;
        if (validMonth()==false)
            this.month=1;
        if (verifyNumberOfDaysPerMonth()==false){
            this.day=1;
        }
    }
    
    //corta(): mostrará la fecha en formato corto (02-09-2003). 
    public String corta(){
        return this.day+"-"+this.month+"-"+this.year;
    }
    //siguiente(): pasará al día siguiente. 
    public void siguiente(){
        if (verifyNumberOfDaysPerMonth()==true){
            if (this.day==daysInAMonth(this.month) && this.month==12){
                this.year++;
                this.month=1;
                this.day=1;
            }else if (this.day==daysInAMonth(this.month)){
                this.month++;
                this.day=1;
            }else{
                if (this.day<daysInAMonth(this.month)){
                    this.day++;
                }
            }
        }
    }
    
    //anterior(): pasará al día anterior. 

    public void anterior(){
        if (verifyNumberOfDaysPerMonth()==true){
            if (this.day==1 && this.month==1){
                this.year--;
                this.month=12;
                this.day=daysInAMonth(this.month);
            }else if (this.day==1){
                this.month--;
                this.day=daysInAMonth(this.month);
            }else{
                if (this.day>1){
                    this.day--;
                }
            }
        }
    }
    
    //igualQue(Fecha fec): indica si la fecha es la misma que la proporcionada.
    
    public boolean igualQue(Date fecha){
        boolean equal=false;
        if (this.day == fecha.day && this.month == fecha.month && this.year == fecha.year){
            equal=true;
        }
        return equal;
    }
    
    //menorQue(Fecha fec): indica si la fecha es anterior a la proporcionada.   
    
    public boolean menorQue(Date fecha){
        boolean lower=false;
        if (this.year < fecha.year ){
            lower=true;
        }else if (this.year  == fecha.year && this.month <fecha.month  ){
            lower=true;
        }else if ( this.year ==fecha.year && this.month == fecha.month &&  this.day < fecha.day ){ 
            lower=true;
        }else{
            lower=false;
        }
        return lower;
    }
    
    // mayorQue(Fecha fec): indica si la fecha es posterior a la  proporcionada. 
        
    public boolean mayorQue(Date fecha){
        boolean upper=false;
        if (this.year > fecha.year){
            upper=true;
        }else if((this.year == fecha.year) && ( this.month >fecha.month ) ){
            upper=true;
        }else if((this.year == fecha.year ) && (this.month == fecha.month ) && (this.day > fecha.day )){
            upper=true;
        }else{
            upper=false;
        }
        return upper;
    }
    
    //diasTranscurridos(): devolverá el número de días transcurridos desde el 1-1-1900 hasta la fecha.
    public int diasTranscurridos(){
       int days=0,years=0, i=0;

        //suma de los días acumulados por años
        for (i=this.year-1;i>=1900;i--){
            boolean bisiesto=false;
            if ((i%4 ==0)&&(i%100 !=0)){
                bisiesto=true;
            }else{
                if ((i%400==0) && (i%100 ==0)){
                     bisiesto=true;
                }else{
                     bisiesto=false;
                }
            }
            if (bisiesto==true){
                years+=366;
            }else{
                years+=365;
            }
        }
        //suma de los días y meses sueltos del último año
        for (i=this.month-1;i>0;i--){    
            days+=diasMes(i);
        } 
        return this.day+days+years;
    }
    
    public String weekday(int day){
        String wday="";
        switch(day){
            case 1:wday="Monday";break;
            case 2:wday="Tuesday";break;
            case 3:wday="Wednesday";break;
            case 4:wday="Thursday";break;
            case 5:wday="Friday";break;
            case 6:wday="Saturday";break;
            case 7:wday="Sunday";break;
        }
        return wday;
    }
    //diaSemana(): devolverá el día de la semana de la fecha. El 1-1-1900 fue Lunes
    public String diaSemana(){
        String wday="";
            wday=weekday(diasTranscurridos()%7);
        return wday;
    }
    public String months(int choice){
        String month="";
        switch (choice){
            case 1:month= "January";break;
            case 2:month= "February";break;
            case 3:month= "March";break;
            case 4:month= "April";break;
            case 5:month= "May";break;
            case 6:month= "June";break;
            case 7:month= "July";break;
            case 8:month= "August";break;
            case 9:month= "September";break;
            case 10:month= "October";break;
            case 11:month= "November";break;
            case 12:month= "December";break;
        }
        return month;
    }
    //larga(): mostrará la fecha en formato largo, empezando por el día de la semana (martes 2 de septiembre de 2003).
    public String larga(){
        String fecha="";
            fecha=diaSemana()+" "+this.day+" "+months(this.month)+" de "+this.year;
        return fecha;
    }
    
}
   