package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0450s;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.C1898e;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 extends Lambda implements C19862q<C19861p<? super C1302d, ? super Integer, ? extends C19394m>, C1302d, Integer, C19394m> {
    public final /* synthetic */ C1251s1 $current;
    public final /* synthetic */ C1251s1 $key;
    public final /* synthetic */ List<C1251s1> $keys;
    public final /* synthetic */ C1257u0<C1251s1> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(C1251s1 s1Var, C1251s1 s1Var2, List<C1251s1> list, C1257u0<C1251s1> u0Var) {
        super(3);
        this.$key = s1Var;
        this.$current = s1Var2;
        this.$keys = list;
        this.$state = u0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C19861p<? super C1302d, ? super Integer, C19394m>) (C19861p) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        C1302d dVar2 = dVar;
        C19383o.m32797g(pVar2, ResponseConstants.CHILDREN);
        if ((i & 14) == 0) {
            i2 = i | (dVar2.mo5408I(pVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar.mo5442i()) {
            boolean b = C19383o.m32792b(this.$key, this.$current);
            int i3 = 75;
            int i4 = b ? 150 : 75;
            if (!b || C19327t.m32636R0(this.$keys).size() == 1) {
                i3 = 0;
            }
            C0433j0 Y0 = C0761x.m1704Y0(i4, i3, C0450s.C0451a.f1169a);
            SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 snackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 = new SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(this.$key, this.$state);
            dVar2.mo5465u(1016418159);
            dVar2.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
            float f = 0.0f;
            if (v == aVar) {
                if (!b) {
                    f = 1.0f;
                }
                v = C19421p.m32945m(f);
                dVar2.mo5454o(v);
            }
            dVar.mo5406H();
            Animatable animatable = (Animatable) v;
            SnackbarHostKt$animatedOpacity$2 snackbarHostKt$animatedOpacity$2 = r10;
            SnackbarHostKt$animatedOpacity$2 snackbarHostKt$animatedOpacity$22 = new SnackbarHostKt$animatedOpacity$2(animatable, b, Y0, snackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1, (C19340c<? super SnackbarHostKt$animatedOpacity$2>) null);
            C1415u.m3031e(Boolean.valueOf(b), snackbarHostKt$animatedOpacity$2, dVar2);
            C0424f<T, V> fVar = animatable.f1008c;
            dVar.mo5406H();
            C0433j0 Y02 = C0761x.m1704Y0(i4, i3, C0450s.f1167a);
            dVar2.mo5465u(2003504988);
            dVar2.mo5465u(-492369756);
            Object v2 = dVar.mo5467v();
            if (v2 == aVar) {
                v2 = C19421p.m32945m(!b ? 1.0f : 0.8f);
                dVar2.mo5454o(v2);
            }
            dVar.mo5406H();
            Animatable animatable2 = (Animatable) v2;
            C1415u.m3031e(Boolean.valueOf(b), new SnackbarHostKt$animatedScale$1(animatable2, b, Y02, (C19340c<? super SnackbarHostKt$animatedScale$1>) null), dVar2);
            C0424f<T, V> fVar2 = animatable2.f1008c;
            dVar.mo5406H();
            C1436d k0 = C19388s.m32869k0(C1436d.C1437a.f3125b, ((Number) fVar2.getValue()).floatValue(), ((Number) fVar2.getValue()).floatValue(), ((Number) fVar.getValue()).floatValue(), 0.0f, 0.0f, (C1530k0) null, false, 65528);
            final C1251s1 s1Var = this.$key;
            C1436d a = SemanticsModifierKt.m4174a(k0, false, new C19857l<C1910q, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C1910q) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(C1910q qVar) {
                    C19383o.m32797g(qVar, "$this$semantics");
                    C1908o.f4256d.mo7356a(qVar, C1908o.f4253a[3], new C1898e());
                    final C1251s1 s1Var = s1Var;
                    C1908o.m4196c(qVar, new C19846a<Boolean>() {
                        public final Boolean invoke() {
                            s1Var.dismiss();
                            return Boolean.TRUE;
                        }
                    });
                }
            });
            dVar2.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(a);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -2137368960);
                dVar2.mo5465u(-421978688);
                pVar.invoke(dVar2, Integer.valueOf(i2 & 14));
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5456p();
                dVar.mo5406H();
                dVar.mo5406H();
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
