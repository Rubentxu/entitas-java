package com.ilargia.games.core;

import com.ilargia.games.entitas.EntityMetaData;
import com.ilargia.games.entitas.interfaces.FactoryEntity;
import com.ilargia.games.entitas.exceptions.EntitasException;
import com.ilargia.games.components.Ball;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp. Changes to
 * this file may cause incorrect behavior and will be lost.
 * 
 * ---------------------------------------------------------------------------
 */
public class Pool extends com.ilargia.games.entitas.BasePool<Entity> {

	public Pool(int totalComponents, int startCreationIndex,
			EntityMetaData metaData, FactoryEntity<Entity> factoryMethod) {
		super(totalComponents, startCreationIndex, metaData, factoryMethod);
	}

	public Entity getBallEntity() {
		return getGroup(CoreMatcher.Ball()).getSingleEntity();
	}

	public Ball getBall() {
		return getBallEntity().getBall();
	}

	public boolean hasBall() {
		return getBallEntity() != null;
	}

	public Entity setBall(boolean resetBall) {
		if (hasBall()) {
			throw new EntitasException(
					"Could not set Ball!" + this
							+ " already has an entity with Ball!",
					"You should check if the pool already has a BallEntity before setting it or use pool.ReplaceBall().");
		}
		Entity entity = createEntity();
		entity.addBall(resetBall);
		return entity;
	}

	public Entity replaceBall(boolean resetBall) {
		Entity entity = getBallEntity();
		if (entity == null) {
			entity = setBall(resetBall);
		} else {
			entity.replaceBall(resetBall);
		}
		return entity;
	}

	public void removeBall() {
		destroyEntity(getBallEntity());
	}
}