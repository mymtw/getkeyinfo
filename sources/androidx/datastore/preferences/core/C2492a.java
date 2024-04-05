package androidx.datastore.preferences.core;

import androidx.datastore.core.C2479f;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p753kq.C19846a;

/* renamed from: androidx.datastore.preferences.core.a */
public final class C2492a {
    /* renamed from: a */
    public static PreferenceDataStore m5474a(List list, C19525d0 d0Var, C19846a aVar) {
        C19383o.m32797g(list, "migrations");
        C19383o.m32797g(d0Var, "scope");
        return new PreferenceDataStore(C2479f.m5443a(list, d0Var, new PreferenceDataStoreFactory$create$delegate$1(aVar)));
    }
}
