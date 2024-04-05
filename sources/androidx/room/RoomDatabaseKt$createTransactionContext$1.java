package androidx.room;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.room.RoomDatabaseKt", mo70541f = "RoomDatabase.kt", mo70542l = {99}, mo70543m = "createTransactionContext")
final class RoomDatabaseKt$createTransactionContext$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public RoomDatabaseKt$createTransactionContext$1(C19340c<? super RoomDatabaseKt$createTransactionContext$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C3220b0.m7863a(this);
    }
}
