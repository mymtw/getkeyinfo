package androidx.compose.foundation.text;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2008j;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.List;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19862q;

public final class CoreTextKt {

    /* renamed from: a */
    public static final Pair<List<C1913a.C1916b<C2008j>>, List<C1913a.C1916b<C19862q<String, C1302d, Integer, C19394m>>>> f1914a;

    static {
        EmptyList emptyList = EmptyList.INSTANCE;
        f1914a = new Pair<>(emptyList, emptyList);
    }

    /* renamed from: a */
    public static final void m1964a(C1913a aVar, List<C1913a.C1916b<C19862q<String, C1302d, Integer, C19394m>>> list, C1302d dVar, int i) {
        C1913a aVar2 = aVar;
        List<C1913a.C1916b<C19862q<String, C1302d, Integer, C19394m>>> list2 = list;
        C19383o.m32797g(aVar2, "text");
        C19383o.m32797g(list2, "inlineContents");
        ComposerImpl h = dVar.mo5440h(-110905764);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            C1913a.C1916b bVar = list2.get(i2);
            C19862q qVar = (C19862q) bVar.f4308a;
            int i3 = bVar.f4309b;
            int i4 = bVar.f4310c;
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = CoreTextKt$InlineChildren$1$2.f1915a;
            h.mo5465u(-1323940314);
            C1436d.C1437a aVar3 = C1436d.C1437a.f3125b;
            C7282b bVar2 = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(aVar3);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar4);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, coreTextKt$InlineChildren$1$2, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar2, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                Updater.m2571b(h, j1Var, ComposeUiNode.Companion.f3783g);
                h.mo5430c();
                a.invoke(new C1295a1(h), h, 0);
                h.mo5465u(2058660585);
                h.mo5465u(-72427749);
                qVar.invoke(aVar2.subSequence(i3, i4).f4296b, h, 0);
                h.mo5418R(false);
                h.mo5418R(false);
                h.mo5418R(true);
                h.mo5418R(false);
                i2++;
            } else {
                C0005b.m45j0();
                throw null;
            }
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new CoreTextKt$InlineChildren$2(aVar2, list2, i);
        }
    }

    /* renamed from: b */
    public static final C0957k m1965b(C0957k kVar, C1913a aVar, C2023s sVar, C7282b bVar, C1952g.C1953a aVar2, boolean z, int i, int i2, List<C1913a.C1916b<C2008j>> list) {
        C0957k kVar2 = kVar;
        C1913a aVar3 = aVar;
        C2023s sVar2 = sVar;
        C7282b bVar2 = bVar;
        C1952g.C1953a aVar4 = aVar2;
        List<C1913a.C1916b<C2008j>> list2 = list;
        C19383o.m32797g(kVar, "current");
        C19383o.m32797g(aVar, "text");
        C19383o.m32797g(sVar, "style");
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(aVar2, "fontFamilyResolver");
        C19383o.m32797g(list2, "placeholders");
        if (!C19383o.m32792b(kVar2.f2013a, aVar) || !C19383o.m32792b(kVar2.f2014b, sVar)) {
            boolean z2 = z;
        } else if (kVar2.f2016d == z) {
            if (kVar2.f2017e == i) {
                if (kVar2.f2015c == i2 && C19383o.m32792b(kVar2.f2018f, bVar) && C19383o.m32792b(kVar2.f2020h, list2) && kVar2.f2019g == aVar4) {
                    return kVar2;
                }
                return new C0957k(aVar, sVar, i2, z, i, bVar, aVar2, (List) list);
            }
            int i3 = i2;
            return new C0957k(aVar, sVar, i2, z, i, bVar, aVar2, (List) list);
        }
        int i4 = i;
        int i32 = i2;
        return new C0957k(aVar, sVar, i2, z, i, bVar, aVar2, (List) list);
    }
}
