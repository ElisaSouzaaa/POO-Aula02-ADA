package br.com.ada.pooii.Ex_Aula03.Ex_01;

public record Pessoa(long id, String nome) implements ObjetoComId<Long>{
    @Override
    public Long getId() {
        return id;
    }
}
