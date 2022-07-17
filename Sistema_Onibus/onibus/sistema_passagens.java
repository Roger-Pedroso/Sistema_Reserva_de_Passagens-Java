package Sistema_Onibus;

import javax.swing.JOptionPane;

/**
 * main
 * no primeiro menu ter a opção de visualixar todas ad poltronas e em cada aba especifica mostras só as poltronas que corespoedm a operação
 */
public class sistema_passagens {
   
    public static void main(String[] args) {
        int sistema =0;
        int linha;
        int operacao;
        String onb1[] = new String[10];
        String onb2[] = new String[10];

        int poltrona = 0;

        String onibus1 = "C:/users/Roger/Desktop/java/Sistema_Onibus/onibus1.txt";
        String onibus2 = "C:/users/Roger/Desktop/java/Sistema_Onibus/onibus2.txt";

        onb1 = manipulador_arquivo.leitor(onibus1);
        onb2 = manipulador_arquivo.leitor(onibus2);

        String titulo = "BIOPARK";

        JOptionPane.showMessageDialog(null, "BEM-VINDO AO SISTEMA", titulo, 1);
        
        do {
            Boolean disponivel = true;

            linha = Integer.parseInt(JOptionPane.showInputDialog("1 - Hogwarts\n2 - Quintos\nInforme a Linha Desejada:"));

            if(linha == 1){
                disponivel = verifica_poltronas.disponivel(onb1);
            }else if(linha == 2){
                disponivel = verifica_poltronas.disponivel(onb2);
            }

            if(disponivel == false){
                JOptionPane.showMessageDialog(null, "Não mais poltronas disponiveis na linha selecionada");
                linha = 0;
            }

        } while (linha != 1 && linha !=2 );

        do {
            operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Comprar\n2 - Reservar\n3 - Cancelar Reserva\nQual opção deseja:"));
        } while (operacao != 1 && operacao !=2 && operacao != 3);
    
        do{

        if(linha == 1){
            switch (operacao) {
                case 1: // Comprar
                    poltrona = onibus.selecionarPoltrona(onb1);
                    poltronas.comprar(poltrona, onb1);
                    onibus.mostrar(onb1);
                    break;
                case 2: // Reservar
                    //poltronas.reservar(poltrona, onibus);
                    break;
                case 3: // Cancelar Reserva
                    //poltronas.cancelar_reserva(poltrona, onibus);
                    break;
            }

        }else if(linha == 2){
            switch (operacao) {
                case 1: // Comprar
    
                    break;
                case 2: // Reservar
    
                    break;
                case 3: // Cancelar Reserva
    
                    break;
            }

        }

        sistema = Integer.parseInt(JOptionPane.showInputDialog(null, "0 - Fechar Sistema\n1 - Realizar outra operação"));
    }while(sistema != 0);

    manipulador_arquivo.escrever(onb1, onibus1);
    } 
}
