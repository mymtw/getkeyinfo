package androidx.compose.p015ui.semantics;

import kotlin.C19283a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1 */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements C19861p<C1894a<C19283a<? extends Boolean>>, C1894a<C19283a<? extends Boolean>>, C1894a<C19283a<? extends Boolean>>> {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    public final C1894a<C19283a<? extends Boolean>> invoke(C1894a<C19283a<? extends Boolean>> aVar, C1894a<C19283a<? extends Boolean>> aVar2) {
        String str;
        T t;
        C19383o.m32797g(aVar2, "childValue");
        if (aVar == null || (str = aVar.f4217a) == null) {
            str = aVar2.f4217a;
        }
        if (aVar == null || (t = aVar.f4218b) == null) {
            t = aVar2.f4218b;
        }
        return new C1894a<>(str, t);
    }
}
