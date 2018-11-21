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
class CursosPosGraduacao extends Cursos {
    
    private int cargaHorariaMax;

    public CursosPosGraduacao(int cargaHorariaMax, String codigo, String nome, String area, int numeroDeVagas) {
        super(codigo, nome, area, numeroDeVagas);
        this.cargaHorariaMax = cargaHorariaMax;
    }

    public int getCargaHorariaMax() {
        return cargaHorariaMax;
    }

    public void setCargaHorariaMax(int cargaHorariaMax) {
        this.cargaHorariaMax = cargaHorariaMax;
    }

    @Override
    public String toString() {
        return super.toString() + " CursosPosGraduacao{" + "cargaHorariaMax=" + cargaHorariaMax + '}';
    }
    
    
   
    }
    

