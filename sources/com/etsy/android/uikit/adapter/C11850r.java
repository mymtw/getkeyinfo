package com.etsy.android.uikit.adapter;

import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.uikit.view.C11951f;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.uikit.adapter.r */
public final class C11850r<T extends BaseModelImageCompat> {

    /* renamed from: a */
    public final C11840k<T> f26345a;

    /* renamed from: b */
    public final C11951f f26346b = null;

    /* renamed from: c */
    public final C19857l<Boolean, C19394m> f26347c;

    /* renamed from: d */
    public final LinkedHashMap f26348d;

    /* renamed from: e */
    public final LinkedHashMap f26349e;

    /* renamed from: f */
    public boolean f26350f;

    public C11850r(C11840k kVar, C19857l lVar) {
        C19383o.m32797g(kVar, "adapter");
        this.f26345a = kVar;
        this.f26347c = lVar;
        this.f26348d = new LinkedHashMap();
        this.f26349e = new LinkedHashMap();
        this.f26350f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (java.lang.Long) r5.f26349e.remove(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38330a(com.etsy.android.stylekit.views.CollagePlayerView r6) {
        /*
            r5 = this;
            android.net.Uri r0 = r6.getVideoURI()
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.util.LinkedHashMap r3 = r5.f26349e
            java.lang.Object r0 = r3.remove(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0017
            long r3 = r0.longValue()
            goto L_0x0018
        L_0x0017:
            r3 = r1
        L_0x0018:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
            r6.seekTo(r3)
        L_0x001f:
            r6.resume()
            kq.l<java.lang.Boolean, kotlin.m> r6 = r5.f26347c
            if (r6 == 0) goto L_0x002f
            boolean r0 = r5.f26350f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.invoke(r0)
        L_0x002f:
            r6 = 0
            r5.f26350f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.adapter.C11850r.mo38330a(com.etsy.android.stylekit.views.CollagePlayerView):void");
    }
}
