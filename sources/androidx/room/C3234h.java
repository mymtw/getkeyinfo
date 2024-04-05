package androidx.room;

import com.google.android.play.core.assetpacks.C15588c1;
import java.util.concurrent.Callable;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.flow.C19665q1;
import p422pe.C13220b;

/* renamed from: androidx.room.h */
public final class C3234h {
    /* renamed from: a */
    public static final C19665q1 m7895a(RoomDatabase roomDatabase, String[] strArr, Callable callable) {
        C19383o.m32797g(roomDatabase, "db");
        return new C19665q1(new CoroutinesRoom$Companion$createFlow$1(false, roomDatabase, strArr, callable, (C19340c<? super CoroutinesRoom$Companion$createFlow$1>) null));
    }

    /* renamed from: b */
    public static final Object m7896b(RoomDatabase roomDatabase, C13220b.C13223c cVar, C19340c cVar2) {
        if (roomDatabase.mo11982k() && roomDatabase.f7463d.mo12025j0().mo18967q0()) {
            return cVar.call();
        }
        C3235h0 h0Var = (C3235h0) cVar2.getContext().get(C3235h0.f7516e);
        CoroutineContext coroutineContext = h0Var == null ? null : h0Var.f7518c;
        if (coroutineContext == null) {
            coroutineContext = C15588c1.m25336m0(roomDatabase);
        }
        return C19697g.m33471i(cVar2, coroutineContext, new CoroutinesRoom$Companion$execute$2(cVar, (C19340c<? super CoroutinesRoom$Companion$execute$2>) null));
    }
}
