package com.ilargia.games.core;

import com.ilargia.games.entitas.api.*;
import com.ilargia.games.entitas.Entity;
import java.util.Stack;
import com.ilargia.games.components.Ball;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.components.Delay;
import com.ilargia.games.components.Motion;
import com.badlogic.gdx.math.Vector2;
import com.ilargia.games.components.Player.ID;
import com.ilargia.games.components.Player;
import com.ilargia.games.components.Score;
import com.ilargia.games.components.TextureView;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.ilargia.games.components.View;
import com.badlogic.gdx.math.Shape2D;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class CoreEntity extends Entity {

	public CoreEntity() {
	}

	public Ball getBall() {
		return (Ball) getComponent(CoreComponentsLookup.Ball);
	}

	public boolean hasBall() {
		return hasComponent(CoreComponentsLookup.Ball);
	}

	public CoreEntity addBall(boolean resetBall) {
		Ball component = (Ball) recoverComponent(CoreComponentsLookup.Ball);
		if (component == null) {
			component = new Ball();
		}
		component.resetBall = resetBall;
		addComponent(CoreComponentsLookup.Ball, component);
		return this;
	}

	public CoreEntity replaceBall(boolean resetBall) {
		Ball component = (Ball) recoverComponent(CoreComponentsLookup.Ball);
		if (component == null) {
			component = new Ball();
		}
		component.resetBall = resetBall;
		replaceComponent(CoreComponentsLookup.Ball, component);
		return this;
	}

	public CoreEntity removeBall() {
		removeComponent(CoreComponentsLookup.Ball);
		return this;
	}

	public Delay getDelay() {
		return (Delay) getComponent(CoreComponentsLookup.Delay);
	}

	public boolean hasDelay() {
		return hasComponent(CoreComponentsLookup.Delay);
	}

	public CoreEntity addDelay(float duration) {
		Delay component = (Delay) recoverComponent(CoreComponentsLookup.Delay);
		if (component == null) {
			component = new Delay(duration);
		} else {
			component.duration = duration;;
			component.time = 0;
		}
		addComponent(CoreComponentsLookup.Delay, component);
		return this;
	}

	public CoreEntity replaceDelay(float duration) {
		Delay component = (Delay) recoverComponent(CoreComponentsLookup.Delay);
		if (component == null) {
			component = new Delay(duration);
		} else {
			component.duration = duration;;
			component.time = 0;
		}
		replaceComponent(CoreComponentsLookup.Delay, component);
		return this;
	}

	public CoreEntity removeDelay() {
		removeComponent(CoreComponentsLookup.Delay);
		return this;
	}

	public Motion getMotion() {
		return (Motion) getComponent(CoreComponentsLookup.Motion);
	}

	public boolean hasMotion() {
		return hasComponent(CoreComponentsLookup.Motion);
	}

	public CoreEntity addMotion(float x, float y) {
		Motion component = (Motion) recoverComponent(CoreComponentsLookup.Motion);
		if (component == null) {
			component = new Motion(x, y);
		} else {
			component.velocity = new Vector2(x, y);
		}
		addComponent(CoreComponentsLookup.Motion, component);
		return this;
	}

	public CoreEntity replaceMotion(float x, float y) {
		Motion component = (Motion) recoverComponent(CoreComponentsLookup.Motion);
		if (component == null) {
			component = new Motion(x, y);
		} else {
			component.velocity = new Vector2(x, y);
		}
		replaceComponent(CoreComponentsLookup.Motion, component);
		return this;
	}

	public CoreEntity removeMotion() {
		removeComponent(CoreComponentsLookup.Motion);
		return this;
	}

	public Player getPlayer() {
		return (Player) getComponent(CoreComponentsLookup.Player);
	}

	public boolean hasPlayer() {
		return hasComponent(CoreComponentsLookup.Player);
	}

	public CoreEntity addPlayer(ID id) {
		Player component = (Player) recoverComponent(CoreComponentsLookup.Player);
		if (component == null) {
			component = new Player();
		}
		component.id = id;
		addComponent(CoreComponentsLookup.Player, component);
		return this;
	}

	public CoreEntity replacePlayer(ID id) {
		Player component = (Player) recoverComponent(CoreComponentsLookup.Player);
		if (component == null) {
			component = new Player();
		}
		component.id = id;
		replaceComponent(CoreComponentsLookup.Player, component);
		return this;
	}

	public CoreEntity removePlayer() {
		removeComponent(CoreComponentsLookup.Player);
		return this;
	}

	public Score getScore() {
		return (Score) getComponent(CoreComponentsLookup.Score);
	}

	public boolean hasScore() {
		return hasComponent(CoreComponentsLookup.Score);
	}

	public CoreEntity addScore(String text, int x, int y) {
		Score component = (Score) recoverComponent(CoreComponentsLookup.Score);
		if (component == null) {
			component = new Score(text, x, y);
		} else {
			component.text = text;;
			component.x = x;;
			component.y = y;;
			component.points = 0;
		}
		addComponent(CoreComponentsLookup.Score, component);
		return this;
	}

	public CoreEntity replaceScore(String text, int x, int y) {
		Score component = (Score) recoverComponent(CoreComponentsLookup.Score);
		if (component == null) {
			component = new Score(text, x, y);
		} else {
			component.text = text;;
			component.x = x;;
			component.y = y;;
			component.points = 0;
		}
		replaceComponent(CoreComponentsLookup.Score, component);
		return this;
	}

	public CoreEntity removeScore() {
		removeComponent(CoreComponentsLookup.Score);
		return this;
	}

	public TextureView getTextureView() {
		return (TextureView) getComponent(CoreComponentsLookup.TextureView);
	}

	public boolean hasTextureView() {
		return hasComponent(CoreComponentsLookup.TextureView);
	}

	public CoreEntity addTextureView(String name, TextureRegion texture,
			Vector2 position, float rotation, int height, int width) {
		TextureView component = (TextureView) recoverComponent(CoreComponentsLookup.TextureView);
		if (component == null) {
			component = new TextureView(name, texture, position, rotation,
					height, width);
		} else {
			component.name = name;;
			component.texture = texture;;
			component.position = position;;
			component.rotation = rotation;;
			component.height = height;;
			component.width = width;
		}
		addComponent(CoreComponentsLookup.TextureView, component);
		return this;
	}

	public CoreEntity replaceTextureView(String name, TextureRegion texture,
			Vector2 position, float rotation, int height, int width) {
		TextureView component = (TextureView) recoverComponent(CoreComponentsLookup.TextureView);
		if (component == null) {
			component = new TextureView(name, texture, position, rotation,
					height, width);
		} else {
			component.name = name;;
			component.texture = texture;;
			component.position = position;;
			component.rotation = rotation;;
			component.height = height;;
			component.width = width;
		}
		replaceComponent(CoreComponentsLookup.TextureView, component);
		return this;
	}

	public CoreEntity removeTextureView() {
		removeComponent(CoreComponentsLookup.TextureView);
		return this;
	}

	public View getView() {
		return (View) getComponent(CoreComponentsLookup.View);
	}

	public boolean hasView() {
		return hasComponent(CoreComponentsLookup.View);
	}

	public CoreEntity addView(Shape2D shape) {
		View component = (View) recoverComponent(CoreComponentsLookup.View);
		if (component == null) {
			component = new View(shape);
		} else {
			component.shape = shape;
		}
		addComponent(CoreComponentsLookup.View, component);
		return this;
	}

	public CoreEntity replaceView(Shape2D shape) {
		View component = (View) recoverComponent(CoreComponentsLookup.View);
		if (component == null) {
			component = new View(shape);
		} else {
			component.shape = shape;
		}
		replaceComponent(CoreComponentsLookup.View, component);
		return this;
	}

	public CoreEntity removeView() {
		removeComponent(CoreComponentsLookup.View);
		return this;
	}
}