package com.ilargia.games.egdx.logicbricks.gen.actuator;

import com.ilargia.games.egdx.logicbricks.component.actuator.CameraActuator;
import com.ilargia.games.egdx.logicbricks.component.actuator.DragActuator;
import com.ilargia.games.egdx.logicbricks.component.actuator.Link;
import com.ilargia.games.egdx.logicbricks.component.actuator.ParticleEffectActuator;
import com.ilargia.games.egdx.logicbricks.component.actuator.RadialGravityActuator;
import com.ilargia.games.egdx.logicbricks.component.actuator.TextureActuator;
import com.ilargia.games.egdx.logicbricks.component.actuator.VelocityActuator;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class ActuatorComponentsLookup {

	public static final int CameraActuator = 0;
	public static final int DragActuator = 1;
	public static final int Link = 2;
	public static final int ParticleEffectActuator = 3;
	public static final int RadialGravityActuator = 4;
	public static final int TextureActuator = 5;
	public static final int VelocityActuator = 6;
	public static final int totalComponents = 7;

	public static String[] componentNames() {
		return new String[]{"CameraActuator", "DragActuator", "Link",
				"ParticleEffectActuator", "RadialGravityActuator",
				"TextureActuator", "VelocityActuator"};
	}

	public static Class[] componentTypes() {
		return new Class[]{CameraActuator.class, DragActuator.class,
				Link.class, ParticleEffectActuator.class,
				RadialGravityActuator.class, TextureActuator.class,
				VelocityActuator.class};
	}
}