package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.IpDAO;
import utng.datos.OficinaDAO;
import utng.modelo.Ip;
import utng.modelo.Oficina;


@ManagedBean(name="oficinaBean") 
@SessionScoped
public class OficinaBean implements Serializable{
    private List<Oficina>oficinas;
    private Oficina oficina;
    private List<Ip> ips;
    
    public OficinaBean(){
        oficina = new Oficina();
        oficina.setIp(new Ip());
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(List<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
    
    public List<Ip> getIps() {
        return ips;
    }
    public void setIp(List<Ip> ips) {
        this.ips = ips;
    }
    
    
    public String listar(){
       OficinaDAO dao = new OficinaDAO();
        try {
            oficinas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Oficinas";
    }
    
    public String eliminar(){
         OficinaDAO dao = new OficinaDAO();
        try {
            dao.delete(oficina);
            oficinas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        oficina = new Oficina();
        oficina.setIp(new Ip());
        try {
            ips = new IpDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
        OficinaDAO dao = new OficinaDAO();
        try {
            if(oficina.getIdOficina()!= 0){
                dao.update(oficina);
            }else {
                dao.insert(oficina);
            }
            oficinas=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Oficina oficina){
        this.oficina = oficina;
        try {
            ips = new IpDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
    
}
