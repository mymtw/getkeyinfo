package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;

public interface Freezable<T> {
    @RecentlyNonNull
    T freeze();

    boolean isDataValid();
}
