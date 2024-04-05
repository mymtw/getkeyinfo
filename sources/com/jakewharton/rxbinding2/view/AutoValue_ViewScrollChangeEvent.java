package com.jakewharton.rxbinding2.view;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.view.View;

final class AutoValue_ViewScrollChangeEvent extends C17012k {
    private final int oldScrollX;
    private final int oldScrollY;
    private final int scrollX;
    private final int scrollY;
    private final View view;

    public AutoValue_ViewScrollChangeEvent(View view2, int i, int i2, int i3, int i4) {
        if (view2 != null) {
            this.view = view2;
            this.scrollX = i;
            this.scrollY = i2;
            this.oldScrollX = i3;
            this.oldScrollY = i4;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17012k)) {
            return false;
        }
        C17012k kVar = (C17012k) obj;
        return this.view.equals(kVar.view()) && this.scrollX == kVar.scrollX() && this.scrollY == kVar.scrollY() && this.oldScrollX == kVar.oldScrollX() && this.oldScrollY == kVar.oldScrollY();
    }

    public int hashCode() {
        return ((((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.scrollX) * 1000003) ^ this.scrollY) * 1000003) ^ this.oldScrollX) * 1000003) ^ this.oldScrollY;
    }

    public int oldScrollX() {
        return this.oldScrollX;
    }

    public int oldScrollY() {
        return this.oldScrollY;
    }

    public int scrollX() {
        return this.scrollX;
    }

    public int scrollY() {
        return this.scrollY;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ViewScrollChangeEvent{view=");
        h.append(this.view);
        h.append(", scrollX=");
        h.append(this.scrollX);
        h.append(", scrollY=");
        h.append(this.scrollY);
        h.append(", oldScrollX=");
        h.append(this.oldScrollX);
        h.append(", oldScrollY=");
        return C0071c.m191c(h, this.oldScrollY, "}");
    }

    public View view() {
        return this.view;
    }
}
