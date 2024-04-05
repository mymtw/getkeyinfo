package com.bugsnag.android.internal.dag;

import androidx.compose.foundation.layout.C0761x;
import com.bugsnag.android.C5746g;
import com.bugsnag.android.TaskType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public abstract class DependencyModule {

    /* renamed from: a */
    public final ArrayList f12337a = new ArrayList();

    /* renamed from: com.bugsnag.android.internal.dag.DependencyModule$a */
    public static final class C5765a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ DependencyModule f12338b;

        public C5765a(DependencyModule dependencyModule) {
            this.f12338b = dependencyModule;
        }

        public final void run() {
            Iterator it = this.f12338b.f12337a.iterator();
            while (it.hasNext()) {
                ((C19285c) it.next()).getValue();
            }
        }
    }

    /* renamed from: a */
    public final <T> C19285c<T> mo16552a(C19846a<? extends T> aVar) {
        C19285c<T> b = C19350d.m32677b(new DependencyModule$future$lazy$1(aVar));
        this.f12337a.add(b);
        return b;
    }

    /* renamed from: b */
    public final void mo16553b(C5746g gVar, TaskType taskType) {
        C19383o.m32798h(gVar, "bgTaskService");
        C19383o.m32798h(taskType, "taskType");
        try {
            Result.m35480constructorimpl(gVar.mo16512a(taskType, new C5765a(this)).get());
        } catch (Throwable th) {
            Result.m35480constructorimpl(C0761x.m1673J(th));
        }
    }
}
