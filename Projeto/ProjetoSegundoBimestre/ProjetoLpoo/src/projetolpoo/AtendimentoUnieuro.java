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
public class AtendimentoUnieuro<Object>  implements Entity,PadraoDeNo<NoLista> {

    private int tamanho;
    private NoLista ultimoNo;
    private NoLista primeiroNo;

    public AtendimentoUnieuro() {
        ultimoNo = primeiroNo = null;
        tamanho = 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean vazia() {

//        if (tamanho != 0) {
//            return vazia();
//        }
        return tamanho == 0;
    }
  
    
    public void imprimirRecursivamente(NoLista no) {

        if (no != null) {

            System.out.println("Nome: " + no.valor + " Prioridade para ser atendido: " + no.prioridade);

            imprimirRecursivamente(no.proximoNo);
        }

    }
    
    @Override
    public void imprimirMetodoRecursivo() {
        NoLista cursor = primeiroNo;

        imprimirRecursivamente(cursor);

    }
    
    public Object fila() {
        return (Object) primeiroNo.valor;
    }

    public void removerPrioridadeFila(int prioridade) {
        NoLista cursor = primeiroNo;
        while (cursor != null) {
            if (cursor.prioridade == prioridade) {
                
                System.out.println(cursor.valor + " está sendo antendido");
                if(cursor == primeiroNo && cursor.proximoNo == null){
                primeiroNo = ultimoNo = null;
                }else  if (cursor.proximoNo == null) {
                    cursor.noAnterior.proximoNo = null;
                } else  if(cursor.noAnterior == null){
                primeiroNo = cursor.proximoNo;
                }  else{
                    cursor.noAnterior.proximoNo = cursor.proximoNo;
                    cursor.proximoNo.noAnterior = cursor.noAnterior;
                }
                
            }
            cursor = cursor.proximoNo;

        }

        //Diminuir tamanho da fila removendo a prioridade
        tamanho--;
    }
    
    
     public void imprimirFila() {
        NoLista cursor = primeiroNo;
        while (cursor != null) {
            System.out.println(cursor.valor);
            cursor = cursor.proximoNo;
        }
    }

    public void adicionaFila(Object elementosDaFila, int prioridade) {
        if (vazia()) {
            primeiroNo = ultimoNo = new NoLista(elementosDaFila, primeiroNo, ultimoNo, prioridade);
        } else {
            NoLista novaLista = new NoLista(elementosDaFila, null, null, prioridade);
            ultimoNo.proximoNo = novaLista;
            novaLista.noAnterior = ultimoNo;
            ultimoNo = novaLista;
        }
        // Aumentando o tamanho da fila
        tamanho++;
    }

   
}
