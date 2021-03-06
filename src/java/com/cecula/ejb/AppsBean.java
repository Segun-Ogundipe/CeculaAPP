package com.cecula.ejb;

import com.cecula.entity.Apps;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Segun Ogundipe <segun.ogundipe at cecula.com>
 */
@Stateless
public class AppsBean extends AbstractBean<Apps> {

    @PersistenceContext(unitName = "CeculaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppsBean() {
        super(Apps.class);
    }
    
}
