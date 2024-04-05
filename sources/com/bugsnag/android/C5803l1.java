package com.bugsnag.android;

import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5763c;
import com.bugsnag.android.internal.C5771f;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.l1 */
public final class C5803l1 extends C5756i {

    /* renamed from: b */
    public final AtomicBoolean f12411b = new AtomicBoolean(true);

    /* renamed from: c */
    public final C5816o1 f12412c;

    /* renamed from: d */
    public final ScheduledThreadPoolExecutor f12413d;

    public C5803l1(C5763c cVar) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        C19383o.m32798h(cVar, "config");
        this.f12413d = scheduledThreadPoolExecutor;
        this.f12412c = cVar.f12329s;
        long j = cVar.f12328r;
        if (j > 0) {
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                scheduledThreadPoolExecutor.schedule(new C5779k1(this), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                this.f12412c.mo16602b("Failed to schedule timer for LaunchCrashTracker", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo16569a() {
        this.f12413d.shutdown();
        this.f12411b.set(false);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            C5780k2.C5795o oVar = new C5780k2.C5795o();
            for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(oVar);
            }
        }
        this.f12412c.mo16604d("App launch period marked as complete");
    }
}
