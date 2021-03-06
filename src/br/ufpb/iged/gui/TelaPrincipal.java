/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaPrincipal.java
 *
 * Created on 14/03/2012, 02:40:44
 */
package br.ufpb.iged.gui;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Dorgi
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private static TelaPrincipal novaTela;

    /** Creates new form TelaPrincipal */
    private TelaPrincipal() {
        initComponents();
        
    }

    public static TelaPrincipal getInstance() {
        if (novaTela == null) {
            novaTela = new TelaPrincipal();
        }
        return novaTela;
    }

    public static JPanel getPanel() {
        return getInstance().panelPrincipal;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        botaoCadastrarTutorial = new javax.swing.JButton();
        botaoAbrir = new javax.swing.JButton();
        botaoPesquisarTutorial = new javax.swing.JButton();
        botaoCadastrarExercicio = new javax.swing.JButton();
        botaoAjuda = new javax.swing.JButton();
        botaoPesquisarExercicio = new javax.swing.JButton();
        botaoCadastrarObjetiva = new javax.swing.JButton();
        botaoExecutarObjetiva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IGED - Interpretador de Comandos e Avaliador Gráfico para o Ensino de Estrutura de Dados");
        setResizable(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        botaoCadastrarTutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/63edit.png"))); // NOI18N
        botaoCadastrarTutorial.setToolTipText("Cadastrar Tutorial");
        botaoCadastrarTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarTutorialActionPerformed(evt);
            }
        });

        botaoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/119.png"))); // NOI18N
        botaoAbrir.setToolTipText("Abrir Arquivo");
        botaoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirActionPerformed(evt);
            }
        });

        botaoPesquisarTutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/61.png"))); // NOI18N
        botaoPesquisarTutorial.setToolTipText("Visualizar Tutorial");
        botaoPesquisarTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarTutorialActionPerformed(evt);
            }
        });

        botaoCadastrarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8.png"))); // NOI18N
        botaoCadastrarExercicio.setToolTipText("Cadastrar Exercício");
        botaoCadastrarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarExercicioActionPerformed(evt);
            }
        });

        botaoAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/67.png"))); // NOI18N
        botaoAjuda.setToolTipText("Ajuda");
        botaoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAjudaActionPerformed(evt);
            }
        });

        botaoPesquisarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10.png"))); // NOI18N
        botaoPesquisarExercicio.setToolTipText("Pesquisar Exercício");
        botaoPesquisarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarExercicioActionPerformed(evt);
            }
        });

        botaoCadastrarObjetiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44.png"))); // NOI18N
        botaoCadastrarObjetiva.setToolTipText("Cadastrar Tarefa Objetiva");
        botaoCadastrarObjetiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarObjetivaActionPerformed(evt);
            }
        });

        botaoExecutarObjetiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/43.png"))); // NOI18N
        botaoExecutarObjetiva.setToolTipText("Pesquisar Exercício Objetivo");
        botaoExecutarObjetiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExecutarObjetivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAbrir)
                        .addGap(2, 2, 2)
                        .addComponent(botaoCadastrarTutorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisarTutorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCadastrarExercicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisarExercicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCadastrarObjetiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExecutarObjetiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(botaoAjuda))
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoAbrir)
                        .addComponent(botaoCadastrarTutorial)
                        .addComponent(botaoPesquisarTutorial)
                        .addComponent(botaoCadastrarExercicio))
                    .addComponent(botaoAjuda)
                    .addComponent(botaoCadastrarObjetiva)
                    .addComponent(botaoPesquisarExercicio)
                    .addComponent(botaoExecutarObjetiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoCadastrarObjetiva.getAccessibleContext().setAccessibleDescription("");
        botaoExecutarObjetiva.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static JInternalFrame cadTutorial, cadExe, visualizarTut, responderExe, pesquisarExe, cadExeObj, responderExeObj, abrirTocador;

    private void botaoPesquisarTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarTutorialActionPerformed
        if (visualizarTut == null) //instancia a tela de cadastro de clientes
        {
            visualizarTut = new TelaTutorialFrameInterno();
            //visualizarTut = new TelaTutorialFrameInterno();
            jDesktopPane1.add(visualizarTut);
            ((BasicInternalFrameUI)visualizarTut.getUI()).setNorthPane(null);
            try {
                visualizarTut.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            visualizarTut.setClosable(true);
            visualizarTut.setMaximizable(true);
            visualizarTut.setIconifiable(true);
            visualizarTut.show();
        } else{
            visualizarTut.dispose();
        }
        //independente da tela estar visível ou não, a tela é movida para frente
        //jDesktopPane1.moveToFront(visualizarTut);
    }//GEN-LAST:event_botaoPesquisarTutorialActionPerformed
/**/
    public static void botaoResponderExercicio() {                                                        
        if (responderExe == null) //instancia a tela de cadastro de clientes
        {
            responderExe = new TelaExercicioInterno();
            jDesktopPane1.add(responderExe);
            ((BasicInternalFrameUI)responderExe.getUI()).setNorthPane(null);
            try {
                responderExe.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            responderExe.setClosable(true);
            responderExe.setMaximizable(true);
            responderExe.setIconifiable(true);
            responderExe.show();
        } else{
            //responderExe.dispose();
            jDesktopPane1.moveToFront(responderExe);
        }
        //independente da tela estar visível ou não, a tela é movida para frente
        //jDesktopPane1.remove(responderExe);}
    }
    
    public static void botaoAbrirTocador() {                                                        
        if (abrirTocador == null) //instancia a tela de cadastro de clientes
        {
            abrirTocador = new TelaTocadorInterno();
            jDesktopPane1.add(abrirTocador);
            ((BasicInternalFrameUI)abrirTocador.getUI()).setNorthPane(null);
            try {
                abrirTocador.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            abrirTocador.setClosable(true);
            abrirTocador.setMaximizable(true);
            abrirTocador.setIconifiable(true);
            abrirTocador.show();
        } else{
            //TelaPrincipal.botaoResponderExercicio();.dispose();
        }
        
    }
    
    private void botaoCadastrarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarExercicioActionPerformed
        if (cadExe == null) //instancia a tela de cadastro de clientes
        {
            cadExe = new TelaCadastroDeTarefaInterno();
            jDesktopPane1.add(cadExe);
            ((BasicInternalFrameUI)cadExe.getUI()).setNorthPane(null);
            try {
                cadExe.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadExe.setClosable(true);
            cadExe.setMaximizable(true);
            cadExe.setIconifiable(true);
            cadExe.show();
        }
        else{
            cadExe.dispose();
        }
        //independente da tela estar visível ou não, a tela é movida para frente
        //jDesktopPane1.remove(cadExe);}
    }//GEN-LAST:event_botaoCadastrarExercicioActionPerformed

    private void botaoCadastrarTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarTutorialActionPerformed
        if (cadTutorial == null) //instancia a tela de cadastro de clientes
        {
            cadTutorial = new TelaCadastroDeTutorialInterno();
            jDesktopPane1.add(cadTutorial);
            ((BasicInternalFrameUI)cadTutorial.getUI()).setNorthPane(null);
            try {
                cadTutorial.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadTutorial.setClosable(true);
            cadTutorial.setMaximizable(true);
            cadTutorial.setIconifiable(true);
            cadTutorial.show();
        }
        else{
            cadTutorial.dispose();
        }
        //independente da tela estar visível ou não, a tela é movida para frente
        //jDesktopPane1.moveToFront(cadTutorial);
    }//GEN-LAST:event_botaoCadastrarTutorialActionPerformed

    private void botaoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAjudaActionPerformed
        JOptionPane.showMessageDialog(this, "Ajuda Indisponível!");
    }//GEN-LAST:event_botaoAjudaActionPerformed

    private void botaoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirActionPerformed
        JFileChooser jfc = new JFileChooser();
        File swingFile = new File("C:\\Users\\Public\\Documents\\");
        if (swingFile.exists()) {
            jfc.setCurrentDirectory(swingFile);
            jfc.setSelectedFile(swingFile);
        }

        //Permite selecionar vários arquivos
        jfc.setMultiSelectionEnabled(true);
        File[] file = jfc.getSelectedFiles();

        //Cria o filtro
        jfc.setFileFilter(new javax.swing.filechooser.FileFilter() {

            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".iged") || f.isDirectory();
            }
            //Mensagem exibida para o usuário
            public String getDescription() {
                return "Arquivos de imagem (.iged)";
            }
        });
        //FileChooser com botão para salvar
        //jfc.showSaveDialog(this);
        //Alterar o título da janela
        jfc.setDialogTitle("Abrir apresentacao");

        jfc.showOpenDialog(null);
        
    }//GEN-LAST:event_botaoAbrirActionPerformed

    TelaPesquisaInterno tp = new TelaPesquisaInterno();
    
    private void botaoPesquisarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarExercicioActionPerformed
        if (pesquisarExe == null) //instancia a tela de cadastro de clientes
        {
            tp.ocultarColuna();
            pesquisarExe = tp;
            tp.listarTodasTarefas();
            jDesktopPane1.add(pesquisarExe);
            ((BasicInternalFrameUI)pesquisarExe.getUI()).setNorthPane(null);
            try {
                pesquisarExe.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            pesquisarExe.setClosable(true);
            pesquisarExe.setMaximizable(true);
            pesquisarExe.setIconifiable(true);
            pesquisarExe.show();
        }
        else{
         pesquisarExe.dispose();
            //jDesktopPane1.moveToFront(pesquisarExe);
        }
    }//GEN-LAST:event_botaoPesquisarExercicioActionPerformed

    private void botaoCadastrarObjetivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarObjetivaActionPerformed
        if (cadExeObj == null) //instancia a tela de cadastro de clientes
        {
            cadExeObj = new TelaCadastroTarefaObjetivaInterno();
            jDesktopPane1.add(cadExeObj);
            ((BasicInternalFrameUI)cadExeObj.getUI()).setNorthPane(null);
            try {
                cadExeObj.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            cadExeObj.setClosable(true);
            cadExeObj.setMaximizable(true);
            cadExeObj.setIconifiable(true);
            cadExeObj.show();
       }
        else{
            cadExeObj.dispose();
        }
    }//GEN-LAST:event_botaoCadastrarObjetivaActionPerformed

    private void botaoExecutarObjetivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExecutarObjetivaActionPerformed
        if (responderExeObj == null) //instancia a tela de cadastro de clientes
        {
            responderExeObj = new TelaTarefaObjetivaInterno();
            jDesktopPane1.add(responderExeObj);
            ((BasicInternalFrameUI)responderExeObj.getUI()).setNorthPane(null);
            try {
                responderExeObj.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            responderExeObj.setClosable(true);
            responderExeObj.setMaximizable(true);
            responderExeObj.setIconifiable(true);
            responderExeObj.show();
        }
        else{
            responderExeObj.dispose();
        }
    }//GEN-LAST:event_botaoExecutarObjetivaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                gd.setFullScreenWindow(TelaPrincipal.getInstance());
            }
        });
    }
    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbrir;
    private javax.swing.JButton botaoAjuda;
    private javax.swing.JButton botaoCadastrarExercicio;
    private javax.swing.JButton botaoCadastrarObjetiva;
    private javax.swing.JButton botaoCadastrarTutorial;
    private javax.swing.JButton botaoExecutarObjetiva;
    private javax.swing.JButton botaoPesquisarExercicio;
    private javax.swing.JButton botaoPesquisarTutorial;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
*/
private javax.swing.JButton botaoAbrir;
    private javax.swing.JButton botaoAjuda;
    private javax.swing.JButton botaoCadastrarExercicio;
    private javax.swing.JButton botaoCadastrarTutorial;
    private javax.swing.JButton botaoPesquisarExercicio;
    private javax.swing.JButton botaoResponderExercicio;
    private javax.swing.JButton botaoPesquisarTutorial;
    private static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton botaoCadastrarObjetiva;
    private javax.swing.JButton botaoExecutarObjetiva;
}
