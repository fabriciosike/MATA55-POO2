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
class CursosDeGraduacao extends Cursos {
    
    private int nDisciplinasOb, nDisciplinasOp;

    public CursosDeGraduacao(int nDisciplinasOb, int nDisciplinasOp, String codigo, String nome, String area, int numeroDeVagas) {
        super(codigo, nome, area, numeroDeVagas);
        this.nDisciplinasOb = nDisciplinasOb;
        this.nDisciplinasOp = nDisciplinasOp;
    }

    public int getnDisciplinasOb() {
        return nDisciplinasOb;
    }

    public void setnDisciplinasOb(int nDisciplinasOb) {
        this.nDisciplinasOb = nDisciplinasOb;
    }

    public int getnDisciplinasOp() {
        return nDisciplinasOp;
    }

    public void setnDisciplinasOp(int nDisciplinasOp) {
        this.nDisciplinasOp = nDisciplinasOp;
    }

    @Override
    public String toString() {
        return super.toString() + " CursosDeGraduacao{" + "nDisciplinasOb=" + nDisciplinasOb + ", nDisciplinasOp=" + nDisciplinasOp + '}';
    }
    
    
}
