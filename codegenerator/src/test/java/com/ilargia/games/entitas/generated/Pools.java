package com.ilargia.games.entitas.generated;

import com.ilargia.games.entitas.Pool;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp. Changes to
 * this file may cause incorrect behavior and will be lost.
 * 
 * ---------------------------------------------------------------------------
 */
public class Pools extends com.ilargia.games.entitas.Pools {

	public Pool ejemplo;
	public Pool core;

	public static Pool createEjemploPool() {
		return com.ilargia.games.entitas.Pools.createPool("Ejemplo",
				EjemploComponentIds.totalComponents,
				EjemploComponentIds.componentNames(),
				EjemploComponentIds.componentTypes());
	}

	public static Pool createCorePool() {
		return com.ilargia.games.entitas.Pools.createPool("Core",
				CoreComponentIds.totalComponents,
				CoreComponentIds.componentNames(),
				CoreComponentIds.componentTypes());
	}

	public Pool[] allPools() {
		return new Pool[]{ejemplo, core};
	}

	public void setAllPools() {
		ejemplo = createEjemploPool();
		core = createCorePool();
	}
}