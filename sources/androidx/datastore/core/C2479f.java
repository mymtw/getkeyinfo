package androidx.datastore.core;

import java.util.List;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p148j1.C7099a;
import p568fn.C17782b;
import p753kq.C19846a;

/* renamed from: androidx.datastore.core.f */
public final class C2479f {
    /* renamed from: a */
    public static SingleProcessDataStore m5443a(List list, C19525d0 d0Var, C19846a aVar) {
        C19383o.m32797g(list, "migrations");
        C19383o.m32797g(d0Var, "scope");
        return new SingleProcessDataStore(aVar, C17782b.m29864d0(new DataMigrationInitializer$Companion$getInitializer$1(list, (C19340c<? super DataMigrationInitializer$Companion$getInitializer$1>) null)), new C7099a(), d0Var);
    }
}
