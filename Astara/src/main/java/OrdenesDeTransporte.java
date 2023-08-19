import java.util.Date;

public class OrdernesDeTransporte {
    private int lineaId;
    private String estado;
    private String codCliente;
    private String campa;
    private String bastidor;
    private String matricula;
    private String codOrigen;
    private String codDestino;
    private String transportadoBal;
    private Date fechaSolicitudOrden;
    private String refCliente;
    private String prioridad;
    private String codFamilia;
    private String descFamilia;
    private String codModelo;
    private String descModelo;
    private String codAcabado;
    private String descAcabado;
    private Date fechaMaxEntrega;

    // Constructor
    public OrdenesDeTransporte(int lineaId, String estado, String codCliente, String campa, String bastidor,
                     String matricula, String codOrigen, String codDestino, String transportadoBal,
                     Date fechaSolicitudOrden, String refCliente, String prioridad, String codFamilia,
                     String descFamilia, String codModelo, String descModelo, String codAcabado,
                     String descAcabado, Date fechaMaxEntrega) {
        this.lineaId = lineaId;
        this.estado = estado;
        this.codCliente = codCliente;
        this.campa = campa;
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.codOrigen = codOrigen;
        this.codDestino = codDestino;
        this.transportadoBal = transportadoBal;
        this.fechaSolicitudOrden = fechaSolicitudOrden;
        this.refCliente = refCliente;
        this.prioridad = prioridad;
        this.codFamilia = codFamilia;
        this.descFamilia = descFamilia;
        this.codModelo = codModelo;
        this.descModelo = descModelo;
        this.codAcabado = codAcabado;
        this.descAcabado = descAcabado;
        this.fechaMaxEntrega = fechaMaxEntrega;
    }

    // Getter methods

    // ... (getter methods for each field)

    // Setter methods

    // ... (setter methods for each field)

    // toString method

    @Override
    public String toString() {
        return "OrdenesDeTransporte{" +
                "lineaId=" + lineaId +
                ", estado='" + estado + '\'' +
                ", codCliente='" + codCliente + '\'' +
                ", campa='" + campa + '\'' +
                ", bastidor='" + bastidor + '\'' +
                ", matricula='" + matricula + '\'' +
                ", codOrigen='" + codOrigen + '\'' +
                ", codDestino='" + codDestino + '\'' +
                ", transportadoBal='" + transportadoBal + '\'' +
                ", fechaSolicitudOrden=" + fechaSolicitudOrden +
                ", refCliente='" + refCliente + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", codFamilia='" + codFamilia + '\'' +
                ", descFamilia='" + descFamilia + '\'' +
                ", codModelo='" + codModelo + '\'' +
                ", descModelo='" + descModelo + '\'' +
                ", codAcabado='" + codAcabado + '\'' +
                ", descAcabado='" + descAcabado + '\'' +
                ", fechaMaxEntrega=" + fechaMaxEntrega +
                '}';
    }

}
