package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.widget.AdapterView;

final class AutoValue_AdapterViewNothingSelectionEvent extends C17017e {
    private final AdapterView<?> view;

    public AutoValue_AdapterViewNothingSelectionEvent(AdapterView<?> adapterView) {
        if (adapterView != null) {
            this.view = adapterView;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17017e) {
            return this.view.equals(((C17017e) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.view.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AdapterViewNothingSelectionEvent{view=");
        h.append(this.view);
        h.append("}");
        return h.toString();
    }

    public AdapterView<?> view() {
        return this.view;
    }
}
