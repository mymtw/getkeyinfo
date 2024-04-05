package com.etsy.android.config.flags;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.runtime.C1302d;
import com.etsy.android.R;
import com.etsy.collagecompose.C12160k;
import com.etsy.collagecompose.TextKt;
import com.etsy.collagecompose.TypographyKt;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ComposableSingletons$ConfigFlagsFragmentKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ConfigFlagsFragmentKt$lambda1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public static final ComposableSingletons$ConfigFlagsFragmentKt$lambda1$1 INSTANCE = new ComposableSingletons$ConfigFlagsFragmentKt$lambda1$1();

    public ComposableSingletons$ConfigFlagsFragmentKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            TextKt.m19958a(C15588c1.m25305S0(R.string.config_flags_title, dVar2), (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) dVar2.mo5410J(TypographyKt.f27060a)).f27196b, dVar, 0, 0, 4094);
        } else {
            dVar.mo5396C();
        }
    }
}
