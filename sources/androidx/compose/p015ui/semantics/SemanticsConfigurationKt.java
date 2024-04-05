package androidx.compose.p015ui.semantics;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.semantics.SemanticsConfigurationKt */
public final class SemanticsConfigurationKt {
    /* renamed from: a */
    public static final <T> T m4173a(C1903j jVar, C1909p<T> pVar) {
        C19383o.m32797g(jVar, "<this>");
        C19383o.m32797g(pVar, "key");
        SemanticsConfigurationKt$getOrNull$1 semanticsConfigurationKt$getOrNull$1 = SemanticsConfigurationKt$getOrNull$1.INSTANCE;
        C19383o.m32797g(semanticsConfigurationKt$getOrNull$1, "defaultValue");
        T t = jVar.f4246b.get(pVar);
        return t == null ? semanticsConfigurationKt$getOrNull$1.invoke() : t;
    }
}
