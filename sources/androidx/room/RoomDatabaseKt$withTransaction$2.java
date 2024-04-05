package androidx.room;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.room.RoomDatabaseKt$withTransaction$2", mo70541f = "RoomDatabase.kt", mo70542l = {58}, mo70543m = "invokeSuspend")
final class RoomDatabaseKt$withTransaction$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {
    public final /* synthetic */ C19857l<C19340c<Object>, Object> $block;
    public final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$withTransaction$2(RoomDatabase roomDatabase, C19857l<? super C19340c<Object>, ? extends Object> lVar, C19340c<? super RoomDatabaseKt$withTransaction$2> cVar) {
        super(2, cVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$2(this.$this_withTransaction, this.$block, cVar);
        roomDatabaseKt$withTransaction$2.L$0 = obj;
        return roomDatabaseKt$withTransaction$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
        return ((RoomDatabaseKt$withTransaction$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            java.lang.String r3 = "Transaction was never started or was already released."
            r4 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r4) goto L_0x0016
            java.lang.Object r0 = r6.L$0
            androidx.room.h0 r0 = (androidx.room.C3235h0) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ all -> 0x0014 }
            goto L_0x004d
        L_0x0014:
            r7 = move-exception
            goto L_0x0071
        L_0x0016:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.d0 r7 = (kotlinx.coroutines.C19525d0) r7
            kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
            androidx.room.h0$a r1 = androidx.room.C3235h0.f7516e
            kotlin.coroutines.CoroutineContext$a r7 = r7.get(r1)
            kotlin.jvm.internal.C19383o.m32794d(r7)
            androidx.room.h0 r7 = (androidx.room.C3235h0) r7
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f7519d
            r1.incrementAndGet()
            androidx.room.RoomDatabase r1 = r6.$this_withTransaction     // Catch:{ all -> 0x007c }
            r1.mo11974c()     // Catch:{ all -> 0x007c }
            kq.l<kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r1 = r6.$block     // Catch:{ all -> 0x006d }
            r6.L$0 = r7     // Catch:{ all -> 0x006d }
            r6.label = r4     // Catch:{ all -> 0x006d }
            java.lang.Object r1 = r1.invoke(r6)     // Catch:{ all -> 0x006d }
            if (r1 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r0 = r7
            r7 = r1
        L_0x004d:
            androidx.room.RoomDatabase r1 = r6.$this_withTransaction     // Catch:{ all -> 0x0014 }
            r1.mo11984m()     // Catch:{ all -> 0x0014 }
            androidx.room.RoomDatabase r1 = r6.$this_withTransaction     // Catch:{ all -> 0x0077 }
            r1.mo11980i()     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f7519d
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x0067
            if (r1 != 0) goto L_0x0066
            kotlinx.coroutines.g1 r0 = r0.f7517b
            r0.mo72134a(r2)
        L_0x0066:
            return r7
        L_0x0067:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x006d:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0071:
            androidx.room.RoomDatabase r1 = r6.$this_withTransaction     // Catch:{ all -> 0x0077 }
            r1.mo11980i()     // Catch:{ all -> 0x0077 }
            throw r7     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x007d
        L_0x007c:
            r0 = move-exception
        L_0x007d:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f7519d
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x008d
            if (r1 != 0) goto L_0x008c
            kotlinx.coroutines.g1 r7 = r7.f7517b
            r7.mo72134a(r2)
        L_0x008c:
            throw r0
        L_0x008d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt$withTransaction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
