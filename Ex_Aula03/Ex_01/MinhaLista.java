package br.com.ada.pooii.Ex_Aula03.Ex_01;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista <T extends ObjetoComId<U>, U>{ //T significa objeto que vai ser adicionado(um TIPO) e U vai ser o identificador

    private final List<T> elementos = new ArrayList<>();

    //adicionar(T elemento);
    public void adicionar(T elemento) {
        this.elementos.add(elemento);
    }

    //obter(int indice)
    public T obter(int indice) {
        if(indice < 0 && indice >= elementos.size()){
            return null;
        }
       T objetoEncontrado = this.elementos.get(indice);
       return objetoEncontrado;
    }

    //int indice(U identificador);
    public int indice(U id) {
        for (int i=0; i < this.elementos.size(); i++){
            T elementoDaPosicao = this.elementos.get(i);
            boolean isIgual = elementoDaPosicao.getId().equals(id);

            if(isIgual) {
                return i;
            }
        }
        return -1;
    }

    //boolean contem(T elemento)
    public boolean contem(T elemento) {
       boolean isElementoNaLista = this.elementos.contains(elemento);
       return isElementoNaLista;
    }
}
