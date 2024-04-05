package androidx.datastore.preferences;

import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19721f;
import p001a0.C0005b;

/* renamed from: androidx.datastore.preferences.a */
public final class C2489a {
    /* renamed from: a */
    public static C2490b m5467a() {
        PreferenceDataStoreDelegateKt$preferencesDataStore$1 preferenceDataStoreDelegateKt$preferencesDataStore$1 = PreferenceDataStoreDelegateKt$preferencesDataStore$1.INSTANCE;
        C19721f a = C19697g.m33463a(C19760n0.f43720b.plus(C0005b.m44j()));
        C19383o.m32797g(preferenceDataStoreDelegateKt$preferencesDataStore$1, "produceMigrations");
        return new C2490b(preferenceDataStoreDelegateKt$preferencesDataStore$1, a);
    }
}
