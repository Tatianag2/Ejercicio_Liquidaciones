public class LiquidacionEAFIT extends Liquidacion implements LiquidacionServicio {

    public LiquidacionEAFIT(boolean certificadoElectoral) {
        super.setCertificadoElectoral(certificadoElectoral);
    }

    @Override
    public int valorMatricula() {
        return 100;
    }

    @Override
    public int valorInscripcion() {
        if(super.isCertificadoElectoral()){
            return 50 - 10;
        }
        return 50;
    }

    @Override
    public int valorDerechosGrado() {
        return valorMatricula() * 15 / 100;
    }

}
