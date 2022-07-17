package Sistema_Onibus;

import javax.swing.JOptionPane;

/**
 * mostarOnibus
 */
public class onibus {

    public static void mostrar(String status[]){
        String a = "";
        
        for (int i = 0; i < status.length; i++) {

            a += (String.format("%02d", i+1 )+" - "+status[i]+"\n");  
        }
       
        JOptionPane.showMessageDialog(null, a );

    }

    public static int selecionarPoltrona(String status[]){
        int poltrona;
        String a = "";
        
        for (int i = 0; i < status.length; i++) {

            a += (String.format("%02d", i+1 )+" - "+status[i]+"\n");  
        }
       
        poltrona = Integer.parseInt(JOptionPane.showInputDialog(null, a ));

        return poltrona;
    }
    
}