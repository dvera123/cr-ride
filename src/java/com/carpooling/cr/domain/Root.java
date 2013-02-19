/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carpooling.cr.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vera
 */
@Entity
@Table(name = "root")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Root.findAll", query = "SELECT r FROM Root r"),
    @NamedQuery(name = "Root.findById", query = "SELECT r FROM Root r WHERE r.id = :id"),
    @NamedQuery(name = "Root.findByStartPoint", query = "SELECT r FROM Root r WHERE r.startPoint = :startPoint"),
    @NamedQuery(name = "Root.findByEndPoint", query = "SELECT r FROM Root r WHERE r.endPoint = :endPoint"),
    @NamedQuery(name = "Root.findByIdDriver", query = "SELECT r FROM Root r WHERE r.idDriver = :idDriver"),
    @NamedQuery(name = "Root.findByMaxPassengers", query = "SELECT r FROM Root r WHERE r.maxPassengers = :maxPassengers")})
public class Root implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "start_point")
    private String startPoint;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "end_point")
    private String endPoint;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_driver")
    private int idDriver;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_passengers")
    private int maxPassengers;

    public Root() {
    }

    public Root(Integer id) {
        this.id = id;
    }

    public Root(Integer id, String startPoint, String endPoint, int idDriver, int maxPassengers) {
        this.id = id;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.idDriver = idDriver;
        this.maxPassengers = maxPassengers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Root)) {
            return false;
        }
        Root other = (Root) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.carpooling.cr.domain.Root[ id=" + id + " ]";
    }
    
}
