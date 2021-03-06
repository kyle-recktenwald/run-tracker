package com.krecktenwald.persistence.service.common;

import com.google.common.collect.Lists;
import com.krecktenwald.persistence.dao.common.IOperations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

import java.io.Serializable;
import java.util.List;

@Transactional(value = "jpaTransactionManager")
public abstract class AbstractSpringDataJpaService<T extends Serializable> implements IOperations<T> {

    @Override
    public T findOne(final long id) {

        Optional<T> optionalEntity = getDao().findById(id);
        T entity = optionalEntity.get();

        return entity;
    }

    @Override
    public List<T> findAll() {
        return Lists.newArrayList(getDao().findAll());
    }

    @Override
    public void create(final T entity) {
        getDao().save(entity);
    }

    @Override
    public T update(final T entity) {
        return getDao().save(entity);
    }

    @Override
    public void delete(final T entity) {
        getDao().delete(entity);
    }

    @Override
    public void deleteById(final long entityId) {
        T genericEntity = (T)Long.valueOf(entityId);
        getDao().delete(genericEntity);
    }

    protected abstract CrudRepository<T, Serializable> getDao();
}
