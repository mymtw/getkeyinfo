package com.jakewharton.rxbinding2.view;

import android.support.p013v4.media.C0072d;
import android.view.View;

final class AutoValue_ViewAttachDetachedEvent extends C17006e {
    private final View view;

    public AutoValue_ViewAttachDetachedEvent(View view2) {
        if (view2 != null) {
            this.view = view2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17006e) {
            return this.view.equals(((C17006e) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.view.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ViewAttachDetachedEvent{view=");
        h.append(this.view);
        h.append("}");
        return h.toString();
    }

    public View view() {
        return this.view;
    }
}
