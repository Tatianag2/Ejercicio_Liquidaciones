public class DerechoGrado extends Liquidacion{
    public DerechoGrado(LiquidacionServicio liqU) {
        super.setTipo("Derechos de grado");
        super.setTotal(liqU.valorDerechosGrado());
    }
}
