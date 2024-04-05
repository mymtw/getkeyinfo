package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;
import p753kq.C19862q;

public final class OutlinedTextFieldKt$OutlinedTextField$2 extends Lambda implements C19862q<C19861p<? super C1302d, ? super Integer, ? extends C19394m>, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $placeholder;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;
    public final /* synthetic */ String $value;
    public final /* synthetic */ C2006x $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$2(String str, boolean z, boolean z2, C2006x xVar, C0640j jVar, boolean z3, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, C1166a2 a2Var, int i, int i2, C1530k0 k0Var) {
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
        this.$shape = k0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C19861p<? super C1302d, ? super Integer, C19394m>) (C19861p) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        C1302d dVar2 = dVar;
        C19383o.m32797g(pVar2, "innerTextField");
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
            C0640j jVar2 = jVar;
            boolean z3 = this.$isError;
            boolean z4 = z3;
            C19861p<C1302d, Integer, C19394m> pVar3 = this.$label;
            C19861p<C1302d, Integer, C19394m> pVar4 = this.$placeholder;
            C19861p<C1302d, Integer, C19394m> pVar5 = this.$leadingIcon;
            final boolean z5 = z3;
            C19861p<C1302d, Integer, C19394m> pVar6 = this.$trailingIcon;
            C1166a2 a2Var = this.$colors;
            final C0640j jVar3 = jVar;
            C1166a2 a2Var2 = a2Var;
            TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
            String str2 = str;
            boolean z6 = z;
            boolean z7 = z2;
            final boolean z8 = z;
            final C1166a2 a2Var3 = a2Var;
            final C1530k0 k0Var = this.$shape;
            final int i3 = this.$$dirty;
            final int i4 = this.$$dirty1;
            ComposableLambdaImpl A = C18263b.m30805A(dVar2, 329542189, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f2324a;
                        boolean z = z8;
                        boolean z2 = z5;
                        C0640j jVar = jVar3;
                        C1166a2 a2Var = a2Var3;
                        C1530k0 k0Var = k0Var;
                        int i2 = 12582912 | ((i3 >> 9) & 14);
                        int i3 = i4;
                        textFieldDefaults.mo5164a(z, z2, jVar, a2Var, k0Var, 0.0f, 0.0f, dVar, i2 | ((i3 << 3) & 112) | ((i3 >> 12) & 896) | ((i3 >> 15) & 7168) | ((i3 >> 9) & 57344), 96);
                        return;
                    }
                    dVar.mo5396C();
                }
            });
            int i5 = this.$$dirty;
            int i6 = this.$$dirty1;
            int i7 = i6 >> 3;
            int i8 = i5 << 3;
            textFieldDefaults2.mo5165b(str2, pVar, z6, z7, xVar, jVar2, z4, pVar3, pVar4, pVar5, pVar6, a2Var2, (C0759v) null, A, dVar, (i5 & 14) | ((i2 << 3) & 112) | ((i5 >> 3) & 896) | (i7 & 7168) | ((i6 << 9) & 57344) | (i7 & 458752) | (3670016 & (i6 << 18)) | (29360128 & i8) | (234881024 & i8) | (1879048192 & i8), ((i5 >> 27) & 14) | 27648 | ((i6 >> 21) & 112), RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
            return;
        }
        dVar.mo5396C();
    }
}
