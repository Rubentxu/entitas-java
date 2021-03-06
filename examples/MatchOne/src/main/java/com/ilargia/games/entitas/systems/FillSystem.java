package com.ilargia.games.entitas.systems;

import com.ilargia.games.entitas.GameBoardLogic;
import com.ilargia.games.logicbrick.component.game.GameBoard;
import com.ilargia.games.logicbrick.gen.game.GameContext;
import com.ilargia.games.logicbrick.gen.game.GameMatcher;
import com.ilargia.games.entitas.ContextExtensions;
import com.ilargia.games.entitas.Entity;
import com.ilargia.games.entitas.api.IContext;
import com.ilargia.games.entitas.collector.Collector;
import com.ilargia.games.entitas.group.GroupEvent;

import java.util.List;


public class FillSystem extends ReactiveSystem {

    GameContext context;

    public FillSystem(GameContext context) {
        super(context);
        this.context = context;
    }

    @Override
    protected Collector getTrigger(IContext context) {
        return context.createCollector(GameMatcher.GameBoardElement(), GroupEvent.Removed);
    }

    @Override
    protected boolean filter(Entity entity) {
        return true;
    }

    @Override
    public void execute(List entities) {
        GameBoard gameBoard = context.getGameBoard();
        for (int column = 0; column < gameBoard.columns; column++) {
            int nextRowPos = GameBoardLogic.getNextEmptyRow(context, column, gameBoard.rows);
            while (nextRowPos != gameBoard.rows) {
                ContextExtensions.createRandomPiece(context, column, nextRowPos);
                nextRowPos = GameBoardLogic.getNextEmptyRow(context, column, gameBoard.rows);
            }
        }

    }


}
