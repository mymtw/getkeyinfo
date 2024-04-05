package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.widget.SeekBar;

final class AutoValue_SeekBarProgressChangeEvent extends C17022j {
    private final boolean fromUser;
    private final int progress;
    private final SeekBar view;

    public AutoValue_SeekBarProgressChangeEvent(SeekBar seekBar, int i, boolean z) {
        if (seekBar != null) {
            this.view = seekBar;
            this.progress = i;
            this.fromUser = z;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17022j)) {
            return false;
        }
        C17022j jVar = (C17022j) obj;
        return this.view.equals(jVar.view()) && this.progress == jVar.progress() && this.fromUser == jVar.fromUser();
    }

    public boolean fromUser() {
        return this.fromUser;
    }

    public int hashCode() {
        return ((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.progress) * 1000003) ^ (this.fromUser ? 1231 : 1237);
    }

    public int progress() {
        return this.progress;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SeekBarProgressChangeEvent{view=");
        h.append(this.view);
        h.append(", progress=");
        h.append(this.progress);
        h.append(", fromUser=");
        h.append(this.fromUser);
        h.append("}");
        return h.toString();
    }

    public SeekBar view() {
        return this.view;
    }
}
