package com.etsy.android.config.flags.p073ui.search;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.C0953g;
import androidx.compose.foundation.text.C0954h;
import androidx.compose.material.C1186g0;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.platform.C1819b1;
import androidx.compose.p015ui.platform.C1833g0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.input.C2002t;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.collagecompose.C12158i;
import com.etsy.collagecompose.C12160k;
import com.etsy.collagecompose.ColorsKt;
import com.etsy.collagecompose.TypographyKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.search.SearchInputComposableKt */
public final class SearchInputComposableKt {
    /* renamed from: a */
    public static final void m12834a(String str, C19857l<? super String, C19394m> lVar, C19846a<C19394m> aVar, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        String str2 = str;
        C19857l<? super String, C19394m> lVar2 = lVar;
        C19846a<C19394m> aVar2 = aVar;
        int i3 = i;
        C19383o.m32797g(str2, "searchText");
        C19383o.m32797g(lVar2, "onSearchTextChanged");
        C19383o.m32797g(aVar2, "onClearClick");
        ComposerImpl h = dVar.mo5440h(-1369263293);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(lVar2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5408I(aVar2) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 731) != 146 || !h.mo5442i()) {
            boolean z = str.length() > 0;
            C1411t tVar = LocalSoftwareKeyboardController.f4035a;
            h.mo5465u(-1059476185);
            C1819b1 b1Var = (C1819b1) h.mo5410J(LocalSoftwareKeyboardController.f4035a);
            if (b1Var == null) {
                h.mo5465u(1835581880);
                C2002t tVar2 = (C2002t) h.mo5410J(CompositionLocalsKt.f4026l);
                if (tVar2 == null) {
                    h.mo5418R(false);
                    b1Var = null;
                } else {
                    h.mo5465u(1157296644);
                    boolean I = h.mo5408I(tVar2);
                    Object c0 = h.mo5431c0();
                    if (I || c0 == C1302d.C1303a.f2828a) {
                        c0 = new C1833g0(tVar2);
                        h.mo5407H0(c0);
                    }
                    h.mo5418R(false);
                    b1Var = (C1833g0) c0;
                    h.mo5418R(false);
                }
            }
            h.mo5418R(false);
            C1436d g = SizeKt.m1487g(C1436d.C1437a.f3125b);
            C2023s sVar = ((C12160k) h.mo5410J(TypographyKt.f27060a)).f27199e;
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f2324a;
            C1345l1 l1Var = ColorsKt.f27041n;
            long j = ((C12158i) h.mo5410J(l1Var)).f27121a;
            long j2 = C1545s.f3363h;
            boolean z2 = z;
            C1186g0 f = TextFieldDefaults.m2263f(j, j2, ((C12158i) h.mo5410J(l1Var)).f27121a, j2, j2, h, 2097042);
            C0954h hVar = new C0954h(0, 1, 7, true);
            h.mo5465u(1157296644);
            boolean I2 = h.mo5408I(b1Var);
            Object c02 = h.mo5431c0();
            if (I2 || c02 == C1302d.C1303a.f2828a) {
                c02 = new SearchInputComposableKt$SearchInput$1$1(b1Var);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            C0953g gVar = r4;
            C0953g gVar2 = new C0953g((C19857l) c02, 62);
            int i5 = i4;
            composerImpl = h;
            int i6 = i3;
            OutlinedTextFieldKt.m2198a(str, lVar, g, false, false, sVar, (C19861p<? super C1302d, ? super Integer, C19394m>) null, ComposableSingletons$SearchInputComposableKt.f14217a, (C19861p<? super C1302d, ? super Integer, C19394m>) null, C18263b.m30805A(h, 438492090, new SearchInputComposableKt$SearchInput$2(z2, aVar2, i4)), false, (C2006x) null, hVar, gVar, true, 1, (C0640j) null, (C1530k0) null, f, composerImpl, (i5 & 14) | 817889664 | (i5 & 112), 221184, 200024);
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new SearchInputComposableKt$SearchInput$3(str, lVar, aVar, i);
        }
    }
}
