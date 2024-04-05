package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.C3422l;
import java.util.ArrayList;
import java.util.Iterator;
import p079d3.C6637j;
import p079d3.C6641m;
import p079d3.C6648r;
import p090e3.C6712a;
import p090e3.C6713b;
import p252u2.C8119a;
import p252u2.C8121c;
import p252u2.C8129j;

/* renamed from: androidx.work.impl.background.systemalarm.d */
public final class C3401d implements C8119a {

    /* renamed from: l */
    public static final String f7947l = C3422l.m8214e("SystemAlarmDispatcher");

    /* renamed from: b */
    public final Context f7948b;

    /* renamed from: c */
    public final C6712a f7949c;

    /* renamed from: d */
    public final C6648r f7950d = new C6648r();

    /* renamed from: e */
    public final C8121c f7951e;

    /* renamed from: f */
    public final C8129j f7952f;

    /* renamed from: g */
    public final C3398a f7953g;

    /* renamed from: h */
    public final Handler f7954h;

    /* renamed from: i */
    public final ArrayList f7955i;

    /* renamed from: j */
    public Intent f7956j;

    /* renamed from: k */
    public C3404c f7957k;

    /* renamed from: androidx.work.impl.background.systemalarm.d$a */
    public class C3402a implements Runnable {
        public C3402a() {
        }

        public final void run() {
            C3405d dVar;
            C3401d dVar2;
            synchronized (C3401d.this.f7955i) {
                C3401d dVar3 = C3401d.this;
                dVar3.f7956j = (Intent) dVar3.f7955i.get(0);
            }
            Intent intent = C3401d.this.f7956j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C3401d.this.f7956j.getIntExtra("KEY_START_ID", 0);
                C3422l c = C3422l.m8213c();
                String str = C3401d.f7947l;
                c.mo12926a(str, String.format("Processing command %s, %s", new Object[]{C3401d.this.f7956j, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock a = C6641m.m13020a(C3401d.this.f7948b, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C3422l.m8213c().mo12926a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.acquire();
                    C3401d dVar4 = C3401d.this;
                    dVar4.f7953g.mo12865c(intExtra, dVar4.f7956j, dVar4);
                    C3422l.m8213c().mo12926a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    dVar2 = C3401d.this;
                    dVar = new C3405d(dVar2);
                } catch (Throwable th) {
                    C3422l.m8213c().mo12926a(C3401d.f7947l, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    C3401d dVar5 = C3401d.this;
                    dVar5.mo12876d(new C3405d(dVar5));
                    throw th;
                }
                dVar2.mo12876d(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$b */
    public static class C3403b implements Runnable {

        /* renamed from: b */
        public final C3401d f7959b;

        /* renamed from: c */
        public final Intent f7960c;

        /* renamed from: d */
        public final int f7961d;

        public C3403b(int i, Intent intent, C3401d dVar) {
            this.f7959b = dVar;
            this.f7960c = intent;
            this.f7961d = i;
        }

        public final void run() {
            this.f7959b.mo12873a(this.f7961d, this.f7960c);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$c */
    public interface C3404c {
        void onAllCommandsCompleted();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    public static class C3405d implements Runnable {

        /* renamed from: b */
        public final C3401d f7962b;

        public C3405d(C3401d dVar) {
            this.f7962b = dVar;
        }

        public final void run() {
            boolean z;
            C3401d dVar = this.f7962b;
            dVar.getClass();
            C3422l c = C3422l.m8213c();
            String str = C3401d.f7947l;
            c.mo12926a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.mo12874b();
            synchronized (dVar.f7955i) {
                boolean z2 = true;
                if (dVar.f7956j != null) {
                    C3422l.m8213c().mo12926a(str, String.format("Removing command %s", new Object[]{dVar.f7956j}), new Throwable[0]);
                    if (((Intent) dVar.f7955i.remove(0)).equals(dVar.f7956j)) {
                        dVar.f7956j = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                C6637j jVar = ((C6713b) dVar.f7949c).f14803a;
                C3398a aVar = dVar.f7953g;
                synchronized (aVar.f7931d) {
                    z = !aVar.f7930c.isEmpty();
                }
                if (!z) {
                    if (dVar.f7955i.isEmpty()) {
                        synchronized (jVar.f14643d) {
                            if (jVar.f14641b.isEmpty()) {
                                z2 = false;
                            }
                        }
                        if (!z2) {
                            C3422l.m8213c().mo12926a(str, "No more commands & intents.", new Throwable[0]);
                            C3404c cVar = dVar.f7957k;
                            if (cVar != null) {
                                cVar.onAllCommandsCompleted();
                            }
                        }
                    }
                }
                if (!dVar.f7955i.isEmpty()) {
                    dVar.mo12877e();
                }
            }
        }
    }

    public C3401d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7948b = applicationContext;
        this.f7953g = new C3398a(applicationContext);
        C8129j e = C8129j.m16345e(context);
        this.f7952f = e;
        C8121c cVar = e.f17766f;
        this.f7951e = cVar;
        this.f7949c = e.f17764d;
        cVar.mo20714a(this);
        this.f7955i = new ArrayList();
        this.f7956j = null;
        this.f7954h = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo12873a(int i, Intent intent) {
        C3422l c = C3422l.m8213c();
        String str = f7947l;
        boolean z = false;
        c.mo12926a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo12874b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C3422l.m8213c().mo12929f(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            mo12874b();
            synchronized (this.f7955i) {
                Iterator it = this.f7955i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f7955i) {
            boolean z2 = !this.f7955i.isEmpty();
            this.f7955i.add(intent);
            if (!z2) {
                mo12877e();
            }
        }
    }

    /* renamed from: b */
    public final void mo12874b() {
        if (this.f7954h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: c */
    public final void mo12875c() {
        C3422l.m8213c().mo12926a(f7947l, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        C8121c cVar = this.f7951e;
        synchronized (cVar.f17740l) {
            cVar.f17739k.remove(this);
        }
        C6648r rVar = this.f7950d;
        if (!rVar.f14676a.isShutdown()) {
            rVar.f14676a.shutdownNow();
        }
        this.f7957k = null;
    }

    /* renamed from: d */
    public final void mo12876d(Runnable runnable) {
        this.f7954h.post(runnable);
    }

    /* renamed from: e */
    public final void mo12877e() {
        mo12874b();
        PowerManager.WakeLock a = C6641m.m13020a(this.f7948b, "ProcessCommand");
        try {
            a.acquire();
            ((C6713b) this.f7952f.f17764d).mo18901a(new C3402a());
        } finally {
            a.release();
        }
    }

    public final void onExecuted(String str, boolean z) {
        Context context = this.f7948b;
        String str2 = C3398a.f7928e;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        mo12876d(new C3403b(0, intent, this));
    }
}
