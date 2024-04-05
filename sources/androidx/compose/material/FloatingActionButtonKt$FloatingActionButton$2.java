package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;

public final class FloatingActionButtonKt$FloatingActionButton$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$2(long j, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$contentColor = j;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1412t0[] t0VarArr = {ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C1545s.m3358d(this.$contentColor)))};
            final C19861p<C1302d, Integer, C19394m> pVar = this.$content;
            final int i2 = this.$$dirty;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, 1867794295, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        C2023s sVar = ((C1178d2) dVar.mo5410J(TypographyKt.f2371a)).f2412k;
                        final C19861p<C1302d, Integer, C19394m> pVar = pVar;
                        final int i2 = i2;
                        TextKt.m2282a(sVar, C18263b.m30805A(dVar, -1567914264, new C19861p<C1302d, Integer, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1302d) obj, ((Number) obj2).intValue());
                                return C19394m.f43287a;
                            }

                            public final void invoke(C1302d dVar, int i) {
                                if ((i & 11) != 2 || !dVar.mo5442i()) {
                                    C1436d.C1437a aVar = C1436d.C1437a.f3125b;
                                    float f = FloatingActionButtonKt.f2209a;
                                    C1436d c = SizeKt.m1483c(aVar, f, f);
                                    C1432b bVar = C1428a.C1429a.f3108d;
                                    C19861p<C1302d, Integer, C19394m> pVar = pVar;
                                    int i2 = i2;
                                    dVar.mo5465u(733328855);
                                    C1711v c2 = BoxKt.m1457c(bVar, false, dVar);
                                    dVar.mo5465u(-1323940314);
                                    C7282b bVar2 = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
                                    LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
                                    C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
                                    ComposeUiNode.f3776c0.getClass();
                                    C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
                                    ComposableLambdaImpl a = C1700o.m3617a(c);
                                    if (dVar.mo5446k() instanceof C1299c) {
                                        dVar.mo5392A();
                                        if (dVar.mo5436f()) {
                                            dVar.mo5450m(aVar2);
                                        } else {
                                            dVar.mo5452n();
                                        }
                                        dVar.mo5394B();
                                        Updater.m2571b(dVar, c2, ComposeUiNode.Companion.f3781e);
                                        Updater.m2571b(dVar, bVar2, ComposeUiNode.Companion.f3780d);
                                        Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                                        C0472h.m1246i(0, a, C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 2058660585, -2137368960);
                                        dVar.mo5465u(-1049034642);
                                        pVar.invoke(dVar, Integer.valueOf((i2 >> 21) & 14));
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
