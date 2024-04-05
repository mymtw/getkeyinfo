package com.etsy.android.lib.useraction;

public enum ActionType {
    VIEW("view"),
    FAVORITE("favorite"),
    UNFAVORITE("unfavorite"),
    SEARCH("search");
    
    private final String actionName;

    private ActionType(String str) {
        this.actionName = str;
    }

    public final String getActionName() {
        return this.actionName;
    }
}
