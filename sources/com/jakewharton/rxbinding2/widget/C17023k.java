package com.jakewharton.rxbinding2.widget;

import android.widget.SeekBar;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.k */
public abstract class C17023k extends C17021i {
    public static C17023k create(SeekBar seekBar) {
        return new AutoValue_SeekBarStartChangeEvent(seekBar);
    }
}
