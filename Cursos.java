/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policlassabs;

/**
 *
 * @author fabricio.siqueira
 */
public abstract class Cursos {
    
    private String codigo, nome, area;
    private int numeroDeVagas;

    public Cursos(String codigo, String nome, String area, int numeroDeVagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
        this.numeroDeVagas = numeroDeVagas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public void setNumeroDeVagas(int numeroDeVagas) {
        this.numeroDeVagas = numeroDeVagas;
    }

    @Override
    public String toString() {
        return "Cursos{ Nome = + nome + ";
    }
      
    
}
