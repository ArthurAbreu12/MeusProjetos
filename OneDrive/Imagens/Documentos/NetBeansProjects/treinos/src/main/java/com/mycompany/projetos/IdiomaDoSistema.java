/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetos;

import java.util.Locale;

/**
 *
 * @author arthu
 */
public class IdiomaDoSistema {
    public static void main(String[] args) {
         Locale idioma = Locale.getDefault(); //Locale é uma classe que representa configurações regionais, como o idioma.
         System.out.println("A maquina está no idioma: " + idioma);
    }
}
