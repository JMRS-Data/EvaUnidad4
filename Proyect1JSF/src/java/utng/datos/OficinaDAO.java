package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Oficina;



public class OficinaDAO extends DAO<Oficina> {
     public OficinaDAO() {
        super(new Oficina());
    }

    
    public Oficina getOneById(Oficina oficina) throws HibernateException {
        return super.getOneById(oficina.getIdOficina()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}