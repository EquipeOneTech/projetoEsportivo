package objts;

import java.util.HashMap;

/**
 *
 * @author Felipe
 */
public class Time {
    private String nome;
    private String organizacao;
    
    public Time(){}
    
    public Time(String nome, String organizacao) {
        this.nome = nome;
        this.organizacao = organizacao;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }
    
    
}
