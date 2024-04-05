package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1341k0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p173m.C7279a;
import p174m0.C7290i;
import p174m0.C7294l;
import p288y.C8343c;
import p288y.C8347f;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;

public final class AndroidEdgeEffectOverscrollEffect implements C1030w {

    /* renamed from: a */
    public final C1029v f1237a;

    /* renamed from: b */
    public final EdgeEffect f1238b;

    /* renamed from: c */
    public final EdgeEffect f1239c;

    /* renamed from: d */
    public final EdgeEffect f1240d;

    /* renamed from: e */
    public final EdgeEffect f1241e;

    /* renamed from: f */
    public final List<EdgeEffect> f1242f;

    /* renamed from: g */
    public final EdgeEffect f1243g;

    /* renamed from: h */
    public final EdgeEffect f1244h;

    /* renamed from: i */
    public final EdgeEffect f1245i;

    /* renamed from: j */
    public final EdgeEffect f1246j;

    /* renamed from: k */
    public final ParcelableSnapshotMutableState f1247k;

    /* renamed from: l */
    public boolean f1248l;

    /* renamed from: m */
    public boolean f1249m;

    /* renamed from: n */
    public long f1250n;

    /* renamed from: o */
    public final ParcelableSnapshotMutableState f1251o;

    /* renamed from: p */
    public boolean f1252p;

    /* renamed from: q */
    public final C19857l<C7290i, C19394m> f1253q;

    /* renamed from: r */
    public final C1436d f1254r;

    public AndroidEdgeEffectOverscrollEffect(Context context, C1029v vVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f1237a = vVar;
        EdgeEffect T = C0114h.m289T(context);
        this.f1238b = T;
        EdgeEffect T2 = C0114h.m289T(context);
        this.f1239c = T2;
        EdgeEffect T3 = C0114h.m289T(context);
        this.f1240d = T3;
        EdgeEffect T4 = C0114h.m289T(context);
        this.f1241e = T4;
        List<EdgeEffect> e0 = C17782b.m29865e0(T3, T, T4, T2);
        this.f1242f = e0;
        this.f1243g = C0114h.m289T(context);
        this.f1244h = C0114h.m289T(context);
        this.f1245i = C0114h.m289T(context);
        this.f1246j = C0114h.m289T(context);
        int size = e0.size();
        for (int i = 0; i < size; i++) {
            e0.get(i).setColor(C18263b.m30859o0(this.f1237a.f2158a));
        }
        this.f1247k = C0761x.m1751w0(C19394m.f43287a, C1341k0.f2935a);
        this.f1248l = true;
        this.f1250n = C8347f.f18313b;
        this.f1251o = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.f1253q = androidEdgeEffectOverscrollEffect$onNewSize$1;
        C1436d dVar = AndroidOverscrollKt.f1256b;
        C19383o.m32797g(dVar, "other");
        C1436d j0 = C18263b.m30849j0(dVar, androidEdgeEffectOverscrollEffect$onNewSize$1);
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        this.f1254r = j0.mo6148i0(new C0648k(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0122  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174m0.C7294l mo3577a(long r10) {
        /*
            r9 = this;
            float r0 = p174m0.C7294l.m14004b(r10)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            r4 = 31
            java.lang.String r5 = "<this>"
            if (r0 <= 0) goto L_0x004a
            android.widget.EdgeEffect r0 = r9.f1240d
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x001f
            androidx.compose.foundation.c r7 = androidx.compose.foundation.C0552c.f1293a
            float r0 = r7.mo3713b(r0)
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            if (r0 != 0) goto L_0x004a
            android.widget.EdgeEffect r0 = r9.f1240d
            float r7 = p174m0.C7294l.m14004b(r10)
            int r7 = p173m.C7279a.m13954l(r7)
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            if (r6 < r4) goto L_0x003c
            r0.onAbsorb(r7)
            goto L_0x0045
        L_0x003c:
            boolean r6 = r0.isFinished()
            if (r6 == 0) goto L_0x0045
            r0.onAbsorb(r7)
        L_0x0045:
            float r0 = p174m0.C7294l.m14004b(r10)
            goto L_0x008f
        L_0x004a:
            float r0 = p174m0.C7294l.m14004b(r10)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008e
            android.widget.EdgeEffect r0 = r9.f1241e
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0062
            androidx.compose.foundation.c r7 = androidx.compose.foundation.C0552c.f1293a
            float r0 = r7.mo3713b(r0)
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            r0 = r3
            goto L_0x006a
        L_0x0069:
            r0 = r2
        L_0x006a:
            if (r0 != 0) goto L_0x008e
            android.widget.EdgeEffect r0 = r9.f1241e
            float r7 = p174m0.C7294l.m14004b(r10)
            int r7 = p173m.C7279a.m13954l(r7)
            int r7 = -r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            if (r6 < r4) goto L_0x0080
            r0.onAbsorb(r7)
            goto L_0x0089
        L_0x0080:
            boolean r6 = r0.isFinished()
            if (r6 == 0) goto L_0x0089
            r0.onAbsorb(r7)
        L_0x0089:
            float r0 = p174m0.C7294l.m14004b(r10)
            goto L_0x008f
        L_0x008e:
            r0 = r1
        L_0x008f:
            float r6 = p174m0.C7294l.m14005c(r10)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d2
            android.widget.EdgeEffect r6 = r9.f1238b
            kotlin.jvm.internal.C19383o.m32797g(r6, r5)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r4) goto L_0x00a7
            androidx.compose.foundation.c r8 = androidx.compose.foundation.C0552c.f1293a
            float r6 = r8.mo3713b(r6)
            goto L_0x00a8
        L_0x00a7:
            r6 = r1
        L_0x00a8:
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00ae
            r6 = r3
            goto L_0x00af
        L_0x00ae:
            r6 = r2
        L_0x00af:
            if (r6 != 0) goto L_0x00d2
            android.widget.EdgeEffect r1 = r9.f1238b
            float r6 = p174m0.C7294l.m14005c(r10)
            int r6 = p173m.C7279a.m13954l(r6)
            kotlin.jvm.internal.C19383o.m32797g(r1, r5)
            if (r7 < r4) goto L_0x00c4
            r1.onAbsorb(r6)
            goto L_0x00cd
        L_0x00c4:
            boolean r4 = r1.isFinished()
            if (r4 == 0) goto L_0x00cd
            r1.onAbsorb(r6)
        L_0x00cd:
            float r1 = p174m0.C7294l.m14005c(r10)
            goto L_0x0115
        L_0x00d2:
            float r6 = p174m0.C7294l.m14005c(r10)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x0115
            android.widget.EdgeEffect r6 = r9.f1239c
            kotlin.jvm.internal.C19383o.m32797g(r6, r5)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r4) goto L_0x00ea
            androidx.compose.foundation.c r8 = androidx.compose.foundation.C0552c.f1293a
            float r6 = r8.mo3713b(r6)
            goto L_0x00eb
        L_0x00ea:
            r6 = r1
        L_0x00eb:
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00f1
            r6 = r3
            goto L_0x00f2
        L_0x00f1:
            r6 = r2
        L_0x00f2:
            if (r6 != 0) goto L_0x0115
            android.widget.EdgeEffect r1 = r9.f1239c
            float r6 = p174m0.C7294l.m14005c(r10)
            int r6 = p173m.C7279a.m13954l(r6)
            int r6 = -r6
            kotlin.jvm.internal.C19383o.m32797g(r1, r5)
            if (r7 < r4) goto L_0x0108
            r1.onAbsorb(r6)
            goto L_0x0111
        L_0x0108:
            boolean r4 = r1.isFinished()
            if (r4 == 0) goto L_0x0111
            r1.onAbsorb(r6)
        L_0x0111:
            float r1 = p174m0.C7294l.m14005c(r10)
        L_0x0115:
            long r10 = androidx.compose.p015ui.text.input.C1993m.m4370p(r0, r1)
            long r0 = p174m0.C7294l.f16176b
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0120
            r2 = r3
        L_0x0120:
            if (r2 != 0) goto L_0x0125
            r9.mo3588k()
        L_0x0125:
            m0.l r0 = new m0.l
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo3577a(long):m0.l");
    }

    /* renamed from: b */
    public final boolean mo3578b() {
        List<EdgeEffect> list = this.f1242f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            C19383o.m32797g(edgeEffect, "<this>");
            if (!((Build.VERSION.SDK_INT >= 31 ? C0552c.f1293a.mo3713b(edgeEffect) : 0.0f) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final C19394m mo3579c(long j) {
        boolean z = false;
        this.f1249m = false;
        if (C7294l.m14004b(j) > 0.0f) {
            EdgeEffect edgeEffect = this.f1240d;
            int l = C7279a.m13954l(C7294l.m14004b(j));
            C19383o.m32797g(edgeEffect, "<this>");
            if (Build.VERSION.SDK_INT >= 31) {
                edgeEffect.onAbsorb(l);
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb(l);
            }
        } else if (C7294l.m14004b(j) < 0.0f) {
            EdgeEffect edgeEffect2 = this.f1241e;
            int i = -C7279a.m13954l(C7294l.m14004b(j));
            C19383o.m32797g(edgeEffect2, "<this>");
            if (Build.VERSION.SDK_INT >= 31) {
                edgeEffect2.onAbsorb(i);
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb(i);
            }
        }
        if (C7294l.m14005c(j) > 0.0f) {
            EdgeEffect edgeEffect3 = this.f1238b;
            int l2 = C7279a.m13954l(C7294l.m14005c(j));
            C19383o.m32797g(edgeEffect3, "<this>");
            if (Build.VERSION.SDK_INT >= 31) {
                edgeEffect3.onAbsorb(l2);
            } else if (edgeEffect3.isFinished()) {
                edgeEffect3.onAbsorb(l2);
            }
        } else if (C7294l.m14005c(j) < 0.0f) {
            EdgeEffect edgeEffect4 = this.f1239c;
            int i2 = -C7279a.m13954l(C7294l.m14005c(j));
            C19383o.m32797g(edgeEffect4, "<this>");
            if (Build.VERSION.SDK_INT >= 31) {
                edgeEffect4.onAbsorb(i2);
            } else if (edgeEffect4.isFinished()) {
                edgeEffect4.onAbsorb(i2);
            }
        }
        if (j == C7294l.f16176b) {
            z = true;
        }
        if (!z) {
            mo3588k();
        }
        mo3583g();
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0130  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo3580d(long r9, p288y.C8343c r11) {
        /*
            r8 = this;
            boolean r0 = r8.f1249m
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x005f
            long r4 = r8.f1250n
            long r4 = androidx.activity.C0114h.m298c0(r4)
            android.widget.EdgeEffect r0 = r8.f1240d
            float r0 = androidx.activity.C0114h.m299d0(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 != 0) goto L_0x0021
            long r6 = p288y.C8343c.f18295b
            r8.mo3590m(r6, r4)
        L_0x0021:
            android.widget.EdgeEffect r0 = r8.f1241e
            float r0 = androidx.activity.C0114h.m299d0(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            r0 = r2
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            if (r0 != 0) goto L_0x0035
            long r6 = p288y.C8343c.f18295b
            r8.mo3591n(r6, r4)
        L_0x0035:
            android.widget.EdgeEffect r0 = r8.f1238b
            float r0 = androidx.activity.C0114h.m299d0(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
            r0 = r2
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r0 != 0) goto L_0x0049
            long r6 = p288y.C8343c.f18295b
            r8.mo3592o(r6, r4)
        L_0x0049:
            android.widget.EdgeEffect r0 = r8.f1239c
            float r0 = androidx.activity.C0114h.m299d0(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            r0 = r2
            goto L_0x0056
        L_0x0055:
            r0 = r1
        L_0x0056:
            if (r0 != 0) goto L_0x005d
            long r6 = p288y.C8343c.f18295b
            r8.mo3589l(r6, r4)
        L_0x005d:
            r8.f1249m = r2
        L_0x005f:
            if (r11 == 0) goto L_0x0064
            long r4 = r11.f18299a
            goto L_0x006a
        L_0x0064:
            long r4 = r8.f1250n
            long r4 = androidx.activity.C0114h.m298c0(r4)
        L_0x006a:
            float r11 = p288y.C8343c.m16643d(r9)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0074
            r11 = r2
            goto L_0x0075
        L_0x0074:
            r11 = r1
        L_0x0075:
            if (r11 == 0) goto L_0x0078
            goto L_0x00c8
        L_0x0078:
            android.widget.EdgeEffect r11 = r8.f1238b
            float r11 = androidx.activity.C0114h.m299d0(r11)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0084
            r11 = r2
            goto L_0x0085
        L_0x0084:
            r11 = r1
        L_0x0085:
            if (r11 != 0) goto L_0x00a0
            float r11 = r8.mo3592o(r9, r4)
            android.widget.EdgeEffect r0 = r8.f1238b
            float r0 = androidx.activity.C0114h.m299d0(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0097
            r0 = r2
            goto L_0x0098
        L_0x0097:
            r0 = r1
        L_0x0098:
            if (r0 == 0) goto L_0x00c9
            android.widget.EdgeEffect r0 = r8.f1238b
            r0.onRelease()
            goto L_0x00c9
        L_0x00a0:
            android.widget.EdgeEffect r11 = r8.f1239c
            float r11 = androidx.activity.C0114h.m299d0(r11)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x00ac
            r11 = r2
            goto L_0x00ad
        L_0x00ac:
            r11 = r1
        L_0x00ad:
            if (r11 != 0) goto L_0x00c8
            float r11 = r8.mo3589l(r9, r4)
            android.widget.EdgeEffect r0 = r8.f1239c
            float r0 = androidx.activity.C0114h.m299d0(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00bf
            r0 = r2
            goto L_0x00c0
        L_0x00bf:
            r0 = r1
        L_0x00c0:
            if (r0 == 0) goto L_0x00c9
            android.widget.EdgeEffect r0 = r8.f1239c
            r0.onRelease()
            goto L_0x00c9
        L_0x00c8:
            r11 = r3
        L_0x00c9:
            float r0 = p288y.C8343c.m16642c(r9)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00d3
            r0 = r2
            goto L_0x00d4
        L_0x00d3:
            r0 = r1
        L_0x00d4:
            if (r0 == 0) goto L_0x00d7
            goto L_0x0124
        L_0x00d7:
            android.widget.EdgeEffect r0 = r8.f1240d
            float r0 = androidx.activity.C0114h.m299d0(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00e3
            r0 = r2
            goto L_0x00e4
        L_0x00e3:
            r0 = r1
        L_0x00e4:
            if (r0 != 0) goto L_0x00fe
            float r9 = r8.mo3590m(r9, r4)
            android.widget.EdgeEffect r10 = r8.f1240d
            float r10 = androidx.activity.C0114h.m299d0(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x00f5
            r1 = r2
        L_0x00f5:
            if (r1 == 0) goto L_0x00fc
            android.widget.EdgeEffect r10 = r8.f1240d
            r10.onRelease()
        L_0x00fc:
            r3 = r9
            goto L_0x0124
        L_0x00fe:
            android.widget.EdgeEffect r0 = r8.f1241e
            float r0 = androidx.activity.C0114h.m299d0(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x010a
            r0 = r2
            goto L_0x010b
        L_0x010a:
            r0 = r1
        L_0x010b:
            if (r0 != 0) goto L_0x0124
            float r9 = r8.mo3591n(r9, r4)
            android.widget.EdgeEffect r10 = r8.f1241e
            float r10 = androidx.activity.C0114h.m299d0(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x011c
            r1 = r2
        L_0x011c:
            if (r1 == 0) goto L_0x00fc
            android.widget.EdgeEffect r10 = r8.f1241e
            r10.onRelease()
            goto L_0x00fc
        L_0x0124:
            long r9 = kotlin.reflect.C19421p.m32952q(r3, r11)
            long r0 = p288y.C8343c.f18295b
            boolean r11 = p288y.C8343c.m16640a(r9, r0)
            if (r11 != 0) goto L_0x0133
            r8.mo3588k()
        L_0x0133:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo3580d(long, y.c):long");
    }

    /* renamed from: e */
    public final C1436d mo3581e() {
        return this.f1254r;
    }

    /* renamed from: f */
    public final void mo3582f(long j, long j2, C8343c cVar, int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i == 1) {
            long c0 = cVar != null ? cVar.f18299a : C0114h.m298c0(this.f1250n);
            if (C8343c.m16642c(j2) > 0.0f) {
                mo3590m(j2, c0);
            } else if (C8343c.m16642c(j2) < 0.0f) {
                mo3591n(j2, c0);
            }
            if (C8343c.m16643d(j2) > 0.0f) {
                mo3592o(j2, c0);
            } else if (C8343c.m16643d(j2) < 0.0f) {
                mo3589l(j2, c0);
            }
            z = !C8343c.m16640a(j2, C8343c.f18295b);
        } else {
            z = false;
        }
        if (this.f1240d.isFinished() || C8343c.m16642c(j) >= 0.0f) {
            z2 = false;
        } else {
            this.f1240d.onRelease();
            z2 = this.f1240d.isFinished();
        }
        if (!this.f1241e.isFinished() && C8343c.m16642c(j) > 0.0f) {
            this.f1241e.onRelease();
            z2 = z2 || this.f1241e.isFinished();
        }
        if (!this.f1238b.isFinished() && C8343c.m16643d(j) < 0.0f) {
            this.f1238b.onRelease();
            z2 = z2 || this.f1238b.isFinished();
        }
        if (!this.f1239c.isFinished() && C8343c.m16643d(j) > 0.0f) {
            this.f1239c.onRelease();
            z2 = z2 || this.f1239c.isFinished();
        }
        if (z2 || z) {
            z3 = true;
        }
        if (z3) {
            mo3588k();
        }
    }

    /* renamed from: g */
    public final void mo3583g() {
        List<EdgeEffect> list = this.f1242f;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            mo3588k();
        }
    }

    /* renamed from: h */
    public final boolean mo3584h(C1741h hVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-C8347f.m16656d(this.f1250n), (-C8347f.m16654b(this.f1250n)) + hVar.mo3789B0(this.f1237a.f2159b.mo4150a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: i */
    public final boolean mo3585i(C1741h hVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-C8347f.m16654b(this.f1250n), hVar.mo3789B0(this.f1237a.f2159b.mo4151b(hVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean isEnabled() {
        return ((Boolean) this.f1251o.getValue()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo3587j(C1741h hVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int l = C7279a.m13954l(C8347f.m16656d(this.f1250n));
        float c = this.f1237a.f2159b.mo4152c(hVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, hVar.mo3789B0(c) + (-((float) l)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: k */
    public final void mo3588k() {
        if (this.f1248l) {
            this.f1247k.setValue(C19394m.f43287a);
        }
    }

    /* renamed from: l */
    public final float mo3589l(long j, long j2) {
        float c = C8343c.m16642c(j2) / C8347f.m16656d(this.f1250n);
        float d = C8343c.m16643d(j) / C8347f.m16654b(this.f1250n);
        EdgeEffect edgeEffect = this.f1239c;
        float f = -d;
        float f2 = ((float) 1) - c;
        C19383o.m32797g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f = C0552c.f1293a.mo3714c(edgeEffect, f, f2);
        } else {
            edgeEffect.onPull(f, f2);
        }
        return C8347f.m16654b(this.f1250n) * (-f);
    }

    /* renamed from: m */
    public final float mo3590m(long j, long j2) {
        float d = C8343c.m16643d(j2) / C8347f.m16654b(this.f1250n);
        float c = C8343c.m16642c(j) / C8347f.m16656d(this.f1250n);
        EdgeEffect edgeEffect = this.f1240d;
        float f = ((float) 1) - d;
        C19383o.m32797g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            c = C0552c.f1293a.mo3714c(edgeEffect, c, f);
        } else {
            edgeEffect.onPull(c, f);
        }
        return C8347f.m16656d(this.f1250n) * c;
    }

    /* renamed from: n */
    public final float mo3591n(long j, long j2) {
        float d = C8343c.m16643d(j2) / C8347f.m16654b(this.f1250n);
        float c = C8343c.m16642c(j) / C8347f.m16656d(this.f1250n);
        EdgeEffect edgeEffect = this.f1241e;
        float f = -c;
        C19383o.m32797g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f = C0552c.f1293a.mo3714c(edgeEffect, f, d);
        } else {
            edgeEffect.onPull(f, d);
        }
        return C8347f.m16656d(this.f1250n) * (-f);
    }

    /* renamed from: o */
    public final float mo3592o(long j, long j2) {
        float c = C8343c.m16642c(j2) / C8347f.m16656d(this.f1250n);
        float d = C8343c.m16643d(j) / C8347f.m16654b(this.f1250n);
        EdgeEffect edgeEffect = this.f1238b;
        C19383o.m32797g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            d = C0552c.f1293a.mo3714c(edgeEffect, d, c);
        } else {
            edgeEffect.onPull(d, c);
        }
        return C8347f.m16654b(this.f1250n) * d;
    }

    public final void setEnabled(boolean z) {
        boolean z2 = this.f1252p != z;
        this.f1251o.setValue(Boolean.valueOf(z));
        this.f1252p = z;
        if (z2) {
            this.f1249m = false;
            mo3583g();
        }
    }
}
