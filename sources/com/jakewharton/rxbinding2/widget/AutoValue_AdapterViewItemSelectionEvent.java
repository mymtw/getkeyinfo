package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import android.view.View;
import android.widget.AdapterView;

final class AutoValue_AdapterViewItemSelectionEvent extends C17016d {

    /* renamed from: id */
    private final long f37381id;
    private final int position;
    private final View selectedView;
    private final AdapterView<?> view;

    public AutoValue_AdapterViewItemSelectionEvent(AdapterView<?> adapterView, View view2, int i, long j) {
        if (adapterView != null) {
            this.view = adapterView;
            if (view2 != null) {
                this.selectedView = view2;
                this.position = i;
                this.f37381id = j;
                return;
            }
            throw new NullPointerException("Null selectedView");
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17016d)) {
            return false;
        }
        C17016d dVar = (C17016d) obj;
        return this.view.equals(dVar.view()) && this.selectedView.equals(dVar.selectedView()) && this.position == dVar.position() && this.f37381id == dVar.mo60208id();
    }

    public int hashCode() {
        long j = this.f37381id;
        return ((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.selectedView.hashCode()) * 1000003) ^ this.position) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: id */
    public long mo60208id() {
        return this.f37381id;
    }

    public int position() {
        return this.position;
    }

    public View selectedView() {
        return this.selectedView;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AdapterViewItemSelectionEvent{view=");
        h.append(this.view);
        h.append(", selectedView=");
        h.append(this.selectedView);
        h.append(", position=");
        h.append(this.position);
        h.append(", id=");
        return C0087d.m236f(h, this.f37381id, "}");
    }

    public AdapterView<?> view() {
        return this.view;
    }
}
