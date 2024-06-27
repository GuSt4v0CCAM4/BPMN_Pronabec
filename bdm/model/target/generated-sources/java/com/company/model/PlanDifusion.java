
package com.company.model;

import javax.persistence.Column;
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
@javax.persistence.Entity(name = "PlanDifusion")
@Table(name = "PLANDIFUSION")
@NamedQueries({
    @NamedQuery(name = "PlanDifusion.findByPersistenceId", query = "SELECT p\nFROM PlanDifusion p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "PlanDifusion.findById", query = "SELECT p\nFROM PlanDifusion p\nWHERE p.id= :id\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PlanDifusion.findByMedios", query = "SELECT p\nFROM PlanDifusion p\nWHERE p.medios= :medios\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PlanDifusion.findByPresupuesto", query = "SELECT p\nFROM PlanDifusion p\nWHERE p.presupuesto= :presupuesto\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PlanDifusion.findByCronograma", query = "SELECT p\nFROM PlanDifusion p\nWHERE p.cronograma= :cronograma\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PlanDifusion.findByAprobado", query = "SELECT p\nFROM PlanDifusion p\nWHERE p.aprobado= :aprobado\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PlanDifusion.find", query = "SELECT p\nFROM PlanDifusion p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PlanDifusion.countForFindById", query = "SELECT COUNT(p)\nFROM PlanDifusion p\nWHERE p.id= :id\n"),
    @NamedQuery(name = "PlanDifusion.countForFindByMedios", query = "SELECT COUNT(p)\nFROM PlanDifusion p\nWHERE p.medios= :medios\n"),
    @NamedQuery(name = "PlanDifusion.countForFindByPresupuesto", query = "SELECT COUNT(p)\nFROM PlanDifusion p\nWHERE p.presupuesto= :presupuesto\n"),
    @NamedQuery(name = "PlanDifusion.countForFindByCronograma", query = "SELECT COUNT(p)\nFROM PlanDifusion p\nWHERE p.cronograma= :cronograma\n"),
    @NamedQuery(name = "PlanDifusion.countForFindByAprobado", query = "SELECT COUNT(p)\nFROM PlanDifusion p\nWHERE p.aprobado= :aprobado\n"),
    @NamedQuery(name = "PlanDifusion.countForFind", query = "SELECT COUNT(p)\nFROM PlanDifusion p\n")
})
public class PlanDifusion implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "MEDIOS", nullable = false)
    @Lob
    private String medios;
    @Column(name = "PRESUPUESTO", nullable = false)
    private Float presupuesto;
    @Column(name = "CRONOGRAMA", nullable = false)
    @Lob
    private String cronograma;
    @Column(name = "APROBADO", nullable = false)
    private Boolean aprobado;

    public PlanDifusion() {
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

    public void setMedios(String medios) {
        this.medios = medios;
    }

    public String getMedios() {
        return medios;
    }

    public void setPresupuesto(Float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Float getPresupuesto() {
        return presupuesto;
    }

    public void setCronograma(String cronograma) {
        this.cronograma = cronograma;
    }

    public String getCronograma() {
        return cronograma;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Boolean isAprobado() {
        return aprobado;
    }

}
