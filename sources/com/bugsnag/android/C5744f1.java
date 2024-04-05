package com.bugsnag.android;

import android.content.Context;
import android.os.storage.StorageManager;
import com.bugsnag.android.C5726c1;
import com.bugsnag.android.internal.C5763c;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.bugsnag.android.f1 */
public final class C5744f1 implements C5726c1.C5727a {

    /* renamed from: a */
    public final C5816o1 f12240a;

    /* renamed from: b */
    public final C5763c f12241b;

    /* renamed from: c */
    public final StorageManager f12242c;

    /* renamed from: d */
    public final C5729d f12243d;

    /* renamed from: e */
    public final C5773j0 f12244e;

    /* renamed from: f */
    public final Context f12245f;

    /* renamed from: g */
    public final C5914t1 f12246g;

    /* renamed from: h */
    public final C5746g f12247h;

    public C5744f1(Context context, C5816o1 o1Var, C5763c cVar, StorageManager storageManager, C5729d dVar, C5773j0 j0Var, C5914t1 t1Var, C5746g gVar) {
        this.f12240a = o1Var;
        this.f12241b = cVar;
        this.f12242c = storageManager;
        this.f12243d = dVar;
        this.f12244e = j0Var;
        this.f12245f = context;
        this.f12246g = t1Var;
        this.f12247h = gVar;
    }

    /* renamed from: a */
    public final void mo16496a(Exception exc, File file, String str) {
        C5750g2 a = C5750g2.m11538a((Severity) null, "unhandledException", (String) null);
        Exception exc2 = exc;
        C5908s0 s0Var = new C5908s0(exc2, this.f12241b, a, new C5829r1(), new C5722b1(), this.f12240a);
        s0Var.f12603b.f12661p = str;
        s0Var.mo16668a("BugsnagDiagnostics", "canRead", Boolean.valueOf(file.canRead()));
        s0Var.mo16668a("BugsnagDiagnostics", "canWrite", Boolean.valueOf(file.canWrite()));
        s0Var.mo16668a("BugsnagDiagnostics", "exists", Boolean.valueOf(file.exists()));
        s0Var.mo16668a("BugsnagDiagnostics", "usableSpace", Long.valueOf(this.f12245f.getCacheDir().getUsableSpace()));
        s0Var.mo16668a("BugsnagDiagnostics", "filename", file.getName());
        s0Var.mo16668a("BugsnagDiagnostics", "fileLength", Long.valueOf(file.length()));
        if (this.f12242c != null) {
            File file2 = new File(this.f12245f.getCacheDir(), "bugsnag-errors");
            try {
                boolean isCacheBehaviorTombstone = this.f12242c.isCacheBehaviorTombstone(file2);
                boolean isCacheBehaviorGroup = this.f12242c.isCacheBehaviorGroup(file2);
                s0Var.mo16668a("BugsnagDiagnostics", "cacheTombstone", Boolean.valueOf(isCacheBehaviorTombstone));
                s0Var.mo16668a("BugsnagDiagnostics", "cacheGroup", Boolean.valueOf(isCacheBehaviorGroup));
            } catch (IOException e) {
                this.f12240a.mo16602b("Failed to record cache behaviour, skipping diagnostics", e);
            }
        }
        C5735e b = this.f12243d.mo16498b();
        C5918u0 u0Var = s0Var.f12603b;
        u0Var.getClass();
        u0Var.f12655j = b;
        C5811n0 b2 = this.f12244e.mo16557b(new Date().getTime());
        C5918u0 u0Var2 = s0Var.f12603b;
        u0Var2.getClass();
        u0Var2.f12656k = b2;
        s0Var.mo16668a("BugsnagDiagnostics", "notifierName", this.f12246g.f12615c);
        s0Var.mo16668a("BugsnagDiagnostics", "notifierVersion", this.f12246g.f12616d);
        s0Var.mo16668a("BugsnagDiagnostics", "apiKey", this.f12241b.f12311a);
        try {
            this.f12247h.mo16512a(TaskType.INTERNAL_REPORT, new C5737e1(this, new C5922v0((String) null, s0Var, this.f12246g, this.f12241b)));
        } catch (RejectedExecutionException unused) {
        }
    }
}
