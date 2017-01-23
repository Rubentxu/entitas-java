package com.ilargia.games.egdx.base.interfaces;


import com.ilargia.games.entitas.BaseContext;
import com.ilargia.games.entitas.Entity;
import com.ilargia.games.entitas.events.EventBus;
import com.ilargia.games.entitas.api.FactoryEntity;

public interface Entitas<E extends Entity> {

    public BaseContext[] allPools();

    public FactoryEntity<E> factoryEntity();

    public EventBus<E> getEventBus();

}
