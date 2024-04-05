package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.widget.TextView;

final class AutoValue_TextViewTextChangeEvent extends C17032r {
    private final int before;
    private final int count;
    private final int start;
    private final CharSequence text;
    private final TextView view;

    public AutoValue_TextViewTextChangeEvent(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView != null) {
            this.view = textView;
            if (charSequence != null) {
                this.text = charSequence;
                this.start = i;
                this.before = i2;
                this.count = i3;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null view");
    }

    public int before() {
        return this.before;
    }

    public int count() {
        return this.count;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17032r)) {
            return false;
        }
        C17032r rVar = (C17032r) obj;
        return this.view.equals(rVar.view()) && this.text.equals(rVar.text()) && this.start == rVar.start() && this.before == rVar.before() && this.count == rVar.count();
    }

    public int hashCode() {
        return ((((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.start) * 1000003) ^ this.before) * 1000003) ^ this.count;
    }

    public int start() {
        return this.start;
    }

    public CharSequence text() {
        return this.text;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TextViewTextChangeEvent{view=");
        h.append(this.view);
        h.append(", text=");
        h.append(this.text);
        h.append(", start=");
        h.append(this.start);
        h.append(", before=");
        h.append(this.before);
        h.append(", count=");
        return C0071c.m191c(h, this.count, "}");
    }

    public TextView view() {
        return this.view;
    }
}
