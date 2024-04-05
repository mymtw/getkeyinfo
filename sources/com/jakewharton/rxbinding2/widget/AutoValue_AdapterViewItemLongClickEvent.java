package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import android.view.View;
import android.widget.AdapterView;

final class AutoValue_AdapterViewItemLongClickEvent extends C17015c {
    private final View clickedView;

    /* renamed from: id */
    private final long f37380id;
    private final int position;
    private final AdapterView<?> view;

    public AutoValue_AdapterViewItemLongClickEvent(AdapterView<?> adapterView, View view2, int i, long j) {
        if (adapterView != null) {
            this.view = adapterView;
            if (view2 != null) {
                this.clickedView = view2;
                this.position = i;
                this.f37380id = j;
                return;
            }
            throw new NullPointerException("Null clickedView");
        }
        throw new NullPointerException("Null view");
    }

    public View clickedView() {
        return this.clickedView;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17015c)) {
            return false;
        }
        C17015c cVar = (C17015c) obj;
        return this.view.equals(cVar.view()) && this.clickedView.equals(cVar.clickedView()) && this.position == cVar.position() && this.f37380id == cVar.mo60202id();
    }

    public int hashCode() {
        long j = this.f37380id;
        return ((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.clickedView.hashCode()) * 1000003) ^ this.position) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: id */
    public long mo60202id() {
        return this.f37380id;
    }

    public int position() {
        return this.position;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AdapterViewItemLongClickEvent{view=");
        h.append(this.view);
        h.append(", clickedView=");
        h.append(this.clickedView);
        h.append(", position=");
        h.append(this.position);
        h.append(", id=");
        return C0087d.m236f(h, this.f37380id, "}");
    }

    public AdapterView<?> view() {
        return this.view;
    }
}
