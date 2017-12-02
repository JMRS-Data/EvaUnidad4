package utng.datos;

import org.hibernate.HibernateException;
import utng.datos.DAO;
import utng.modelo.Ip;

public class IpDAO extends DAO<Ip> {
     public IpDAO() {
        super(new Ip());
    }

    
    public Ip getOneById(Ip ip) throws HibernateException {
        return super.getOneById(ip.getIdIp()); //To change body of generated methods, choose Tools | Templates.
    }
}