package com.etsy.android.p327ui.user.help;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.help.a */
public final class C11528a {

    /* renamed from: a */
    public final int f25427a;

    /* renamed from: b */
    public final int f25428b;

    /* renamed from: c */
    public final int f25429c;

    /* renamed from: d */
    public final TrackingOnClickListener f25430d;

    public C11528a(int i, int i2, int i3, TrackingOnClickListener trackingOnClickListener) {
        this.f25427a = i;
        this.f25428b = i2;
        this.f25429c = i3;
        this.f25430d = trackingOnClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11528a)) {
            return false;
        }
        C11528a aVar = (C11528a) obj;
        return this.f25427a == aVar.f25427a && this.f25428b == aVar.f25428b && this.f25429c == aVar.f25429c && C19383o.m32792b(this.f25430d, aVar.f25430d);
    }

    public final int hashCode() {
        return this.f25430d.hashCode() + C0069a.m170a(this.f25429c, C0069a.m170a(this.f25428b, Integer.hashCode(this.f25427a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HelpOption(labelRes=");
        h.append(this.f25427a);
        h.append(", descriptionRes=");
        h.append(this.f25428b);
        h.append(", iconRes=");
        h.append(this.f25429c);
        h.append(", clickListener=");
        h.append(this.f25430d);
        h.append(')');
        return h.toString();
    }
}
