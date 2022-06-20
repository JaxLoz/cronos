package com.mycompany.cronometro;


/**
 *
 * @author javier
 */
public class Logica {
    
    private int hours;
    private int minutes;
    private int seconds;
    private int miliseconds;

    public Logica (){
        
        this.hours = 0;
        this.minutes= 0;
        this.seconds = 0;
        this.miliseconds = 0;
    }
    
    public void setHours(int hou) {
        this.hours = hou;
    }

    public void setMinutes(int min) {
        this.minutes = min;
    }

    public void setSeconds(int sec) {
        this.seconds = sec;
    }

    public void setMiliseconds(int msec) {
        this.miliseconds = msec;
    }
    
     public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMiliseconds() {
        return miliseconds;
    }
    
    public void Cronometrar (){
        
        miliseconds++;
        if (miliseconds == 100){
            seconds++;
            miliseconds = 0;
            if (seconds == 60){
                minutes++;
                seconds = 0;
                if (minutes == 60){
                    hours++;
                    minutes = 0;
                }
            }
        }
    }
    
    public void RestartTimer (){
        setHours(0);
        setMinutes(0);
        setSeconds(0);
        setMiliseconds(0);
    }
    
    
    
}
