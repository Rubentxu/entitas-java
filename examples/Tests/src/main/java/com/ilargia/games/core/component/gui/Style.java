package com.ilargia.games.core.component.gui;

import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.entitas.codeGenerator.Component;


@Component(pools = {"Gui"})
public class Style implements IComponent {
    public String name;

    public Style(String styleName) {
        this.name = name;
    }

}