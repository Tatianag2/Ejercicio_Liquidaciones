public class Inscripcion extends Liquidacion{
    public Inscripcion(LiquidacionServicio liqU) {
        super.setTipo("Inscripcion");
        super.setTotal(liqU.valorInscripcion());
    }
}
