package com.ilargia.games.entitas.interfaces.events;

import com.ilargia.games.entitas.BasePool;
import com.ilargia.games.entitas.Entity;

@FunctionalInterface
public interface PoolChanged<P extends BasePool, E extends Entity> {
    void poolChanged(final P pool, final E entity);
}
