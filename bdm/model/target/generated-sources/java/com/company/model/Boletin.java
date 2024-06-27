
package com.company.model;

import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "Boletin")
@Table(name = "BOLETIN")
@NamedQueries({
    @NamedQuery(name = "Boletin.findByPersistenceId", query = "SELECT b\nFROM Boletin b\nWHERE b.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Boletin.findById", query = "SELECT b\nFROM Boletin b\nWHERE b.id= :id\nORDER BY b.persistenceId"),
    @NamedQuery(name = "Boletin.findByTitulo", query = "SELECT b\nFROM Boletin b\nWHERE b.titulo= :titulo\nORDER BY b.persistenceId"),
    @NamedQuery(name = "Boletin.findByContenido", query = "SELECT b\nFROM Boletin b\nWHERE b.contenido= :contenido\nORDER BY b.persistenceId"),
    @NamedQuery(name = "Boletin.findByAprobado", query = "SELECT b\nFROM Boletin b\nWHERE b.aprobado= :aprobado\nORDER BY b.persistenceId"),
    @NamedQuery(name = "Boletin.findByFechaPublicacion", query = "SELECT b\nFROM Boletin b\nWHERE b.fechaPublicacion= :fechaPublicacion\nORDER BY b.persistenceId"),
    @NamedQuery(name = "Boletin.find", query = "SELECT b\nFROM Boletin b\nORDER BY b.persistenceId"),
    @NamedQuery(name = "Boletin.countForFindById", query = "SELECT COUNT(b)\nFROM Boletin b\nWHERE b.id= :id\n"),
    @NamedQuery(name = "Boletin.countForFindByTitulo", query = "SELECT COUNT(b)\nFROM Boletin b\nWHERE b.titulo= :titulo\n"),
    @NamedQuery(name = "Boletin.countForFindByContenido", query = "SELECT COUNT(b)\nFROM Boletin b\nWHERE b.contenido= :contenido\n"),
    @NamedQuery(name = "Boletin.countForFindByAprobado", query = "SELECT COUNT(b)\nFROM Boletin b\nWHERE b.aprobado= :aprobado\n"),
    @NamedQuery(name = "Boletin.countForFindByFechaPublicacion", query = "SELECT COUNT(b)\nFROM Boletin b\nWHERE b.fechaPublicacion= :fechaPublicacion\n"),
    @NamedQuery(name = "Boletin.countForFind", query = "SELECT COUNT(b)\nFROM Boletin b\n")
})
public class Boletin implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "TITULO", nullable = false, length = 255)
    private String titulo;
    @Column(name = "CONTENIDO", nullable = false)
    @Lob
    private String contenido;
    @Column(name = "APROBADO", nullable = true)
    private Boolean aprobado;
    @Column(name = "FECHAPUBLICACION", nullable = false, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.OffsetDateTimeConverter.class)
    private OffsetDateTime fechaPublicacion;

    public Boletin() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Boolean isAprobado() {
        return aprobado;
    }

    public void setFechaPublicacion(OffsetDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public OffsetDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

}
