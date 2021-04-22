/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author nicola.cristian
 */
public class Studente implements Serializable{
    
    private String nome,cognome;
    private int num_registro;

    public Studente(String nome, String cognome, int num_registro) {
        this.nome = nome;
        this.cognome = cognome;
        this.num_registro = num_registro;
    }

    public String getAll() {
        return num_registro+", nome: "+nome+", cognome: "+cognome;
    }





    
}
