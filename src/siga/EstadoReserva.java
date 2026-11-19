package siga;

public interface EstadoReserva {

    String getSituacao();

    EstadoReserva retirar();

    EstadoReserva devolver();

    EstadoReserva cancelar();
}
