package com.airbnb.lottie;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p149j3.C7101b;
import p149j3.C7102c;
import p149j3.C7106g;
import p193o.C7498f;
import p193o.C7507j;
import p206p3.C7656b;

/* renamed from: com.airbnb.lottie.c */
public final class C4828c {

    /* renamed from: a */
    public final C4851o f10841a = new C4851o();

    /* renamed from: b */
    public final HashSet<String> f10842b = new HashSet<>();

    /* renamed from: c */
    public Map<String, List<Layer>> f10843c;

    /* renamed from: d */
    public Map<String, C4837h> f10844d;

    /* renamed from: e */
    public Map<String, C7101b> f10845e;

    /* renamed from: f */
    public List<C7106g> f10846f;

    /* renamed from: g */
    public C7507j<C7102c> f10847g;

    /* renamed from: h */
    public C7498f<Layer> f10848h;

    /* renamed from: i */
    public List<Layer> f10849i;

    /* renamed from: j */
    public Rect f10850j;

    /* renamed from: k */
    public float f10851k;

    /* renamed from: l */
    public float f10852l;

    /* renamed from: m */
    public float f10853m;

    /* renamed from: n */
    public boolean f10854n;

    /* renamed from: o */
    public int f10855o = 0;

    /* renamed from: a */
    public final void mo14581a(String str) {
        C7656b.m14695b(str);
        this.f10842b.add(str);
    }

    /* renamed from: b */
    public final float mo14582b() {
        return (float) ((long) (((this.f10852l - this.f10851k) / this.f10853m) * 1000.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r3.substring(0, r3.length() - 1).equalsIgnoreCase(r7) != false) goto L_0x003e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p149j3.C7106g mo14583c(java.lang.String r7) {
        /*
            r6 = this;
            java.util.List<j3.g> r0 = r6.f10846f
            r0.size()
            r0 = 0
            r1 = r0
        L_0x0007:
            java.util.List<j3.g> r2 = r6.f10846f
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0044
            java.util.List<j3.g> r2 = r6.f10846f
            java.lang.Object r2 = r2.get(r1)
            j3.g r2 = (p149j3.C7106g) r2
            java.lang.String r3 = r2.f15807a
            boolean r3 = r3.equalsIgnoreCase(r7)
            r4 = 1
            if (r3 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.lang.String r3 = r2.f15807a
            java.lang.String r5 = "\r"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r2.f15807a
            int r5 = r3.length()
            int r5 = r5 - r4
            java.lang.String r3 = r3.substring(r0, r5)
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = r0
        L_0x003e:
            if (r4 == 0) goto L_0x0041
            return r2
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0044:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C4828c.mo14583c(java.lang.String):j3.g");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer a : this.f10849i) {
            sb.append(a.mo14600a("\t"));
        }
        return sb.toString();
    }
}
