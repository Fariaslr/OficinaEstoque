package com.ifba.estoque;

import jakarta.persistence.*;
import jakarta.persistence.SequenceGenerator;

/**
 *
 * @author aluno
 */
@Entity
@Table(name="itens")
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itens_generator")
    @SequenceGenerator(name = "itens_generator", sequenceName = "public.itens_seq", allocationSize = 1)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    String nomeItem;
    int quantidade;

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
