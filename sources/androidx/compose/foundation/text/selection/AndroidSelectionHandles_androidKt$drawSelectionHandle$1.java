package androidx.compose.foundation.text.selection;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.C1440b;
import androidx.compose.p015ui.draw.C1445g;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.p015ui.graphics.C1489a;
import androidx.compose.p015ui.graphics.C1529k;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.C1604x;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8347f;
import p297z.C8410c;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19862q;

final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ ResolvedTextDirection $direction;
    public final /* synthetic */ boolean $handlesCrossed;
    public final /* synthetic */ boolean $isStartHandle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(3);
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-1538687176);
        final long j = ((C1026t) dVar2.mo5410J(TextSelectionColorsKt.f2103a)).f2154a;
        final boolean z = this.$isStartHandle;
        final ResolvedTextDirection resolvedTextDirection = this.$direction;
        final boolean z2 = this.$handlesCrossed;
        C1436d i0 = dVar.mo6148i0(DrawModifierKt.m3071b(new C19857l<C1440b, C1445g>() {
            public final C1445g invoke(C1440b bVar) {
                ColorFilter colorFilter;
                C19383o.m32797g(bVar, "$this$drawWithCache");
                final C1604x d = AndroidSelectionHandles_androidKt.m2009d(bVar, C8347f.m16656d(bVar.mo6168b()) / 2.0f);
                long j = j;
                if (Build.VERSION.SDK_INT >= 29) {
                    colorFilter = C1529k.f3326a.mo6367a(j, 5);
                } else {
                    colorFilter = new PorterDuffColorFilter(C18263b.m30859o0(j), C1489a.m3160b(5));
                }
                final C1546t tVar = new C1546t(colorFilter);
                final boolean z = z;
                final ResolvedTextDirection resolvedTextDirection = resolvedTextDirection;
                final boolean z2 = z2;
                return bVar.mo6169c(new C19857l<C8410c, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C8410c) obj);
                        return C19394m.f43287a;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
                        if (((r1 == androidx.compose.p015ui.text.style.ResolvedTextDirection.Ltr && !r2) || (r1 == androidx.compose.p015ui.text.style.ResolvedTextDirection.Rtl && r2)) == false) goto L_0x003a;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
                        if (r2 == false) goto L_0x003a;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
                        if (r2 != false) goto L_0x003a;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void invoke(p297z.C8410c r11) {
                        /*
                            r10 = this;
                            java.lang.String r0 = "$this$onDrawWithContent"
                            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
                            r11.mo6911O0()
                            boolean r0 = r2
                            androidx.compose.ui.text.style.ResolvedTextDirection r1 = r3
                            boolean r2 = r4
                            java.lang.String r3 = "direction"
                            r4 = 1
                            r5 = 0
                            if (r0 == 0) goto L_0x0024
                            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
                            androidx.compose.ui.text.style.ResolvedTextDirection r0 = androidx.compose.p015ui.text.style.ResolvedTextDirection.Ltr
                            if (r1 != r0) goto L_0x001d
                            if (r2 == 0) goto L_0x003a
                        L_0x001d:
                            androidx.compose.ui.text.style.ResolvedTextDirection r0 = androidx.compose.p015ui.text.style.ResolvedTextDirection.Rtl
                            if (r1 != r0) goto L_0x0039
                            if (r2 == 0) goto L_0x0039
                            goto L_0x003a
                        L_0x0024:
                            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
                            androidx.compose.ui.text.style.ResolvedTextDirection r0 = androidx.compose.p015ui.text.style.ResolvedTextDirection.Ltr
                            if (r1 != r0) goto L_0x002d
                            if (r2 == 0) goto L_0x0033
                        L_0x002d:
                            androidx.compose.ui.text.style.ResolvedTextDirection r0 = androidx.compose.p015ui.text.style.ResolvedTextDirection.Rtl
                            if (r1 != r0) goto L_0x0035
                            if (r2 == 0) goto L_0x0035
                        L_0x0033:
                            r0 = r4
                            goto L_0x0036
                        L_0x0035:
                            r0 = r5
                        L_0x0036:
                            if (r0 != 0) goto L_0x0039
                            goto L_0x003a
                        L_0x0039:
                            r4 = r5
                        L_0x003a:
                            if (r4 == 0) goto L_0x006a
                            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                            r1 = 1065353216(0x3f800000, float:1.0)
                            androidx.compose.ui.graphics.x r2 = r5
                            androidx.compose.ui.graphics.t r3 = r6
                            long r4 = r11.mo6907K0()
                            z.a$b r6 = r11.mo6900C0()
                            long r7 = r6.mo20992b()
                            androidx.compose.ui.graphics.o r9 = r6.mo20991a()
                            r9.mo6264r()
                            z.b r9 = r6.f18430a
                            r9.mo20998e(r0, r4, r1)
                            p297z.C8412e.m16789n0(r11, r2, r3)
                            androidx.compose.ui.graphics.o r11 = r6.mo20991a()
                            r11.mo6261m()
                            r6.mo20993c(r7)
                            goto L_0x0071
                        L_0x006a:
                            androidx.compose.ui.graphics.x r0 = r5
                            androidx.compose.ui.graphics.t r1 = r6
                            p297z.C8412e.m16789n0(r11, r0, r1)
                        L_0x0071:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1.C09681.C09691.invoke(z.c):void");
                    }
                });
            }
        }));
        dVar2.mo5406H();
        return i0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }
}
