package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.u3 */
public final class C14829u3 extends ContentObserver {
    public C14829u3() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C14841v3.f33123d.set(true);
    }
}
