package com.etsy.android.config.flags;

import androidx.compose.material.IconKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1532l0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.vector.C1553c;
import androidx.compose.p015ui.graphics.vector.C1556d;
import androidx.compose.p015ui.graphics.vector.C1583j;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1313c;
import com.etsy.android.R;
import com.etsy.collagecompose.C12158i;
import com.etsy.collagecompose.ColorsKt;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import p405nc.C13110a;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ComposableSingletons$ConfigFlagsFragmentKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$ConfigFlagsFragmentKt$lambda2$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public static final ComposableSingletons$ConfigFlagsFragmentKt$lambda2$1 INSTANCE = new ComposableSingletons$ConfigFlagsFragmentKt$lambda2$1();

    public ComposableSingletons$ConfigFlagsFragmentKt$lambda2$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1553c cVar = C13110a.f28824b;
            if (cVar == null) {
                C1553c.C1554a aVar = new C1553c.C1554a("Filled.ArrowBack");
                EmptyList emptyList = C1583j.f3538a;
                C1532l0 l0Var = new C1532l0(C1545s.f3357b);
                C1313c cVar2 = new C1313c(1);
                cVar2.mo5755c(new C1556d.C1562f(20.0f, 11.0f));
                cVar2.mo5755c(new C1556d.C1560d(7.83f));
                cVar2.mo5760i(5.59f, -5.59f);
                cVar2.mo5759h(12.0f, 4.0f);
                cVar2.mo5760i(-8.0f, 8.0f);
                cVar2.mo5760i(8.0f, 8.0f);
                cVar2.mo5760i(1.41f, -1.41f);
                cVar2.mo5759h(7.83f, 13.0f);
                cVar2.mo5755c(new C1556d.C1560d(20.0f));
                cVar2.mo5755c(new C1556d.C1574r(-2.0f));
                cVar2.mo5755c(C1556d.C1558b.f3467c);
                aVar.mo6446b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, l0Var, (C1533m) null, "", (List) cVar2.f2868b);
                cVar = aVar.mo6447d();
                C13110a.f28824b = cVar;
            }
            IconKt.m2186b(cVar, C15588c1.m25305S0(R.string.back, dVar), (C1436d) null, ((C12158i) dVar.mo5410J(ColorsKt.f27041n)).f27121a, dVar, 0, 4);
            return;
        }
        dVar.mo5396C();
    }
}
