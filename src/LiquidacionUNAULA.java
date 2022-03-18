public class LiquidacionUNAULA extends Liquidacion implements LiquidacionServicio {

    public LiquidacionUNAULA(boolean certificadoElectoral) {
        super.setCertificadoElectoral(certificadoElectoral);
    }

    @Override
    public int valorMatricula() {
        if(super.isCertificadoElectoral()){
            return 80 - 10;
        }
        return 80;
    }

    @Override
    public int valorInscripcion() {
        return 40;
    }

    @Override
    public int valorDerechosGrado() {
        return valorMatricula() * 20 / 100;
    }


}
