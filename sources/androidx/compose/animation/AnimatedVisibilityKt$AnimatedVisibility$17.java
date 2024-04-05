package androidx.compose.animation;

import androidx.compose.animation.core.C0418c0;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

final class AnimatedVisibilityKt$AnimatedVisibility$17 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C0473i $enter;
    public final /* synthetic */ C0475k $exit;
    public final /* synthetic */ boolean $initiallyVisible;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ boolean $visible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$17(boolean z, C1436d dVar, C0473i iVar, C0475k kVar, boolean z2, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$visible = z;
        this.$modifier = dVar;
        this.$enter = iVar;
        this.$exit = kVar;
        this.$initiallyVisible = z2;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        int i3;
        ComposerImpl composerImpl;
        int i4;
        C1436d dVar2;
        boolean z = this.$visible;
        C1436d dVar3 = this.$modifier;
        C0473i iVar = this.$enter;
        C0475k kVar = this.$exit;
        boolean z2 = this.$initiallyVisible;
        C19861p<C1302d, Integer, C19394m> pVar = this.$content;
        int i5 = this.$$changed | 1;
        int i6 = this.$$default;
        C19383o.m32797g(iVar, "enter");
        C19383o.m32797g(kVar, "exit");
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(1121582420);
        if ((i6 & 1) != 0) {
            i2 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i2 = (h.mo5427a(z) ? 4 : 2) | i5;
        } else {
            i2 = i5;
        }
        int i7 = i6 & 2;
        if (i7 != 0) {
            i2 |= 48;
        } else if ((i5 & 112) == 0) {
            i2 |= h.mo5408I(dVar3) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i2 |= 384;
        } else if ((i5 & 896) == 0) {
            i2 |= h.mo5408I(iVar) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i2 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i2 |= h.mo5408I(kVar) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i6 & 16) != 0) {
            i2 |= 24576;
        } else if ((57344 & i5) == 0) {
            i2 |= h.mo5427a(z2) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((i6 & 32) != 0) {
            i2 |= 196608;
        } else if ((458752 & i5) == 0) {
            i2 |= h.mo5408I(pVar) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !h.mo5442i()) {
            if (i7 != 0) {
                dVar3 = C1436d.C1437a.f3125b;
            }
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            if (c0 == C1302d.C1303a.f2828a) {
                c0 = new C0418c0(Boolean.valueOf(z2));
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C0418c0 c0Var = (C0418c0) c0;
            c0Var.f1094b.setValue(Boolean.valueOf(z));
            composerImpl = h;
            i3 = i6;
            i4 = i5;
            AnimatedVisibilityKt.m1026b(c0Var, dVar3, iVar, kVar, (String) null, C18263b.m30805A(h, 1996320812, new AnimatedVisibilityKt$AnimatedVisibility$16(pVar, i2)), h, (i2 & 112) | 196608 | (i2 & 896) | (i2 & 7168), 16);
            dVar2 = dVar3;
        } else {
            h.mo5396C();
            dVar2 = dVar3;
            composerImpl = h;
            i3 = i6;
            i4 = i5;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new AnimatedVisibilityKt$AnimatedVisibility$17(z, dVar2, iVar, kVar, z2, pVar, i4, i3);
        }
    }
}
