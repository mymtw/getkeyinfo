package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.runtime.C1302d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class TextFieldKt$TextField$2 extends Lambda implements C19862q<C19861p<? super C1302d, ? super Integer, ? extends C19394m>, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $placeholder;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;
    public final /* synthetic */ String $value;
    public final /* synthetic */ C2006x $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$2(String str, boolean z, boolean z2, C2006x xVar, C0640j jVar, boolean z3, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, C1166a2 a2Var, int i, int i2) {
        super(3);
        this.$value = str;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = xVar;
        this.$interactionSource = jVar;
        this.$isError = z3;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$colors = a2Var;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C19861p<? super C1302d, ? super Integer, C19394m>) (C19861p) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        C19383o.m32797g(pVar2, "innerTextField");
        C1302d dVar2 = dVar;
        if ((i & 14) == 0) {
            i2 = i | (dVar2.mo5408I(pVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar.mo5442i()) {
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f2324a;
            String str = this.$value;
            boolean z = this.$enabled;
            boolean z2 = this.$singleLine;
            C2006x xVar = this.$visualTransformation;
            C0640j jVar = this.$interactionSource;
            boolean z3 = this.$isError;
            C19861p<C1302d, Integer, C19394m> pVar3 = this.$label;
            C19861p<C1302d, Integer, C19394m> pVar4 = this.$placeholder;
            C19861p<C1302d, Integer, C19394m> pVar5 = this.$leadingIcon;
            C19861p<C1302d, Integer, C19394m> pVar6 = this.$trailingIcon;
            C1166a2 a2Var = this.$colors;
            int i3 = this.$$dirty;
            int i4 = this.$$dirty1;
            textFieldDefaults.mo5166c(str, pVar, z, z2, xVar, jVar, z3, pVar3, pVar4, pVar5, pVar6, a2Var, (C0759v) null, dVar, ((i4 >> 3) & 7168) | (i3 & 14) | ((i2 << 3) & 112) | ((i3 >> 3) & 896) | ((i4 << 9) & 57344) | ((i4 >> 3) & 458752) | ((i4 << 18) & 3670016) | ((i3 << 3) & 29360128) | ((i3 << 3) & 234881024) | ((i3 << 3) & 1879048192), ((i3 >> 27) & 14) | 3072 | ((i4 >> 21) & 112), RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
            return;
        }
        dVar.mo5396C();
    }
}
