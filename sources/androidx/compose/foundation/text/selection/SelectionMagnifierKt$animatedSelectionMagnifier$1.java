package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0428h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;

final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C19846a<C8343c> $magnifierCenter;
    public final /* synthetic */ C19857l<C19846a<C8343c>, C1436d> $platformMagnifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(C19846a<C8343c> aVar, C19857l<? super C19846a<C8343c>, ? extends C1436d> lVar) {
        super(3);
        this.$magnifierCenter = aVar;
        this.$platformMagnifier = lVar;
    }

    /* renamed from: access$invoke$lambda-0  reason: not valid java name */
    public static final long m34719access$invoke$lambda0(C1342k1 k1Var) {
        return ((C8343c) k1Var.getValue()).f18299a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(759876635);
        C19846a<C8343c> aVar = this.$magnifierCenter;
        C0428h hVar = SelectionMagnifierKt.f2059a;
        dVar2.mo5465u(-1589795249);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        C1302d.C1303a.C1304a aVar2 = C1302d.C1303a.f2828a;
        if (v == aVar2) {
            v = C0761x.m1687Q(aVar);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C1342k1 k1Var = (C1342k1) v;
        dVar2.mo5465u(-492369756);
        Object v2 = dVar2.mo5467v();
        if (v2 == aVar2) {
            v2 = new Animatable(new C8343c(((C8343c) k1Var.getValue()).f18299a), SelectionMagnifierKt.f2060b, new C8343c(SelectionMagnifierKt.f2061c));
            dVar2.mo5454o(v2);
        }
        dVar2.mo5406H();
        Animatable animatable = (Animatable) v2;
        C1415u.m3031e(C19394m.f43287a, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(k1Var, animatable, (C19340c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1>) null), dVar2);
        final C0424f<T, V> fVar = animatable.f1008c;
        dVar2.mo5406H();
        C1436d invoke = this.$platformMagnifier.invoke(new C19846a<C8343c>() {
            public /* synthetic */ Object invoke() {
                return new C8343c(m34720invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0  reason: not valid java name */
            public final long m34720invokeF1C5BW0() {
                return SelectionMagnifierKt$animatedSelectionMagnifier$1.m34719access$invoke$lambda0(fVar);
            }
        });
        dVar2.mo5406H();
        return invoke;
    }
}
