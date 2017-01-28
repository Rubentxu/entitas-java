package com.ilargia.games.core;

import com.ilargia.games.components.Asset;
import com.ilargia.games.components.Destroy;
import com.ilargia.games.components.GameBoard;
import com.ilargia.games.components.GameBoardElement;
import com.ilargia.games.components.Interactive;
import com.ilargia.games.components.Movable;
import com.ilargia.games.components.Position;
import com.ilargia.games.components.View;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class CoreComponentIds {

	public static final int Asset = 0;
	public static final int Destroy = 2;
	public static final int GameBoard = 3;
	public static final int GameBoardElement = 4;
	public static final int Interactive = 6;
	public static final int Movable = 7;
	public static final int Position = 8;
	public static final int View = 10;
	public static final int totalComponents = 8;

	public static String[] componentNames() {
		return new String[]{"Asset", null, "Destroy", "GameBoard",
				"GameBoardElement", null, "Interactive", "Movable", "Position",
				null, "View"};
	}

	public static Class[] componentTypes() {
		return new Class[]{Asset.class, null, Destroy.class, GameBoard.class,
				GameBoardElement.class, null, Interactive.class, Movable.class,
				Position.class, null, View.class};
	}
}