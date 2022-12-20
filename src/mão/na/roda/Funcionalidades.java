
package mão.na.roda;

import javax.swing.JFrame;


public class Funcionalidades {
    
    public void mudaTela(JFrame open, JFrame close)
    {
        close.dispose();
        open.show();
    }
    
    public double taxas(String tipo, double value, double taxa, int dias){
        
        switch(tipo){
            
            case "JS": {
                return value + (value * taxa);
            }
            
            case "JC": {
                return value * (Math.pow(1+taxa,dias));
            }
        }
        return -1;
    }
}