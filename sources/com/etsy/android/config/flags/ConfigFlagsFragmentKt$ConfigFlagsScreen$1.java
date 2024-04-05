package com.etsy.android.config.flags;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.config.flags.C6383l;
import com.etsy.android.config.flags.events.C6350c;
import com.etsy.android.config.flags.p073ui.C6403c;
import com.etsy.android.config.flags.p073ui.ConfigsListComposableKt;
import com.etsy.collagecompose.C12158i;
import com.etsy.collagecompose.C12159j;
import com.etsy.collagecompose.ColorsKt;
import com.etsy.collagecompose.DimensKt;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class ConfigFlagsFragmentKt$ConfigFlagsScreen$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19857l<C6350c, C19394m> $dispatch;
    public final /* synthetic */ C1342k1<C6383l> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsFragmentKt$ConfigFlagsScreen$1(C1342k1<? extends C6383l> k1Var, C19857l<? super C6350c, C19394m> lVar, int i) {
        super(2);
        this.$state = k1Var;
        this.$dispatch = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1342k1<C6383l> k1Var = this.$state;
            C19857l<C6350c, C19394m> lVar = this.$dispatch;
            int i2 = this.$$dirty;
            dVar2.mo5465u(-483455358);
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1711v a = ColumnKt.m1461a(C0718d.f1478c, C1428a.C1429a.f3116l, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(aVar);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -1163856341);
                boolean z = true;
                AppBarKt.m2166b(ComposableSingletons$ConfigFlagsFragmentKt.f14127a, (C1436d) null, C18263b.m30805A(dVar2, -1341093204, new ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$1(lVar, i2)), C18263b.m30805A(dVar2, -1193779051, new ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$2(k1Var, lVar, i2)), ((C12158i) dVar2.mo5410J(ColorsKt.f27041n)).f27147n, 0, ((C12159j) dVar2.mo5410J(DimensKt.f27051e)).f27184l, dVar, 3462, 34);
                C6383l value = k1Var.getValue();
                if (value instanceof C6383l.C6384a) {
                    dVar2.mo5465u(168564419);
                    List<C6403c> list = ((C6383l.C6384a) value).f14210c;
                    dVar2.mo5465u(1157296644);
                    boolean I = dVar2.mo5408I(lVar);
                    Object v = dVar.mo5467v();
                    if (I || v == C1302d.C1303a.f2828a) {
                        v = new ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$3$1(lVar);
                        dVar2.mo5454o(v);
                    }
                    dVar.mo5406H();
                    C19857l lVar2 = (C19857l) v;
                    dVar2.mo5465u(1157296644);
                    boolean I2 = dVar2.mo5408I(lVar);
                    Object v2 = dVar.mo5467v();
                    if (I2 || v2 == C1302d.C1303a.f2828a) {
                        v2 = new ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$4$1(lVar);
                        dVar2.mo5454o(v2);
                    }
                    dVar.mo5406H();
                    ConfigsListComposableKt.m12826a(list, lVar2, (C19861p) v2, dVar2, 8);
                    dVar.mo5406H();
                } else if (C19383o.m32792b(value, C6383l.C6385b.f14211a)) {
                    dVar2.mo5465u(168564919);
                    dVar.mo5406H();
                } else {
                    if (!C19383o.m32792b(value, C6383l.C6386c.f14212a)) {
                        z = C19383o.m32792b(value, C6383l.C6387d.f14213a);
                    }
                    if (z) {
                        dVar2.mo5465u(168565033);
                        ConfigFlagsFragmentKt.m12823b(dVar2, 0);
                        dVar.mo5406H();
                    } else {
                        dVar2.mo5465u(168565102);
                        dVar.mo5406H();
                    }
                }
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
