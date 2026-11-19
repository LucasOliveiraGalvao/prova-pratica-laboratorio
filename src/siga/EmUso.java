package siga;

public class EmUso implements EstadoReserva {

    @Override
    public String getSituacao() {
        return "EM_USO";
    }

    @Override
    public EstadoReserva retirar() {
        throw new IllegalStateException("Nao e possivel retirar em EM_USO.");
    }

    @Override
    public EstadoReserva devolver() {
        return new Encerrada();
    }

    @Override
    public EstadoReserva cancelar() {
        throw new IllegalStateException("Nao e possivel cancelar em EM_USO.");
    }
}
