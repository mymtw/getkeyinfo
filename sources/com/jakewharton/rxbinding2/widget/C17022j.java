package com.jakewharton.rxbinding2.widget;

import android.widget.SeekBar;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.j */
public abstract class C17022j extends C17021i {
    public static C17022j create(SeekBar seekBar, int i, boolean z) {
        return new AutoValue_SeekBarProgressChangeEvent(seekBar, i, z);
    }

    public abstract boolean fromUser();

    public abstract int progress();
}
