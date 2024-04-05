package com.bugsnag.android;

import com.bugsnag.android.C5912t0;
import com.bugsnag.android.internal.C5763c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.x0 */
public final class C5933x0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5926w0 f12712b;

    public C5933x0(C5926w0 w0Var) {
        this.f12712b = w0Var;
    }

    public final void run() {
        C5926w0 w0Var = this.f12712b;
        ArrayList d = w0Var.mo16492d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            C5912t0.C5913a aVar = C5912t0.f12608f;
            C5763c cVar = w0Var.f12697h;
            aVar.getClass();
            if (C19383o.m32792b(C5912t0.C5913a.m11705b(file, cVar).f12612d, "startupcrash")) {
                arrayList.add(file);
            }
        }
        Collections.sort(arrayList, C5926w0.f12696n);
        File file2 = arrayList.isEmpty() ? null : (File) arrayList.get(arrayList.size() - 1);
        if (file2 != null) {
            d.remove(file2);
        }
        w0Var.mo16489a(d);
        if (file2 != null) {
            w0Var.f12702m.mo16606f("Attempting to send the most recent launch crash report");
            w0Var.mo16696k(Collections.singletonList(file2));
            w0Var.f12702m.mo16606f("Continuing with Bugsnag initialisation");
            return;
        }
        w0Var.f12702m.mo16604d("No startupcrash events to flush to Bugsnag.");
    }
}
