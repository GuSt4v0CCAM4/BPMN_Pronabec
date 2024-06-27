
package com.company.model;

import java.time.OffsetDateTime;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface BoletinDAO
    extends BusinessObjectDAO
{


    public Boletin findByPersistenceId(Long persistenceId);

    public List<Boletin> findById(Long id, int startIndex, int maxResults);

    public List<Boletin> findByTitulo(String titulo, int startIndex, int maxResults);

    public List<Boletin> findByContenido(String contenido, int startIndex, int maxResults);

    public List<Boletin> findByAprobado(Boolean aprobado, int startIndex, int maxResults);

    public List<Boletin> findByFechaPublicacion(OffsetDateTime fechaPublicacion, int startIndex, int maxResults);

    public List<Boletin> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFindByTitulo(String titulo);

    public Long countForFindByContenido(String contenido);

    public Long countForFindByAprobado(Boolean aprobado);

    public Long countForFindByFechaPublicacion(OffsetDateTime fechaPublicacion);

    public Long countForFind();

    public Boletin newInstance(Long id, String titulo, String contenido, OffsetDateTime fechaPublicacion);

}
