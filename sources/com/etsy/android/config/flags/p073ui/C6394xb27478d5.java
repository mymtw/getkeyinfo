package com.etsy.android.config.flags.p073ui;

import androidx.compose.foundation.lazy.C0777d;
import androidx.compose.material.C1192i0;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import com.etsy.android.config.flags.p073ui.ConfigsListComposableKt$ConfigsList$1;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a;
import com.etsy.android.config.flags.p073ui.switchconfigflag.SwitchConfigComposableKt;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6421a;
import com.etsy.android.config.flags.p073ui.textconfigflag.TextConfigComposableKt;
import com.etsy.collagecompose.BadgeStyle;
import com.etsy.collagecompose.C12158i;
import com.etsy.collagecompose.ColorsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19318k;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import p010a9.C0048b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19863r;

/* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt$ConfigsList$1$invoke$$inlined$items$default$4 */
public final class C6394xb27478d5 extends Lambda implements C19863r<C0777d, Integer, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty$inlined;
    public final /* synthetic */ List $items;
    public final /* synthetic */ C19857l $onClickSwitchConfig$inlined;
    public final /* synthetic */ C19861p $onClickTextConfig$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6394xb27478d5(List list, C19857l lVar, int i, C19861p pVar) {
        super(4);
        this.$items = list;
        this.$onClickSwitchConfig$inlined = lVar;
        this.$$dirty$inlined = i;
        this.$onClickTextConfig$inlined = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C0777d) obj, ((Number) obj2).intValue(), (C1302d) obj3, ((Number) obj4).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0777d dVar, int i, C1302d dVar2, int i2) {
        int i3;
        String str;
        BadgeStyle badgeStyle;
        String str2;
        BadgeStyle badgeStyle2;
        C0777d dVar3 = dVar;
        int i4 = i;
        C1302d dVar4 = dVar2;
        C19383o.m32797g(dVar3, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = i2 | (dVar4.mo5408I(dVar3) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = 32;
        if ((i2 & 112) == 0) {
            i3 |= dVar4.mo5432d(i4) ? 32 : 16;
        }
        if ((i3 & 731) != 146 || !dVar2.mo5442i()) {
            int i6 = i3 & 14;
            C6403c cVar = (C6403c) this.$items.get(i4);
            if ((i6 & 112) == 0) {
                if (!dVar4.mo5408I(cVar)) {
                    i5 = 16;
                }
                i6 |= i5;
            }
            if ((i6 & 721) != 144 || !dVar2.mo5442i()) {
                int i7 = ConfigsListComposableKt$ConfigsList$1.C6396a.f14215a[cVar.mo18197g().ordinal()];
                Integer num = null;
                if (i7 == 1) {
                    dVar4.mo5465u(-372238622);
                    C6417a aVar = (C6417a) cVar;
                    String str3 = aVar.f14225a;
                    ArrayList c1 = C19318k.m32611c1(new String[]{aVar.f14227c, aVar.f14226b});
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c1.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!C19457k.m33020X0((String) next)) {
                            arrayList.add(next);
                        }
                    }
                    String Z0 = C19327t.m32644Z0(arrayList, ", ", (String) null, (String) null, (C19857l) null, 62);
                    String configFlagOrigin = aVar.f14230f.toString();
                    if (C19457k.m33020X0(Z0)) {
                        str = configFlagOrigin;
                    } else {
                        str = C0048b.m163a(Z0, "\n\n", configFlagOrigin);
                    }
                    boolean z = aVar.f14228d;
                    ConfigFlagStatus configFlagStatus = aVar.f14229e;
                    String statusName = configFlagStatus != null ? configFlagStatus.getStatusName() : null;
                    ConfigFlagStatus configFlagStatus2 = aVar.f14229e;
                    if (configFlagStatus2 == null || (badgeStyle = configFlagStatus2.getBadgeStyle()) == null) {
                        badgeStyle = BadgeStyle.Primary;
                    }
                    ConfigFlagStatus configFlagStatus3 = aVar.f14229e;
                    if (configFlagStatus3 != null) {
                        num = Integer.valueOf(configFlagStatus3.getIconRes());
                    }
                    dVar4.mo5465u(511388516);
                    boolean I = dVar4.mo5408I(this.$onClickSwitchConfig$inlined) | dVar4.mo5408I(aVar);
                    Object v = dVar2.mo5467v();
                    if (I || v == C1302d.C1303a.f2828a) {
                        v = new ConfigsListComposableKt$ConfigsList$1$2$1$1(this.$onClickSwitchConfig$inlined, aVar);
                        dVar4.mo5454o(v);
                    }
                    dVar2.mo5406H();
                    C19846a aVar2 = (C19846a) v;
                    dVar4.mo5465u(511388516);
                    boolean I2 = dVar4.mo5408I(this.$onClickTextConfig$inlined) | dVar4.mo5408I(aVar);
                    Object v2 = dVar2.mo5467v();
                    if (I2 || v2 == C1302d.C1303a.f2828a) {
                        v2 = new ConfigsListComposableKt$ConfigsList$1$2$2$1(this.$onClickTextConfig$inlined, aVar);
                        dVar4.mo5454o(v2);
                    }
                    dVar2.mo5406H();
                    SwitchConfigComposableKt.m12835a(str3, str, z, statusName, badgeStyle, num, aVar2, (C19857l) v2, dVar2, 0);
                    dVar2.mo5406H();
                } else if (i7 != 2) {
                    dVar4.mo5465u(-372237173);
                    dVar2.mo5406H();
                } else {
                    dVar4.mo5465u(-372237842);
                    C6421a aVar3 = (C6421a) cVar;
                    String str4 = aVar3.f14235a;
                    ArrayList c12 = C19318k.m32611c1(new String[]{aVar3.f14237c, aVar3.f14236b});
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = c12.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (!C19457k.m33020X0((String) next2)) {
                            arrayList2.add(next2);
                        }
                    }
                    String Z02 = C19327t.m32644Z0(arrayList2, ", ", (String) null, (String) null, (C19857l) null, 62);
                    String configFlagOrigin2 = aVar3.f14240f.toString();
                    if (C19457k.m33020X0(Z02)) {
                        str2 = configFlagOrigin2;
                    } else {
                        str2 = C0048b.m163a(Z02, "\n\n", configFlagOrigin2);
                    }
                    String str5 = aVar3.f14238d;
                    ConfigFlagStatus configFlagStatus4 = aVar3.f14239e;
                    String statusName2 = configFlagStatus4 != null ? configFlagStatus4.getStatusName() : null;
                    ConfigFlagStatus configFlagStatus5 = aVar3.f14239e;
                    if (configFlagStatus5 == null || (badgeStyle2 = configFlagStatus5.getBadgeStyle()) == null) {
                        badgeStyle2 = BadgeStyle.Primary;
                    }
                    ConfigFlagStatus configFlagStatus6 = aVar3.f14239e;
                    if (configFlagStatus6 != null) {
                        num = Integer.valueOf(configFlagStatus6.getIconRes());
                    }
                    dVar4.mo5465u(511388516);
                    boolean I3 = dVar4.mo5408I(this.$onClickTextConfig$inlined) | dVar4.mo5408I(aVar3);
                    Object v3 = dVar2.mo5467v();
                    if (I3 || v3 == C1302d.C1303a.f2828a) {
                        v3 = new ConfigsListComposableKt$ConfigsList$1$2$3$1(this.$onClickTextConfig$inlined, aVar3);
                        dVar4.mo5454o(v3);
                    }
                    dVar2.mo5406H();
                    TextConfigComposableKt.m12844a(str4, str2, str5, statusName2, badgeStyle2, num, (C19846a) v3, dVar2, 0);
                    dVar2.mo5406H();
                }
                C1192i0.m2325a(0.0f, 0.0f, 0, 13, ((C12158i) dVar4.mo5410J(ColorsKt.f27041n)).f27163v, dVar2, (C1436d) null);
                return;
            }
            dVar2.mo5396C();
            return;
        }
        dVar2.mo5396C();
    }
}
