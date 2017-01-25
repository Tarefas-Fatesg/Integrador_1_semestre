/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador;

/**
 *
 * @author aluno
 */
public class Controle_de_campeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("gtk".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                  if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) {   
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                  } 
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_principal_software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_principal_software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_principal_software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_principal_software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // TODO code application logic here
        Tela_principal_software exibe  = new Tela_principal_software();
        exibe.setVisible(true);
    }
    
}
