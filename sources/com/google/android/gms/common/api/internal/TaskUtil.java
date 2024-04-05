package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p605kk.C18123g;
import p605kk.C18124h;

@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(@RecentlyNonNull Status status, @RecentlyNonNull C18124h<Void> hVar) {
        setResultOrApiException(status, (Object) null, hVar);
    }

    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static C18123g<Void> toVoidTaskThatFailsOnFalse(@RecentlyNonNull C18123g<Boolean> gVar) {
        return gVar.mo69661h(new zacl());
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@RecentlyNonNull Status status, ResultT resultt, @RecentlyNonNull C18124h<ResultT> hVar) {
        return status.isSuccess() ? hVar.mo69680d(resultt) : hVar.mo69679c(new ApiException(status));
    }

    @KeepForSdk
    public static <TResult> void setResultOrApiException(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull C18124h<TResult> hVar) {
        if (status.isSuccess()) {
            hVar.mo69678b(tresult);
        } else {
            hVar.mo69677a(new ApiException(status));
        }
    }
}
