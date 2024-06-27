
package com.company.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface MaterialDifusionDAO
    extends BusinessObjectDAO
{


    public MaterialDifusion findByPersistenceId(Long persistenceId);

    public List<MaterialDifusion> findById(Long id, int startIndex, int maxResults);

    public List<MaterialDifusion> findByTitulo(String titulo, int startIndex, int maxResults);

    public List<MaterialDifusion> findByContenido(String contenido, int startIndex, int maxResults);

    public List<MaterialDifusion> findByFechaCreacion(OffsetDateTime fechaCreacion, int startIndex, int maxResults);

    public List<MaterialDifusion> findByFechaModificacion(OffsetDateTime fechaModificacion, int startIndex, int maxResults);

    public List<MaterialDifusion> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFindByTitulo(String titulo);

    public Long countForFindByContenido(String contenido);

    public Long countForFindByFechaCreacion(OffsetDateTime fechaCreacion);

    public Long countForFindByFechaModificacion(OffsetDateTime fechaModificacion);

    public Long countForFind();

    public MaterialDifusion newInstance(Long id, String titulo, String contenido, OffsetDateTime fechaCreacion);

}
