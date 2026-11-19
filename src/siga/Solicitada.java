package siga;

public class Solicitada implements EstadoReserva {

    @Override
    public String getSituacao() {
        return "SOLICITADA";
    }

    @Override
    public EstadoReserva retirar() {
        return new EmUso();
    }

    @Override
    public EstadoReserva devolver() {
        throw new IllegalStateException("Nao e possivel devolver em SOLICITADA.");
    }

    @Override
    public EstadoReserva cancelar() {
        return new Encerrada();
    }
}
