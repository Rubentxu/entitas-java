package com.ilargia.games.core;

import com.ilargia.games.components.Score;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class GameSessionContext
        extends
        com.ilargia.games.entitas.Context<GameSessionEntity> {

    public GameSessionContext(int totalComponents, int startCreationIndex,
                              ContextInfo contextInfo,
                              FactoryEntity<GameSessionEntity> factoryMethod) {
        super(totalComponents, startCreationIndex, contextInfo, factoryMethod);
    }

    public GameSessionEntity getScoreEntity() {
        return getGroup(GamesessionMatcher.Score()).getSingleEntity();
    }

    public Score getScore() {
        return getScoreEntity().getScore();
    }

    public boolean hasScore() {
        return getScoreEntity() != null;
    }

    public GameSessionEntity setScore(int value) {
        if (hasScore()) {
            throw new EntitasException(
                    "Could not set Score!" + this
                            + " already has an entity with Score!",
                    "You should check if the context already has a ScoreEntity before setting it or use context.ReplaceScore().");
        }
        GameSessionEntity entity = createEntity();
        entity.addScore(value);
        return entity;
    }

    public GameSessionEntity replaceScore(int value) {
        GameSessionEntity entity = getScoreEntity();
        if (entity == null) {
            entity = setScore(value);
        } else {
            entity.replaceScore(value);
        }
        return entity;
    }

    public GameSessionContext removeScore() {
        destroyEntity(getScoreEntity());
        return this;
    }
}