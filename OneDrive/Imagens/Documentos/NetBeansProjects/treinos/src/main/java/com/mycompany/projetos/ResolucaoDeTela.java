/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetos;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author arthu
 */
public class ResolucaoDeTela {
    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)size.getWidth();
        int altura = (int)size.getHeight();
        System.out.println("Sua resolução de tela é:"+ largura + "X" + altura);
    }
}
