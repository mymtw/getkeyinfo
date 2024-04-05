package com.google.android.gms.tasks;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import p605kk.C18123g;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, Exception exc) {
        super(str, exc);
    }

    /* renamed from: of */
    public static IllegalStateException m24721of(C18123g<?> gVar) {
        if (!gVar.mo69667n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception j = gVar.mo69663j();
        String concat = j != null ? EventsNameKt.FAILED : gVar.mo69668o() ? "result ".concat(String.valueOf(gVar.mo69664k())) : gVar.mo69666m() ? "cancellation" : "unknown issue";
        return new DuplicateTaskCompletionException(concat.length() != 0 ? "Complete with: ".concat(concat) : new String("Complete with: "), j);
    }
}
