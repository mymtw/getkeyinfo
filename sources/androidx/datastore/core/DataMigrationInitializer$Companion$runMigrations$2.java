package androidx.datastore.core;

import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", mo70541f = "DataMigrationInitializer.kt", mo70542l = {44, 46}, mo70543m = "invokeSuspend")
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements C19861p<Object, C19340c<Object>, Object> {
    public final /* synthetic */ List<C19857l<C19340c<? super C19394m>, Object>> $cleanUps;
    public final /* synthetic */ List<C2475c<Object>> $migrations;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends C2475c<Object>> list, List<C19857l<C19340c<? super C19394m>, Object>> list2, C19340c<? super DataMigrationInitializer$Companion$runMigrations$2> cVar) {
        super(2, cVar);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, cVar);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    public final Object invoke(Object obj, C19340c<Object> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0033
            if (r1 == r2) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r1 = r10.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r10.L$0
            java.util.List r4 = (java.util.List) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0040
        L_0x0018:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0020:
            java.lang.Object r1 = r10.L$3
            java.lang.Object r4 = r10.L$2
            androidx.datastore.core.c r4 = (androidx.datastore.core.C2475c) r4
            java.lang.Object r5 = r10.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r10.L$0
            java.util.List r6 = (java.util.List) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            r7 = r10
            goto L_0x0066
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            java.lang.Object r11 = r10.L$0
            java.util.List<androidx.datastore.core.c<java.lang.Object>> r1 = r10.$migrations
            java.util.List<kq.l<kotlin.coroutines.c<? super kotlin.m>, java.lang.Object>> r4 = r10.$cleanUps
            java.util.Iterator r1 = r1.iterator()
        L_0x0040:
            r5 = r10
        L_0x0041:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x008d
            java.lang.Object r6 = r1.next()
            androidx.datastore.core.c r6 = (androidx.datastore.core.C2475c) r6
            r5.L$0 = r4
            r5.L$1 = r1
            r5.L$2 = r6
            r5.L$3 = r11
            r5.label = r2
            java.lang.Object r7 = r6.mo9328b()
            if (r7 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r8 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r8
            r9 = r6
            r6 = r4
            r4 = r9
        L_0x0066:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0088
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r11 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r1 = 0
            r11.<init>(r4, r1)
            r6.add(r11)
            r7.L$0 = r6
            r7.L$1 = r5
            r7.L$2 = r1
            r7.L$3 = r1
            r7.label = r3
            java.lang.Object r11 = r4.mo9327a()
            if (r11 != r0) goto L_0x0089
            return r0
        L_0x0088:
            r11 = r1
        L_0x0089:
            r1 = r5
            r4 = r6
            r5 = r7
            goto L_0x0041
        L_0x008d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
