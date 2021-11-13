/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocalculadora;

import com.mycompany.projetocalculadora.visao.jFrTela;

/**
 *
 * @author jails
 */
public class Principal {
    public static void main(String[] args) {
                /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrTela().setVisible(true);
            }
        });
    }
}
