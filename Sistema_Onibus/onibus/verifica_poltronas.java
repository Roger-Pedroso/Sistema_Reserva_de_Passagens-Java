package Sistema_Onibus;

public class verifica_poltronas {
    
    public static Boolean disponivel(String onibus[]) {
        Boolean poltronas = false;

        for (int i = 0; i < onibus.length; i++) {
            if(onibus[i].equals("Disponivel")){
                poltronas = true;
            }
        }
        return poltronas;
    }
}
