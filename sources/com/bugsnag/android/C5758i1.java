package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;

/* renamed from: com.bugsnag.android.i1 */
public final class C5758i1 {

    /* renamed from: a */
    public final int f12294a;

    /* renamed from: b */
    public final boolean f12295b;

    /* renamed from: c */
    public final boolean f12296c;

    public C5758i1(int i, boolean z, boolean z2) {
        this.f12294a = i;
        this.f12295b = z;
        this.f12296c = z2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LastRunInfo(consecutiveLaunchCrashes=");
        h.append(this.f12294a);
        h.append(", crashed=");
        h.append(this.f12295b);
        h.append(", crashedDuringLaunch=");
        return C0391c.m1058d(h, this.f12296c, ')');
    }
}
