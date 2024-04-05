package androidx.compose.animation;

import androidx.compose.animation.core.TransitionKt;
import androidx.compose.p015ui.C1428a;
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
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19863r;

final class AnimatedContentKt$AnimatedContent$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19863r<C0468d, Object, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1428a $contentAlignment;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ Object $targetState;
    public final /* synthetic */ C19857l<AnimatedContentScope<Object>, C0471g> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$2(Object obj, C1436d dVar, C19857l<? super AnimatedContentScope<Object>, C0471g> lVar, C1428a aVar, C19863r<? super C0468d, Object, ? super C1302d, ? super Integer, C19394m> rVar, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = dVar;
        this.$transitionSpec = lVar;
        this.$contentAlignment = aVar;
        this.$content = rVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        int i3;
        C1428a aVar;
        Object obj = this.$targetState;
        C1436d dVar2 = this.$modifier;
        C19857l lVar = this.$transitionSpec;
        C1428a aVar2 = this.$contentAlignment;
        C19863r<C0468d, Object, C1302d, Integer, C19394m> rVar = this.$content;
        int i4 = this.$$changed | 1;
        int i5 = this.$$default;
        C19383o.m32797g(rVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(2124549995);
        if ((i5 & 1) != 0) {
            i2 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i2 = (h.mo5408I(obj) ? 4 : 2) | i4;
        } else {
            i2 = i4;
        }
        int i6 = i5 & 2;
        if (i6 != 0) {
            i2 |= 48;
        } else if ((i4 & 112) == 0) {
            i2 |= h.mo5408I(dVar2) ? 32 : 16;
        }
        int i7 = i5 & 4;
        if (i7 != 0) {
            i2 |= 384;
        } else if ((i4 & 896) == 0) {
            i2 |= h.mo5408I(lVar) ? 256 : 128;
        }
        int i8 = i5 & 8;
        if (i8 != 0) {
            i2 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i2 |= h.mo5408I(aVar2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i5 & 16) != 0) {
            i2 |= 24576;
        } else if ((57344 & i4) == 0) {
            i2 |= h.mo5408I(rVar) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((46811 & i2) != 9362 || !h.mo5442i()) {
            if (i6 != 0) {
                dVar2 = C1436d.C1437a.f3125b;
            }
            if (i7 != 0) {
                lVar = AnimatedContentKt$AnimatedContent$1.INSTANCE;
            }
            if (i8 != 0) {
                aVar2 = C1428a.C1429a.f3105a;
            }
            composerImpl = h;
            i3 = i5;
            AnimatedContentKt.m1008a(TransitionKt.m1103e(obj, "AnimatedContent", h, (i2 & 8) | 48 | (i2 & 14), 0), dVar2, lVar, aVar2, (C19857l) null, rVar, h, (i2 & 112) | (i2 & 896) | (i2 & 7168) | ((i2 << 3) & 458752), 8);
            aVar = aVar2;
        } else {
            h.mo5396C();
            aVar = aVar2;
            composerImpl = h;
            i3 = i5;
        }
        C19857l lVar2 = lVar;
        C1436d dVar3 = dVar2;
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new AnimatedContentKt$AnimatedContent$2(obj, dVar3, lVar2, aVar, rVar, i4, i3);
        }
    }
}
