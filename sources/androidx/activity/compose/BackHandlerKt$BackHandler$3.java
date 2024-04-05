package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.C0113g;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.lifecycle.C2887s;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class BackHandlerKt$BackHandler$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19846a<C19394m> $onBack;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$3(boolean z, C19846a<C19394m> aVar, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$onBack = aVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        boolean z = this.$enabled;
        C19846a<C19394m> aVar = this.$onBack;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        C19383o.m32797g(aVar, "onBack");
        ComposerImpl h = dVar.mo5440h(-971160336);
        int i5 = i4 & 1;
        if (i5 != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5427a(z) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i4 & 2) != 0) {
            i2 |= 48;
        } else if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(aVar) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) != 0 || !h.mo5442i()) {
            if (i5 != 0) {
                z = true;
            }
            C1338j0 E0 = C0761x.m1664E0(aVar, h);
            h.mo5465u(-3687241);
            Object c0 = h.mo5431c0();
            C1302d.C1303a.C1304a aVar2 = C1302d.C1303a.f2828a;
            if (c0 == aVar2) {
                c0 = new C0108b(z, E0);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C0108b bVar = (C0108b) c0;
            Boolean valueOf = Boolean.valueOf(z);
            h.mo5465u(-3686552);
            boolean I = h.mo5408I(valueOf) | h.mo5408I(bVar);
            Object c02 = h.mo5431c0();
            if (I || c02 == aVar2) {
                c02 = new BackHandlerKt$BackHandler$1$1(bVar, z);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            C1415u.m3033g((C19846a) c02, h);
            C1411t tVar = LocalOnBackPressedDispatcherOwner.f154a;
            h.mo5465u(1680121376);
            C0113g gVar = (C0113g) h.mo5410J(LocalOnBackPressedDispatcherOwner.f154a);
            if (gVar == null) {
                h.mo5465u(1680121441);
                Context context = (Context) h.mo5410J(AndroidCompositionLocals_androidKt.f3987b);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        context = null;
                        break;
                    } else if (context instanceof C0113g) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        C19383o.m32796f(context, "innerContext.baseContext");
                    }
                }
                gVar = (C0113g) context;
                h.mo5418R(false);
            } else {
                h.mo5465u(1680121384);
                h.mo5418R(false);
            }
            h.mo5418R(false);
            if (gVar != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = gVar.getOnBackPressedDispatcher();
                C19383o.m32796f(onBackPressedDispatcher, "checkNotNull(LocalOnBackPressedDispatcherOwner.current) {\n        \"No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner\"\n    }.onBackPressedDispatcher");
                C2887s sVar = (C2887s) h.mo5410J(AndroidCompositionLocals_androidKt.f3989d);
                C1415u.m3027a(sVar, onBackPressedDispatcher, new BackHandlerKt$BackHandler$2(onBackPressedDispatcher, sVar, bVar), h);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new BackHandlerKt$BackHandler$3(z, aVar, i3, i4);
        }
    }
}
