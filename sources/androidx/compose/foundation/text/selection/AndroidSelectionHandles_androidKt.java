package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.p015ui.window.AndroidPopup_androidKt;
import androidx.compose.p015ui.window.C2093f;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7287g;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19861p;

public final class AndroidSelectionHandles_androidKt {
    /* renamed from: a */
    public static final void m2006a(C1436d dVar, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, C1302d dVar2, int i) {
        int i2;
        C19383o.m32797g(dVar, "modifier");
        C19383o.m32797g(resolvedTextDirection, "direction");
        ComposerImpl h = dVar2.mo5440h(47957398);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5427a(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5408I(resolvedTextDirection) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.mo5427a(z2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            C1436d m = SizeKt.m1493m(dVar, C1014i.f2129a, C1014i.f2130b);
            C19383o.m32797g(m, "<this>");
            C15588c1.m25324f(ComposedModifierKt.m3049a(m, InspectableValueKt.f4032a, new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(z, resolvedTextDirection, z2)), h, 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(dVar, z, resolvedTextDirection, z2, i);
        }
    }

    /* renamed from: b */
    public static final void m2007b(long j, HandleReferencePoint handleReferencePoint, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(handleReferencePoint, "handleReferencePoint");
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-1409050158);
        if ((i & 14) == 0) {
            i2 = (h.mo5434e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(handleReferencePoint) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5408I(pVar) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            long o = C19421p.m32949o(C7279a.m13954l(C8343c.m16642c(j)), C7279a.m13954l(C8343c.m16643d(j)));
            C7287g gVar = new C7287g(o);
            h.mo5465u(511388516);
            boolean I = h.mo5408I(gVar) | h.mo5408I(handleReferencePoint);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new C1006c(handleReferencePoint, o);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            AndroidPopup_androidKt.m4514a((C1006c) c0, (C19846a<C19394m>) null, new C2093f(false, false, false, true, 15), pVar, h, (i2 << 3) & 7168, 2);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AndroidSelectionHandles_androidKt$HandlePopup$1(j, handleReferencePoint, pVar, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r11 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00aa, code lost:
        if (r11 != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bc, code lost:
        if (((r10 == androidx.compose.p015ui.text.style.ResolvedTextDirection.Ltr && !r11) || (r10 == androidx.compose.p015ui.text.style.ResolvedTextDirection.Rtl && r11)) == false) goto L_0x00c0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2008c(long r18, boolean r20, androidx.compose.p015ui.text.style.ResolvedTextDirection r21, boolean r22, androidx.compose.p015ui.C1436d r23, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r24, androidx.compose.runtime.C1302d r25, int r26) {
        /*
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r26
            java.lang.String r0 = "direction"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            r0 = -616295642(0xffffffffdb441326, float:-5.5190149E16)
            r1 = r25
            androidx.compose.runtime.ComposerImpl r14 = r1.mo5440h(r0)
            r0 = r13 & 14
            r7 = r18
            if (r0 != 0) goto L_0x002e
            boolean r0 = r14.mo5434e(r7)
            if (r0 == 0) goto L_0x002b
            r0 = 4
            goto L_0x002c
        L_0x002b:
            r0 = 2
        L_0x002c:
            r0 = r0 | r13
            goto L_0x002f
        L_0x002e:
            r0 = r13
        L_0x002f:
            r1 = r13 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x003f
            boolean r1 = r14.mo5427a(r9)
            if (r1 == 0) goto L_0x003c
            r1 = 32
            goto L_0x003e
        L_0x003c:
            r1 = 16
        L_0x003e:
            r0 = r0 | r1
        L_0x003f:
            r1 = r13 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x004f
            boolean r1 = r14.mo5408I(r10)
            if (r1 == 0) goto L_0x004c
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x004e
        L_0x004c:
            r1 = 128(0x80, float:1.794E-43)
        L_0x004e:
            r0 = r0 | r1
        L_0x004f:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x005f
            boolean r1 = r14.mo5427a(r11)
            if (r1 == 0) goto L_0x005c
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x005e
        L_0x005c:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x005e:
            r0 = r0 | r1
        L_0x005f:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x0071
            boolean r1 = r14.mo5408I(r12)
            if (r1 == 0) goto L_0x006e
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0070
        L_0x006e:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x0070:
            r0 = r0 | r1
        L_0x0071:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r13
            r15 = r24
            if (r1 != 0) goto L_0x0084
            boolean r1 = r14.mo5408I(r15)
            if (r1 == 0) goto L_0x0081
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0083
        L_0x0081:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0083:
            r0 = r0 | r1
        L_0x0084:
            r16 = r0
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r16 & r0
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r1) goto L_0x009c
            boolean r0 = r14.mo5442i()
            if (r0 != 0) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            r14.mo5396C()
            goto L_0x00f2
        L_0x009c:
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x00ad
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = androidx.compose.p015ui.text.style.ResolvedTextDirection.Ltr
            if (r10 != r2) goto L_0x00a6
            if (r11 == 0) goto L_0x00c0
        L_0x00a6:
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = androidx.compose.p015ui.text.style.ResolvedTextDirection.Rtl
            if (r10 != r2) goto L_0x00bf
            if (r11 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00ad:
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = androidx.compose.p015ui.text.style.ResolvedTextDirection.Ltr
            if (r10 != r2) goto L_0x00b3
            if (r11 == 0) goto L_0x00b9
        L_0x00b3:
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = androidx.compose.p015ui.text.style.ResolvedTextDirection.Rtl
            if (r10 != r2) goto L_0x00bb
            if (r11 == 0) goto L_0x00bb
        L_0x00b9:
            r2 = r0
            goto L_0x00bc
        L_0x00bb:
            r2 = r1
        L_0x00bc:
            if (r2 != 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r0 = r1
        L_0x00c0:
            if (r0 == 0) goto L_0x00c5
            androidx.compose.foundation.text.selection.HandleReferencePoint r0 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopRight
            goto L_0x00c7
        L_0x00c5:
            androidx.compose.foundation.text.selection.HandleReferencePoint r0 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopLeft
        L_0x00c7:
            r17 = r0
            r6 = 732099485(0x2ba2f39d, float:1.1578409E-12)
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1 r4 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
            r0 = r4
            r1 = r24
            r2 = r23
            r3 = r20
            r9 = r4
            r4 = r18
            r10 = r6
            r6 = r16
            r7 = r21
            r8 = r22
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r4 = p628nj.C18263b.m30805A(r14, r10, r9)
            r0 = r16 & 14
            r6 = r0 | 384(0x180, float:5.38E-43)
            r1 = r18
            r3 = r17
            r5 = r14
            m2007b(r1, r3, r4, r5, r6)
        L_0x00f2:
            androidx.compose.runtime.v0 r9 = r14.mo5421U()
            if (r9 != 0) goto L_0x00f9
            goto L_0x010f
        L_0x00f9:
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2 r10 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
            r0 = r10
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r26
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            r9.f3081d = r10
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m2008c(long, boolean, androidx.compose.ui.text.style.ResolvedTextDirection, boolean, androidx.compose.ui.d, kq.p, androidx.compose.runtime.d, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r1 > r6) goto L_0x0028;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p015ui.graphics.C1604x m2009d(androidx.compose.p015ui.draw.C1440b r23, float r24) {
        /*
            r0 = r23
            r3 = r24
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r1 = r1 * 2
            androidx.compose.ui.graphics.x r2 = p628nj.C18263b.f40064d
            androidx.compose.ui.graphics.o r4 = p628nj.C18263b.f40065e
            z.a r5 = p628nj.C18263b.f40066f
            if (r2 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0028
            int r6 = r2.getWidth()
            if (r1 > r6) goto L_0x0028
            int r6 = r2.getHeight()
            if (r1 <= r6) goto L_0x0037
        L_0x0028:
            r2 = 1
            r4 = 24
            androidx.compose.ui.graphics.d r2 = kotlin.reflect.C19421p.m32947n(r1, r1, r2, r4)
            p628nj.C18263b.f40064d = r2
            androidx.compose.ui.graphics.b r4 = kotlin.jvm.internal.C19382n.m32742d(r2)
            p628nj.C18263b.f40065e = r4
        L_0x0037:
            r8 = r2
            r9 = r4
            if (r5 != 0) goto L_0x0042
            z.a r5 = new z.a
            r5.<init>()
            p628nj.C18263b.f40066f = r5
        L_0x0042:
            r7 = r5
            androidx.compose.ui.draw.a r1 = r0.f3132b
            androidx.compose.ui.unit.LayoutDirection r1 = r1.getLayoutDirection()
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r4 = r8.getHeight()
            float r4 = (float) r4
            long r4 = androidx.activity.C0114h.m319t(r2, r4)
            z.a$a r2 = r7.f18422b
            m0.b r6 = r2.f18426a
            androidx.compose.ui.unit.LayoutDirection r15 = r2.f18427b
            androidx.compose.ui.graphics.o r13 = r2.f18428c
            long r11 = r2.f18429d
            r2.f18426a = r0
            r2.mo20987a(r1)
            r2.f18428c = r9
            r2.f18429d = r4
            r9.mo6264r()
            long r0 = androidx.compose.p015ui.graphics.C1545s.f3357b
            r4 = 0
            long r16 = r7.mo6913b()
            r2 = 0
            r18 = 58
            r10 = r7
            r19 = r11
            r11 = r0
            r1 = r13
            r13 = r4
            r4 = r15
            r15 = r16
            r17 = r2
            p297z.C8412e.m16785N(r10, r11, r13, r15, r17, r18)
            r21 = 4278190080(0xff000000, double:2.113706745E-314)
            long r11 = p628nj.C18263b.m30836c(r21)
            long r13 = p288y.C8343c.f18295b
            long r15 = androidx.activity.C0114h.m319t(r3, r3)
            r17 = 0
            r18 = 120(0x78, float:1.68E-43)
            p297z.C8412e.m16785N(r10, r11, r13, r15, r17, r18)
            long r10 = p628nj.C18263b.m30836c(r21)
            long r12 = kotlin.reflect.C19421p.m32952q(r3, r3)
            r14 = 0
            r15 = 120(0x78, float:1.68E-43)
            r0 = r7
            r5 = r1
            r1 = r10
            r3 = r24
            r10 = r4
            r11 = r5
            r4 = r12
            r12 = r6
            r6 = r14
            r13 = r7
            r7 = r15
            p297z.C8412e.m16793y(r0, r1, r3, r4, r6, r7)
            r9.mo6261m()
            z.a$a r0 = r13.f18422b
            r0.getClass()
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.C19383o.m32797g(r12, r1)
            r0.f18426a = r12
            r0.mo20987a(r10)
            kotlin.jvm.internal.C19383o.m32797g(r11, r1)
            r0.f18428c = r11
            r1 = r19
            r0.f18429d = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m2009d(androidx.compose.ui.draw.b, float):androidx.compose.ui.graphics.x");
    }
}
