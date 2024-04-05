package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.widget.SeekBar;

final class AutoValue_SeekBarStartChangeEvent extends C17023k {
    private final SeekBar view;

    public AutoValue_SeekBarStartChangeEvent(SeekBar seekBar) {
        if (seekBar != null) {
            this.view = seekBar;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17023k) {
            return this.view.equals(((C17023k) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.view.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SeekBarStartChangeEvent{view=");
        h.append(this.view);
        h.append("}");
        return h.toString();
    }

    public SeekBar view() {
        return this.view;
    }
}
