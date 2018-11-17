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
public class Pilha<Object> implements Entity, PadraoDeNo<NoPilha> {

    NoPilha ultimoPilha;
    int tamanho;

    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean vazia() {
        return tamanho == 0;

    }

    public void prioridade(int prioridade) {
        NoPilha ponteiro = ultimoPilha;
        while (ponteiro != null) {
            if (ponteiro.prioridade == prioridade) {

                System.out.println("O Processo " + ponteiro.valor + "a ser excluido da pilha de processos");
                if (ponteiro == ultimoPilha && ponteiro.noAnterior == null) {
                    ultimoPilha = null;
                } else if (ponteiro.noAnterior == null) {
                    ponteiro.proximoNo.noAnterior = null;
                } else if (ponteiro.proximoNo == null) {
                    ultimoPilha = ponteiro.noAnterior;
                } else {
                    ponteiro.proximoNo.noAnterior = ponteiro.noAnterior;
                    ponteiro.noAnterior.proximoNo = ponteiro.proximoNo;
                }
                break;
            }
            ponteiro = ponteiro.noAnterior;

        }

        tamanho--;
    }

    public void moverPilha(Object valor, int prioridade) {
        if (vazia()) {
            ultimoPilha = new NoPilha(valor, null, null, prioridade);

        } else {
            NoPilha novaPilha = new NoPilha(valor, ultimoPilha, null, prioridade);
            ultimoPilha.proximoNo = novaPilha;
            ultimoPilha = novaPilha;
        }
        tamanho++;
    }

    public void topoPilha(int prioridade) {
        NoPilha ponteiro = ultimoPilha;

        while (ponteiro != null) {
            if (ponteiro.prioridade == prioridade) {
                System.out.println("Valor da pilha: " + ponteiro.valor + "Prioridade de execução da pilha: " + ponteiro.prioridade);
                break;
            }
            ponteiro = ponteiro.noAnterior;
        }
    }

    private boolean consultarProcessos(Object object) {
        NoPilha ponteiro = ultimoPilha;
        while (ponteiro != null) {
            if (ponteiro.valor == object) {
                return true;
            }
            ponteiro = ponteiro.proximoNo;
        }
        return false;
    }

    @Override
    public void imprimirRecursivamente(NoPilha noPilha) {

        if (noPilha != null) {

            System.out.println("Nome: " + noPilha.valor + " Prioridade: " + noPilha.prioridade);

            imprimirRecursivamente(noPilha.noAnterior);
        }
    }

    @Override
    public void imprimirMetodoRecursivo() {

        NoPilha ponteiro = ultimoPilha;

        imprimirRecursivamente(ponteiro);
    }

    private void ProcessosPilha(NoPilha ponteiro, Object object) {

        if (ponteiro.valor == object) {
            System.out.println("Os processos encontrados Processos: " + ponteiro.valor);

        } else {

            ProcessosPilha(ponteiro.noAnterior, object);
        }
    }

    public void procurarProcessoDentroPilha(Object object) {
        NoPilha ponteiro = ultimoPilha;
        if (consultarProcessos(object)) {
            ProcessosPilha(ponteiro, object);
        } else {
            System.err.println("Não existem esses processos!");
        }

    }

}
