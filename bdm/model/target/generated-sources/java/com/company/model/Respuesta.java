
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
@javax.persistence.Entity(name = "Respuesta")
@Table(name = "RESPUESTA")
@NamedQueries({
    @NamedQuery(name = "Respuesta.findByPersistenceId", query = "SELECT r\nFROM Respuesta r\nWHERE r.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Respuesta.findById", query = "SELECT r\nFROM Respuesta r\nWHERE r.id= :id\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Respuesta.findByConsultaId", query = "SELECT r\nFROM Respuesta r\nWHERE r.consultaId= :consultaId\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Respuesta.findByRespuesta", query = "SELECT r\nFROM Respuesta r\nWHERE r.respuesta= :respuesta\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Respuesta.findByFechaRespuesta", query = "SELECT r\nFROM Respuesta r\nWHERE r.fechaRespuesta= :fechaRespuesta\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Respuesta.find", query = "SELECT r\nFROM Respuesta r\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Respuesta.countForFindById", query = "SELECT COUNT(r)\nFROM Respuesta r\nWHERE r.id= :id\n"),
    @NamedQuery(name = "Respuesta.countForFindByConsultaId", query = "SELECT COUNT(r)\nFROM Respuesta r\nWHERE r.consultaId= :consultaId\n"),
    @NamedQuery(name = "Respuesta.countForFindByRespuesta", query = "SELECT COUNT(r)\nFROM Respuesta r\nWHERE r.respuesta= :respuesta\n"),
    @NamedQuery(name = "Respuesta.countForFindByFechaRespuesta", query = "SELECT COUNT(r)\nFROM Respuesta r\nWHERE r.fechaRespuesta= :fechaRespuesta\n"),
    @NamedQuery(name = "Respuesta.countForFind", query = "SELECT COUNT(r)\nFROM Respuesta r\n")
})
public class Respuesta implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "CONSULTAID", nullable = false)
    private Long consultaId;
    @Column(name = "RESPUESTA", nullable = false, length = 255)
    private String respuesta;
    @Column(name = "FECHARESPUESTA", nullable = false, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.OffsetDateTimeConverter.class)
    private OffsetDateTime fechaRespuesta;

    public Respuesta() {
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

    public void setConsultaId(Long consultaId) {
        this.consultaId = consultaId;
    }

    public Long getConsultaId() {
        return consultaId;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setFechaRespuesta(OffsetDateTime fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public OffsetDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

}
