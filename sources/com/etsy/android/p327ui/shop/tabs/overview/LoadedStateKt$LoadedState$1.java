package com.etsy.android.p327ui.shop.tabs.overview;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.lazy.C0863v;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.C1271y1;
import androidx.compose.material.TabRowKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.android.p327ui.shop.tabs.Tab;
import com.etsy.android.p327ui.shop.tabs.about.AboutTabKt;
import com.etsy.android.p327ui.shop.tabs.items.ItemsTabKt;
import com.etsy.android.p327ui.shop.tabs.reviews.ReviewsTabKt;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadedStateKt$LoadedState$1 */
public final class LoadedStateKt$LoadedState$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ ShopViewModel $viewModel;
    public final /* synthetic */ C11224i.C11230f $viewState;

    /* renamed from: com.etsy.android.ui.shop.tabs.overview.LoadedStateKt$LoadedState$1$a */
    public /* synthetic */ class C11231a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24814a;

        static {
            int[] iArr = new int[Tab.Type.values().length];
            iArr[Tab.Type.ITEMS.ordinal()] = 1;
            iArr[Tab.Type.REVIEWS.ordinal()] = 2;
            iArr[Tab.Type.ABOUT.ordinal()] = 3;
            f24814a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadedStateKt$LoadedState$1(C11224i.C11230f fVar, ShopViewModel shopViewModel) {
        super(2);
        this.$viewState = fVar;
        this.$viewModel = shopViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C11224i.C11230f fVar = this.$viewState;
            ShopViewModel shopViewModel = this.$viewModel;
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
            Tab.Type type = null;
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
                ShopViewModel shopViewModel2 = shopViewModel;
                TabRowKt.m2260a(fVar.mo36923a(), (C1436d) null, 0, 0, (C19862q<? super List<C1271y1>, ? super C1302d, ? super Integer, C19394m>) null, (C19861p<? super C1302d, ? super Integer, C19394m>) null, C18263b.m30805A(dVar2, 1045059449, new LoadedStateKt$LoadedState$1$1$1(fVar, shopViewModel)), dVar, 1572864, 62);
                LazyListState a3 = C0863v.m1919a(dVar);
                Tab tab = (fVar.mo36923a() < 0 || fVar.mo36923a() >= fVar.f24812b.size()) ? null : fVar.f24812b.get(fVar.mo36923a());
                if (tab != null) {
                    type = tab.f24780a;
                }
                if (type == null) {
                    i2 = -1;
                } else {
                    i2 = C11231a.f24814a[type.ordinal()];
                }
                if (i2 == 1) {
                    dVar2.mo5465u(-1886033747);
                    ItemsTabKt.m19149a(a3, shopViewModel2, fVar, dVar2, 576);
                    dVar.mo5406H();
                } else if (i2 == 2) {
                    dVar2.mo5465u(-1886033562);
                    ReviewsTabKt.m19156a(shopViewModel2, fVar, dVar2, 72);
                    dVar.mo5406H();
                } else if (i2 != 3) {
                    dVar2.mo5465u(-1886033282);
                    dVar.mo5406H();
                } else {
                    dVar2.mo5465u(-1886033401);
                    AboutTabKt.m19146a(shopViewModel2, fVar, dVar2, 72);
                    dVar.mo5406H();
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
