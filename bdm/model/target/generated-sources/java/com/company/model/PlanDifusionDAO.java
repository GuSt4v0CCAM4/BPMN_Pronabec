
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface PlanDifusionDAO
    extends BusinessObjectDAO
{


    public PlanDifusion findByPersistenceId(Long persistenceId);

    public List<PlanDifusion> findById(Long id, int startIndex, int maxResults);

    public List<PlanDifusion> findByMedios(String medios, int startIndex, int maxResults);

    public List<PlanDifusion> findByPresupuesto(Float presupuesto, int startIndex, int maxResults);

    public List<PlanDifusion> findByCronograma(String cronograma, int startIndex, int maxResults);

    public List<PlanDifusion> findByAprobado(Boolean aprobado, int startIndex, int maxResults);

    public List<PlanDifusion> find(int startIndex, int maxResults);

    public Long countForFindById(Long id);

    public Long countForFindByMedios(String medios);

    public Long countForFindByPresupuesto(Float presupuesto);

    public Long countForFindByCronograma(String cronograma);

    public Long countForFindByAprobado(Boolean aprobado);

    public Long countForFind();

    public PlanDifusion newInstance(Long id, String medios, Float presupuesto, String cronograma, Boolean aprobado);

}
