package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14350k;
import com.google.android.gms.measurement.internal.C15099u;
import com.google.common.collect.C16154c1;
import com.google.common.collect.C16160d1;
import com.google.common.collect.C16169f1;
import com.google.common.collect.C16203o;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import p505aj.C14003j;
import p505aj.C14014t;
import p513bj.C14049b0;
import p594jh.C17939k1;
import p594jh.C17954o0;

public final class MergingMediaSource extends C14294c<Integer> {

    /* renamed from: r */
    public static final C17954o0 f31753r;

    /* renamed from: j */
    public final C14344i[] f31754j;

    /* renamed from: k */
    public final C17939k1[] f31755k;

    /* renamed from: l */
    public final ArrayList<C14344i> f31756l;

    /* renamed from: m */
    public final C15099u f31757m;

    /* renamed from: n */
    public final C16154c1<Object, C14292b> f31758n;

    /* renamed from: o */
    public int f31759o = -1;

    /* renamed from: p */
    public long[][] f31760p;

    /* renamed from: q */
    public IllegalMergeException f31761q;

    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    static {
        C17954o0.C17956b bVar = new C17954o0.C17956b();
        bVar.f39145a = "MergingMediaSource";
        f31753r = bVar.mo69497a();
    }

    public MergingMediaSource(C14344i... iVarArr) {
        C15099u uVar = new C15099u();
        this.f31754j = iVarArr;
        this.f31757m = uVar;
        this.f31756l = new ArrayList<>(Arrays.asList(iVarArr));
        this.f31755k = new C17939k1[iVarArr.length];
        this.f31760p = new long[0][];
        new HashMap();
        C16203o.m26215b(8, "expectedKeys");
        C16160d1 d1Var = new C16160d1();
        C16203o.m26215b(2, "expectedValuesPerKey");
        this.f31758n = new C16169f1(d1Var).mo57660a();
    }

    /* renamed from: e */
    public final C17954o0 mo47622e() {
        C14344i[] iVarArr = this.f31754j;
        return iVarArr.length > 0 ? iVarArr[0].mo47622e() : f31753r;
    }

    /* renamed from: f */
    public final void mo47623f(C14304h hVar) {
        C14350k kVar = (C14350k) hVar;
        int i = 0;
        while (true) {
            C14344i[] iVarArr = this.f31754j;
            if (i < iVarArr.length) {
                C14344i iVar = iVarArr[i];
                C14304h hVar2 = kVar.f32167b[i];
                if (hVar2 instanceof C14350k.C14351a) {
                    hVar2 = ((C14350k.C14351a) hVar2).f32175b;
                }
                iVar.mo47623f(hVar2);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final C14304h mo47624h(C14344i.C14345a aVar, C14003j jVar, long j) {
        int length = this.f31754j.length;
        C14304h[] hVarArr = new C14304h[length];
        int b = this.f31755k[0].mo47698b(aVar.f39346a);
        for (int i = 0; i < length; i++) {
            hVarArr[i] = this.f31754j[i].mo47624h(aVar.mo47785b(this.f31755k[i].mo47699l(b)), jVar, j - this.f31760p[b][i]);
        }
        return new C14350k(this.f31757m, this.f31760p[b], hVarArr);
    }

    /* renamed from: l */
    public final void mo47625l() throws IOException {
        IllegalMergeException illegalMergeException = this.f31761q;
        if (illegalMergeException == null) {
            super.mo47625l();
            return;
        }
        throw illegalMergeException;
    }

    /* renamed from: o */
    public final void mo47626o(C14014t tVar) {
        this.f31791i = tVar;
        this.f31790h = C14049b0.m21639l((Handler.Callback) null);
        for (int i = 0; i < this.f31754j.length; i++) {
            mo47684t(Integer.valueOf(i), this.f31754j[i]);
        }
    }

    /* renamed from: q */
    public final void mo47627q() {
        super.mo47627q();
        Arrays.fill(this.f31755k, (Object) null);
        this.f31759o = -1;
        this.f31761q = null;
        this.f31756l.clear();
        Collections.addAll(this.f31756l, this.f31754j);
    }

    /* renamed from: r */
    public final C14344i.C14345a mo47632r(Object obj, C14344i.C14345a aVar) {
        if (((Integer) obj).intValue() == 0) {
            return aVar;
        }
        return null;
    }

    /* renamed from: s */
    public final void mo47628s(Object obj, C14344i iVar, C17939k1 k1Var) {
        Integer num = (Integer) obj;
        if (this.f31761q == null) {
            if (this.f31759o == -1) {
                this.f31759o = k1Var.mo47700h();
            } else if (k1Var.mo47700h() != this.f31759o) {
                this.f31761q = new IllegalMergeException(0);
                return;
            }
            if (this.f31760p.length == 0) {
                int i = this.f31759o;
                int[] iArr = new int[2];
                iArr[1] = this.f31755k.length;
                iArr[0] = i;
                this.f31760p = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            this.f31756l.remove(iVar);
            this.f31755k[num.intValue()] = k1Var;
            if (this.f31756l.isEmpty()) {
                mo47660p(this.f31755k[0]);
            }
        }
    }
}
