package androidx.compose.foundation.interaction;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19671s1;
import kotlinx.coroutines.flow.C19680v;

/* renamed from: androidx.compose.foundation.interaction.k */
public final class C0641k implements C0640j {

    /* renamed from: a */
    public final C19671s1 f1379a = C19680v.m33452a(0, 16, BufferOverflow.DROP_OLDEST, 1);

    /* renamed from: a */
    public final Object mo3870a(C0638h hVar, C19340c<? super C19394m> cVar) {
        Object emit = this.f1379a.emit(hVar, cVar);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : C19394m.f43287a;
    }

    /* renamed from: b */
    public final boolean mo3871b(C0638h hVar) {
        return this.f1379a.mo72331a(hVar);
    }

    /* renamed from: c */
    public final C19671s1 mo3869c() {
        return this.f1379a;
    }
}
