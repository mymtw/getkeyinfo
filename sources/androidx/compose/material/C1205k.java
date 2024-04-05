package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.SubcomposeLayoutKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import p174m0.C7284d;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.material.k */
public final class C1205k {

    /* renamed from: a */
    public static final float f2506a = ((float) 16);

    /* renamed from: a */
    public static final void m2335a(C19861p pVar, C19862q qVar, C19862q qVar2, C19861p pVar2, C19861p pVar3, float f, int i, C1342k1 k1Var, C1211m mVar, C1302d dVar, int i2) {
        int i3;
        ComposerImpl composerImpl;
        C19861p pVar4 = pVar;
        C19862q qVar3 = qVar;
        C19862q qVar4 = qVar2;
        C19861p pVar5 = pVar2;
        C19861p pVar6 = pVar3;
        float f2 = f;
        int i4 = i;
        C1342k1 k1Var2 = k1Var;
        C1211m mVar2 = mVar;
        int i5 = i2;
        ComposerImpl h = dVar.mo5440h(499725572);
        if ((i5 & 14) == 0) {
            i3 = (h.mo5408I(pVar4) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= h.mo5408I(qVar3) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i3 |= h.mo5408I(qVar4) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i3 |= h.mo5408I(pVar5) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((57344 & i5) == 0) {
            i3 |= h.mo5408I(pVar6) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((458752 & i5) == 0) {
            i3 |= h.mo5428b(f2) ? 131072 : 65536;
        }
        if ((3670016 & i5) == 0) {
            i3 |= h.mo5432d(i4) ? 1048576 : 524288;
        }
        if ((29360128 & i5) == 0) {
            i3 |= h.mo5408I(k1Var2) ? 8388608 : 4194304;
        }
        if ((234881024 & i5) == 0) {
            i3 |= h.mo5408I(mVar2) ? 67108864 : 33554432;
        }
        int i6 = i3;
        if ((i6 & 191739611) != 38347922 || !h.mo5442i()) {
            Object[] objArr = {qVar4, k1Var2, pVar4, qVar3, new C7284d(f2), pVar5, new C1250s0(i4), pVar6, mVar2};
            h.mo5465u(-568225417);
            int i7 = 0;
            boolean z = false;
            for (int i8 = 9; i7 < i8; i8 = 9) {
                z |= h.mo5408I(objArr[i7]);
                i7++;
            }
            Object c0 = h.mo5431c0();
            if (z || c0 == C1302d.C1303a.f2828a) {
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 = r0;
                composerImpl = h;
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$12 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(k1Var, pVar, pVar2, i, f, pVar3, mVar, qVar2, i6, qVar);
                composerImpl.mo5407H0(bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1);
                c0 = bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1;
            } else {
                composerImpl = h;
            }
            composerImpl.mo5418R(false);
            SubcomposeLayoutKt.m3531a((C1436d) null, (C19861p) c0, composerImpl, 0, 1);
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(pVar, qVar, qVar2, pVar2, pVar3, f, i, k1Var, mVar, i2);
        }
    }
}
