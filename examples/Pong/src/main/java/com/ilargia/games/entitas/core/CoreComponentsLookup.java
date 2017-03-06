package com.ilargia.games.entitas.core;

import com.ilargia.games.logicbrick.component.Delay;
import com.ilargia.games.logicbrick.component.TextureView;
import com.ilargia.games.logicbrick.component.View;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class CoreComponentsLookup {

	public static final int Ball = 0;
	public static final int Delay = 1;
	public static final int Motion = 2;
	public static final int Player = 3;
	public static final int Score = 4;
	public static final int TextureView = 5;
	public static final int View = 6;
	public static final int totalComponents = 7;

	public static String[] componentNames() {
		return new String[]{"Ball", "Delay", "Motion", "Player", "Score",
				"TextureView", "View"};
	}

	public static Class[] componentTypes() {
		return new Class[]{com.ilargia.games.logicbrick.component.Ball.class, Delay.class, com.ilargia.games.logicbrick.component.Motion.class, com.ilargia.games.logicbrick.component.Player.class,
				com.ilargia.games.logicbrick.component.Score.class, TextureView.class, View.class};
	}
}