package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends Lambda implements C19846a<File> {
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ C2490b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, C2490b bVar) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = bVar;
    }

    public final File invoke() {
        Context context = this.$applicationContext;
        C19383o.m32796f(context, "applicationContext");
        String str = this.this$0.f5755b;
        C19383o.m32797g(str, "name");
        String l = C19383o.m32802l(".preferences_pb", str);
        C19383o.m32797g(l, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), C19383o.m32802l(l, "datastore/"));
    }
}
