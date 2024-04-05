package com.etsy.android.lib.logger;

import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.models.editable.EditableListing;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ViewPerformanceTracker$drainTimers$3 extends Lambda implements C19857l<C8707d, CharSequence> {
    public static final ViewPerformanceTracker$drainTimers$3 INSTANCE = new ViewPerformanceTracker$drainTimers$3();

    public ViewPerformanceTracker$drainTimers$3() {
        super(1);
    }

    public final CharSequence invoke(C8707d dVar) {
        C19383o.m32797g(dVar, "timer");
        long j = dVar.f19129c;
        return (j > -1 ? 1 : (j == -1 ? 0 : -1)) != 0 ? String.valueOf(j) : EditableListing.LISTING_ID_DEVICE_DRAFT;
    }
}
