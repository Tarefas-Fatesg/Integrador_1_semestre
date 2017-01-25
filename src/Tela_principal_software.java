/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador;

import java.awt.Color;
import java.awt.List;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
//import sun.org.mozilla.javascript.Token;

/**
 *
 * @author aluno
 */
public class Tela_principal_software extends javax.swing.JFrame {
    //////////////////////
    //  Variaveis       //
    /////////////////////

    int i = 0; /* Auxiliar Tipo Contador */

    int df = 0; /* Auxiliar Tipo Contador */

    int df2 = 0; /* Auxiliar Tipo Contador */

    int countTime = 0; /* Auxiliar Tipo Contador */

    String Time[] = new String[10]; /* Salva o nome dos Times*/

    String TimeNomeA, TimeNomeB, NomeDigitado, TimeDigitado, NTemporario, T; /* Auxiliares para comparação*/

    int TimeA, TimeB, GolsTimeA, GolsTimeB, TNA, TNB; /* Auxiliares para comparação */

    int TGolsP[] = new int[10]; /* Salva Total de Gols Pro */

    int TGolsC[] = new int[10]; /* Salva Total de Gols Contra */

    int TPontos[] = new int[10]; /* Salva Total de Pontos */

    int TJogos[] = new int[10]; /* Salva Total de jogos participados */

    int TEmpates[] = new int[10]; /* Salva Total de empates */

    int TVitorias[] = new int[10]; /* Salva Total de vitorias */

    int TDerrotas[] = new int[10]; /* Salva Total de derrotas */

    int SaldoG[] = new int[10]; /* Auxiliar tipo clone da TGolsP */

    int CPontos[] = new int[10]; /* Auxiliar tipo clone da TGolsP da TPontos */

    int CVitorias[] = new int[10]; /* Auxiliar tipo clone da TVitorias */

    int PrimeirosLugares[] = new int[10]; /* Salva os primeiros colocados*/

    String Modelo = ""; /* Salva todos os times com quebra de linha */


    /**
     * Insere valores Zerados para a tabela
     */
    public void zeratudo() {
        for (int o = 0; o < 10; o++) {
            Time[o] = null;

        }
        for (int o = 0; o < 10; o++) {
            TGolsP[o] = 0;
            TGolsC[o] = 0;
            TPontos[o] = 0;
            TJogos[o] = 0;
            TEmpates[o] = 0;
            TVitorias[o] = 0;
            TDerrotas[o] = 0;
        }
    }

    /* Cria tabela de exebição de desempenho dos times */
    DefaultTableModel TabelaExibeTimes;

    public Tela_principal_software() {
        initComponents();
        TabelaExibeTimes = (DefaultTableModel) TabelaTimes.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel_Geral = new javax.swing.JTabbedPane();
        Painel_adicionar_time = new javax.swing.JPanel();
        Textfield_adicionar_time = new javax.swing.JTextField();
        Botao_adicionar_time = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ExibeTimes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Painel_adicionar_resultados = new javax.swing.JPanel();
        TextField_Placar_TimeA = new javax.swing.JTextField();
        TextField_Placar_TimeB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExibeTimes_2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Botao_salvar_resultado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextArea_ultimos_resultados_salvos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        CombBox_Times_A = new javax.swing.JComboBox();
        CombBox_Times_B = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        Painel_tabela_de_jogos = new javax.swing.JPanel();
        Botao_gerar_tabela = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaTimes = new javax.swing.JTable();
        Painel_quatro_primeiros_colocados = new javax.swing.JPanel();
        Label1Lugar = new javax.swing.JLabel();
        Botao_mostra_4_primeiros = new javax.swing.JButton();
        Label2Lugar = new javax.swing.JLabel();
        Label3Lugar = new javax.swing.JLabel();
        Label4Lugar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão de Campeonato | GRUPO 2");
        setResizable(false);

        Painel_Geral.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        Painel_Geral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Painel_adicionar_time.setBackground(java.awt.Color.white);

        Botao_adicionar_time.setFont(new java.awt.Font("Waree", 0, 14)); // NOI18N
        Botao_adicionar_time.setText("Adicionar Time");
        Botao_adicionar_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_adicionar_timeActionPerformed(evt);
            }
        });
        Botao_adicionar_time.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Botao_adicionar_timeKeyTyped(evt);
            }
        });

        ExibeTimes.setEditable(false);
        ExibeTimes.setColumns(20);
        ExibeTimes.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        ExibeTimes.setLineWrap(true);
        ExibeTimes.setRows(5);
        ExibeTimes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(ExibeTimes);

        jLabel1.setText("Times Adicionados");

        javax.swing.GroupLayout Painel_adicionar_timeLayout = new javax.swing.GroupLayout(Painel_adicionar_time);
        Painel_adicionar_time.setLayout(Painel_adicionar_timeLayout);
        Painel_adicionar_timeLayout.setHorizontalGroup(
            Painel_adicionar_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_adicionar_timeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Painel_adicionar_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Textfield_adicionar_time)
                    .addComponent(Botao_adicionar_time, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(Painel_adicionar_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        Painel_adicionar_timeLayout.setVerticalGroup(
            Painel_adicionar_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_adicionar_timeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(Painel_adicionar_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_adicionar_timeLayout.createSequentialGroup()
                        .addComponent(Textfield_adicionar_time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Botao_adicionar_time))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Painel_Geral.addTab("Adicionar Time", Painel_adicionar_time);

        Painel_adicionar_resultados.setBackground(java.awt.Color.white);

        TextField_Placar_TimeA.setBackground(java.awt.Color.white);
        TextField_Placar_TimeA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time \"A\"", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Waree", 0, 8), new java.awt.Color(1, 1, 1))); // NOI18N
        TextField_Placar_TimeA.setCaretColor(java.awt.Color.white);
        TextField_Placar_TimeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Placar_TimeAActionPerformed(evt);
            }
        });

        TextField_Placar_TimeB.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time \"B\"", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Waree", 0, 8))); // NOI18N

        jLabel2.setText("Placar");

        jLabel3.setText("VS");

        ExibeTimes_2.setEditable(false);
        ExibeTimes_2.setColumns(20);
        ExibeTimes_2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        ExibeTimes_2.setLineWrap(true);
        ExibeTimes_2.setRows(5);
        ExibeTimes_2.setPreferredSize(new java.awt.Dimension(262, 97));
        jScrollPane2.setViewportView(ExibeTimes_2);

        jLabel6.setText("Time \"A\"  ");

        Botao_salvar_resultado.setText("Salvar");
        Botao_salvar_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_salvar_resultadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Times Cadastrados");

        TextArea_ultimos_resultados_salvos.setEditable(false);
        TextArea_ultimos_resultados_salvos.setColumns(20);
        TextArea_ultimos_resultados_salvos.setLineWrap(true);
        TextArea_ultimos_resultados_salvos.setRows(5);
        jScrollPane5.setViewportView(TextArea_ultimos_resultados_salvos);

        jLabel5.setText("Ultimo Resultado Salvo");

        CombBox_Times_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombBox_Times_AActionPerformed(evt);
            }
        });

        CombBox_Times_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombBox_Times_BActionPerformed(evt);
            }
        });

        jLabel15.setText(" Time \"B\"");

        javax.swing.GroupLayout Painel_adicionar_resultadosLayout = new javax.swing.GroupLayout(Painel_adicionar_resultados);
        Painel_adicionar_resultados.setLayout(Painel_adicionar_resultadosLayout);
        Painel_adicionar_resultadosLayout.setHorizontalGroup(
            Painel_adicionar_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_adicionar_resultadosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Painel_adicionar_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_adicionar_resultadosLayout.createSequentialGroup()
                        .addGroup(Painel_adicionar_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addGroup(Painel_adicionar_resultadosLayout.createSequentialGroup()
                                .addComponent(TextField_Placar_TimeA, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_Placar_TimeB))
                            .addComponent(CombBox_Times_A, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CombBox_Times_B, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Botao_salvar_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(359, 541, Short.MAX_VALUE))
                    .addGroup(Painel_adicionar_resultadosLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(Painel_adicionar_resultadosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(189, 189, 189))))
        );
        Painel_adicionar_resultadosLayout.setVerticalGroup(
            Painel_adicionar_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_adicionar_resultadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Painel_adicionar_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Painel_adicionar_resultadosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(Painel_adicionar_resultadosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CombBox_Times_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(Painel_adicionar_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CombBox_Times_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Painel_adicionar_resultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_Placar_TimeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Placar_TimeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Botao_salvar_resultado)
                        .addGap(37, 37, 37)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 66, Short.MAX_VALUE))
        );

        Painel_Geral.addTab("Adicionar Resultados de jogos", Painel_adicionar_resultados);

        Painel_tabela_de_jogos.setBackground(new java.awt.Color(84, 191, 79));
        Painel_tabela_de_jogos.setLayout(null);

        Botao_gerar_tabela.setText("Gerar Tabela de resultados");
        Botao_gerar_tabela.setAlignmentY(0.0F);
        Botao_gerar_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_gerar_tabelaActionPerformed(evt);
            }
        });
        Painel_tabela_de_jogos.add(Botao_gerar_tabela);
        Botao_gerar_tabela.setBounds(-10, 327, 790, 60);

        TabelaTimes.setAutoCreateRowSorter(true);
        TabelaTimes.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        TabelaTimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Gols Pro", "Gols Contra", "Partidas", "Derrotas", "Empates", "Vitórias", "Pontos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTimes.setRowHeight(20);
        jScrollPane4.setViewportView(TabelaTimes);

        Painel_tabela_de_jogos.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 770, 330);

        Painel_Geral.addTab("Tabela de Jogos", Painel_tabela_de_jogos);

        Painel_quatro_primeiros_colocados.setBackground(java.awt.Color.white);

        Label1Lugar.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        Label1Lugar.setText(" ");

        Botao_mostra_4_primeiros.setText("Mostrar Os Quatro Primeiros Colocados");
        Botao_mostra_4_primeiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_mostra_4_primeirosActionPerformed(evt);
            }
        });

        Label2Lugar.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        Label2Lugar.setText(" ");

        Label3Lugar.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        Label3Lugar.setText(" ");

        Label4Lugar.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        Label4Lugar.setText(" ");

        javax.swing.GroupLayout Painel_quatro_primeiros_colocadosLayout = new javax.swing.GroupLayout(Painel_quatro_primeiros_colocados);
        Painel_quatro_primeiros_colocados.setLayout(Painel_quatro_primeiros_colocadosLayout);
        Painel_quatro_primeiros_colocadosLayout.setHorizontalGroup(
            Painel_quatro_primeiros_colocadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_quatro_primeiros_colocadosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(Painel_quatro_primeiros_colocadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1Lugar)
                    .addComponent(Label2Lugar)
                    .addComponent(Label3Lugar)
                    .addComponent(Label4Lugar))
                .addContainerGap(726, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_quatro_primeiros_colocadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Botao_mostra_4_primeiros)
                .addContainerGap())
        );
        Painel_quatro_primeiros_colocadosLayout.setVerticalGroup(
            Painel_quatro_primeiros_colocadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_quatro_primeiros_colocadosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Label1Lugar)
                .addGap(19, 19, 19)
                .addComponent(Label2Lugar)
                .addGap(18, 18, 18)
                .addComponent(Label3Lugar)
                .addGap(22, 22, 22)
                .addComponent(Label4Lugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(Botao_mostra_4_primeiros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Painel_Geral.addTab("Quatro Primeros Colocados", Painel_quatro_primeiros_colocados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Geral)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel_Geral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_adicionar_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_adicionar_timeActionPerformed

        try {
            NTemporario = this.Textfield_adicionar_time.getText();
            // Verifica se já existe nome na lista de adicionados
            for (int j = 0; j < 10; j++) {
                if (NTemporario.equalsIgnoreCase(Time[j])) {
                    JOptionPane.showMessageDialog(this, "O nome já está cadastrado", "Tem algo Errado... ",
                            JOptionPane.ERROR_MESSAGE);
                    NTemporario = null;
                    T = "Exibido";
                }
            }
            if (NTemporario.trim().equals("")) {
                JOptionPane.showMessageDialog(
                        this, "O nome adicionado e vázio",
                        "Tem algo Errado... ",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                //Adicionar o nome do time Digitado ao vetor Time   
                Time[countTime] = this.Textfield_adicionar_time.getText();

                // Insere os nomes dos times adicionados a uma combo box
                CombBox_Times_A.addItem(Time[countTime]);
                CombBox_Times_B.addItem(Time[countTime]);

                for (int c = 0; c < 1; c++) {
                    // Responsavel por armazenar os nomes dos times junto com uma 
                    // quebra de linha a cada novo time
                    Modelo += String.valueOf(Time[df2]) + "\n";
                    df2++;
                }
                // Exibe no GUI o conteudo da variavel Modelo
                this.ExibeTimes.setText(Modelo);
                this.ExibeTimes_2.setText(Modelo);
                countTime++;
            }
            // Exibe mensagem de erro ao tentar adicionar mais de 10 times
        } catch (Exception e) {
        }


    }//GEN-LAST:event_Botao_adicionar_timeActionPerformed

    private void Botao_salvar_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_salvar_resultadoActionPerformed
        // Pega times selecionados e a quantidade de gols atribuidos a cada Time
        try {
            TimeNomeA = String.valueOf(CombBox_Times_A.getSelectedItem());;
            TimeNomeB = String.valueOf(CombBox_Times_B.getSelectedItem());;
            GolsTimeA = Integer.parseInt(TextField_Placar_TimeA.getText());
            GolsTimeB = Integer.parseInt(TextField_Placar_TimeB.getText());

            // Exibe mensagem de erro caso dois o mesmo time seja selecionado  nos dois
            // Combo Box
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chegou no Limite ",
                    "Nada foi selecionado ou não foi atribuido gols para nehum time",
                    JOptionPane.ERROR_MESSAGE);
        }
        //
        for (int verifica = 0; verifica < 9; verifica++) {
            if (TimeNomeA.equalsIgnoreCase(Time[verifica])) {
                TimeA = verifica;
                TNA = 1;
            }

        }
        for (int verifica = 0; verifica < 9; verifica++) {
            if (TimeNomeB.equalsIgnoreCase(Time[verifica])) {
                TimeB = verifica;
                TNB = 1;
            }

        }

        // Verifica se nomes de times são equivalentes aos amarzenados 
        // no vetor Time e adiciona o resultado ao vetor Tabela
        if ((TimeNomeB.equalsIgnoreCase(TimeNomeA)) || (GolsTimeA < 0) || (GolsTimeB < 0)) {
            JOptionPane.showMessageDialog(this, "Um time não pode jogar contra ele mesmo"
                    + " \n A) você deve ter cadastrado dois times com o mesmo nome"
                    + " \n B) Ou você colocou um valor negativo no placar"
                    + " \n C) feche e abra o software novamente e cadastre corretamente."
                    + " ",
                    "ERRO ",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            if (TNA == 1 && TNB == 1) {
                // Seta Valor De verificação de igualdade de nomes igual a 0
                TNA = 0;
                this.TextArea_ultimos_resultados_salvos.setText(
                        TimeNomeA + " " + GolsTimeA + " VS " + TimeNomeB + " " + GolsTimeB
                );
                // PARA TIME A
                // Conta Quantidade De Jogos
                TJogos[TimeA]++;
                // Gols Sofridos Pelo Time A
                TGolsC[TimeA] += GolsTimeB;
                // Gols Pró
                TGolsP[TimeA] += GolsTimeA;

                // PARA TIME B
                // Conta Quantidade De Jogos
                TJogos[TimeB]++;
                // Gols Sofridos Pelo Time A
                TGolsC[TimeB] += GolsTimeA;
                // Gols Pró
                TGolsP[TimeB] += GolsTimeB;

                // Comparação de Vitorias, Derretoa Empate entre os dois times
                if (GolsTimeA > GolsTimeB) {
                    // Conta pontos 
                    TPontos[TimeA] += 3;
                    // Conta Vitorias
                    TVitorias[TimeA]++;
                    // Conta Derrotas Do Time Adversario
                    TDerrotas[TimeB]++;
                }
                if (GolsTimeB > GolsTimeA) {
                    // Conta pontos de vitorias
                    TPontos[TimeB] += 3;
                    // Conta Vitorias
                    TVitorias[TimeB]++;
                    // Conta Derrotas Do Time Adversario
                    TDerrotas[TimeA]++;
                }
                if (GolsTimeA == GolsTimeB) {
                    // Conta Quantidade de empates
                    TEmpates[TimeA] += 1;
                    TEmpates[TimeB] += 1;
                    // Conta pontos caso seja empate
                    TPontos[TimeB] += 1;
                    TPontos[TimeA] += 1;
                }

            }
        }

//                

    }//GEN-LAST:event_Botao_salvar_resultadoActionPerformed

    private void Botao_mostra_4_primeirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_mostra_4_primeirosActionPerformed
        // TODO add your handling code here:
        int w, x, y,q;
        for (x = 0; x < 10; x++) {
            SaldoG[x] = TGolsP[x] - TGolsC[x];
            CPontos[x] = TPontos[x];
            CVitorias[x] = TVitorias[x];
        }
        int auxnull=0;
        for (q = 0; q < 10; q++) {
            if(Time[q]==null){
                auxnull++;
            }
        }
        
        for (x = 0; x < (10-auxnull); x++) {
            SaldoG[x] = TGolsP[x]-TGolsC[x];//Aqui eu mudei o nome do vetor de CGolsP[] para SaldoG[].
            CPontos[x] = TPontos[x];
            CVitorias[x] = TVitorias[x];
        }
        for (w = 0; w < 4; w++) {
            PrimeirosLugares[w] = 0;
            y = 0;
            for (x = 1; x < (10-auxnull); x++) {
                if (CPontos[x] > CPontos[y]) {//Determina maior pontuação
                    y = x;
                    PrimeirosLugares[w] = y;
                } else if (CPontos[x] == CPontos[y]) {//Determina caso de empate na pontuação
                    //Para caso de empate na pontuação 
                    if (SaldoG[x] > SaldoG[y]) {//Compara o 1º fator de desempate
                        y = x;
                        PrimeirosLugares[w] = y;
                    } else if (SaldoG[x] == SaldoG[y]) {//Determina se 1º fator de desempate e igual
                        //Para caso de empate no 1º fator de desempate
                        if (CVitorias[x] > CVitorias[y]) {//Compara o 2º fator de desempate
                            y = x;
                            PrimeirosLugares[w] = y;
                        }
                    }
                }
            }
            CPontos[y] = -1;/*ZERA o maior valor da matriz B atual para assim 
             achar o 2º maior 3º maior e 4ºmaior.*/

        }

        // Permite a exebição somente se 4 times já tiverem cadastrados
        if (Time[3] == null) {
            JOptionPane.showMessageDialog(this,
                    "Você precisa cadastrar no minimo Quatro times"
                    + "\n para poder gerar essa tabela", "Tem algo Errado... ",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            this.Label1Lugar.setText("1º Lugar: " + Time[PrimeirosLugares[0]] + " com " + TGolsP[PrimeirosLugares[0]] + " Gols e " + TPontos[PrimeirosLugares[0]] + " pontos");
            this.Label2Lugar.setText("2º Lugar: " + Time[PrimeirosLugares[1]] + " com " + TGolsP[PrimeirosLugares[1]] + " Gols e " + TPontos[PrimeirosLugares[1]] + " pontos");
            this.Label3Lugar.setText("3º Lugar: " + Time[PrimeirosLugares[2]] + " com " + TGolsP[PrimeirosLugares[2]] + " Gols e " + TPontos[PrimeirosLugares[2]] + " pontos");
            this.Label4Lugar.setText("4º Lugar: " + Time[PrimeirosLugares[3]] + " com " + TGolsP[PrimeirosLugares[3]] + " Gols e " + TPontos[PrimeirosLugares[3]] + " pontos");
        }
    }//GEN-LAST:event_Botao_mostra_4_primeirosActionPerformed

    private void Botao_adicionar_timeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao_adicionar_timeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_adicionar_timeKeyTyped

    private void CombBox_Times_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombBox_Times_AActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_CombBox_Times_AActionPerformed

    private void Botao_gerar_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_gerar_tabelaActionPerformed

        if (TabelaTimes.getRowCount() > 0) {
            TabelaExibeTimes.setRowCount(0);
        }
        for (int bmx = 0; bmx < 10; bmx++) {
            TabelaExibeTimes.insertRow(TabelaExibeTimes.getRowCount(), new Object[]{
                Time[bmx],
                TGolsP[bmx],
                TGolsC[bmx],
                TJogos[bmx],
                TDerrotas[bmx],
                TEmpates[bmx],
                TVitorias[bmx],
                TPontos[bmx]});
        }
        TabelaTimes.setAutoCreateRowSorter(true);

        df = 0;

    }//GEN-LAST:event_Botao_gerar_tabelaActionPerformed

    private void TextField_Placar_TimeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Placar_TimeAActionPerformed
    }//GEN-LAST:event_TextField_Placar_TimeAActionPerformed

    private void CombBox_Times_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombBox_Times_BActionPerformed
    }//GEN-LAST:event_CombBox_Times_BActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("gtk".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
//                  if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) {   
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                  } 
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Tela_principal_software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Tela_principal_software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Tela_principal_software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Tela_principal_software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_principal_software().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_adicionar_time;
    private javax.swing.JButton Botao_gerar_tabela;
    private javax.swing.JButton Botao_mostra_4_primeiros;
    private javax.swing.JButton Botao_salvar_resultado;
    private javax.swing.JComboBox CombBox_Times_A;
    private javax.swing.JComboBox CombBox_Times_B;
    private javax.swing.JTextArea ExibeTimes;
    private javax.swing.JTextArea ExibeTimes_2;
    private javax.swing.JLabel Label1Lugar;
    private javax.swing.JLabel Label2Lugar;
    private javax.swing.JLabel Label3Lugar;
    private javax.swing.JLabel Label4Lugar;
    private javax.swing.JTabbedPane Painel_Geral;
    private javax.swing.JPanel Painel_adicionar_resultados;
    private javax.swing.JPanel Painel_adicionar_time;
    private javax.swing.JPanel Painel_quatro_primeiros_colocados;
    private javax.swing.JPanel Painel_tabela_de_jogos;
    private javax.swing.JTable TabelaTimes;
    private javax.swing.JTextArea TextArea_ultimos_resultados_salvos;
    private javax.swing.JTextField TextField_Placar_TimeA;
    private javax.swing.JTextField TextField_Placar_TimeB;
    private javax.swing.JTextField Textfield_adicionar_time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
