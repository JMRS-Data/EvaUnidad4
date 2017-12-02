/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sarai
 */

@Entity
@Table(name="ip")
public class Ip implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_ip")
    private Long idIp;
    @Column(length=30)
    private String mask;
    @Column(length=30)
    private String dirIp;
     @Column(length=30)
    private String port;

    public Ip() {
        this.idIp=0L;
    }

    public Long getIdIp() {
        return idIp;
    }

    public void setIdIp(Long idIp) {
        this.idIp = idIp;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getDirIp() {
        return dirIp;
    }

    public void setDirIp(String dirIp) {
        this.dirIp = dirIp;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
    
    
}