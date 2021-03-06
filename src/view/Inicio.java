/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import dao.UsuarioDAO;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import model.Usuario;

/**
 *
 * @author Jéssica
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnChat = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbTitulo2 = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        scComunicado = new javax.swing.JScrollPane();
        txComunicado = new javax.swing.JTextArea();
        lbEntrar = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbEquipe = new javax.swing.JLabel();
        tfEquipe = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        btCadastrar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        pnChat.setBackground(new java.awt.Color(255, 255, 255));
        pnChat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 10, true));

        tfNome.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N

        btEntrar.setBackground(new java.awt.Color(0, 51, 51));
        btEntrar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("Conectar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        pnTitulo.setBackground(new java.awt.Color(190, 242, 191));

        lbTitulo.setBackground(new java.awt.Color(0, 51, 51));
        lbTitulo.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        lbTitulo.setText("Secretaria do Estado ");

        lbTitulo2.setBackground(new java.awt.Color(0, 51, 51));
        lbTitulo2.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        lbTitulo2.setText("e Meio Ambiente");

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/logo.png"))); // NOI18N

        txComunicado.setEditable(false);
        txComunicado.setBackground(new java.awt.Color(0, 51, 52));
        txComunicado.setColumns(20);
        txComunicado.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        txComunicado.setForeground(new java.awt.Color(255, 255, 255));
        txComunicado.setLineWrap(true);
        txComunicado.setRows(5);
        txComunicado.setText("\n        A Secretaria do Meio Ambiente, tem a disposição uma ferramenta \n        para comunicação dos funcionarios com a entidade, visando o \n        aperfeiçoamento da captação  de informações do Meio Ambiente.");
        txComunicado.setToolTipText("");
        txComunicado.setAlignmentX(1.0F);
        txComunicado.setAlignmentY(2.0F);
        txComunicado.setAutoscrolls(false);
        txComunicado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 255, 184), 1, true));
        txComunicado.setCaretColor(new java.awt.Color(255, 255, 255));
        scComunicado.setViewportView(txComunicado);

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTituloLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbLogo)
                        .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTituloLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lbTitulo))
                            .addGroup(pnTituloLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lbTitulo2))))
                    .addGroup(pnTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scComunicado, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnTituloLayout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scComunicado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        lbEntrar.setBackground(new java.awt.Color(0, 51, 51));
        lbEntrar.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lbEntrar.setText("Entrar");

        lbNome.setBackground(new java.awt.Color(0, 51, 51));
        lbNome.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbNome.setText("Nome:");

        lbEquipe.setBackground(new java.awt.Color(0, 51, 51));
        lbEquipe.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbEquipe.setText("Equipe:");

        tfEquipe.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N

        lbSenha.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbSenha.setText("Senha:");

        pfSenha.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        pfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaActionPerformed(evt);
            }
        });

        btCadastrar.setBackground(new java.awt.Color(0, 51, 51));
        btCadastrar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(255, 204, 204));
        btSair.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnChatLayout = new javax.swing.GroupLayout(pnChat);
        pnChat.setLayout(pnChatLayout);
        pnChatLayout.setHorizontalGroup(
            pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChatLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNome)
                    .addComponent(tfNome)
                    .addComponent(lbSenha)
                    .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEquipe)
                    .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btSair)
                        .addGroup(pnChatLayout.createSequentialGroup()
                            .addComponent(btEntrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btCadastrar))))
                .addGap(21, 21, 21))
            .addGroup(pnChatLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(lbEntrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnChatLayout.setVerticalGroup(
            pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChatLayout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnChatLayout.createSequentialGroup()
                        .addComponent(lbEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEquipe))
                    .addGroup(pnChatLayout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnChatLayout.createSequentialGroup()
                        .addComponent(btSair)
                        .addContainerGap())
                    .addGroup(pnChatLayout.createSequentialGroup()
                        .addComponent(lbSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEntrar)
                            .addComponent(btCadastrar))
                        .addGap(51, 51, 51))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
        inicializar();
    }//GEN-LAST:event_btEntrarActionPerformed

    private void pfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfSenhaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        TelaCadastro tc = new TelaCadastro();
        tc.setVisible(true);
        
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void inicializar(){        
        Usuario usuario = UsuarioDAO.getInstance().findUser(tfNome.getText(), String.copyValueOf(pfSenha.getPassword()), Integer.valueOf(tfEquipe.getText()));
        if(verificaUsuario(usuario)){
            Chat chat = new Chat();
            chat.setVisible(true);
            chat.setNome(usuario.getNome());
            ClienteController controller = new ClienteController();
            controller.iniciarConexao(chat);
        } else {
            showMessageDialog(null, "Usuário não cadastrado", "", ERROR_MESSAGE);
        }
    }
    
    private boolean verificaUsuario(Usuario usuario){
        return usuario != null;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel lbEntrar;
    private javax.swing.JLabel lbEquipe;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnChat;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JScrollPane scComunicado;
    private javax.swing.JTextField tfEquipe;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextArea txComunicado;
    // End of variables declaration//GEN-END:variables
}
