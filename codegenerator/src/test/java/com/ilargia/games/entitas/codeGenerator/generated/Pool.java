package com.ilargia.games.entitas.codeGenerator.generated;

import com.ilargia.games.entitas.api.ContextInfo;
import com.ilargia.games.entitas.api.FactoryEntity;
import com.ilargia.games.entitas.api.EntitasException;
import com.ilargia.games.entitas.codeGenerator.components.Ball;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Context extends com.ilargia.games.entitas.Context<Entity, Context> {

	public Context(int totalComponents, int startCreationIndex,
				ContextInfo metaData, FactoryEntity<Entity> factoryMethod,
				EventBus<Entity> bus) {
		super(totalComponents, startCreationIndex, metaData, bus, factoryMethod);
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
					"You should check if the Context already has a BallEntity before setting it or use Context.ReplaceBall().");
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

	public Context removeBall() {
		destroyEntity(getBallEntity());
		return this;
	}
}