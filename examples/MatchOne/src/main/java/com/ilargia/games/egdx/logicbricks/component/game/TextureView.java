package com.ilargia.games.egdx.logicbricks.component.game;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.entitas.Component;

@Component(pools = {"Game"})
public class TextureView implements IComponent {
    public Body body;
    public String name;
    public TextureRegion texture;

    public TextureView(String name, TextureRegion texture, Body body) {
        this.name = name;
        this.texture = texture;
        this.body = body;

    }
}
