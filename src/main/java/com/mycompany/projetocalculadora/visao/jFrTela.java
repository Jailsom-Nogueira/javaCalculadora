/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetocalculadora.visao;

import com.mycompany.projetocalculadora.controle.CalculadoraController;
import com.mycompany.projetocalculadora.enums.EnumOperacao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author jails
 */
public class jFrTela extends javax.swing.JFrame {

    private CalculadoraController calculadoraController;
    
    private EnumOperacao ultimaOperacao;
    
    /**
     * Creates new form jFrTela
     */
    public jFrTela() {
        initComponents();
        calculadoraController = new CalculadoraController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btAC = new javax.swing.JButton();
        btMaisBarraMenos = new javax.swing.JButton();
        btPorcentagem = new javax.swing.JButton();
        btDivisao = new javax.swing.JButton();
        btSete = new javax.swing.JButton();
        btOito = new javax.swing.JButton();
        btNove = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        btQuatro = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btSubtracao = new javax.swing.JButton();
        btUm = new javax.swing.JButton();
        btDois = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btAdicao = new javax.swing.JButton();
        btZero = new javax.swing.JButton();
        btVirgula = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        tfValor.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValor.setText("0,00");
        tfValor.setToolTipText("VISOR");
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btAC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btAC.setText("AC");
        btAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACActionPerformed(evt);
            }
        });
        jPanel1.add(btAC);

        btMaisBarraMenos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btMaisBarraMenos.setText("<=");
        btMaisBarraMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisBarraMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btMaisBarraMenos);

        btPorcentagem.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btPorcentagem.setText("%");
        btPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPorcentagemActionPerformed(evt);
            }
        });
        jPanel1.add(btPorcentagem);

        btDivisao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btDivisao.setText("/");
        btDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(btDivisao);

        btSete.setText("7");
        btSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeteActionPerformed(evt);
            }
        });
        jPanel1.add(btSete);

        btOito.setText("8");
        btOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOitoActionPerformed(evt);
            }
        });
        jPanel1.add(btOito);

        btNove.setText("9");
        btNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoveActionPerformed(evt);
            }
        });
        jPanel1.add(btNove);

        btMultiplicacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btMultiplicacao.setText("*");
        btMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btMultiplicacao);

        btQuatro.setText("4");
        btQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuatroActionPerformed(evt);
            }
        });
        jPanel1.add(btQuatro);

        btCinco.setText("5");
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });
        jPanel1.add(btCinco);

        btSeis.setText("6");
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });
        jPanel1.add(btSeis);

        btSubtracao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btSubtracao.setText("-");
        btSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtracaoActionPerformed(evt);
            }
        });
        jPanel1.add(btSubtracao);

        btUm.setText("1");
        btUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUmActionPerformed(evt);
            }
        });
        jPanel1.add(btUm);

        btDois.setText("2");
        btDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoisActionPerformed(evt);
            }
        });
        jPanel1.add(btDois);

        btTres.setText("3");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });
        jPanel1.add(btTres);

        btAdicao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btAdicao.setText("+");
        btAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicaoActionPerformed(evt);
            }
        });
        jPanel1.add(btAdicao);

        btZero.setText("0");
        btZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZeroActionPerformed(evt);
            }
        });
        jPanel1.add(btZero);

        btVirgula.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btVirgula.setText(",");
        btVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVirgulaActionPerformed(evt);
            }
        });
        jPanel1.add(btVirgula);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar);

        btIgual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });
        jPanel1.add(btIgual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(tfValor))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void btACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACActionPerformed
        limpa();
        calculadoraController.zerar();
    }//GEN-LAST:event_btACActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btFecharActionPerformed
        
    private void btUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUmActionPerformed
        digita("1");
    }//GEN-LAST:event_btUmActionPerformed

    private void btDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoisActionPerformed
        digita("2");
    }//GEN-LAST:event_btDoisActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTresActionPerformed
        digita("3");
    }//GEN-LAST:event_btTresActionPerformed

    private void btQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuatroActionPerformed
        digita("4");
    }//GEN-LAST:event_btQuatroActionPerformed

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCincoActionPerformed
        digita("5");
    }//GEN-LAST:event_btCincoActionPerformed

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeisActionPerformed
        digita("6");
    }//GEN-LAST:event_btSeisActionPerformed

    private void btSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeteActionPerformed
        digita("7");
    }//GEN-LAST:event_btSeteActionPerformed

    private void btOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOitoActionPerformed
        digita("8");
    }//GEN-LAST:event_btOitoActionPerformed

    private void btNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNoveActionPerformed
        digita("9");
    }//GEN-LAST:event_btNoveActionPerformed

    private void btZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZeroActionPerformed
        digita("0");
    }//GEN-LAST:event_btZeroActionPerformed

    private void btVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVirgulaActionPerformed
        digita(",");
    }//GEN-LAST:event_btVirgulaActionPerformed

    private void btAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicaoActionPerformed
        Boolean zerada = calculadoraController.getZerada();
        if(zerada){
            calculadoraController.realizaOperacao(EnumOperacao.ADICAO, stringParaDouble(tfValor.getText()));
        }
        ultimaOperacao = EnumOperacao.ADICAO;
        limpa();
    }//GEN-LAST:event_btAdicaoActionPerformed

    private void btSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtracaoActionPerformed
        Boolean zerada = calculadoraController.getZerada();
        if(zerada){
            calculadoraController.realizaOperacao(EnumOperacao.SUBTRACAO, stringParaDouble(tfValor.getText()));
        }
        ultimaOperacao = EnumOperacao.SUBTRACAO;
        limpa();
    }//GEN-LAST:event_btSubtracaoActionPerformed

    private void btMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicacaoActionPerformed
        Boolean zerada = calculadoraController.getZerada();
        if(zerada){
            calculadoraController.realizaOperacao(EnumOperacao.MULTIPLICACAO, stringParaDouble(tfValor.getText()));
        }
        ultimaOperacao = EnumOperacao.MULTIPLICACAO;
        limpa();
    }//GEN-LAST:event_btMultiplicacaoActionPerformed

    private void btDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisaoActionPerformed
        Boolean zerada = calculadoraController.getZerada();
        if(zerada){
            calculadoraController.realizaOperacao(EnumOperacao.DIVISAO, stringParaDouble(tfValor.getText()));
        }
        ultimaOperacao = EnumOperacao.DIVISAO;
        limpa();
    }//GEN-LAST:event_btDivisaoActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        calculadoraController.realizaOperacao(ultimaOperacao, stringParaDouble(tfValor.getText()));
        tfValor.setText(doubleParaString(calculadoraController.getTotal()));
        ultimaOperacao = EnumOperacao.IGUAL;
    }//GEN-LAST:event_btIgualActionPerformed

    private void btPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPorcentagemActionPerformed
        switch (ultimaOperacao) {
            case ADICAO -> {
                calculadoraController.realizaOperacao(EnumOperacao.PORCENTAGEM_ADICAO, stringParaDouble(tfValor.getText()));
                tfValor.setText(doubleParaString(calculadoraController.getTotal()));
            }
            case SUBTRACAO -> {
                calculadoraController.realizaOperacao(EnumOperacao.PORCENTAGEM_SUBTRACAO, stringParaDouble(tfValor.getText()));
                tfValor.setText(doubleParaString(calculadoraController.getTotal()));
            }
            default -> tfValor.setText("Operação não suportada.");
        }
        //tfValor.setText(doubleParaString(calculadoraController.getTotal()));
    }//GEN-LAST:event_btPorcentagemActionPerformed

    private void btMaisBarraMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisBarraMenosActionPerformed
        removerUltimo();
    }//GEN-LAST:event_btMaisBarraMenosActionPerformed

    
    private Double stringParaDouble(String numero){
        NumberFormat nf = NumberFormat.getInstance();
        Double dv = 0.0;
        try {
            dv = nf.parse(numero).doubleValue();
        } catch (ParseException ex) {
            
        }
        return dv;
    }
    
    private String doubleParaString(Double numero){
        if(numero != null) {
            DecimalFormat formato = new DecimalFormat("##,###,###,##0.0", new DecimalFormatSymbols(new Locale("pt", "BR")));
            formato.setParseBigDecimal(true);
            return formato.format(numero);
        }
        return "";
    }
        
    private void limpa(){
        tfValor.setText("0,00");
    }
    
    private void digita(String caractere) {
        if(tfValor.getText().equals("0,00")){
            tfValor.setText(caractere);
        }else {
            if(caractere.equals(",") && tfValor.getText().contains(",")){
                
            }else {
                tfValor.setText(tfValor.getText().concat(caractere));
            }        
        }  
    }
    
    public void removerUltimo()
    {
        if(tfValor.getText().equals("0,00")){
            
        }else{
            StringBuilder sb = new StringBuilder(tfValor.getText());
            sb.deleteCharAt(tfValor.getText().length() - 1);
            tfValor.setText(sb.toString());
            calculadoraController.realizaOperacao(EnumOperacao.DIMINUI_NUMERO, stringParaDouble(tfValor.getText()));
            if(tfValor.getText().length() == 0){
                tfValor.setText("0,00");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAC;
    private javax.swing.JButton btAdicao;
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btDois;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMaisBarraMenos;
    private javax.swing.JButton btMultiplicacao;
    private javax.swing.JButton btNove;
    private javax.swing.JButton btOito;
    private javax.swing.JButton btPorcentagem;
    private javax.swing.JButton btQuatro;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSete;
    private javax.swing.JButton btSubtracao;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUm;
    private javax.swing.JButton btVirgula;
    private javax.swing.JButton btZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
