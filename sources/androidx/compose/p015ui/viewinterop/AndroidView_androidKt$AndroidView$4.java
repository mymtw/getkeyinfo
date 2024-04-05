package androidx.compose.p015ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p015ui.node.C1754s;
import androidx.compose.p015ui.node.C1757v;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.C1369e;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.C2887s;
import androidx.savedstate.C3269d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4 */
final class AndroidView_androidKt$AndroidView$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19857l<Context, Object> $factory;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Object, C19394m> $update;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$4(C19857l<? super Context, Object> lVar, C1436d dVar, C19857l<Object, C19394m> lVar2, int i, int i2) {
        super(2);
        this.$factory = lVar;
        this.$modifier = dVar;
        this.$update = lVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C19857l<Context, Object> lVar;
        int i3;
        int i4;
        C19857l lVar2;
        C1436d dVar2;
        C19857l<Context, Object> lVar3 = this.$factory;
        C1436d dVar3 = this.$modifier;
        C19857l lVar4 = this.$update;
        int i5 = this.$$changed | 1;
        int i6 = this.$$default;
        C19857l<View, C19394m> lVar5 = AndroidView_androidKt.f4698a;
        C19383o.m32797g(lVar3, "factory");
        ComposerImpl h = dVar.mo5440h(-1783766393);
        if ((i6 & 1) != 0) {
            i2 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i2 = (h.mo5408I(lVar3) ? 4 : 2) | i5;
        } else {
            i2 = i5;
        }
        int i7 = i6 & 2;
        if (i7 != 0) {
            i2 |= 48;
        } else if ((i5 & 112) == 0) {
            i2 |= h.mo5408I(dVar3) ? 32 : 16;
        }
        int i8 = i6 & 4;
        if (i8 != 0) {
            i2 |= 384;
        } else if ((i5 & 896) == 0) {
            i2 |= h.mo5408I(lVar4) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            if (i7 != 0) {
                dVar3 = C1436d.C1437a.f3125b;
            }
            C1436d dVar4 = dVar3;
            if (i8 != 0) {
                lVar4 = AndroidView_androidKt.f4698a;
            }
            C19857l lVar6 = lVar4;
            Context context = (Context) h.mo5410J(AndroidCompositionLocals_androidKt.f3987b);
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
            if (c0 == aVar) {
                c0 = new C2075c();
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C2075c cVar = (C2075c) c0;
            h.mo5465u(-492369756);
            Object c02 = h.mo5431c0();
            if (c02 == aVar) {
                c02 = new NestedScrollDispatcher();
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) c02;
            C1436d c = ComposedModifierKt.m3051c(h, SemanticsModifierKt.m4174a(dVar4.mo6148i0(NestedScrollModifierKt.m3433a(C1436d.C1437a.f3125b, cVar, nestedScrollDispatcher)), true, AndroidView_androidKt$AndroidView$modifierWithSemantics$1.INSTANCE));
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1324g m0 = C0005b.m50m0(h);
            C1369e eVar = (C1369e) h.mo5410J(SaveableStateRegistryKt.f2970a);
            String valueOf = String.valueOf(h.f2703L);
            h.mo5465u(-492369756);
            Object c03 = h.mo5431c0();
            if (c03 == aVar) {
                c03 = new C1754s();
                h.mo5407H0(c03);
            }
            h.mo5418R(false);
            C3269d dVar5 = (C3269d) h.mo5410J(AndroidCompositionLocals_androidKt.f3990e);
            C1436d dVar6 = dVar4;
            C1754s sVar = (C1754s) c03;
            i3 = i6;
            LayoutDirection layoutDirection2 = layoutDirection;
            C1324g gVar = m0;
            i4 = i5;
            C2887s sVar2 = (C2887s) h.mo5410J(AndroidCompositionLocals_androidKt.f3989d);
            NestedScrollDispatcher nestedScrollDispatcher2 = nestedScrollDispatcher;
            C19857l<Context, Object> lVar7 = lVar3;
            lVar = lVar3;
            C7282b bVar2 = bVar;
            C1369e eVar2 = eVar;
            C1369e eVar3 = eVar;
            C1436d dVar7 = c;
            String str = valueOf;
            AndroidView_androidKt$AndroidView$1 androidView_androidKt$AndroidView$1 = new AndroidView_androidKt$AndroidView$1(context, gVar, nestedScrollDispatcher2, lVar7, eVar2, valueOf, sVar);
            h.mo5465u(1886828752);
            if (h.f2715a instanceof C1757v) {
                h.mo5470w0();
                if (h.f2702K) {
                    h.mo5450m(new AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1(androidView_androidKt$AndroidView$1));
                } else {
                    h.mo5452n();
                }
                C1754s sVar3 = sVar;
                Updater.m2571b(h, dVar7, new AndroidView_androidKt$AndroidView$2$1(sVar3));
                Updater.m2571b(h, bVar2, new AndroidView_androidKt$AndroidView$2$2(sVar3));
                Updater.m2571b(h, sVar2, new AndroidView_androidKt$AndroidView$2$3(sVar3));
                Updater.m2571b(h, dVar5, new AndroidView_androidKt$AndroidView$2$4(sVar3));
                Updater.m2571b(h, lVar6, new AndroidView_androidKt$AndroidView$2$5(sVar3));
                Updater.m2571b(h, layoutDirection2, new AndroidView_androidKt$AndroidView$2$6(sVar3));
                h.mo5418R(true);
                h.mo5418R(false);
                if (eVar3 != null) {
                    C1369e eVar4 = eVar3;
                    String str2 = str;
                    C1415u.m3027a(eVar4, str2, new AndroidView_androidKt$AndroidView$3(eVar4, str2, sVar3), h);
                }
                lVar2 = lVar6;
                dVar2 = dVar6;
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
            dVar2 = dVar3;
            lVar2 = lVar4;
            lVar = lVar3;
            i4 = i5;
            i3 = i6;
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AndroidView_androidKt$AndroidView$4(lVar, dVar2, lVar2, i4, i3);
        }
    }
}
