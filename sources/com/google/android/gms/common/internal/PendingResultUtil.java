package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import p605kk.C18123g;
import p605kk.C18124h;

@KeepForSdk
public class PendingResultUtil {
    private static final zaa zaa = new zap();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @RecentlyNonNull
        @KeepForSdk
        T convert(@RecentlyNonNull R r);
    }

    public interface zaa {
        ApiException zaa(Status status);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> C18123g<T> toResponseTask(@RecentlyNonNull PendingResult<R> pendingResult, @RecentlyNonNull T t) {
        return toTask(pendingResult, new zaq(t));
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result, T> C18123g<T> toTask(@RecentlyNonNull PendingResult<R> pendingResult, @RecentlyNonNull ResultConverter<R, T> resultConverter) {
        zaa zaa2 = zaa;
        C18124h hVar = new C18124h();
        pendingResult.addStatusListener(new zar(pendingResult, hVar, resultConverter, zaa2));
        return hVar.f39566a;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result> C18123g<Void> toVoidTask(@RecentlyNonNull PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zas());
    }
}
