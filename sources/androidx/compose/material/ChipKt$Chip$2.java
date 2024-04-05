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
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class ChipKt$Chip$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C1249s $colors;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1342k1<C1545s> $contentColor$delegate;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$2(C1342k1<C1545s> k1Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1249s sVar, boolean z, int i, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(2);
        this.$contentColor$delegate = k1Var;
        this.$leadingIcon = pVar;
        this.$colors = sVar;
        this.$enabled = z;
        this.$$dirty = i;
        this.$content = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1411t tVar = ContentAlphaKt.f2198a;
            C1342k1<C1545s> k1Var = this.$contentColor$delegate;
            float f = C1256u.f2622a;
            C1412t0[] t0VarArr = {tVar.mo5908b(Float.valueOf(C1545s.m3358d(k1Var.getValue().f3366a)))};
            final C19861p<C1302d, Integer, C19394m> pVar = this.$leadingIcon;
            final C1249s sVar = this.$colors;
            final boolean z = this.$enabled;
            final int i2 = this.$$dirty;
            final C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$content;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, 667535631, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        C2023s sVar = ((C1178d2) dVar.mo5410J(TypographyKt.f2371a)).f2411j;
                        final C19861p<C1302d, Integer, C19394m> pVar = pVar;
                        final C1249s sVar2 = sVar;
                        final boolean z = z;
                        final int i2 = i2;
                        final C19862q<C0763z, C1302d, Integer, C19394m> qVar = qVar;
                        TextKt.m2282a(sVar, C18263b.m30805A(dVar, -1131213696, new C19861p<C1302d, Integer, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1302d) obj, ((Number) obj2).intValue());
                                return C19394m.f43287a;
                            }

                            public final void invoke(C1302d dVar, int i) {
                                C1302d dVar2 = dVar;
                                if ((i & 11) != 2 || !dVar.mo5442i()) {
                                    C1436d.C1437a aVar = C1436d.C1437a.f3125b;
                                    C1436d J0 = C15588c1.m25287J0(SizeKt.m1484d(aVar, C1252t.f2613a, 1), pVar == null ? C1256u.f2622a : (float) 0, 0.0f, C1256u.f2622a, 0.0f, 10);
                                    C0718d.C0727i iVar = C0718d.f1476a;
                                    C1432b.C1434b bVar = C1428a.C1429a.f3114j;
                                    C19861p<C1302d, Integer, C19394m> pVar = pVar;
                                    C1249s sVar = sVar2;
                                    boolean z = z;
                                    int i2 = i2;
                                    C19862q<C0763z, C1302d, Integer, C19394m> qVar = qVar;
                                    dVar2.mo5465u(693286680);
                                    C1711v a = RowKt.m1480a(iVar, bVar, dVar2);
                                    dVar2.mo5465u(-1323940314);
                                    C7282b bVar2 = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
                                    LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
                                    C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
                                    ComposeUiNode.f3776c0.getClass();
                                    C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
                                    ComposableLambdaImpl a2 = C1700o.m3617a(J0);
                                    if (dVar.mo5446k() instanceof C1299c) {
                                        dVar.mo5392A();
                                        if (dVar.mo5436f()) {
                                            dVar2.mo5450m(aVar2);
                                        } else {
                                            dVar.mo5452n();
                                        }
                                        dVar.mo5394B();
                                        Updater.m2571b(dVar2, a, ComposeUiNode.Companion.f3781e);
                                        Updater.m2571b(dVar2, bVar2, ComposeUiNode.Companion.f3780d);
                                        Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                                        C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -678309503);
                                        C0708a0 a0Var = C0708a0.f1463a;
                                        dVar2.mo5465u(951468004);
                                        dVar2.mo5465u(2084788874);
                                        if (pVar != null) {
                                            C15588c1.m25324f(SizeKt.m1495o(aVar, C1256u.f2623b), dVar2, 6);
                                            C1338j0 c = sVar.mo5342c(z, dVar2);
                                            CompositionLocalKt.m2530a(new C1412t0[]{ContentColorKt.f2199a.mo5908b(new C1545s(((C1545s) c.getValue()).f3366a)), ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C1545s.m3358d(((C1545s) c.getValue()).f3366a)))}, pVar, dVar2, ((i2 >> 18) & 112) | 8);
                                            C15588c1.m25324f(SizeKt.m1495o(aVar, C1256u.f2624c), dVar2, 6);
                                        }
                                        dVar.mo5406H();
                                        qVar.invoke(a0Var, dVar2, Integer.valueOf(6 | ((i2 >> 21) & 112)));
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
                        }), dVar, 48);
                        return;
                    }
                    dVar.mo5396C();
                }
            }), dVar, 56);
            return;
        }
        dVar.mo5396C();
    }
}
