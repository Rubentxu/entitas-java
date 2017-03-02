package com.ilargia.games.core.gen.scene;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.ilargia.games.entitas.api.ContextInfo;
import com.ilargia.games.entitas.api.EntitasException;
import com.ilargia.games.entitas.api.EntityBaseFactory;
import com.ilargia.games.states.game.component.scene.Background;
import com.ilargia.games.states.game.component.scene.Camera;
import com.ilargia.games.states.game.component.scene.GameWorld;
import com.ilargia.games.states.game.component.scene.Tiled;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class SceneContext
		extends
			com.ilargia.games.entitas.Context<SceneEntity> {

	public SceneContext(int totalComponents, int startCreationIndex,
			ContextInfo contextInfo,
			EntityBaseFactory<SceneEntity> factoryMethod) {
		super(totalComponents, startCreationIndex, contextInfo, factoryMethod);
	}

	public SceneEntity getBackgroundEntity() {
		return getGroup(SceneMatcher.Background()).getSingleEntity();
	}

	public Background getBackground() {
		return getBackgroundEntity().getBackground();
	}

	public boolean hasBackground() {
		return getBackgroundEntity() != null;
	}

	public SceneEntity setBackground(Texture front, Texture middle, Texture back) {
		if (hasBackground()) {
			throw new EntitasException(
					"Could not set Background!" + this
							+ " already has an entity with Background!",
					"You should check if the context already has a BackgroundEntity before setting it or use context.ReplaceBackground().");
		}
		SceneEntity entity = createEntity();
		entity.addBackground(front, middle, back);
		return entity;
	}

	public SceneEntity replaceBackground(Texture front, Texture middle,
                                         Texture back) {
		SceneEntity entity = getBackgroundEntity();
		if (entity == null) {
			entity = setBackground(front, middle, back);
		} else {
			entity.replaceBackground(front, middle, back);
		}
		return entity;
	}

	public SceneContext removeBackground() {
		destroyEntity(getBackgroundEntity());
		return this;
	}

	public SceneEntity getCameraEntity() {
		return getGroup(SceneMatcher.Camera()).getSingleEntity();
	}

	public Camera getCamera() {
		return getCameraEntity().getCamera();
	}

	public boolean hasCamera() {
		return getCameraEntity() != null;
	}

	public SceneEntity setCamera(OrthographicCamera camera) {
		if (hasCamera()) {
			throw new EntitasException(
					"Could not set Camera!" + this
							+ " already has an entity with Camera!",
					"You should check if the context already has a CameraEntity before setting it or use context.ReplaceCamera().");
		}
		SceneEntity entity = createEntity();
		entity.addCamera(camera);
		return entity;
	}

	public SceneEntity replaceCamera(OrthographicCamera camera) {
		SceneEntity entity = getCameraEntity();
		if (entity == null) {
			entity = setCamera(camera);
		} else {
			entity.replaceCamera(camera);
		}
		return entity;
	}

	public SceneContext removeCamera() {
		destroyEntity(getCameraEntity());
		return this;
	}

	public SceneEntity getGameWorldEntity() {
		return getGroup(SceneMatcher.GameWorld()).getSingleEntity();
	}

	public GameWorld getGameWorld() {
		return getGameWorldEntity().getGameWorld();
	}

	public boolean hasGameWorld() {
		return getGameWorldEntity() != null;
	}

	public SceneEntity setGameWorld(float width, float height,
                                    float metresToPixels, float pixelsToMetres, boolean catchBack,
                                    boolean catchMenu, Color backGroundColor) {
		if (hasGameWorld()) {
			throw new EntitasException(
					"Could not set GameWorld!" + this
							+ " already has an entity with GameWorld!",
					"You should check if the context already has a GameWorldEntity before setting it or use context.ReplaceGameWorld().");
		}
		SceneEntity entity = createEntity();
		entity.addGameWorld(width, height, metresToPixels, pixelsToMetres,
				catchBack, catchMenu, backGroundColor);
		return entity;
	}

	public SceneEntity replaceGameWorld(float width, float height,
                                        float metresToPixels, float pixelsToMetres, boolean catchBack,
                                        boolean catchMenu, Color backGroundColor) {
		SceneEntity entity = getGameWorldEntity();
		if (entity == null) {
			entity = setGameWorld(width, height, metresToPixels,
					pixelsToMetres, catchBack, catchMenu, backGroundColor);
		} else {
			entity.replaceGameWorld(width, height, metresToPixels,
					pixelsToMetres, catchBack, catchMenu, backGroundColor);
		}
		return entity;
	}

	public SceneContext removeGameWorld() {
		destroyEntity(getGameWorldEntity());
		return this;
	}

	public SceneEntity getTiledEntity() {
		return getGroup(SceneMatcher.Tiled()).getSingleEntity();
	}

	public Tiled getTiled() {
		return getTiledEntity().getTiled();
	}

	public boolean hasTiled() {
		return getTiledEntity() != null;
	}

	public SceneEntity setTiled(String tileMapName, float unitScale) {
		if (hasTiled()) {
			throw new EntitasException(
					"Could not set Tiled!" + this
							+ " already has an entity with Tiled!",
					"You should check if the context already has a TiledEntity before setting it or use context.ReplaceTiled().");
		}
		SceneEntity entity = createEntity();
		entity.addTiled(tileMapName, unitScale);
		return entity;
	}

	public SceneEntity replaceTiled(String tileMapName, float unitScale) {
		SceneEntity entity = getTiledEntity();
		if (entity == null) {
			entity = setTiled(tileMapName, unitScale);
		} else {
			entity.replaceTiled(tileMapName, unitScale);
		}
		return entity;
	}

	public SceneContext removeTiled() {
		destroyEntity(getTiledEntity());
		return this;
	}
}