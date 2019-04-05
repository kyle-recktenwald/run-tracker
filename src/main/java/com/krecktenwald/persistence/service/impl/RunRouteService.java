
package com.krecktenwald.persistence.service.impl;

import com.krecktenwald.persistence.dao.IRunRouteDao;
import com.krecktenwald.persistence.dao.common.IOperations;
import com.krecktenwald.persistence.model.RunRoute;
import com.krecktenwald.persistence.service.IRunRouteService;
import com.krecktenwald.persistence.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RunRouteService extends AbstractHibernateService<RunRoute> implements IRunRouteService {

    @Autowired
    @Qualifier("runRouteHibernateDao")
    private IRunRouteDao dao;

    public RunRouteService() {
        super();
    }

    // API

    @Override
    protected IOperations<RunRoute> getDao() {
        return dao;
    }

}