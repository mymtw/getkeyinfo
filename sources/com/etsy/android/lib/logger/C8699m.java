package com.etsy.android.lib.logger;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.lib.logger.m */
public final class C8699m {

    /* renamed from: a */
    public Map<AnalyticsProperty, ? extends Object> f19100a;

    /* renamed from: b */
    public String f19101b;

    /* renamed from: c */
    public int f19102c;

    /* renamed from: d */
    public List<C8696j> f19103d;

    public C8699m() {
        this((Map) null, 15);
    }

    public C8699m(Map<AnalyticsProperty, ? extends Object> map, int i) {
        map = (i & 1) != 0 ? C19294b0.m32559p0() : map;
        ArrayList arrayList = null;
        String str = (i & 2) != 0 ? "" : null;
        arrayList = (i & 8) != 0 ? new ArrayList() : arrayList;
        C19383o.m32797g(map, "parameters");
        C19383o.m32797g(str, "name");
        C19383o.m32797g(arrayList, "onSeenData");
        this.f19100a = map;
        this.f19101b = str;
        this.f19102c = 0;
        this.f19103d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8699m)) {
            return false;
        }
        C8699m mVar = (C8699m) obj;
        return C19383o.m32792b(this.f19100a, mVar.f19100a) && C19383o.m32792b(this.f19101b, mVar.f19101b) && this.f19102c == mVar.f19102c && C19383o.m32792b(this.f19103d, mVar.f19103d);
    }

    public final int hashCode() {
        return this.f19103d.hashCode() + C0069a.m170a(this.f19102c, C0023f.m105e(this.f19101b, this.f19100a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TrackingData(parameters=");
        h.append(this.f19100a);
        h.append(", name=");
        h.append(this.f19101b);
        h.append(", position=");
        h.append(this.f19102c);
        h.append(", onSeenData=");
        return C0070b.m186i(h, this.f19103d, ')');
    }
}
