package com.bugsnag.android;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.g */
public final class C5746g {

    /* renamed from: a */
    public final ThreadPoolExecutor f12250a;

    /* renamed from: b */
    public final ThreadPoolExecutor f12251b;

    /* renamed from: c */
    public final ThreadPoolExecutor f12252c;

    /* renamed from: d */
    public final ThreadPoolExecutor f12253d;

    /* renamed from: e */
    public final ThreadPoolExecutor f12254e;

    public C5746g() {
        ThreadPoolExecutor a = C5751h.m11539a("Bugsnag Error thread", true);
        ThreadPoolExecutor a2 = C5751h.m11539a("Bugsnag Session thread", true);
        ThreadPoolExecutor a3 = C5751h.m11539a("Bugsnag IO thread", true);
        ThreadPoolExecutor a4 = C5751h.m11539a("Bugsnag Internal Report thread", false);
        ThreadPoolExecutor a5 = C5751h.m11539a("Bugsnag Default thread", false);
        this.f12250a = a;
        this.f12251b = a2;
        this.f12252c = a3;
        this.f12253d = a4;
        this.f12254e = a5;
    }

    /* renamed from: a */
    public final Future<?> mo16512a(TaskType taskType, Runnable runnable) throws RejectedExecutionException {
        C19383o.m32798h(taskType, "taskType");
        Callable<Object> callable = Executors.callable(runnable);
        C19383o.m32793c(callable, "Executors.callable(runnable)");
        return mo16513b(taskType, callable);
    }

    /* renamed from: b */
    public final <T> Future<T> mo16513b(TaskType taskType, Callable<T> callable) throws RejectedExecutionException {
        C19383o.m32798h(taskType, "taskType");
        int i = C5741f.f12232a[taskType.ordinal()];
        if (i == 1) {
            Future<T> submit = this.f12250a.submit(callable);
            C19383o.m32793c(submit, "errorExecutor.submit(callable)");
            return submit;
        } else if (i == 2) {
            Future<T> submit2 = this.f12251b.submit(callable);
            C19383o.m32793c(submit2, "sessionExecutor.submit(callable)");
            return submit2;
        } else if (i == 3) {
            Future<T> submit3 = this.f12252c.submit(callable);
            C19383o.m32793c(submit3, "ioExecutor.submit(callable)");
            return submit3;
        } else if (i == 4) {
            Future<T> submit4 = this.f12253d.submit(callable);
            C19383o.m32793c(submit4, "internalReportExecutor.submit(callable)");
            return submit4;
        } else if (i == 5) {
            Future<T> submit5 = this.f12254e.submit(callable);
            C19383o.m32793c(submit5, "defaultExecutor.submit(callable)");
            return submit5;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
