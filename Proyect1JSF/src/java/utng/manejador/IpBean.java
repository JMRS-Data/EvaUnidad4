package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.IpDAO;
import utng.modelo.Ip;

@ManagedBean
@SessionScoped
public class IpBean implements Serializable{
    private List<Ip> ips;
    private Ip ip;
    public IpBean(){}

    public List<Ip> getIps() {
        return ips;
    }

    public void setIps(List<Ip> ips) {
        this.ips = ips;
    }

    public Ip getIp() {
        return ip;
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }
    
    
    public String listar(){
        IpDAO dao = new IpDAO();
        try {
            ips=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Ips";
    }
    
    public String eliminar(){
         IpDAO dao = new IpDAO();
        try {
            dao.delete(ip);
            ips=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        ip = new Ip();
        return "Iniciar";
    }
    
    public String guardar(){
        IpDAO dao = new IpDAO();
        try {
            if(ip.getIdIp()!= 0){
                dao.update(ip);
            }else {
                dao.insert(ip);
            }
            ips=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Ip ip){
        this.ip=ip;
        return "Editar";
    }
    
}
