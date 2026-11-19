package siga;

public class Encerrada implements EstadoReserva {

    @Override
    public String getSituacao() {
        return "ENCERRADA";
    }

    @Override
    public EstadoReserva retirar() {
        throw new IllegalStateException("Nao e possivel retirar em ENCERRADA.");
    }

    @Override
    public EstadoReserva devolver() {
        throw new IllegalStateException("Nao e possivel devolver em ENCERRADA.");
    }

    @Override
    public EstadoReserva cancelar() {
        throw new IllegalStateException("Nao e possivel cancelar em ENCERRADA.");
    }
}
