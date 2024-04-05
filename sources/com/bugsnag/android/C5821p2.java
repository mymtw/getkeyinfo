package com.bugsnag.android;

import androidx.appcompat.widget.C0326j;
import com.bugsnag.android.C5748g1;
import com.bugsnag.android.Thread;
import com.bugsnag.android.internal.C5763c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C19318k;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.bugsnag.android.p2 */
public final class C5821p2 implements C5748g1.C5749a {

    /* renamed from: c */
    public static final C5822a f12451c = new C5822a();

    /* renamed from: b */
    public final ArrayList f12452b;

    /* renamed from: com.bugsnag.android.p2$a */
    public static final class C5822a {
    }

    public C5821p2(Throwable th, boolean z, C5763c cVar) {
        ArrayList arrayList;
        C5763c cVar2 = cVar;
        C19383o.m32798h(cVar2, "config");
        int i = cVar2.f12333w;
        ThreadSendPolicy threadSendPolicy = cVar2.f12315e;
        Collection<String> collection = cVar2.f12318h;
        C5816o1 o1Var = cVar2.f12329s;
        Thread currentThread = Thread.currentThread();
        C19383o.m32793c(currentThread, "JavaThread.currentThread()");
        f12451c.getClass();
        Thread currentThread2 = Thread.currentThread();
        C19383o.m32793c(currentThread2, "JavaThread.currentThread()");
        ThreadGroup threadGroup = currentThread2.getThreadGroup();
        if (threadGroup != null) {
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
                C19383o.m32793c(threadGroup, "group.parent");
            }
            Thread[] threadArr = new Thread[threadGroup.activeCount()];
            threadGroup.enumerate(threadArr);
            ArrayList c1 = C19318k.m32611c1(threadArr);
            C19383o.m32798h(threadSendPolicy, "sendThreads");
            C19383o.m32798h(collection, "projectPackages");
            C19383o.m32798h(o1Var, "logger");
            if (threadSendPolicy == ThreadSendPolicy.ALWAYS || (threadSendPolicy == ThreadSendPolicy.UNHANDLED_ONLY && z)) {
                ThreadState$captureThreadTrace$1 threadState$captureThreadTrace$1 = new ThreadState$captureThreadTrace$1(currentThread, th, z, collection, o1Var);
                List<Thread> m1 = C19327t.m32657m1(C19327t.m32656l1(c1, new C5826q2()), i);
                m1 = !m1.contains(currentThread) ? C19327t.m32656l1(C19327t.m32651g1(C19327t.m32657m1(m1, Math.max(i - 1, 0)), currentThread), new C5831r2()) : m1;
                ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(m1));
                for (Thread invoke : m1) {
                    arrayList2.add(threadState$captureThreadTrace$1.invoke(invoke));
                }
                arrayList = C19327t.m32661q1(arrayList2);
                if (c1.size() > i) {
                    StringBuilder k = C0326j.m866k('[');
                    k.append(c1.size() - i);
                    k.append(" threads omitted as the maxReportedThreads limit (");
                    k.append(i);
                    k.append(") was exceeded]");
                    arrayList.add(new Thread(-1, k.toString(), ThreadType.EMPTY, false, Thread.State.UNKNOWN, new C5776j2(new StackTraceElement[]{new StackTraceElement("", "", HelpFormatter.DEFAULT_OPT_PREFIX, 0)}, collection, o1Var), o1Var));
                }
            } else {
                arrayList = new ArrayList();
            }
            this.f12452b = arrayList;
            return;
        }
        C19383o.m32803m();
        throw null;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16520b();
        for (Thread M : this.f12452b) {
            g1Var.mo16516M(M, false);
        }
        g1Var.mo16524f();
    }
}
