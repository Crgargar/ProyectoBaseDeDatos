/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cristiangg.campofutbol.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Usuario
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ESTADIO")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Estadio.findAll", query = "SELECT e FROM Estadio e"),
    @javax.persistence.NamedQuery(name = "Estadio.findById", query = "SELECT e FROM Estadio e WHERE e.id = :id"),
    @javax.persistence.NamedQuery(name = "Estadio.findByNombre", query = "SELECT e FROM Estadio e WHERE e.nombre = :nombre"),
    @javax.persistence.NamedQuery(name = "Estadio.findByLocalizacion", query = "SELECT e FROM Estadio e WHERE e.localizacion = :localizacion"),
    @javax.persistence.NamedQuery(name = "Estadio.findByTelefono", query = "SELECT e FROM Estadio e WHERE e.telefono = :telefono"),
    @javax.persistence.NamedQuery(name = "Estadio.findByEmail", query = "SELECT e FROM Estadio e WHERE e.email = :email"),
    @javax.persistence.NamedQuery(name = "Estadio.findByFechaFundacion", query = "SELECT e FROM Estadio e WHERE e.fechaFundacion = :fechaFundacion"),
    @javax.persistence.NamedQuery(name = "Estadio.findByCategoriaClubs", query = "SELECT e FROM Estadio e WHERE e.categoriaClubs = :categoriaClubs"),
    @javax.persistence.NamedQuery(name = "Estadio.findByPrecio", query = "SELECT e FROM Estadio e WHERE e.precio = :precio"),
    @javax.persistence.NamedQuery(name = "Estadio.findByMedidaCampo", query = "SELECT e FROM Estadio e WHERE e.medidaCampo = :medidaCampo"),
    @javax.persistence.NamedQuery(name = "Estadio.findByEntradasDisponibles", query = "SELECT e FROM Estadio e WHERE e.entradasDisponibles = :entradasDisponibles"),
    @javax.persistence.NamedQuery(name = "Estadio.findByFotoEstadio", query = "SELECT e FROM Estadio e WHERE e.fotoEstadio = :fotoEstadio")})
public class Estadio implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ID")
    private Integer id;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "NOMBRE")
    private String nombre;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "LOCALIZACION")
    private String localizacion;
    @javax.persistence.Column(name = "TELEFONO")
    private String telefono;
    @javax.persistence.Column(name = "EMAIL")
    private String email;
    @javax.persistence.Column(name = "FECHA_FUNDACION")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFundacion;
    @javax.persistence.Column(name = "CATEGORIA_CLUBS")
    private Character categoriaClubs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Column(name = "PRECIO")
    private BigDecimal precio;
    @javax.persistence.Column(name = "MEDIDA_CAMPO")
    private Short medidaCampo;
    @javax.persistence.Column(name = "ENTRADAS_DISPONIBLES")
    private Boolean entradasDisponibles;
    @javax.persistence.Column(name = "FOTO_ESTADIO")
    private String fotoEstadio;
    @javax.persistence.JoinColumn(name = "PROVINCIA", referencedColumnName = "ID")
    @javax.persistence.ManyToOne
    private Provincia provincia;

    public Estadio() {
    }

    public Estadio(Integer id) {
        this.id = id;
    }

    public Estadio(Integer id, String nombre, String localizacion) {
        this.id = id;
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public Character getCategoriaClubs() {
        return categoriaClubs;
    }

    public void setCategoriaClubs(Character categoriaClubs) {
        this.categoriaClubs = categoriaClubs;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Short getMedidaCampo() {
        return medidaCampo;
    }

    public void setMedidaCampo(Short medidaCampo) {
        this.medidaCampo = medidaCampo;
    }

    public Boolean getEntradasDisponibles() {
        return entradasDisponibles;
    }

    public void setEntradasDisponibles(Boolean entradasDisponibles) {
        this.entradasDisponibles = entradasDisponibles;
    }

    public String getFotoEstadio() {
        return fotoEstadio;
    }

    public void setFotoEstadio(String fotoEstadio) {
        this.fotoEstadio = fotoEstadio;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
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
        if (!(object instanceof Estadio)) {
            return false;
        }
        Estadio other = (Estadio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.cristiangg.campofutbol.entities.Estadio[ id=" + id + " ]";
    }
    
}
