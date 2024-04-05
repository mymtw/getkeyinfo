package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p288y.C8347f;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ float $animationProgress;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $border;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leading;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C8347f, C19394m> $onLabelMeasured;
    public final /* synthetic */ C0759v $paddingValues;
    public final /* synthetic */ C19862q<C1436d, C1302d, Integer, C19394m> $placeholder;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $textField;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$2(C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19862q<? super C1436d, ? super C1302d, ? super Integer, C19394m> qVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, boolean z, float f, C19857l<? super C8347f, C19394m> lVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar5, C0759v vVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$textField = pVar;
        this.$placeholder = qVar;
        this.$label = pVar2;
        this.$leading = pVar3;
        this.$trailing = pVar4;
        this.$singleLine = z;
        this.$animationProgress = f;
        this.$onLabelMeasured = lVar;
        this.$border = pVar5;
        this.$paddingValues = vVar;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        OutlinedTextFieldKt.m2199b(this.$modifier, this.$textField, this.$placeholder, this.$label, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$onLabelMeasured, this.$border, this.$paddingValues, dVar, this.$$changed | 1, this.$$changed1);
    }
}
