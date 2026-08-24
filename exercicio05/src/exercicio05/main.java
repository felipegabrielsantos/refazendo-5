//exercício 3 "EXERCÍCIOS COM ESTRUTURA DE DECISÃO"
package exercicio05;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
    	int aux, maior;
    	String repe;
    	
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4º número:"));
        int n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 5º número:"));
        int n6 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 6º número:"));
        
        
        
        for (int i = 0; i < 5; i++) {
            if (n1 > n2){
            	aux = n1;
            	n1 = n2;
            	n2 = aux;
            }
            if (n2 > n3){
            	aux = n2;
            	n2 = n3;
            	n3 = aux; 
            }
            if (n3 > n4){ 
            	aux = n3; 
            	n3 = n4; 
            	n4 = aux; 
            }
            if (n4 > n5){ 
            	aux = n4; 
            	n4 = n5; 
            	n5 = aux; 
            }
            if (n5 > n6){ 
            	aux = n5; 
            	n5 = n6; 
            	n6 = aux;
            }
        }
        
        maior = n6;
        
        
        if ((n1 == n2 || n2 == n3 || n3 == n4 || n4 == n5 || n5 == n6)) {
            repe = "Sim";
        } else {
            repe = "Não";
        }
        
        JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\n"
                + "Existem repetidos: " + repe + "\n"
                + "Ordem crescente: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);
    }
}