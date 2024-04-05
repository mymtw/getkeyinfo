package com.jakewharton.rxbinding2.view;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;

final class AutoValue_ViewGroupHierarchyChildViewRemoveEvent extends C17010i {
    private final View child;
    private final ViewGroup view;

    public AutoValue_ViewGroupHierarchyChildViewRemoveEvent(ViewGroup viewGroup, View view2) {
        if (viewGroup != null) {
            this.view = viewGroup;
            if (view2 != null) {
                this.child = view2;
                return;
            }
            throw new NullPointerException("Null child");
        }
        throw new NullPointerException("Null view");
    }

    public View child() {
        return this.child;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17010i)) {
            return false;
        }
        C17010i iVar = (C17010i) obj;
        return this.view.equals(iVar.view()) && this.child.equals(iVar.child());
    }

    public int hashCode() {
        return ((this.view.hashCode() ^ 1000003) * 1000003) ^ this.child.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ViewGroupHierarchyChildViewRemoveEvent{view=");
        h.append(this.view);
        h.append(", child=");
        h.append(this.child);
        h.append("}");
        return h.toString();
    }

    public ViewGroup view() {
        return this.view;
    }
}
