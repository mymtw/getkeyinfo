package androidx.room;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.room.RoomDatabaseKt", mo70541f = "RoomDatabase.kt", mo70542l = {50, 51}, mo70543m = "withTransaction")
final class RoomDatabaseKt$withTransaction$1<R> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public RoomDatabaseKt$withTransaction$1(C19340c<? super RoomDatabaseKt$withTransaction$1> cVar) {
        super(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.result = r8
            int r8 = r7.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.label = r8
            r1 = r8 & r0
            if (r1 == 0) goto L_0x0012
            int r8 = r8 - r0
            r7.label = r8
            r8 = r7
            goto L_0x0017
        L_0x0012:
            androidx.room.RoomDatabaseKt$withTransaction$1 r8 = new androidx.room.RoomDatabaseKt$withTransaction$1
            r8.<init>(r7)
        L_0x0017:
            java.lang.Object r0 = r8.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x007b
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0032:
            java.lang.Object r2 = r8.L$1
            kq.l r2 = (p753kq.C19857l) r2
            java.lang.Object r4 = r8.L$0
            androidx.room.RoomDatabase r4 = (androidx.room.RoomDatabase) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x0064
        L_0x003e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            kotlin.coroutines.CoroutineContext r0 = r8.getContext()
            androidx.room.h0$a r2 = androidx.room.C3235h0.f7516e
            kotlin.coroutines.CoroutineContext$a r0 = r0.get(r2)
            androidx.room.h0 r0 = (androidx.room.C3235h0) r0
            if (r0 != 0) goto L_0x0051
            r0 = r5
            goto L_0x0053
        L_0x0051:
            kotlin.coroutines.d r0 = r0.f7518c
        L_0x0053:
            if (r0 != 0) goto L_0x0067
            r8.L$0 = r5
            r8.L$1 = r5
            r8.label = r4
            java.lang.Object r0 = androidx.room.C3220b0.m7863a(r8)
            if (r0 != r1) goto L_0x0062
            goto L_0x007c
        L_0x0062:
            r2 = r5
            r4 = r2
        L_0x0064:
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            goto L_0x0069
        L_0x0067:
            r2 = r5
            r4 = r2
        L_0x0069:
            androidx.room.RoomDatabaseKt$withTransaction$2 r6 = new androidx.room.RoomDatabaseKt$withTransaction$2
            r6.<init>(r4, r2, r5)
            r8.L$0 = r5
            r8.L$1 = r5
            r8.label = r3
            java.lang.Object r0 = kotlinx.coroutines.C19697g.m33471i(r8, r0, r6)
            if (r0 != r1) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r1 = r0
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt$withTransaction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
