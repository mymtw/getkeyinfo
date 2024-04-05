package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.w2 */
public final class C5931w2 {

    /* renamed from: a */
    public final C5813n2<C5915t2> f12705a;

    /* renamed from: b */
    public final boolean f12706b;

    /* renamed from: c */
    public final AtomicReference<C5915t2> f12707c = new AtomicReference<>((Object) null);

    /* renamed from: d */
    public final String f12708d;

    /* renamed from: e */
    public final C5755h2 f12709e;

    /* renamed from: f */
    public final C5816o1 f12710f;

    public C5931w2(C5763c cVar, String str, C5755h2 h2Var, C5816o1 o1Var) {
        File file = new File(cVar.f12334x.getValue(), "user-info");
        C19383o.m32798h(cVar, "config");
        C19383o.m32798h(h2Var, "sharedPrefMigrator");
        C19383o.m32798h(o1Var, "logger");
        this.f12708d = str;
        this.f12709e = h2Var;
        this.f12710f = o1Var;
        this.f12706b = cVar.f12327q;
        try {
            file.createNewFile();
        } catch (IOException e) {
            this.f12710f.mo16602b("Failed to created device ID file", e);
        }
        this.f12705a = new C5813n2<>(file);
    }

    /* renamed from: a */
    public final void mo16700a(C5915t2 t2Var) {
        C19383o.m32798h(t2Var, "user");
        if (this.f12706b && (!C19383o.m32792b(t2Var, this.f12707c.getAndSet(t2Var)))) {
            try {
                this.f12705a.mo16576b(t2Var);
            } catch (Exception e) {
                this.f12710f.mo16602b("Failed to persist user info", e);
            }
        }
    }
}
