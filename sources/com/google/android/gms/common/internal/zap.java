package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;

final class zap implements PendingResultUtil.zaa {
    public final ApiException zaa(Status status) {
        return ApiExceptionUtil.fromStatus(status);
    }
}
