
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
@javax.persistence.Entity(name = "MaterialDifusion")
@Table(name = "MATERIALDIFUSION")
@NamedQueries({
    @NamedQuery(name = "MaterialDifusion.findByPersistenceId", query = "SELECT m\nFROM MaterialDifusion m\nWHERE m.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "MaterialDifusion.findById", query = "SELECT m\nFROM MaterialDifusion m\nWHERE m.id= :id\nORDER BY m.persistenceId"),
    @NamedQuery(name = "MaterialDifusion.findByTitulo", query = "SELECT m\nFROM MaterialDifusion m\nWHERE m.titulo= :titulo\nORDER BY m.persistenceId"),
    @NamedQuery(name = "MaterialDifusion.findByContenido", query = "SELECT m\nFROM MaterialDifusion m\nWHERE m.contenido= :contenido\nORDER BY m.persistenceId"),
    @NamedQuery(name = "MaterialDifusion.findByFechaCreacion", query = "SELECT m\nFROM MaterialDifusion m\nWHERE m.fechaCreacion= :fechaCreacion\nORDER BY m.persistenceId"),
    @NamedQuery(name = "MaterialDifusion.findByFechaModificacion", query = "SELECT m\nFROM MaterialDifusion m\nWHERE m.fechaModificacion= :fechaModificacion\nORDER BY m.persistenceId"),
    @NamedQuery(name = "MaterialDifusion.find", query = "SELECT m\nFROM MaterialDifusion m\nORDER BY m.persistenceId"),
    @NamedQuery(name = "MaterialDifusion.countForFindById", query = "SELECT COUNT(m)\nFROM MaterialDifusion m\nWHERE m.id= :id\n"),
    @NamedQuery(name = "MaterialDifusion.countForFindByTitulo", query = "SELECT COUNT(m)\nFROM MaterialDifusion m\nWHERE m.titulo= :titulo\n"),
    @NamedQuery(name = "MaterialDifusion.countForFindByContenido", query = "SELECT COUNT(m)\nFROM MaterialDifusion m\nWHERE m.contenido= :contenido\n"),
    @NamedQuery(name = "MaterialDifusion.countForFindByFechaCreacion", query = "SELECT COUNT(m)\nFROM MaterialDifusion m\nWHERE m.fechaCreacion= :fechaCreacion\n"),
    @NamedQuery(name = "MaterialDifusion.countForFindByFechaModificacion", query = "SELECT COUNT(m)\nFROM MaterialDifusion m\nWHERE m.fechaModificacion= :fechaModificacion\n"),
    @NamedQuery(name = "MaterialDifusion.countForFind", query = "SELECT COUNT(m)\nFROM MaterialDifusion m\n")
})
public class MaterialDifusion implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "FECHACREACION", nullable = false, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.OffsetDateTimeConverter.class)
    private OffsetDateTime fechaCreacion;
    @Column(name = "FECHAMODIFICACION", nullable = true, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.OffsetDateTimeConverter.class)
    private OffsetDateTime fechaModificacion;

    public MaterialDifusion() {
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

    public void setFechaCreacion(OffsetDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public OffsetDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaModificacion(OffsetDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public OffsetDateTime getFechaModificacion() {
        return fechaModificacion;
    }

}
