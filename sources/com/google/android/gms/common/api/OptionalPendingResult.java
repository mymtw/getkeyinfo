package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;

public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    @RecentlyNonNull
    public abstract R get();

    public abstract boolean isDone();
}
