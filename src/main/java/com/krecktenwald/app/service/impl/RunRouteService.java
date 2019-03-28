
package com.krecktenwald.app.service.impl;

import com.krecktenwald.app.dao.IRunRouteDao;
import com.krecktenwald.app.dao.common.IOperations;
import com.krecktenwald.app.model.RunRoute;
import com.krecktenwald.app.service.IRunRouteService;
import com.krecktenwald.app.service.common.AbstractHibernateService;
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