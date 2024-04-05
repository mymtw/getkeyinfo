package com.etsy.android.p327ui.shop.tabs.items;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C0777d;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.runtime.C1302d;
import com.etsy.collagecompose.C12159j;
import com.etsy.collagecompose.DimensKt;
import com.etsy.collagecompose.TextKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19862q;

/* renamed from: com.etsy.android.ui.shop.tabs.items.ItemsTabKt$ItemsTab$1$1$1 */
public final class ItemsTabKt$ItemsTab$1$1$1 extends Lambda implements C19862q<C0777d, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemsTabKt$ItemsTab$1$1$1(int i) {
        super(3);
        this.$it = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0777d) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0777d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$item");
        if ((i & 81) != 16 || !dVar2.mo5442i()) {
            C1436d d = SizeKt.m1484d(SizeKt.m1487g(C1436d.C1437a.f3125b), ((C12159j) dVar2.mo5410J(DimensKt.f27051e)).f27181i, 1);
            StringBuilder h = C0072d.m201h("Item #");
            h.append(this.$it);
            TextKt.m19958a(h.toString(), d, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, (C2023s) null, dVar2, 0, 0, 8188);
            return;
        }
        dVar2.mo5396C();
    }
}
