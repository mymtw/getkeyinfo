package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.widget.TextView;

final class AutoValue_TextViewBeforeTextChangeEvent extends C17028o {
    private final int after;
    private final int count;
    private final int start;
    private final CharSequence text;
    private final TextView view;

    public AutoValue_TextViewBeforeTextChangeEvent(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView != null) {
            this.view = textView;
            if (charSequence != null) {
                this.text = charSequence;
                this.start = i;
                this.count = i2;
                this.after = i3;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null view");
    }

    public int after() {
        return this.after;
    }

    public int count() {
        return this.count;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17028o)) {
            return false;
        }
        C17028o oVar = (C17028o) obj;
        return this.view.equals(oVar.view()) && this.text.equals(oVar.text()) && this.start == oVar.start() && this.count == oVar.count() && this.after == oVar.after();
    }

    public int hashCode() {
        return ((((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.start) * 1000003) ^ this.count) * 1000003) ^ this.after;
    }

    public int start() {
        return this.start;
    }

    public CharSequence text() {
        return this.text;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TextViewBeforeTextChangeEvent{view=");
        h.append(this.view);
        h.append(", text=");
        h.append(this.text);
        h.append(", start=");
        h.append(this.start);
        h.append(", count=");
        h.append(this.count);
        h.append(", after=");
        return C0071c.m191c(h, this.after, "}");
    }

    public TextView view() {
        return this.view;
    }
}
