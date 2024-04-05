package com.jakewharton.rxbinding2.view;

import android.support.p013v4.media.C0072d;
import android.view.MenuItem;

final class AutoValue_MenuItemActionViewCollapseEvent extends C17002a {
    private final MenuItem menuItem;

    public AutoValue_MenuItemActionViewCollapseEvent(MenuItem menuItem2) {
        if (menuItem2 != null) {
            this.menuItem = menuItem2;
            return;
        }
        throw new NullPointerException("Null menuItem");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17002a) {
            return this.menuItem.equals(((C17002a) obj).menuItem());
        }
        return false;
    }

    public int hashCode() {
        return this.menuItem.hashCode() ^ 1000003;
    }

    public MenuItem menuItem() {
        return this.menuItem;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("MenuItemActionViewCollapseEvent{menuItem=");
        h.append(this.menuItem);
        h.append("}");
        return h.toString();
    }
}
