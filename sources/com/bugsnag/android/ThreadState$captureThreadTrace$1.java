package com.bugsnag.android;

import com.bugsnag.android.Thread;
import java.util.Collection;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ThreadState$captureThreadTrace$1 extends Lambda implements C19857l<Thread, Thread> {
    public final /* synthetic */ Thread $currentThread;
    public final /* synthetic */ Throwable $exc;
    public final /* synthetic */ boolean $isUnhandled;
    public final /* synthetic */ C5816o1 $logger;
    public final /* synthetic */ Collection $projectPackages;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadState$captureThreadTrace$1(Thread thread, Throwable th, boolean z, Collection collection, C5816o1 o1Var) {
        super(1);
        this.$currentThread = thread;
        this.$exc = th;
        this.$isUnhandled = z;
        this.$projectPackages = collection;
        this.$logger = o1Var;
    }

    public final Thread invoke(Thread thread) {
        StackTraceElement[] stackTraceElementArr;
        C19383o.m32798h(thread, "thread");
        boolean z = thread.getId() == this.$currentThread.getId();
        if (z) {
            Throwable th = this.$exc;
            if (th == null || !this.$isUnhandled) {
                stackTraceElementArr = this.$currentThread.getStackTrace();
            } else {
                stackTraceElementArr = th.getStackTrace();
            }
        } else {
            stackTraceElementArr = thread.getStackTrace();
        }
        C19383o.m32793c(stackTraceElementArr, "if (isErrorThread) {\n   …ckTrace\n                }");
        return new Thread(thread.getId(), thread.getName(), ThreadType.ANDROID, z, Thread.State.forThread(thread), new C5776j2(stackTraceElementArr, this.$projectPackages, this.$logger), this.$logger);
    }
}
