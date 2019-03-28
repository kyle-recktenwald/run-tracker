package com.krecktenwald.app.model.pom;

import java.io.Serializable;

public interface Persistable<ID extends Serializable & Comparable<ID>> extends
        Serializable {

    public ID getId();

    public void setId(ID id);
}
