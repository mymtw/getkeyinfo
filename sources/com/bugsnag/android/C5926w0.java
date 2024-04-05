package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import com.bugsnag.android.C5726c1;
import com.bugsnag.android.C5912t0;
import com.bugsnag.android.internal.C5763c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.w0 */
public final class C5926w0 extends C5726c1 {

    /* renamed from: n */
    public static final C5927a f12696n = new C5927a();

    /* renamed from: h */
    public final C5763c f12697h;

    /* renamed from: i */
    public final C5726c1.C5727a f12698i;

    /* renamed from: j */
    public final C5914t1 f12699j;

    /* renamed from: k */
    public final C5746g f12700k;

    /* renamed from: l */
    public final C5805m f12701l;

    /* renamed from: m */
    public final C5816o1 f12702m;

    /* renamed from: com.bugsnag.android.w0$a */
    public class C5927a implements Comparator<File> {
        public final int compare(Object obj, Object obj2) {
            File file = (File) obj;
            File file2 = (File) obj2;
            if (file == null && file2 == null) {
                return 0;
            }
            if (file == null) {
                return 1;
            }
            if (file2 == null) {
                return -1;
            }
            return file.compareTo(file2);
        }
    }

    /* renamed from: com.bugsnag.android.w0$b */
    public class C5928b implements Runnable {
        public C5928b() {
        }

        public final void run() {
            ArrayList d = C5926w0.this.mo16492d();
            if (d.isEmpty()) {
                C5926w0.this.f12702m.mo16604d("No regular events to flush to Bugsnag.");
            }
            C5926w0.this.mo16696k(d);
        }
    }

    /* renamed from: com.bugsnag.android.w0$c */
    public static /* synthetic */ class C5929c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12704a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bugsnag.android.DeliveryStatus[] r0 = com.bugsnag.android.DeliveryStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12704a = r0
                com.bugsnag.android.DeliveryStatus r1 = com.bugsnag.android.DeliveryStatus.DELIVERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12704a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bugsnag.android.DeliveryStatus r1 = com.bugsnag.android.DeliveryStatus.UNDELIVERED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12704a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bugsnag.android.DeliveryStatus r1 = com.bugsnag.android.DeliveryStatus.FAILURE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5926w0.C5929c.<clinit>():void");
        }
    }

    public C5926w0(C5763c cVar, C5816o1 o1Var, C5914t1 t1Var, C5746g gVar, C5744f1 f1Var, C5805m mVar) {
        super(new File(cVar.f12334x.getValue(), "bugsnag-errors"), cVar.f12331u, f12696n, o1Var, f1Var);
        this.f12697h = cVar;
        this.f12702m = o1Var;
        this.f12698i = f1Var;
        this.f12699j = t1Var;
        this.f12700k = gVar;
        this.f12701l = mVar;
    }

    /* renamed from: e */
    public final String mo16493e(Object obj) {
        C5912t0.C5913a aVar = C5912t0.f12608f;
        C5763c cVar = this.f12697h;
        aVar.getClass();
        return C5912t0.C5913a.m11704a(obj, (String) null, cVar).mo16676a();
    }

    /* renamed from: h */
    public final C5922v0 mo16693h(File file, String str) {
        C5820p1 p1Var = new C5820p1(file, str, this.f12702m);
        try {
            C5805m mVar = this.f12701l;
            C5816o1 o1Var = this.f12702m;
            mVar.getClass();
            C19383o.m32798h(o1Var, "logger");
            if (!(mVar.f12418d.isEmpty() ? true : mVar.mo16570a((C5908s0) p1Var.invoke(), o1Var))) {
                return null;
            }
        } catch (Exception unused) {
            p1Var.f12447b = null;
        }
        C5908s0 s0Var = p1Var.f12447b;
        if (s0Var != null) {
            return new C5922v0(s0Var.f12603b.f12654i, s0Var, (File) null, this.f12699j, this.f12697h);
        }
        return new C5922v0(str, (C5908s0) null, file, this.f12699j, this.f12697h);
    }

    /* renamed from: i */
    public final void mo16694i(File file, C5922v0 v0Var) {
        int i = C5929c.f12704a[this.f12697h.f12325o.mo16486b(v0Var, this.f12697h.mo16544a(v0Var)).ordinal()];
        if (i == 1) {
            mo16490b(Collections.singleton(file));
            C5816o1 o1Var = this.f12702m;
            StringBuilder h = C0072d.m201h("Deleting sent error file ");
            h.append(file.getName());
            o1Var.mo16606f(h.toString());
        } else if (i == 2) {
            mo16489a(Collections.singleton(file));
            this.f12702m.mo16608h("Could not send previously saved error(s) to Bugsnag, will try again later");
        } else if (i == 3) {
            RuntimeException runtimeException = new RuntimeException("Failed to deliver event payload");
            C5726c1.C5727a aVar = this.f12698i;
            if (aVar != null) {
                aVar.mo16496a(runtimeException, file, "Crash Report Deserialization");
            }
            mo16490b(Collections.singleton(file));
        }
    }

    /* renamed from: j */
    public final void mo16695j() {
        try {
            this.f12700k.mo16512a(TaskType.ERROR_REQUEST, new C5928b());
        } catch (RejectedExecutionException unused) {
            this.f12702m.mo16608h("Failed to flush all on-disk errors, retaining unsent errors for later.");
        }
    }

    /* renamed from: k */
    public final void mo16696k(List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            C5816o1 o1Var = this.f12702m;
            o1Var.mo16606f("Sending " + size + " saved error(s) to Bugsnag");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                try {
                    C5912t0.C5913a aVar = C5912t0.f12608f;
                    C5763c cVar = this.f12697h;
                    aVar.getClass();
                    C5922v0 h = mo16693h(file, C5912t0.C5913a.m11705b(file, cVar).f12609a);
                    if (h == null) {
                        mo16490b(Collections.singleton(file));
                    } else {
                        mo16694i(file, h);
                    }
                } catch (Exception e) {
                    C5726c1.C5727a aVar2 = this.f12698i;
                    if (aVar2 != null) {
                        aVar2.mo16496a(e, file, "Crash Report Deserialization");
                    }
                    mo16490b(Collections.singleton(file));
                }
            }
        }
    }
}
