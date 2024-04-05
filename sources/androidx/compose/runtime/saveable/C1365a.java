package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.runtime.saveable.a */
public final class C1365a {
    /* renamed from: a */
    public static final C1374h m2862a(C19861p pVar, C19857l lVar) {
        C19383o.m32797g(pVar, "save");
        C19383o.m32797g(lVar, "restore");
        ListSaverKt$listSaver$1 listSaverKt$listSaver$1 = new ListSaverKt$listSaver$1(pVar);
        C19389t.m32910d(1, lVar);
        return SaverKt.m2861a(listSaverKt$listSaver$1, lVar);
    }
}
