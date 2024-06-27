
package com.company.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface RespuestaDAO
    extends BusinessObjectDAO
{


    public Respuesta findByPersistenceId(Long persistenceId);

    public List<Respuesta> findById(Long id, int startIndex, int maxResults);

    public List<Respuesta> findByConsultaId(Long consultaId, int startIndex, int maxResults);

    public List<Respuesta> findByRespuesta(String respuesta, int startIndex, int maxResults);

    public List<Respuesta> findByFechaRespuesta(OffsetDateTime fechaRespuesta, int startIndex, int maxResults);

    public List<Respuesta> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFindByConsultaId(Long consultaId);

    public Long countForFindByRespuesta(String respuesta);

    public Long countForFindByFechaRespuesta(OffsetDateTime fechaRespuesta);

    public Long countForFind();

    public Respuesta newInstance(Long id, Long consultaId, String respuesta, OffsetDateTime fechaRespuesta);

}
