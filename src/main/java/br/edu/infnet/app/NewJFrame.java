/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.app;

/**
 *
 * @author welli
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    double num, ans;
    int calculation;
    
    public NewJFrame() {
        initComponents();        
        jRadioButtonOn.setEnabled(false);
            
    }
    
    public void arithmetic_operation(){
        switch(calculation){
            
            case 1: //Addition
                ans = num + Double.parseDouble(jTextFieldVisor.getText());
                jTextFieldVisor.setText(Double.toString(ans));
                break;
            case 2: //Subtraction
                ans = num - Double.parseDouble(jTextFieldVisor.getText());
                jTextFieldVisor.setText(Double.toString(ans));
                break;
            case 3: //Multiplication
                ans = num * Double.parseDouble(jTextFieldVisor.getText());
                jTextFieldVisor.setText(Double.toString(ans));
                break;
            case 4: //Division
                ans = num / Double.parseDouble(jTextFieldVisor.getText());
                jTextFieldVisor.setText(Double.toString(ans));
                break;
        }
    }
    
    public void enable(){
        jTextFieldVisor.setEnabled(true);
        
        jRadioButtonOn.setEnabled(false);  //botão ON desabilitado
        jRadioButtonOff.setEnabled(true);  // botão off habilitado
        
        jButton0.setEnabled(true);
        jButton01.setEnabled(true);
        jButton02.setEnabled(true);
        jButton03.setEnabled(true);
        jButton04.setEnabled(true);
        jButton05.setEnabled(true);
        jButton06.setEnabled(true);
        jButton9.setEnabled(true); //corresponde ao button07
        jButton08.setEnabled(true);
        jButton09.setEnabled(true);
        jButtonApagar.setEnabled(true);
        jButtonDividir.setEnabled(true);
        jButtonIgual.setEnabled(true);
        jButtonMultiplicar.setEnabled(true);
        jButtonMais.setEnabled(true);
        jButtonMenos.setEnabled(true);
        jButtonPonto.setEnabled(true);
        jButtonC.setEnabled(true);
        
    }
    
    public void disable() {
        jTextFieldVisor.setEnabled(false);
        
        jRadioButtonOn.setEnabled(true);
        jRadioButtonOff.setEnabled(false);

        jButton0.setEnabled(false);
        jButton01.setEnabled(false);
        jButton02.setEnabled(false);
        jButton03.setEnabled(false);
        jButton04.setEnabled(false);
        jButton05.setEnabled(false);
        jButton06.setEnabled(false);
        jButton9.setEnabled(false); //corresponde ao button07
        jButton08.setEnabled(false);
        jButton09.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jButtonDividir.setEnabled(false);
        jButtonIgual.setEnabled(false);
        jButtonMultiplicar.setEnabled(false);
        jButtonMais.setEnabled(false);
        jButtonMenos.setEnabled(false);
        jButtonPonto.setEnabled(false);
        jButtonC.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton22 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton07 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jTextFieldVisor = new javax.swing.JTextField();
        jRadioButtonOn = new javax.swing.JRadioButton();
        jRadioButtonOff = new javax.swing.JRadioButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonMais = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton08 = new javax.swing.JButton();
        jButton09 = new javax.swing.JButton();
        jButton05 = new javax.swing.JButton();
        jButton06 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton03 = new javax.swing.JButton();
        jButton04 = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jLabelVisorOperacao = new javax.swing.JLabel();

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton22.setText("0");

        jButton07.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton07.setText("7");
        jButton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton07ActionPerformed(evt);
            }
        });

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldVisor.setEditable(false);
        jTextFieldVisor.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        buttonGroup1.add(jRadioButtonOn);
        jRadioButtonOn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonOn.setText("ON");
        jRadioButtonOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOnActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonOff);
        jRadioButtonOff.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonOff.setText("OFF");
        jRadioButtonOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOffActionPerformed(evt);
            }
        });

        jButtonApagar.setText("<<");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonMais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonMais.setText("+");
        jButtonMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton08.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton08.setText("8");
        jButton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton08ActionPerformed(evt);
            }
        });

        jButton09.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton09.setText("9");
        jButton09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton09ActionPerformed(evt);
            }
        });

        jButton05.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton05.setText("5");
        jButton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton05ActionPerformed(evt);
            }
        });

        jButton06.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton06.setText("6");
        jButton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton06ActionPerformed(evt);
            }
        });

        jButton01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton01.setText("1");
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });

        jButton02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton02.setText("2");
        jButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton02ActionPerformed(evt);
            }
        });

        jButton03.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton03.setText("3");
        jButton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton03ActionPerformed(evt);
            }
        });

        jButton04.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton04.setText("4");
        jButton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton04ActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonMenos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonMenos.setText("-");
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButtonDividir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonDividir.setText("/");
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonPonto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPonto.setText(".");
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });

        jLabelVisorOperacao.setForeground(new java.awt.Color(255, 51, 51));
        jLabelVisorOperacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton04, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton05, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRadioButtonOn)
                                                .addComponent(jRadioButtonOff))
                                            .addGap(15, 15, 15)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonC)
                                        .addComponent(jButton08, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton06, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton09, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonApagar))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                                .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelVisorOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVisorOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonOn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton08, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton09, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton04, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton05, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton06, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton03, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "7");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jRadioButtonOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOffActionPerformed
        disable();
    }//GEN-LAST:event_jRadioButtonOffActionPerformed

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "1");
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton02ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "2");
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton03ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "3");
    }//GEN-LAST:event_jButton03ActionPerformed

    private void jButton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton04ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "4");
    }//GEN-LAST:event_jButton04ActionPerformed

    private void jButton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton05ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "5");
    }//GEN-LAST:event_jButton05ActionPerformed

    private void jButton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton06ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "6");
    }//GEN-LAST:event_jButton06ActionPerformed

    private void jButton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton07ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "7");
    }//GEN-LAST:event_jButton07ActionPerformed

    private void jButton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton08ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "8");
    }//GEN-LAST:event_jButton08ActionPerformed

    private void jButton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton09ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "9");
    }//GEN-LAST:event_jButton09ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        jTextFieldVisor.setText(jTextFieldVisor.getText() + ".");
    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        //jTextFieldVisor.setText(jTextFieldVisor.getText() + "=");
        
        arithmetic_operation();
        jLabelVisorOperacao.setText("");
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        //jTextFieldVisor.setText(jTextFieldVisor.getText() + "/");
        
        num = Double.parseDouble(jTextFieldVisor.getText());
        calculation = 4; // case
        jTextFieldVisor.setText(" ");
        jLabelVisorOperacao.setText(num + "/");
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        //jTextFieldVisor.setText(jTextFieldVisor.getText() + "*");
        
        num = Double.parseDouble(jTextFieldVisor.getText());
        calculation = 3;  //case
        jTextFieldVisor.setText(" ");
        jLabelVisorOperacao.setText(num + "*");
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosActionPerformed
        //jTextFieldVisor.setText(jTextFieldVisor.getText() + "-");
        
        num = Double.parseDouble(jTextFieldVisor.getText());
        calculation = 2;  //case
        jTextFieldVisor.setText(" ");
        jLabelVisorOperacao.setText(num + "-");
    }//GEN-LAST:event_jButtonMenosActionPerformed

    private void jButtonMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisActionPerformed
        //jTextFieldVisor.setText(jTextFieldVisor.getText() + "+");
        
        num = Double.parseDouble(jTextFieldVisor.getText());
        calculation = 1; //case
        jTextFieldVisor.setText(" ");
        jLabelVisorOperacao.setText(num + "+");
    }//GEN-LAST:event_jButtonMaisActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jTextFieldVisor.setText("");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jRadioButtonOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOnActionPerformed
        enable();
    }//GEN-LAST:event_jRadioButtonOnActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        
        int lenght = jTextFieldVisor.getText().length();
        int number = jTextFieldVisor.getText().length() - 1;
        String store;
        
        if (lenght > 0){
            StringBuilder back = new StringBuilder(jTextFieldVisor.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextFieldVisor.setText(store);
            
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton03;
    private javax.swing.JButton jButton04;
    private javax.swing.JButton jButton05;
    private javax.swing.JButton jButton06;
    private javax.swing.JButton jButton07;
    private javax.swing.JButton jButton08;
    private javax.swing.JButton jButton09;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMais;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JLabel jLabelVisorOperacao;
    private javax.swing.JRadioButton jRadioButtonOff;
    private javax.swing.JRadioButton jRadioButtonOn;
    private javax.swing.JTextField jTextFieldVisor;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
