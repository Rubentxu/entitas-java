package com.ilargia.games.egdx.logicbricks.gen.sensor;

import com.ilargia.games.entitas.api.*;
import com.ilargia.games.entitas.Entity;
import java.util.Stack;
import com.ilargia.games.egdx.logicbricks.component.sensor.AlwaysSensor;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.egdx.logicbricks.component.sensor.CollisionSensor;
import com.badlogic.gdx.physics.box2d.Contact;
import com.ilargia.games.entitas.api.IEntity;
import com.ilargia.games.entitas.factories.EntitasCollections;
import java.util.Set;
import com.ilargia.games.egdx.logicbricks.component.sensor.DelaySensor;
import com.ilargia.games.egdx.logicbricks.component.sensor.Frequency;
import com.ilargia.games.egdx.logicbricks.component.sensor.Link;
import com.ilargia.games.egdx.logicbricks.component.sensor.Mode;
import com.ilargia.games.egdx.logicbricks.component.sensor.MouseWheelSensor;
import com.badlogic.gdx.math.Vector2;
import com.ilargia.games.egdx.logicbricks.component.sensor.NearSensor;
import com.ilargia.games.egdx.logicbricks.component.sensor.PointerOverSensor;
import com.ilargia.games.egdx.logicbricks.component.sensor.RadarSensor;
import com.ilargia.games.egdx.logicbricks.data.Axis2D;
import com.ilargia.games.egdx.logicbricks.component.sensor.RaySensor;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class SensorEntity extends Entity {

	public AlwaysSensor AlwaysSensorComponent = new AlwaysSensor();

	public SensorEntity() {
	}

	public boolean isAlwaysSensor() {
		return hasComponent(SensorComponentsLookup.AlwaysSensor);
	}

	public SensorEntity setAlwaysSensor(boolean value) {
		if (value != hasComponent(SensorComponentsLookup.AlwaysSensor)) {
			if (value) {
				addComponent(SensorComponentsLookup.AlwaysSensor,
						AlwaysSensorComponent);
			} else {
				removeComponent(SensorComponentsLookup.AlwaysSensor);
			}
		}
		return this;
	}

	public CollisionSensor getCollisionSensor() {
		return (CollisionSensor) getComponent(SensorComponentsLookup.CollisionSensor);
	}

	public boolean hasCollisionSensor() {
		return hasComponent(SensorComponentsLookup.CollisionSensor);
	}

	public SensorEntity addCollisionSensor(String targetTag) {
		CollisionSensor component = (CollisionSensor) recoverComponent(SensorComponentsLookup.CollisionSensor);
		if (component == null) {
			component = new CollisionSensor(targetTag);
		} else {
			component.targetTag = targetTag;
			component.collisionSignal = false;
		}
		addComponent(SensorComponentsLookup.CollisionSensor, component);
		return this;
	}

	public SensorEntity replaceCollisionSensor(String targetTag) {
		CollisionSensor component = (CollisionSensor) recoverComponent(SensorComponentsLookup.CollisionSensor);
		if (component == null) {
			component = new CollisionSensor(targetTag);
		} else {
			component.targetTag = targetTag;
			component.collisionSignal = false;
		}
		replaceComponent(SensorComponentsLookup.CollisionSensor, component);
		return this;
	}

	public SensorEntity removeCollisionSensor() {
		removeComponent(SensorComponentsLookup.CollisionSensor);
		return this;
	}

	public DelaySensor getDelaySensor() {
		return (DelaySensor) getComponent(SensorComponentsLookup.DelaySensor);
	}

	public boolean hasDelaySensor() {
		return hasComponent(SensorComponentsLookup.DelaySensor);
	}

	public SensorEntity addDelaySensor(float delay, float duration,
			boolean repeat) {
		DelaySensor component = (DelaySensor) recoverComponent(SensorComponentsLookup.DelaySensor);
		if (component == null) {
			component = new DelaySensor(delay, duration, repeat);
		} else {
			component.delay = delay;
			component.duration = duration;
			component.repeat = repeat;
			component.time = 0;
		}
		addComponent(SensorComponentsLookup.DelaySensor, component);
		return this;
	}

	public SensorEntity replaceDelaySensor(float delay, float duration,
			boolean repeat) {
		DelaySensor component = (DelaySensor) recoverComponent(SensorComponentsLookup.DelaySensor);
		if (component == null) {
			component = new DelaySensor(delay, duration, repeat);
		} else {
			component.delay = delay;
			component.duration = duration;
			component.repeat = repeat;
			component.time = 0;
		}
		replaceComponent(SensorComponentsLookup.DelaySensor, component);
		return this;
	}

	public SensorEntity removeDelaySensor() {
		removeComponent(SensorComponentsLookup.DelaySensor);
		return this;
	}

	public Frequency getFrequency() {
		return (Frequency) getComponent(SensorComponentsLookup.Frequency);
	}

	public boolean hasFrequency() {
		return hasComponent(SensorComponentsLookup.Frequency);
	}

	public SensorEntity addFrequency(float tick) {
		Frequency component = (Frequency) recoverComponent(SensorComponentsLookup.Frequency);
		if (component == null) {
			component = new Frequency(tick);
		} else {
			component.tick = tick;
		}
		addComponent(SensorComponentsLookup.Frequency, component);
		return this;
	}

	public SensorEntity replaceFrequency(float tick) {
		Frequency component = (Frequency) recoverComponent(SensorComponentsLookup.Frequency);
		if (component == null) {
			component = new Frequency(tick);
		} else {
			component.tick = tick;
		}
		replaceComponent(SensorComponentsLookup.Frequency, component);
		return this;
	}

	public SensorEntity removeFrequency() {
		removeComponent(SensorComponentsLookup.Frequency);
		return this;
	}

	public Link getLink() {
		return (Link) getComponent(SensorComponentsLookup.Link);
	}

	public boolean hasLink() {
		return hasComponent(SensorComponentsLookup.Link);
	}

	public SensorEntity addLink(int ownerEntity, String nameReference) {
		Link component = (Link) recoverComponent(SensorComponentsLookup.Link);
		if (component == null) {
			component = new Link(ownerEntity, nameReference);
		} else {
			component.ownerEntity = ownerEntity;
			component.nameReference = nameReference;
			component.isOpen = false;
			component.isChanged = false;
			component.pulse = false;
		}
		addComponent(SensorComponentsLookup.Link, component);
		return this;
	}

	public SensorEntity replaceLink(int ownerEntity, String nameReference) {
		Link component = (Link) recoverComponent(SensorComponentsLookup.Link);
		if (component == null) {
			component = new Link(ownerEntity, nameReference);
		} else {
			component.ownerEntity = ownerEntity;
			component.nameReference = nameReference;
			component.isOpen = false;
			component.isChanged = false;
			component.pulse = false;
		}
		replaceComponent(SensorComponentsLookup.Link, component);
		return this;
	}

	public SensorEntity removeLink() {
		removeComponent(SensorComponentsLookup.Link);
		return this;
	}

	public Mode getMode() {
		return (Mode) getComponent(SensorComponentsLookup.Mode);
	}

	public boolean hasMode() {
		return hasComponent(SensorComponentsLookup.Mode);
	}

	public SensorEntity addMode(boolean type) {
		Mode component = (Mode) recoverComponent(SensorComponentsLookup.Mode);
		if (component == null) {
			component = new Mode();
		}
		component.type = type;
		addComponent(SensorComponentsLookup.Mode, component);
		return this;
	}

	public SensorEntity replaceMode(boolean type) {
		Mode component = (Mode) recoverComponent(SensorComponentsLookup.Mode);
		if (component == null) {
			component = new Mode();
		}
		component.type = type;
		replaceComponent(SensorComponentsLookup.Mode, component);
		return this;
	}

	public SensorEntity removeMode() {
		removeComponent(SensorComponentsLookup.Mode);
		return this;
	}

	public MouseWheelSensor getMouseWheelSensor() {
		return (MouseWheelSensor) getComponent(SensorComponentsLookup.MouseWheelSensor);
	}

	public boolean hasMouseWheelSensor() {
		return hasComponent(SensorComponentsLookup.MouseWheelSensor);
	}

	public SensorEntity addMouseWheelSensor(int amountScroll,
			boolean scrollSignal) {
		MouseWheelSensor component = (MouseWheelSensor) recoverComponent(SensorComponentsLookup.MouseWheelSensor);
		if (component == null) {
			component = new MouseWheelSensor();
		}
		component.amountScroll = amountScroll;
		component.scrollSignal = scrollSignal;
		addComponent(SensorComponentsLookup.MouseWheelSensor, component);
		return this;
	}

	public SensorEntity replaceMouseWheelSensor(int amountScroll,
			boolean scrollSignal) {
		MouseWheelSensor component = (MouseWheelSensor) recoverComponent(SensorComponentsLookup.MouseWheelSensor);
		if (component == null) {
			component = new MouseWheelSensor();
		}
		component.amountScroll = amountScroll;
		component.scrollSignal = scrollSignal;
		replaceComponent(SensorComponentsLookup.MouseWheelSensor, component);
		return this;
	}

	public SensorEntity removeMouseWheelSensor() {
		removeComponent(SensorComponentsLookup.MouseWheelSensor);
		return this;
	}

	public NearSensor getNearSensor() {
		return (NearSensor) getComponent(SensorComponentsLookup.NearSensor);
	}

	public boolean hasNearSensor() {
		return hasComponent(SensorComponentsLookup.NearSensor);
	}

	public SensorEntity addNearSensor(String targetTag, float distance,
			float resetDistance) {
		NearSensor component = (NearSensor) recoverComponent(SensorComponentsLookup.NearSensor);
		if (component == null) {
			component = new NearSensor(targetTag, distance, resetDistance);
		} else {
			component.targetTag = targetTag;
			component.distance = distance;
			component.resetDistance = resetDistance;
			component.distanceContactList = EntitasCollections
					.createSet(Integer.class);
			component.resetDistanceContactList = EntitasCollections
					.createSet(Integer.class);
		}
		addComponent(SensorComponentsLookup.NearSensor, component);
		return this;
	}

	public SensorEntity replaceNearSensor(String targetTag, float distance,
			float resetDistance) {
		NearSensor component = (NearSensor) recoverComponent(SensorComponentsLookup.NearSensor);
		if (component == null) {
			component = new NearSensor(targetTag, distance, resetDistance);
		} else {
			component.targetTag = targetTag;
			component.distance = distance;
			component.resetDistance = resetDistance;
			component.distanceContactList = EntitasCollections
					.createSet(Integer.class);
			component.resetDistanceContactList = EntitasCollections
					.createSet(Integer.class);
		}
		replaceComponent(SensorComponentsLookup.NearSensor, component);
		return this;
	}

	public SensorEntity removeNearSensor() {
		removeComponent(SensorComponentsLookup.NearSensor);
		return this;
	}

	public PointerOverSensor getPointerOverSensor() {
		return (PointerOverSensor) getComponent(SensorComponentsLookup.PointerOverSensor);
	}

	public boolean hasPointerOverSensor() {
		return hasComponent(SensorComponentsLookup.PointerOverSensor);
	}

	public SensorEntity addPointerOverSensor(int pointer, String targetTag) {
		PointerOverSensor component = (PointerOverSensor) recoverComponent(SensorComponentsLookup.PointerOverSensor);
		if (component == null) {
			component = new PointerOverSensor(pointer, targetTag);
		} else {
			component.targetTag = targetTag;
		}
		addComponent(SensorComponentsLookup.PointerOverSensor, component);
		return this;
	}

	public SensorEntity replacePointerOverSensor(int pointer, String targetTag) {
		PointerOverSensor component = (PointerOverSensor) recoverComponent(SensorComponentsLookup.PointerOverSensor);
		if (component == null) {
			component = new PointerOverSensor(pointer, targetTag);
		} else {
			component.targetTag = targetTag;
		}
		replaceComponent(SensorComponentsLookup.PointerOverSensor, component);
		return this;
	}

	public SensorEntity removePointerOverSensor() {
		removeComponent(SensorComponentsLookup.PointerOverSensor);
		return this;
	}

	public RadarSensor getRadarSensor() {
		return (RadarSensor) getComponent(SensorComponentsLookup.RadarSensor);
	}

	public boolean hasRadarSensor() {
		return hasComponent(SensorComponentsLookup.RadarSensor);
	}

	public SensorEntity addRadarSensor(String targetTag, Axis2D axis2D,
			float distance, float angle) {
		RadarSensor component = (RadarSensor) recoverComponent(SensorComponentsLookup.RadarSensor);
		if (component == null) {
			component = new RadarSensor(targetTag, axis2D, distance, angle);
		} else {
			component.targetTag = targetTag;
			component.axis2D = axis2D;
			component.distance = distance;
			component.angle = angle;
			component.collisionSignal = false;
		}
		addComponent(SensorComponentsLookup.RadarSensor, component);
		return this;
	}

	public SensorEntity replaceRadarSensor(String targetTag, Axis2D axis2D,
			float distance, float angle) {
		RadarSensor component = (RadarSensor) recoverComponent(SensorComponentsLookup.RadarSensor);
		if (component == null) {
			component = new RadarSensor(targetTag, axis2D, distance, angle);
		} else {
			component.targetTag = targetTag;
			component.axis2D = axis2D;
			component.distance = distance;
			component.angle = angle;
			component.collisionSignal = false;
		}
		replaceComponent(SensorComponentsLookup.RadarSensor, component);
		return this;
	}

	public SensorEntity removeRadarSensor() {
		removeComponent(SensorComponentsLookup.RadarSensor);
		return this;
	}

	public RaySensor getRaySensor() {
		return (RaySensor) getComponent(SensorComponentsLookup.RaySensor);
	}

	public boolean hasRaySensor() {
		return hasComponent(SensorComponentsLookup.RaySensor);
	}

	public SensorEntity addRaySensor(String targetTag, Axis2D axis2D,
			float range, boolean xRayMode) {
		RaySensor component = (RaySensor) recoverComponent(SensorComponentsLookup.RaySensor);
		if (component == null) {
			component = new RaySensor(targetTag, axis2D, range, xRayMode);
		} else {
			component.targetTag = targetTag;
			component.axis2D = axis2D;
			component.range = range;
			component.xRayMode = xRayMode;
			component.collisionSignal = false;
			component.rayContactList = EntitasCollections
					.createSet(Integer.class);
		}
		addComponent(SensorComponentsLookup.RaySensor, component);
		return this;
	}

	public SensorEntity replaceRaySensor(String targetTag, Axis2D axis2D,
			float range, boolean xRayMode) {
		RaySensor component = (RaySensor) recoverComponent(SensorComponentsLookup.RaySensor);
		if (component == null) {
			component = new RaySensor(targetTag, axis2D, range, xRayMode);
		} else {
			component.targetTag = targetTag;
			component.axis2D = axis2D;
			component.range = range;
			component.xRayMode = xRayMode;
			component.collisionSignal = false;
			component.rayContactList = EntitasCollections
					.createSet(Integer.class);
		}
		replaceComponent(SensorComponentsLookup.RaySensor, component);
		return this;
	}

	public SensorEntity removeRaySensor() {
		removeComponent(SensorComponentsLookup.RaySensor);
		return this;
	}
}