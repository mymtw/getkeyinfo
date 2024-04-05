package androidx.compose.foundation.text;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$BasicTextFieldKt$lambda2$1 extends Lambda implements C19862q<C19861p<? super C1302d, ? super Integer, ? extends C19394m>, C1302d, Integer, C19394m> {
    public static final ComposableSingletons$BasicTextFieldKt$lambda2$1 INSTANCE = new ComposableSingletons$BasicTextFieldKt$lambda2$1();

    public ComposableSingletons$BasicTextFieldKt$lambda2$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C19861p<? super C1302d, ? super Integer, C19394m>) (C19861p) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        C19383o.m32797g(pVar, "innerTextField");
        if ((i & 14) == 0) {
            i |= dVar.mo5408I(pVar) ? 4 : 2;
        }
        if ((i & 91) != 18 || !dVar.mo5442i()) {
            pVar.invoke(dVar, Integer.valueOf(i & 14));
        } else {
            dVar.mo5396C();
        }
    }
}
