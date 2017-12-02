package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="oficina")
public class Oficina implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_Oficina")
    private Long idOficina;
    @Column(name="nombre_encargado", length=30)
    private String nombreEncargado;
    @Column(length=40)
    private String ocupacion;
     @Column(length=40)
    private String area;
    
    @ManyToOne()
    @JoinColumn(name="id_ip")
    private Ip ip;

    public Oficina() {
        this.idOficina=0L;
    }

    public Oficina(Long idOficina, String nombreEncargado, String ocupacion, String area, Ip ip) {
        super();
        this.idOficina = idOficina;
        this.nombreEncargado = nombreEncargado;
        this.ocupacion = ocupacion;
        this.area = area;
        this.ip = ip;
    }

    public Long getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Long idOficina) {
        this.idOficina = idOficina;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Ip getIp() {
        return ip;
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    
    
    
}
    