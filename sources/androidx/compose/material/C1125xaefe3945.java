package androidx.compose.material;

import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.runtime.C1342k1;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p288y.C8343c;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1 */
public final class C1125xaefe3945 extends Lambda implements C19857l<C1644p, C19394m> {
    public final /* synthetic */ Ref$BooleanRef $draggingStart;
    public final /* synthetic */ boolean $isRtl;
    public final /* synthetic */ C1342k1<C19861p<Boolean, Float, C19394m>> $onDrag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1125xaefe3945(C1342k1<? extends C19861p<? super Boolean, ? super Float, C19394m>> k1Var, Ref$BooleanRef ref$BooleanRef, boolean z) {
        super(1);
        this.$onDrag = k1Var;
        this.$draggingStart = ref$BooleanRef;
        this.$isRtl = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1644p) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1644p pVar) {
        C19383o.m32797g(pVar, "it");
        float c = C8343c.m16642c(C15562d.m25183U(pVar));
        C19861p value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.element);
        if (this.$isRtl) {
            c = -c;
        }
        value.invoke(valueOf, Float.valueOf(c));
    }
}
