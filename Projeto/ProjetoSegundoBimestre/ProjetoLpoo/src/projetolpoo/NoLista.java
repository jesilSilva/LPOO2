/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolpoo;

/**
 *
 * @author jesie
 */
public class NoLista {

    Object valor;
    NoLista noAnterior;
    NoLista proximoNo;
    int prioridade;

    public NoLista(Object valor, NoLista noAnterior, NoLista proximoNo, int prioridade) {
        this.valor = valor;
        this.noAnterior = noAnterior;
        this.proximoNo = proximoNo;
        this.prioridade = prioridade;
    }

}
