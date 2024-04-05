package com.etsy.android.p327ui.home.etsylens;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.R;
import com.etsy.collagecompose.ButtonKt;
import com.etsy.collagecompose.C12142d;
import com.etsy.collagecompose.C12145e;
import com.etsy.collagecompose.C12159j;
import com.etsy.collagecompose.C12160k;
import com.etsy.collagecompose.DimensKt;
import com.etsy.collagecompose.TextKt;
import com.etsy.collagecompose.TypographyKt;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.etsylens.CameraOrFileBottomSheetComposableKt$CameraOrFileBottomSheetComposable$3 */
public final class C9953xcc5e7ae extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19846a<C19394m> $onSelectFileClicked;
    public final /* synthetic */ C19846a<C19394m> $onTakePictureClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9953xcc5e7ae(C19846a<C19394m> aVar, int i, C19846a<C19394m> aVar2) {
        super(2);
        this.$onTakePictureClicked = aVar;
        this.$$dirty = i;
        this.$onSelectFileClicked = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d F0 = C15588c1.m25279F0(SizeKt.m1487g(aVar), (float) 16);
            C0718d.C0727i iVar = C0718d.f1476a;
            C1345l1 l1Var = DimensKt.f27051e;
            C0718d.C0726h g = C0718d.m1571g(((C12159j) dVar2.mo5410J(l1Var)).f27177e);
            C19846a<C19394m> aVar2 = this.$onTakePictureClicked;
            int i2 = this.$$dirty;
            C19846a<C19394m> aVar3 = this.$onSelectFileClicked;
            dVar2.mo5465u(-483455358);
            C1711v a = ColumnKt.m1461a(g, C1428a.C1429a.f3116l, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(F0);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar4);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -1163856341);
                String S0 = C15588c1.m25305S0(R.string.etsy_lens_camera_or_file_bottom_sheet_title, dVar2);
                C19846a<C19394m> aVar5 = aVar3;
                int i3 = i2;
                C1345l1 l1Var2 = TypographyKt.f27060a;
                TextKt.m19958a(S0, (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) dVar2.mo5410J(l1Var2)).f27197c, dVar, 0, 0, 4094);
                C1302d dVar3 = dVar;
                TextKt.m19958a(C15588c1.m25305S0(R.string.etsy_lens_camera_or_file_bottom_sheet_body, dVar3), (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) dVar3.mo5410J(l1Var2)).f27200f, dVar, 0, 0, 4094);
                C19846a<C19394m> aVar6 = aVar2;
                C1302d dVar4 = dVar;
                ButtonKt.m19939a(C12145e.C12146a.f27083a, aVar6, C15588c1.m25287J0(SizeKt.m1487g(aVar), 0.0f, ((C12159j) dVar3.mo5410J(l1Var)).f27178f, 0.0f, 0.0f, 13), C15588c1.m25305S0(R.string.etsy_lens_camera_or_file_bottom_sheet_take_picture_button, dVar3), (String) null, (C12142d) null, Integer.valueOf(R.drawable.clg_icon_core_camera_v1), false, false, dVar4, ((i3 << 3) & 112) | 8, 432);
                C19846a<C19394m> aVar7 = aVar5;
                ButtonKt.m19939a(C12145e.C12147b.f27084a, aVar7, SizeKt.m1487g(aVar), C15588c1.m25305S0(R.string.etsy_lens_camera_or_file_bottom_sheet_select_file_button, dVar3), (String) null, (C12142d) null, Integer.valueOf(R.drawable.clg_icon_core_image_v1), false, false, dVar4, (i3 & 112) | 392, 432);
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
