
package com.company.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface ConsultaDAO
    extends BusinessObjectDAO
{


    public Consulta findByPersistenceId(Long persistenceId);

    public List<Consulta> findById(Long id, int startIndex, int maxResults);

    public List<Consulta> findByNombreSolicitante(String nombreSolicitante, int startIndex, int maxResults);

    public List<Consulta> findByDni(Integer dni, int startIndex, int maxResults);

    public List<Consulta> findByDetalle(String detalle, int startIndex, int maxResults);

    public List<Consulta> findByFechaConsulta(OffsetDateTime fechaConsulta, int startIndex, int maxResults);

    public List<Consulta> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFindByNombreSolicitante(String nombreSolicitante);

    public Long countForFindByDni(Integer dni);

    public Long countForFindByDetalle(String detalle);

    public Long countForFindByFechaConsulta(OffsetDateTime fechaConsulta);

    public Long countForFind();

    public Consulta newInstance(Long id, String nombreSolicitante, Integer dni, String detalle, OffsetDateTime fechaConsulta);

}
