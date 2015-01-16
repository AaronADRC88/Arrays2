package arrays2;

import javax.swing.JOptionPane;

public class Metodos {

    public static void visualizar(String[] nome, int[] dorsal) {
        for (int i = 0; i < nome.length; i++) 
           // JOptionPane.showMessageDialog(null, (nome[i]+"\t\t"+dorsal[i]));
        {
           System.out.printf("%-12S %-10d", nome[i], dorsal[i]);
        }
    }

    public static void busqueda(String[] nome, int[] dorsal) {
        String search = JOptionPane.showInputDialog("introduce busqueda");
        int b = Integer.parseInt(search);
        int founded=0;// non está
        
        for (int i = 0; i < nome.length; i++) {
            if (b == dorsal[i]) {
                founded=1;
                JOptionPane.showMessageDialog(null, "nº: "+b+"\nnome: "+nome[i]);
        break;
         }
    }
        if(founded==0)
            JOptionPane.showMessageDialog(null, "non está");
}
}
