package com.ilargia.games.core;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Shape2D;
import com.badlogic.gdx.math.Vector2;
import com.ilargia.games.components.*;
import com.ilargia.games.components.Player.ID;
import com.ilargia.games.entitas.Entity;

import java.util.Stack;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class CoreEntity extends Entity {

    public CoreEntity(int totalComponents,
                      Stack<IComponent>[] componentContexts, ContextInfo contextInfo) {
        super(totalComponents, componentContexts, contextInfo);
    }

    public Ball getBall() {
        return (Ball) getComponent(CoreComponentIds.Ball);
    }

    public boolean hasBall() {
        return hasComponent(CoreComponentIds.Ball);
    }

    public CoreEntity addBall(boolean resetBall) {
        Ball component = (Ball) recoverComponent(CoreComponentIds.Ball);
        if (component == null) {
            component = new Ball();
        }
        component.resetBall = resetBall;
        addComponent(CoreComponentIds.Ball, component);
        return this;
    }

    public CoreEntity replaceBall(boolean resetBall) {
        Ball component = (Ball) recoverComponent(CoreComponentIds.Ball);
        if (component == null) {
            component = new Ball();
        }
        component.resetBall = resetBall;
        removeComponent(CoreComponentIds.Ball);
        return this;
    }

    public CoreEntity removeBall() {
        removeComponent(CoreComponentIds.Ball);
        return this;
    }

    public Delay getDelay() {
        return (Delay) getComponent(CoreComponentIds.Delay);
    }

    public boolean hasDelay() {
        return hasComponent(CoreComponentIds.Delay);
    }

    public CoreEntity addDelay(float duration) {
        Delay component = (Delay) recoverComponent(CoreComponentIds.Delay);
        if (component == null) {
            component = new Delay(duration);
        } else {
            component.duration = duration;
            ;
            component.time = 0;
        }
        addComponent(CoreComponentIds.Delay, component);
        return this;
    }

    public CoreEntity replaceDelay(float duration) {
        Delay component = (Delay) recoverComponent(CoreComponentIds.Delay);
        if (component == null) {
            component = new Delay(duration);
        } else {
            component.duration = duration;
            ;
            component.time = 0;
        }
        replaceComponent(CoreComponentIds.Delay, component);
        return this;
    }

    public CoreEntity removeDelay() {
        removeComponent(CoreComponentIds.Delay);
        return this;
    }

    public Motion getMotion() {
        return (Motion) getComponent(CoreComponentIds.Motion);
    }

    public boolean hasMotion() {
        return hasComponent(CoreComponentIds.Motion);
    }

    public CoreEntity addMotion(float x, float y) {
        Motion component = (Motion) recoverComponent(CoreComponentIds.Motion);
        if (component == null) {
            component = new Motion(x, y);
        } else {
            component.velocity = new Vector2(x, y);
        }
        addComponent(CoreComponentIds.Motion, component);
        return this;
    }

    public CoreEntity replaceMotion(float x, float y) {
        Motion component = (Motion) recoverComponent(CoreComponentIds.Motion);
        if (component == null) {
            component = new Motion(x, y);
        } else {
            component.velocity = new Vector2(x, y);
        }
        replaceComponent(CoreComponentIds.Motion, component);
        return this;
    }

    public CoreEntity removeMotion() {
        removeComponent(CoreComponentIds.Motion);
        return this;
    }

    public Player getPlayer() {
        return (Player) getComponent(CoreComponentIds.Player);
    }

    public boolean hasPlayer() {
        return hasComponent(CoreComponentIds.Player);
    }

    public CoreEntity addPlayer(ID id) {
        Player component = (Player) recoverComponent(CoreComponentIds.Player);
        if (component == null) {
            component = new Player();
        }
        component.id = id;
        addComponent(CoreComponentIds.Player, component);
        return this;
    }

    public CoreEntity replacePlayer(ID id) {
        Player component = (Player) recoverComponent(CoreComponentIds.Player);
        if (component == null) {
            component = new Player();
        }
        component.id = id;
        removeComponent(CoreComponentIds.Player);
        return this;
    }

    public CoreEntity removePlayer() {
        removeComponent(CoreComponentIds.Player);
        return this;
    }

    public Score getScore() {
        return (Score) getComponent(CoreComponentIds.Score);
    }

    public boolean hasScore() {
        return hasComponent(CoreComponentIds.Score);
    }

    public CoreEntity addScore(String text, int x, int y) {
        Score component = (Score) recoverComponent(CoreComponentIds.Score);
        if (component == null) {
            component = new Score(text, x, y);
        } else {
            component.text = text;
            ;
            component.x = x;
            ;
            component.y = y;
            ;
            component.points = 0;
        }
        addComponent(CoreComponentIds.Score, component);
        return this;
    }

    public CoreEntity replaceScore(String text, int x, int y) {
        Score component = (Score) recoverComponent(CoreComponentIds.Score);
        if (component == null) {
            component = new Score(text, x, y);
        } else {
            component.text = text;
            ;
            component.x = x;
            ;
            component.y = y;
            ;
            component.points = 0;
        }
        replaceComponent(CoreComponentIds.Score, component);
        return this;
    }

    public CoreEntity removeScore() {
        removeComponent(CoreComponentIds.Score);
        return this;
    }

    public TextureView getTextureView() {
        return (TextureView) getComponent(CoreComponentIds.TextureView);
    }

    public boolean hasTextureView() {
        return hasComponent(CoreComponentIds.TextureView);
    }

    public CoreEntity addTextureView(String name, TextureRegion texture,
                                     Vector2 position, float rotation, int height, int width) {
        TextureView component = (TextureView) recoverComponent(CoreComponentIds.TextureView);
        if (component == null) {
            component = new TextureView(name, texture, position, rotation,
                    height, width);
        } else {
            component.name = name;
            ;
            component.texture = texture;
            ;
            component.position = position;
            ;
            component.rotation = rotation;
            ;
            component.height = height;
            ;
            component.width = width;
        }
        addComponent(CoreComponentIds.TextureView, component);
        return this;
    }

    public CoreEntity replaceTextureView(String name, TextureRegion texture,
                                         Vector2 position, float rotation, int height, int width) {
        TextureView component = (TextureView) recoverComponent(CoreComponentIds.TextureView);
        if (component == null) {
            component = new TextureView(name, texture, position, rotation,
                    height, width);
        } else {
            component.name = name;
            ;
            component.texture = texture;
            ;
            component.position = position;
            ;
            component.rotation = rotation;
            ;
            component.height = height;
            ;
            component.width = width;
        }
        replaceComponent(CoreComponentIds.TextureView, component);
        return this;
    }

    public CoreEntity removeTextureView() {
        removeComponent(CoreComponentIds.TextureView);
        return this;
    }

    public View getView() {
        return (View) getComponent(CoreComponentIds.View);
    }

    public boolean hasView() {
        return hasComponent(CoreComponentIds.View);
    }

    public CoreEntity addView(Shape2D shape) {
        View component = (View) recoverComponent(CoreComponentIds.View);
        if (component == null) {
            component = new View(shape);
        } else {
            component.shape = shape;
        }
        addComponent(CoreComponentIds.View, component);
        return this;
    }

    public CoreEntity replaceView(Shape2D shape) {
        View component = (View) recoverComponent(CoreComponentIds.View);
        if (component == null) {
            component = new View(shape);
        } else {
            component.shape = shape;
        }
        replaceComponent(CoreComponentIds.View, component);
        return this;
    }

    public CoreEntity removeView() {
        removeComponent(CoreComponentIds.View);
        return this;
    }
}