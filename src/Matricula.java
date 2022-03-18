public class Matricula extends Liquidacion{

    public Matricula(LiquidacionServicio liqU){
        super.setTipo("Matricula");
        super.setTotal(liqU.valorMatricula());
    }
}
