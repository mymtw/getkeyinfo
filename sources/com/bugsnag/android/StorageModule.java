package com.bugsnag.android;

import android.content.Context;
import com.bugsnag.android.internal.C5763c;
import com.bugsnag.android.internal.dag.DependencyModule;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;

public final class StorageModule extends DependencyModule {

    /* renamed from: b */
    public final C19285c f12129b;

    /* renamed from: c */
    public final C19285c f12130c;

    /* renamed from: d */
    public final C19285c f12131d = mo16552a(new StorageModule$deviceId$2(this));

    /* renamed from: e */
    public final C19285c f12132e;

    /* renamed from: f */
    public final C19285c f12133f;

    /* renamed from: g */
    public final C19285c f12134g;

    /* renamed from: h */
    public final C19285c f12135h;

    public StorageModule(Context context, C5763c cVar, C5816o1 o1Var) {
        C19383o.m32798h(context, "appContext");
        C19383o.m32798h(cVar, "immutableConfig");
        C19383o.m32798h(o1Var, "logger");
        this.f12129b = mo16552a(new StorageModule$sharedPrefMigrator$2(context));
        this.f12130c = mo16552a(new StorageModule$deviceIdStore$2(this, context, o1Var));
        this.f12132e = mo16552a(new StorageModule$userStore$2(this, cVar, o1Var));
        this.f12133f = mo16552a(new StorageModule$lastRunInfoStore$2(cVar));
        this.f12134g = mo16552a(new StorageModule$sessionStore$2(cVar, o1Var));
        this.f12135h = mo16552a(new StorageModule$lastRunInfo$2(this));
    }
}
