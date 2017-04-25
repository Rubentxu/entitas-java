package com.ilargia.games.egdx.logicbricks.component.actuator;


import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.entitas.codeGenerator.Component;

@Component(pools = {"Actuator"})
public class Link implements IComponent {
    public String nameReference;
    public int ownerEntity;
    public boolean isOpen;

    public Link(int ownerEntity, String nameReference, boolean isOpen) {
        this.nameReference = nameReference;
        this.ownerEntity = ownerEntity;
        this.isOpen = isOpen;

    }

}