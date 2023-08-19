import java.util.Date;

public class EntidadesYDireccionesDeLaMarca {
    private String fileName;
    private String CODENTIDAD;
    private String CODDIRECCION;
    private String ESTADO;
    private String CODCLIENTE;
    private String CAMPA;
    private String TIPOVIA;
    private String DESCDIRECCION;
    private String NUMEROVIA;
    private String EXTENSIONDIRECCION;
    private String LOCALIDAD;
    private String CODIGOPOSTAL;
    private String PROVINCIA;
    private String TLFCONTACTO;
    private Date FECHACREACIONSIL;
    private Date FECHAMODIFICACIONSIL;

    public EntidadesYDireccionesDeLaMarca(String fileName, String CODENTIDAD, String CODDIRECCION, String ESTADO,
                                          String CODCLIENTE, String CAMPA, String TIPOVIA, String DESCDIRECCION,
                                          String NUMEROVIA, String EXTENSIONDIRECCION, String LOCALIDAD, String CODIGOPOSTAL,
                                          String PROVINCIA, String TLFCONTACTO, Date FECHACREACIONSIL, Date FECHAMODIFICACIONSIL) {
        this.fileName = fileName;
        this.CODENTIDAD = CODENTIDAD;
        this.CODDIRECCION = CODDIRECCION;
        this.ESTADO = ESTADO;
        this.CODCLIENTE = CODCLIENTE;
        this.CAMPA = CAMPA;
        this.TIPOVIA = TIPOVIA;
        this.DESCDIRECCION = DESCDIRECCION;
        this.NUMEROVIA = NUMEROVIA;
        this.EXTENSIONDIRECCION = EXTENSIONDIRECCION;
        this.LOCALIDAD = LOCALIDAD;
        this.CODIGOPOSTAL = CODIGOPOSTAL;
        this.PROVINCIA = PROVINCIA;
        this.TLFCONTACTO = TLFCONTACTO;
        this.FECHACREACIONSIL = FECHACREACIONSIL;
        this.FECHAMODIFICACIONSIL = FECHAMODIFICACIONSIL;
    }
    public String getfileName() {
        return fileName;
    }

    public String getCODENTIDAD() {
        return CODENTIDAD;
    }

    public String getCODDIRECCION() {
        return CODDIRECCION;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public String getCODCLIENTE() {
        return CODCLIENTE;
    }

    public String getCAMPA() {
        return CAMPA;
    }

    public String getTIPOVIA() {
        return TIPOVIA;
    }

    public String getDESCDIRECCION() {
        return DESCDIRECCION;
    }

    public String getNUMEROVIA() {
        return NUMEROVIA;
    }

    public String getEXTENSIONDIRECCION() {
        return EXTENSIONDIRECCION;
    }

    public String getLOCALIDAD() {
        return LOCALIDAD;
    }

    public String getCODIGOPOSTAL() {
        return CODIGOPOSTAL;
    }

    public String getPROVINCIA() {
        return PROVINCIA;
    }

    public String getTLFCONTACTO() {
        return TLFCONTACTO;
    }

    public Date getFECHACREACIONSIL() {
        return FECHACREACIONSIL;
    }

    public Date getFECHAMODIFICACIONSIL() {
        return FECHAMODIFICACIONSIL;
    }

    // Setter methods (if needed)

    public void setfileName(String fileName) {
        this.fileName = fileName;
    }

    public void setCODENTIDAD(String CODENTIDAD) {
        this.CODENTIDAD = CODENTIDAD;
    }

    // ... (similarly for other fields)

    public void setFECHAMODIFICACIONSIL(Date FECHAMODIFICACIONSIL) {
        this.FECHAMODIFICACIONSIL = FECHAMODIFICACIONSIL;
    }

    // toString method for debugging

    @Override
    public String toString() {
        return "EntidadesYDireccionesDeLaMarca{" +
                "fileName='" + fileName + '\'' +
                ", CODENTIDAD='" + CODENTIDAD + '\'' +
                ", CODDIRECCION='" + CODDIRECCION + '\'' +
                ", ESTADO='" + ESTADO + '\'' +
                ", CODCLIENTE='" + CODCLIENTE + '\'' +
                ", CAMPA='" + CAMPA + '\'' +
                ", TIPOVIA='" + TIPOVIA + '\'' +
                ", DESCDIRECCION='" + DESCDIRECCION + '\'' +
                ", NUMEROVIA='" + NUMEROVIA + '\'' +
                ", EXTENSIONDIRECCION='" + EXTENSIONDIRECCION + '\'' +
                ", LOCALIDAD='" + LOCALIDAD + '\'' +
                ", CODIGOPOSTAL='" + CODIGOPOSTAL + '\'' +
                ", PROVINCIA='" + PROVINCIA + '\'' +
                ", TLFCONTACTO='" + TLFCONTACTO + '\'' +
                ", FECHACREACIONSIL=" + FECHACREACIONSIL +
                ", FECHAMODIFICACIONSIL=" + FECHAMODIFICACIONSIL +
                '}';
    }

    public static void main(String[] args) {
        EntidadesYDireccionesDeLaMarca data = new EntidadesYDireccionesDeLaMarca(
                "C:\\Users\\rafael.monsalve\\Documents\\Astara\\INPUT\\ENTDIR_CO_20230721171152(2).txt",
                "CODENTIDAD", "CODDIRECCION", "ESTADO", "CODCLIENTE", "CAMPA", "TIPOVIA", "DESCDIRECCION",
                "NUMEROVIA", "EXTENSIONDIRECCION", "LOCALIDAD", "CODIGOPOSTAL", "PROVINCIA", "TLFCONTACTO",
                new Date(), new Date());

        System.out.println(data.toString());
    }
}

