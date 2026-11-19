package siga;

/**
 * Reserva que delega o ciclo de vida para objetos de estado.
 * Ciclo de vida vigente:
 *   SOLICITADA  --retirar-->  EM_USO
 *   SOLICITADA  --cancelar-->  ENCERRADA
 *   EM_USO  --devolver-->  ENCERRADA
 *   ENCERRADA e final: recusa as tres operacoes.
 */
public class Reserva {

    private final Usuario solicitante;
    private final Equipamento item;

    public Reserva(Usuario solicitante, Equipamento item) {
        this.solicitante = solicitante;
        this.item = item;
        this.estado = new Solicitada();
    }

    private EstadoReserva estado;

    public String getSituacao() {
        return estado.getSituacao();
    }

    public void retirar() {
        estado = estado.retirar();
    }

    public void devolver() {
        estado = estado.devolver();
    }

    public void cancelar() {
        estado = estado.cancelar();
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public Equipamento getEquipamento() {
        return item;
    }
}
