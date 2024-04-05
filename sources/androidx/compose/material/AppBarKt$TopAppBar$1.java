package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0708a0;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

public final class AppBarKt$TopAppBar$1 extends Lambda implements C19862q<C0763z, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $actions;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $navigationIcon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(3);
        this.$navigationIcon = pVar;
        this.$$dirty = i;
        this.$title = pVar2;
        this.$actions = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0763z) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0763z zVar, C1302d dVar, int i) {
        C19383o.m32797g(zVar, "$this$AppBar");
        if ((i & 14) == 0) {
            i |= dVar.mo5408I(zVar) ? 4 : 2;
        }
        if ((i & 91) != 18 || !dVar.mo5442i()) {
            if (this.$navigationIcon == null) {
                dVar.mo5465u(-512812651);
                C15588c1.m25324f(AppBarKt.f2171c, dVar, 6);
                dVar.mo5406H();
            } else {
                dVar.mo5465u(-512812592);
                C1436d dVar2 = AppBarKt.f2172d;
                C1432b.C1434b bVar = C1428a.C1429a.f3114j;
                C19861p<C1302d, Integer, C19394m> pVar = this.$navigationIcon;
                int i2 = this.$$dirty;
                dVar.mo5465u(693286680);
                C1711v a = RowKt.m1480a(C0718d.f1476a, bVar, dVar);
                dVar.mo5465u(-1323940314);
                C7282b bVar2 = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
                LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
                C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
                ComposeUiNode.f3776c0.getClass();
                C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
                ComposableLambdaImpl a2 = C1700o.m3617a(dVar2);
                if (dVar.mo5446k() instanceof C1299c) {
                    dVar.mo5392A();
                    if (dVar.mo5436f()) {
                        dVar.mo5450m(aVar);
                    } else {
                        dVar.mo5452n();
                    }
                    dVar.mo5394B();
                    Updater.m2571b(dVar, a, ComposeUiNode.Companion.f3781e);
                    Updater.m2571b(dVar, bVar2, ComposeUiNode.Companion.f3780d);
                    Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                    C0472h.m1246i(0, a2, C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 2058660585, -678309503);
                    dVar.mo5465u(1485618042);
                    CompositionLocalKt.m2530a(new C1412t0[]{ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C19543e0.m33301S(dVar)))}, pVar, dVar, ((i2 >> 3) & 112) | 8);
                    dVar.mo5406H();
                    dVar.mo5406H();
                    dVar.mo5406H();
                    dVar.mo5456p();
                    dVar.mo5406H();
                    dVar.mo5406H();
                    dVar.mo5406H();
                } else {
                    C0005b.m45j0();
                    throw null;
                }
            }
            C1436d a3 = zVar.mo4073a(SizeKt.m1485e(C1436d.C1437a.f3125b), true);
            C1432b.C1434b bVar3 = C1428a.C1429a.f3114j;
            C19861p<C1302d, Integer, C19394m> pVar2 = this.$title;
            int i3 = this.$$dirty;
            dVar.mo5465u(693286680);
            C1711v a4 = RowKt.m1480a(C0718d.f1476a, bVar3, dVar);
            dVar.mo5465u(-1323940314);
            C7282b bVar4 = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection2 = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var2 = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a5 = C1700o.m3617a(a3);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, a4, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar4, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection2, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a5, C0073e.m204d(dVar, j1Var2, ComposeUiNode.Companion.f3783g, dVar), dVar, 2058660585, -678309503);
                dVar.mo5465u(159489950);
                TextKt.m2282a(((C1178d2) dVar.mo5410J(TypographyKt.f2371a)).f2407f, C18263b.m30805A(dVar, -2021518195, new AppBarKt$TopAppBar$1$2$1(pVar2, i3)), dVar, 48);
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5456p();
                dVar.mo5406H();
                dVar.mo5406H();
                C1412t0[] t0VarArr = {ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C19543e0.m33302T(dVar)))};
                final C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$actions;
                final int i4 = this.$$dirty;
                CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, 1157662914, new C19861p<C1302d, Integer, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C1302d) obj, ((Number) obj2).intValue());
                        return C19394m.f43287a;
                    }

                    public final void invoke(C1302d dVar, int i) {
                        if ((i & 11) != 2 || !dVar.mo5442i()) {
                            C1436d e = SizeKt.m1485e(C1436d.C1437a.f3125b);
                            C0718d.C0721c cVar = C0718d.f1477b;
                            C1432b.C1434b bVar = C1428a.C1429a.f3114j;
                            C19862q<C0763z, C1302d, Integer, C19394m> qVar = qVar;
                            int i2 = (i4 & 7168) | 438;
                            dVar.mo5465u(693286680);
                            C1711v a = RowKt.m1480a(cVar, bVar, dVar);
                            dVar.mo5465u(-1323940314);
                            C7282b bVar2 = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
                            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
                            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
                            ComposeUiNode.f3776c0.getClass();
                            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
                            ComposableLambdaImpl a2 = C1700o.m3617a(e);
                            int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
                            if (dVar.mo5446k() instanceof C1299c) {
                                dVar.mo5392A();
                                if (dVar.mo5436f()) {
                                    dVar.mo5450m(aVar);
                                } else {
                                    dVar.mo5452n();
                                }
                                dVar.mo5394B();
                                Updater.m2571b(dVar, a, ComposeUiNode.Companion.f3781e);
                                Updater.m2571b(dVar, bVar2, ComposeUiNode.Companion.f3780d);
                                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                                a2.invoke(C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, Integer.valueOf((i3 >> 3) & 112));
                                dVar.mo5465u(2058660585);
                                dVar.mo5465u(-678309503);
                                if (((i3 >> 9) & 14 & 11) != 2 || !dVar.mo5442i()) {
                                    qVar.invoke(C0708a0.f1463a, dVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
                                } else {
                                    dVar.mo5396C();
                                }
                                C0048b.m166e(dVar);
                                return;
                            }
                            C0005b.m45j0();
                            throw null;
                        }
                        dVar.mo5396C();
                    }
                }), dVar, 56);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
