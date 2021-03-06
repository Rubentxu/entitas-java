package ilargia.egdx.logicbricks.gen.actuator;

import ilargia.entitas.matcher.Matcher;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class ActuatorMatcher {

	private static Matcher _matcherCameraActuator;
	private static Matcher _matcherDragActuator;
	private static Matcher _matcherLink;
	private static Matcher _matcherName;
	private static Matcher _matcherParticleEffectActuator;
	private static Matcher _matcherRadialGravityActuator;
	private static Matcher _matcherTextureActuator;
	private static Matcher _matcherVelocityActuator;

	public static Matcher CameraActuator() {
		if (_matcherCameraActuator == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(ActuatorComponentsLookup.CameraActuator);
			matcher.componentNames = ActuatorComponentsLookup.componentNames();
			_matcherCameraActuator = matcher;
		}
		return _matcherCameraActuator;
	}

	public static Matcher DragActuator() {
		if (_matcherDragActuator == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(ActuatorComponentsLookup.DragActuator);
			matcher.componentNames = ActuatorComponentsLookup.componentNames();
			_matcherDragActuator = matcher;
		}
		return _matcherDragActuator;
	}

	public static Matcher Link() {
		if (_matcherLink == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(ActuatorComponentsLookup.Link);
			matcher.componentNames = ActuatorComponentsLookup.componentNames();
			_matcherLink = matcher;
		}
		return _matcherLink;
	}

	public static Matcher Name() {
		if (_matcherName == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(ActuatorComponentsLookup.Name);
			matcher.componentNames = ActuatorComponentsLookup.componentNames();
			_matcherName = matcher;
		}
		return _matcherName;
	}

	public static Matcher ParticleEffectActuator() {
		if (_matcherParticleEffectActuator == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(ActuatorComponentsLookup.ParticleEffectActuator);
			matcher.componentNames = ActuatorComponentsLookup.componentNames();
			_matcherParticleEffectActuator = matcher;
		}
		return _matcherParticleEffectActuator;
	}

	public static Matcher RadialGravityActuator() {
		if (_matcherRadialGravityActuator == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(ActuatorComponentsLookup.RadialGravityActuator);
			matcher.componentNames = ActuatorComponentsLookup.componentNames();
			_matcherRadialGravityActuator = matcher;
		}
		return _matcherRadialGravityActuator;
	}

	public static Matcher TextureActuator() {
		if (_matcherTextureActuator == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(ActuatorComponentsLookup.TextureActuator);
			matcher.componentNames = ActuatorComponentsLookup.componentNames();
			_matcherTextureActuator = matcher;
		}
		return _matcherTextureActuator;
	}

	public static Matcher VelocityActuator() {
		if (_matcherVelocityActuator == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(ActuatorComponentsLookup.VelocityActuator);
			matcher.componentNames = ActuatorComponentsLookup.componentNames();
			_matcherVelocityActuator = matcher;
		}
		return _matcherVelocityActuator;
	}
}