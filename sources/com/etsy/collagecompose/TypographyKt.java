package com.etsy.collagecompose;

import androidx.activity.C0114h;
import androidx.compose.p015ui.text.C2011m;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1950f;
import androidx.compose.p015ui.text.font.C1956j;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.CompositionLocalKt;
import com.etsy.android.R;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.collections.C19318k;

public final class TypographyKt {

    /* renamed from: a */
    public static final C1345l1 f27060a = CompositionLocalKt.m2532c(TypographyKt$LocalCollageTypography$1.INSTANCE);

    /* renamed from: b */
    public static final C12160k f27061b;

    static {
        C1959m mVar = C1959m.f4413g;
        C1959m mVar2 = C1959m.f4415i;
        C1956j jVar = new C1956j(C19318k.m32599Q0(new C1950f[]{C15588c1.m25320d(R.font.graphik_latin_cyrillic_app_regular, mVar), C15588c1.m25320d(R.font.graphik_latin_cyrillic_app_medium, mVar2)}));
        C1956j jVar2 = new C1956j(C19318k.m32599Q0(new C1950f[]{C15588c1.m25320d(R.font.guardian_egyptian_app_light, mVar)}));
        C2023s sVar = new C2023s(DimensKt.f27050d, mVar, jVar2, C0114h.m302g0(28), new C2011m());
        C1959m mVar3 = mVar2;
        C2023s sVar2 = new C2023s(DimensKt.f27049c, mVar2, jVar, C0114h.m302g0(24), new C2011m());
        long j = DimensKt.f27047a;
        C1959m mVar4 = mVar3;
        C2023s sVar3 = new C2023s(j, mVar4, jVar, C0114h.m302g0(20), new C2011m());
        long j2 = DimensKt.f27048b;
        long j3 = j;
        C1959m mVar5 = mVar;
        C1956j jVar3 = jVar;
        f27061b = new C12160k(sVar, sVar2, sVar3, new C2023s(j2, mVar4, jVar, C0114h.m302g0(16), new C2011m()), new C2023s(j3, mVar5, jVar3, C0114h.m302g0(20), new C2011m()), new C2023s(j2, mVar5, jVar3, C0114h.m302g0(16), new C2011m()));
    }
}
