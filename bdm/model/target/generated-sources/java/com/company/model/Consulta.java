
package com.company.model;

import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "Consulta")
@Table(name = "CONSULTA")
@NamedQueries({
    @NamedQuery(name = "Consulta.findByPersistenceId", query = "SELECT c\nFROM Consulta c\nWHERE c.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Consulta.findById", query = "SELECT c\nFROM Consulta c\nWHERE c.id= :id\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Consulta.findByNombreSolicitante", query = "SELECT c\nFROM Consulta c\nWHERE c.nombreSolicitante= :nombreSolicitante\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Consulta.findByDni", query = "SELECT c\nFROM Consulta c\nWHERE c.dni= :dni\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Consulta.findByDetalle", query = "SELECT c\nFROM Consulta c\nWHERE c.detalle= :detalle\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Consulta.findByFechaConsulta", query = "SELECT c\nFROM Consulta c\nWHERE c.fechaConsulta= :fechaConsulta\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Consulta.find", query = "SELECT c\nFROM Consulta c\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Consulta.countForFindById", query = "SELECT COUNT(c)\nFROM Consulta c\nWHERE c.id= :id\n"),
    @NamedQuery(name = "Consulta.countForFindByNombreSolicitante", query = "SELECT COUNT(c)\nFROM Consulta c\nWHERE c.nombreSolicitante= :nombreSolicitante\n"),
    @NamedQuery(name = "Consulta.countForFindByDni", query = "SELECT COUNT(c)\nFROM Consulta c\nWHERE c.dni= :dni\n"),
    @NamedQuery(name = "Consulta.countForFindByDetalle", query = "SELECT COUNT(c)\nFROM Consulta c\nWHERE c.detalle= :detalle\n"),
    @NamedQuery(name = "Consulta.countForFindByFechaConsulta", query = "SELECT COUNT(c)\nFROM Consulta c\nWHERE c.fechaConsulta= :fechaConsulta\n"),
    @NamedQuery(name = "Consulta.countForFind", query = "SELECT COUNT(c)\nFROM Consulta c\n")
})
public class Consulta implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "NOMBRESOLICITANTE", nullable = false, length = 255)
    private String nombreSolicitante;
    @Column(name = "DNI", nullable = false)
    private Integer dni;
    @Column(name = "DETALLE", nullable = false, length = 255)
    private String detalle;
    @Column(name = "FECHACONSULTA", nullable = false, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.OffsetDateTimeConverter.class)
    private OffsetDateTime fechaConsulta;

    public Consulta() {
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

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setFechaConsulta(OffsetDateTime fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public OffsetDateTime getFechaConsulta() {
        return fechaConsulta;
    }

}
