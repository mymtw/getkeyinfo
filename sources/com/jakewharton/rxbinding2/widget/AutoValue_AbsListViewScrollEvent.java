package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.widget.AbsListView;

final class AutoValue_AbsListViewScrollEvent extends C17013a {
    private final int firstVisibleItem;
    private final int scrollState;
    private final int totalItemCount;
    private final AbsListView view;
    private final int visibleItemCount;

    public AutoValue_AbsListViewScrollEvent(AbsListView absListView, int i, int i2, int i3, int i4) {
        if (absListView != null) {
            this.view = absListView;
            this.scrollState = i;
            this.firstVisibleItem = i2;
            this.visibleItemCount = i3;
            this.totalItemCount = i4;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17013a)) {
            return false;
        }
        C17013a aVar = (C17013a) obj;
        return this.view.equals(aVar.view()) && this.scrollState == aVar.scrollState() && this.firstVisibleItem == aVar.firstVisibleItem() && this.visibleItemCount == aVar.visibleItemCount() && this.totalItemCount == aVar.totalItemCount();
    }

    public int firstVisibleItem() {
        return this.firstVisibleItem;
    }

    public int hashCode() {
        return ((((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.scrollState) * 1000003) ^ this.firstVisibleItem) * 1000003) ^ this.visibleItemCount) * 1000003) ^ this.totalItemCount;
    }

    public int scrollState() {
        return this.scrollState;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AbsListViewScrollEvent{view=");
        h.append(this.view);
        h.append(", scrollState=");
        h.append(this.scrollState);
        h.append(", firstVisibleItem=");
        h.append(this.firstVisibleItem);
        h.append(", visibleItemCount=");
        h.append(this.visibleItemCount);
        h.append(", totalItemCount=");
        return C0071c.m191c(h, this.totalItemCount, "}");
    }

    public int totalItemCount() {
        return this.totalItemCount;
    }

    public AbsListView view() {
        return this.view;
    }

    public int visibleItemCount() {
        return this.visibleItemCount;
    }
}
