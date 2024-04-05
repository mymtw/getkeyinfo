package androidx.datastore.core;

import androidx.datastore.core.C2476d;
import java.util.List;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.datastore.core.DataMigrationInitializer$Companion", mo70541f = "DataMigrationInitializer.kt", mo70542l = {42, 57}, mo70543m = "runMigrations")
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C2476d.C2477a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(C2476d.C2477a aVar, C19340c<? super DataMigrationInitializer$Companion$runMigrations$1> cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C2476d.C2477a.m5441a(this.this$0, (List) null, (C2481h) null, this);
    }
}
