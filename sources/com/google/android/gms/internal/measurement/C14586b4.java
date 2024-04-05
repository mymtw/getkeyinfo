package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.b4 */
public final class C14586b4 extends ContentObserver {
    public C14586b4() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C14742n4.f32964h.incrementAndGet();
    }
}
