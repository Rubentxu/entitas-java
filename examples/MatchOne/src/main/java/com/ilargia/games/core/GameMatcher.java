package com.ilargia.games.core;

import com.ilargia.games.entitas.matcher.Matcher;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class GameMatcher {

    private static Matcher _matcherAsset;
    private static Matcher _matcherDestroy;
    private static Matcher _matcherGameBoard;
    private static Matcher _matcherGameBoardElement;
    private static Matcher _matcherInteractive;
    private static Matcher _matcherMovable;
    private static Matcher _matcherPosition;
    private static Matcher _matcherTextureView;

    public static Matcher Asset() {
        if (_matcherAsset == null) {
            Matcher matcher = (Matcher) Matcher.AllOf(GameComponentIds.Asset);
            matcher.componentNames = GameComponentIds.componentNames();
            _matcherAsset = matcher;
        }
        return _matcherAsset;
    }

    public static Matcher Destroy() {
        if (_matcherDestroy == null) {
            Matcher matcher = (Matcher) Matcher.AllOf(GameComponentIds.Destroy);
            matcher.componentNames = GameComponentIds.componentNames();
            _matcherDestroy = matcher;
        }
        return _matcherDestroy;
    }

    public static Matcher GameBoard() {
        if (_matcherGameBoard == null) {
            Matcher matcher = (Matcher) Matcher
                    .AllOf(GameComponentIds.GameBoard);
            matcher.componentNames = GameComponentIds.componentNames();
            _matcherGameBoard = matcher;
        }
        return _matcherGameBoard;
    }

    public static Matcher GameBoardElement() {
        if (_matcherGameBoardElement == null) {
            Matcher matcher = (Matcher) Matcher
                    .AllOf(GameComponentIds.GameBoardElement);
            matcher.componentNames = GameComponentIds.componentNames();
            _matcherGameBoardElement = matcher;
        }
        return _matcherGameBoardElement;
    }

    public static Matcher Interactive() {
        if (_matcherInteractive == null) {
            Matcher matcher = (Matcher) Matcher
                    .AllOf(GameComponentIds.Interactive);
            matcher.componentNames = GameComponentIds.componentNames();
            _matcherInteractive = matcher;
        }
        return _matcherInteractive;
    }

    public static Matcher Movable() {
        if (_matcherMovable == null) {
            Matcher matcher = (Matcher) Matcher.AllOf(GameComponentIds.Movable);
            matcher.componentNames = GameComponentIds.componentNames();
            _matcherMovable = matcher;
        }
        return _matcherMovable;
    }

    public static Matcher Position() {
        if (_matcherPosition == null) {
            Matcher matcher = (Matcher) Matcher
                    .AllOf(GameComponentIds.Position);
            matcher.componentNames = GameComponentIds.componentNames();
            _matcherPosition = matcher;
        }
        return _matcherPosition;
    }

    public static Matcher TextureView() {
        if (_matcherTextureView == null) {
            Matcher matcher = (Matcher) Matcher
                    .AllOf(GameComponentIds.TextureView);
            matcher.componentNames = GameComponentIds.componentNames();
            _matcherTextureView = matcher;
        }
        return _matcherTextureView;
    }
}