package com.jakewharton.rxbinding2.view;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.view.View;

final class AutoValue_ViewLayoutChangeEvent extends C17011j {
    private final int bottom;
    private final int left;
    private final int oldBottom;
    private final int oldLeft;
    private final int oldRight;
    private final int oldTop;
    private final int right;
    private final int top;
    private final View view;

    public AutoValue_ViewLayoutChangeEvent(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view2 != null) {
            this.view = view2;
            this.left = i;
            this.top = i2;
            this.right = i3;
            this.bottom = i4;
            this.oldLeft = i5;
            this.oldTop = i6;
            this.oldRight = i7;
            this.oldBottom = i8;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public int bottom() {
        return this.bottom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17011j)) {
            return false;
        }
        C17011j jVar = (C17011j) obj;
        return this.view.equals(jVar.view()) && this.left == jVar.left() && this.top == jVar.top() && this.right == jVar.right() && this.bottom == jVar.bottom() && this.oldLeft == jVar.oldLeft() && this.oldTop == jVar.oldTop() && this.oldRight == jVar.oldRight() && this.oldBottom == jVar.oldBottom();
    }

    public int hashCode() {
        return ((((((((((((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.left) * 1000003) ^ this.top) * 1000003) ^ this.right) * 1000003) ^ this.bottom) * 1000003) ^ this.oldLeft) * 1000003) ^ this.oldTop) * 1000003) ^ this.oldRight) * 1000003) ^ this.oldBottom;
    }

    public int left() {
        return this.left;
    }

    public int oldBottom() {
        return this.oldBottom;
    }

    public int oldLeft() {
        return this.oldLeft;
    }

    public int oldRight() {
        return this.oldRight;
    }

    public int oldTop() {
        return this.oldTop;
    }

    public int right() {
        return this.right;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ViewLayoutChangeEvent{view=");
        h.append(this.view);
        h.append(", left=");
        h.append(this.left);
        h.append(", top=");
        h.append(this.top);
        h.append(", right=");
        h.append(this.right);
        h.append(", bottom=");
        h.append(this.bottom);
        h.append(", oldLeft=");
        h.append(this.oldLeft);
        h.append(", oldTop=");
        h.append(this.oldTop);
        h.append(", oldRight=");
        h.append(this.oldRight);
        h.append(", oldBottom=");
        return C0071c.m191c(h, this.oldBottom, "}");
    }

    public int top() {
        return this.top;
    }

    public View view() {
        return this.view;
    }
}
