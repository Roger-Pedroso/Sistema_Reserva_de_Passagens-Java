package Sistema_Onibus;

public class poltronas {
    
    public static void comprar(int poltrona, String onibus[]){
        onibus[poltrona-1] = "Vendida";
    }

    public static void reservar(int poltrona, String onibus[]){
        onibus[poltrona-1] = "Reservada";
    }

    public static void cancelar_reserva(int poltrona, String onibus[]){
        onibus[poltrona-1] = "Disponivel";
    }

}
