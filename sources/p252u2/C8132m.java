package p252u2;

import android.content.Context;
import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.work.C3373b;
import androidx.work.C3380e;
import androidx.work.C3422l;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.futures.C3419a;
import com.google.common.util.concurrent.C16388l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p023b3.C3473a;
import p034c3.C4371b;
import p034c3.C4372c;
import p034c3.C4388n;
import p034c3.C4391o;
import p034c3.C4393p;
import p034c3.C4394q;
import p034c3.C4404s;
import p079d3.C6634g;
import p090e3.C6712a;

/* renamed from: u2.m */
public final class C8132m implements Runnable {

    /* renamed from: t */
    public static final String f17776t = C3422l.m8214e("WorkerWrapper");

    /* renamed from: b */
    public Context f17777b;

    /* renamed from: c */
    public String f17778c;

    /* renamed from: d */
    public List<C8123d> f17779d;

    /* renamed from: e */
    public C4391o f17780e;

    /* renamed from: f */
    public ListenableWorker f17781f;

    /* renamed from: g */
    public C6712a f17782g;

    /* renamed from: h */
    public ListenableWorker.C3367a f17783h = new ListenableWorker.C3367a.C3368a();

    /* renamed from: i */
    public C3373b f17784i;

    /* renamed from: j */
    public C3473a f17785j;

    /* renamed from: k */
    public WorkDatabase f17786k;

    /* renamed from: l */
    public C4393p f17787l;

    /* renamed from: m */
    public C4371b f17788m;

    /* renamed from: n */
    public C4404s f17789n;

    /* renamed from: o */
    public ArrayList f17790o;

    /* renamed from: p */
    public String f17791p;

    /* renamed from: q */
    public C3419a<Boolean> f17792q = new C3419a<>();

    /* renamed from: r */
    public C16388l<ListenableWorker.C3367a> f17793r = null;

    /* renamed from: s */
    public volatile boolean f17794s;

    /* renamed from: u2.m$a */
    public static class C8133a {

        /* renamed from: a */
        public Context f17795a;

        /* renamed from: b */
        public C3473a f17796b;

        /* renamed from: c */
        public C6712a f17797c;

        /* renamed from: d */
        public C3373b f17798d;

        /* renamed from: e */
        public WorkDatabase f17799e;

        /* renamed from: f */
        public String f17800f;

        /* renamed from: g */
        public List<C8123d> f17801g;

        /* renamed from: h */
        public WorkerParameters.C3371a f17802h = new WorkerParameters.C3371a();

        public C8133a(Context context, C3373b bVar, C6712a aVar, C3473a aVar2, WorkDatabase workDatabase, String str) {
            this.f17795a = context.getApplicationContext();
            this.f17797c = aVar;
            this.f17796b = aVar2;
            this.f17798d = bVar;
            this.f17799e = workDatabase;
            this.f17800f = str;
        }
    }

    public C8132m(C8133a aVar) {
        this.f17777b = aVar.f17795a;
        this.f17782g = aVar.f17797c;
        this.f17785j = aVar.f17796b;
        this.f17778c = aVar.f17800f;
        this.f17779d = aVar.f17801g;
        WorkerParameters.C3371a aVar2 = aVar.f17802h;
        this.f17781f = null;
        this.f17784i = aVar.f17798d;
        WorkDatabase workDatabase = aVar.f17799e;
        this.f17786k = workDatabase;
        this.f17787l = workDatabase.mo12857t();
        this.f17788m = this.f17786k.mo12852o();
        this.f17789n = this.f17786k.mo12858u();
    }

    /* renamed from: a */
    public final void mo20732a(ListenableWorker.C3367a aVar) {
        if (aVar instanceof ListenableWorker.C3367a.C3370c) {
            C3422l.m8213c().mo12928d(f17776t, String.format("Worker result SUCCESS for %s", new Object[]{this.f17791p}), new Throwable[0]);
            if (this.f17780e.mo14319c()) {
                mo20736e();
                return;
            }
            this.f17786k.mo11974c();
            try {
                C4393p pVar = this.f17787l;
                ((C4394q) pVar).mo14340p(WorkInfo$State.SUCCEEDED, this.f17778c);
                C3380e eVar = ((ListenableWorker.C3367a.C3370c) this.f17783h).f7859a;
                ((C4394q) this.f17787l).mo14338n(this.f17778c, eVar);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((C4372c) this.f17788m).mo14304a(this.f17778c).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((C4394q) this.f17787l).mo14330f(str) == WorkInfo$State.BLOCKED && ((C4372c) this.f17788m).mo14305b(str)) {
                        C3422l.m8213c().mo12928d(f17776t, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                        C4393p pVar2 = this.f17787l;
                        ((C4394q) pVar2).mo14340p(WorkInfo$State.ENQUEUED, str);
                        ((C4394q) this.f17787l).mo14339o(currentTimeMillis, str);
                    }
                }
                this.f17786k.mo11984m();
            } finally {
                this.f17786k.mo11980i();
                mo20737f(false);
            }
        } else if (aVar instanceof ListenableWorker.C3367a.C3369b) {
            C3422l.m8213c().mo12928d(f17776t, String.format("Worker result RETRY for %s", new Object[]{this.f17791p}), new Throwable[0]);
            mo20735d();
        } else {
            C3422l.m8213c().mo12928d(f17776t, String.format("Worker result FAILURE for %s", new Object[]{this.f17791p}), new Throwable[0]);
            if (this.f17780e.mo14319c()) {
                mo20736e();
            } else {
                mo20739h();
            }
        }
    }

    /* renamed from: b */
    public final void mo20733b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((C4394q) this.f17787l).mo14330f(str2) != WorkInfo$State.CANCELLED) {
                C4393p pVar = this.f17787l;
                ((C4394q) pVar).mo14340p(WorkInfo$State.FAILED, str2);
            }
            linkedList.addAll(((C4372c) this.f17788m).mo14304a(str2));
        }
    }

    /* renamed from: c */
    public final void mo20734c() {
        if (!mo20740i()) {
            this.f17786k.mo11974c();
            try {
                WorkInfo$State f = ((C4394q) this.f17787l).mo14330f(this.f17778c);
                ((C4388n) this.f17786k.mo12856s()).mo14315a(this.f17778c);
                if (f == null) {
                    mo20737f(false);
                } else if (f == WorkInfo$State.RUNNING) {
                    mo20732a(this.f17783h);
                } else if (!f.isFinished()) {
                    mo20735d();
                }
                this.f17786k.mo11984m();
            } finally {
                this.f17786k.mo11980i();
            }
        }
        List<C8123d> list = this.f17779d;
        if (list != null) {
            for (C8123d a : list) {
                a.mo20722a(this.f17778c);
            }
            C8124e.m16338a(this.f17784i, this.f17786k, this.f17779d);
        }
    }

    /* renamed from: d */
    public final void mo20735d() {
        this.f17786k.mo11974c();
        try {
            C4393p pVar = this.f17787l;
            ((C4394q) pVar).mo14340p(WorkInfo$State.ENQUEUED, this.f17778c);
            C4393p pVar2 = this.f17787l;
            C4394q qVar = (C4394q) pVar2;
            qVar.mo14339o(System.currentTimeMillis(), this.f17778c);
            ((C4394q) this.f17787l).mo14336l(-1, this.f17778c);
            this.f17786k.mo11984m();
        } finally {
            this.f17786k.mo11980i();
            mo20737f(true);
        }
    }

    /* renamed from: e */
    public final void mo20736e() {
        this.f17786k.mo11974c();
        try {
            C4393p pVar = this.f17787l;
            C4394q qVar = (C4394q) pVar;
            qVar.mo14339o(System.currentTimeMillis(), this.f17778c);
            C4393p pVar2 = this.f17787l;
            ((C4394q) pVar2).mo14340p(WorkInfo$State.ENQUEUED, this.f17778c);
            ((C4394q) this.f17787l).mo14337m(this.f17778c);
            ((C4394q) this.f17787l).mo14336l(-1, this.f17778c);
            this.f17786k.mo11984m();
        } finally {
            this.f17786k.mo11980i();
            mo20737f(false);
        }
    }

    /* renamed from: f */
    public final void mo20737f(boolean z) {
        C3226d0 d;
        Cursor l;
        ListenableWorker listenableWorker;
        this.f17786k.mo11974c();
        try {
            C4394q qVar = (C4394q) this.f17786k.mo12857t();
            qVar.getClass();
            d = C3226d0.m7877d(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            qVar.f9664a.mo11973b();
            l = qVar.f9664a.mo11983l(d);
            boolean z2 = l.moveToFirst() && l.getInt(0) != 0;
            l.close();
            d.release();
            if (!z2) {
                C6634g.m13017a(this.f17777b, RescheduleReceiver.class, false);
            }
            if (z) {
                ((C4394q) this.f17787l).mo14340p(WorkInfo$State.ENQUEUED, this.f17778c);
                ((C4394q) this.f17787l).mo14336l(-1, this.f17778c);
            }
            if (!(this.f17780e == null || (listenableWorker = this.f17781f) == null || !listenableWorker.mo12822c())) {
                C3473a aVar = this.f17785j;
                String str = this.f17778c;
                C8121c cVar = (C8121c) aVar;
                synchronized (cVar.f17740l) {
                    cVar.f17735g.remove(str);
                    cVar.mo20718f();
                }
            }
            this.f17786k.mo11984m();
            this.f17786k.mo11980i();
            this.f17792q.mo12917i(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f17786k.mo11980i();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo20738g() {
        WorkInfo$State f = ((C4394q) this.f17787l).mo14330f(this.f17778c);
        if (f == WorkInfo$State.RUNNING) {
            C3422l.m8213c().mo12926a(f17776t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f17778c}), new Throwable[0]);
            mo20737f(true);
            return;
        }
        C3422l.m8213c().mo12926a(f17776t, String.format("Status for %s is %s; not doing any work", new Object[]{this.f17778c, f}), new Throwable[0]);
        mo20737f(false);
    }

    /* renamed from: h */
    public final void mo20739h() {
        this.f17786k.mo11974c();
        try {
            mo20733b(this.f17778c);
            C3380e eVar = ((ListenableWorker.C3367a.C3368a) this.f17783h).f7858a;
            ((C4394q) this.f17787l).mo14338n(this.f17778c, eVar);
            this.f17786k.mo11984m();
        } finally {
            this.f17786k.mo11980i();
            mo20737f(false);
        }
    }

    /* renamed from: i */
    public final boolean mo20740i() {
        if (!this.f17794s) {
            return false;
        }
        C3422l.m8213c().mo12926a(f17776t, String.format("Work interrupted for %s", new Object[]{this.f17791p}), new Throwable[0]);
        WorkInfo$State f = ((C4394q) this.f17787l).mo14330f(this.f17778c);
        if (f == null) {
            mo20737f(false);
        } else {
            mo20737f(!f.isFinished());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bf, code lost:
        if ((r0.f9645b == r3 && r0.f9654k > 0) != false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            c3.s r0 = r15.f17789n
            java.lang.String r1 = r15.f17778c
            c3.t r0 = (p034c3.C4405t) r0
            java.util.ArrayList r0 = r0.mo14341a(r1)
            r15.f17790o = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Work [ id="
            r1.<init>(r2)
            java.lang.String r2 = r15.f17778c
            r1.append(r2)
            java.lang.String r2 = ", tags={ "
            r1.append(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
            r3 = r2
        L_0x0023:
            boolean r4 = r0.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L_0x0034
            r3 = r5
            goto L_0x0039
        L_0x0034:
            java.lang.String r5 = ", "
            r1.append(r5)
        L_0x0039:
            r1.append(r4)
            goto L_0x0023
        L_0x003d:
            java.lang.String r0 = " } ]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.f17791p = r0
            boolean r0 = r15.mo20740i()
            if (r0 == 0) goto L_0x0050
            goto L_0x02c7
        L_0x0050:
            androidx.work.impl.WorkDatabase r0 = r15.f17786k
            r0.mo11974c()
            c3.p r0 = r15.f17787l     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = r15.f17778c     // Catch:{ all -> 0x02d7 }
            c3.q r0 = (p034c3.C4394q) r0     // Catch:{ all -> 0x02d7 }
            c3.o r0 = r0.mo14333i(r1)     // Catch:{ all -> 0x02d7 }
            r15.f17780e = r0     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0084
            androidx.work.l r0 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = f17776t     // Catch:{ all -> 0x02d7 }
            java.lang.String r3 = "Didn't find WorkSpec for id %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02d7 }
            java.lang.String r4 = r15.f17778c     // Catch:{ all -> 0x02d7 }
            r2[r5] = r4     // Catch:{ all -> 0x02d7 }
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x02d7 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02d7 }
            r0.mo12927b(r1, r2, r3)     // Catch:{ all -> 0x02d7 }
            r15.mo20737f(r5)     // Catch:{ all -> 0x02d7 }
            androidx.work.impl.WorkDatabase r0 = r15.f17786k     // Catch:{ all -> 0x02d7 }
            r0.mo11984m()     // Catch:{ all -> 0x02d7 }
            goto L_0x00fd
        L_0x0084:
            androidx.work.WorkInfo$State r1 = r0.f9645b     // Catch:{ all -> 0x02d7 }
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ all -> 0x02d7 }
            if (r1 == r3) goto L_0x00ac
            r15.mo20738g()     // Catch:{ all -> 0x02d7 }
            androidx.work.impl.WorkDatabase r0 = r15.f17786k     // Catch:{ all -> 0x02d7 }
            r0.mo11984m()     // Catch:{ all -> 0x02d7 }
            androidx.work.l r0 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = f17776t     // Catch:{ all -> 0x02d7 }
            java.lang.String r3 = "%s is not in ENQUEUED state. Nothing more to do."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02d7 }
            c3.o r4 = r15.f17780e     // Catch:{ all -> 0x02d7 }
            java.lang.String r4 = r4.f9646c     // Catch:{ all -> 0x02d7 }
            r2[r5] = r4     // Catch:{ all -> 0x02d7 }
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x02d7 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02d7 }
            r0.mo12926a(r1, r2, r3)     // Catch:{ all -> 0x02d7 }
            goto L_0x00fd
        L_0x00ac:
            boolean r0 = r0.mo14319c()     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x00c1
            c3.o r0 = r15.f17780e     // Catch:{ all -> 0x02d7 }
            androidx.work.WorkInfo$State r1 = r0.f9645b     // Catch:{ all -> 0x02d7 }
            if (r1 != r3) goto L_0x00be
            int r0 = r0.f9654k     // Catch:{ all -> 0x02d7 }
            if (r0 <= 0) goto L_0x00be
            r0 = r2
            goto L_0x00bf
        L_0x00be:
            r0 = r5
        L_0x00bf:
            if (r0 == 0) goto L_0x0104
        L_0x00c1:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02d7 }
            c3.o r3 = r15.f17780e     // Catch:{ all -> 0x02d7 }
            long r6 = r3.f9657n     // Catch:{ all -> 0x02d7 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00d1
            r4 = r2
            goto L_0x00d2
        L_0x00d1:
            r4 = r5
        L_0x00d2:
            if (r4 != 0) goto L_0x0104
            long r3 = r3.mo14317a()     // Catch:{ all -> 0x02d7 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            androidx.work.l r0 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = f17776t     // Catch:{ all -> 0x02d7 }
            java.lang.String r3 = "Delaying execution for %s because it is being executed before schedule."
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x02d7 }
            c3.o r6 = r15.f17780e     // Catch:{ all -> 0x02d7 }
            java.lang.String r6 = r6.f9646c     // Catch:{ all -> 0x02d7 }
            r4[r5] = r6     // Catch:{ all -> 0x02d7 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x02d7 }
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02d7 }
            r0.mo12926a(r1, r3, r4)     // Catch:{ all -> 0x02d7 }
            r15.mo20737f(r2)     // Catch:{ all -> 0x02d7 }
            androidx.work.impl.WorkDatabase r0 = r15.f17786k     // Catch:{ all -> 0x02d7 }
            r0.mo11984m()     // Catch:{ all -> 0x02d7 }
        L_0x00fd:
            androidx.work.impl.WorkDatabase r0 = r15.f17786k
            r0.mo11980i()
            goto L_0x02c7
        L_0x0104:
            androidx.work.impl.WorkDatabase r0 = r15.f17786k     // Catch:{ all -> 0x02d7 }
            r0.mo11984m()     // Catch:{ all -> 0x02d7 }
            androidx.work.impl.WorkDatabase r0 = r15.f17786k
            r0.mo11980i()
            c3.o r0 = r15.f17780e
            boolean r0 = r0.mo14319c()
            if (r0 == 0) goto L_0x011d
            c3.o r0 = r15.f17780e
            androidx.work.e r0 = r0.f9648e
        L_0x011a:
            r8 = r0
            goto L_0x01c4
        L_0x011d:
            androidx.work.b r0 = r15.f17784i
            androidx.work.i r0 = r0.f7876d
            c3.o r1 = r15.f17780e
            java.lang.String r1 = r1.f9647d
            r0.getClass()
            java.lang.String r0 = androidx.work.C3384h.f7904a
            r0 = 0
            java.lang.Class r3 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0137 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x0137 }
            androidx.work.h r3 = (androidx.work.C3384h) r3     // Catch:{ Exception -> 0x0137 }
            r0 = r3
            goto L_0x014b
        L_0x0137:
            r3 = move-exception
            androidx.work.l r4 = androidx.work.C3422l.m8213c()
            java.lang.String r6 = androidx.work.C3384h.f7904a
            java.lang.String r7 = "Trouble instantiating + "
            java.lang.String r1 = androidx.appcompat.widget.C0326j.m864i(r7, r1)
            java.lang.Throwable[] r7 = new java.lang.Throwable[r2]
            r7[r5] = r3
            r4.mo12927b(r6, r1, r7)
        L_0x014b:
            if (r0 != 0) goto L_0x016b
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f17776t
            java.lang.Object[] r2 = new java.lang.Object[r2]
            c3.o r3 = r15.f17780e
            java.lang.String r3 = r3.f9647d
            r2[r5] = r3
            java.lang.String r3 = "Could not create Input Merger %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.mo12927b(r1, r2, r3)
            r15.mo20739h()
            goto L_0x02c7
        L_0x016b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            c3.o r3 = r15.f17780e
            androidx.work.e r3 = r3.f9648e
            r1.add(r3)
            c3.p r3 = r15.f17787l
            java.lang.String r4 = r15.f17778c
            c3.q r3 = (p034c3.C4394q) r3
            r3.getClass()
            java.lang.String r6 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            androidx.room.d0 r6 = androidx.room.C3226d0.m7877d(r2, r6)
            if (r4 != 0) goto L_0x018c
            r6.mo12015p0(r2)
            goto L_0x018f
        L_0x018c:
            r6.mo12011Y(r2, r4)
        L_0x018f:
            androidx.room.RoomDatabase r4 = r3.f9664a
            r4.mo11973b()
            androidx.room.RoomDatabase r3 = r3.f9664a
            android.database.Cursor r3 = r3.mo11983l(r6)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02cf }
            int r7 = r3.getCount()     // Catch:{ all -> 0x02cf }
            r4.<init>(r7)     // Catch:{ all -> 0x02cf }
        L_0x01a3:
            boolean r7 = r3.moveToNext()     // Catch:{ all -> 0x02cf }
            if (r7 == 0) goto L_0x01b5
            byte[] r7 = r3.getBlob(r5)     // Catch:{ all -> 0x02cf }
            androidx.work.e r7 = androidx.work.C3380e.m8118a(r7)     // Catch:{ all -> 0x02cf }
            r4.add(r7)     // Catch:{ all -> 0x02cf }
            goto L_0x01a3
        L_0x01b5:
            r3.close()
            r6.release()
            r1.addAll(r4)
            androidx.work.e r0 = r0.mo12810a(r1)
            goto L_0x011a
        L_0x01c4:
            androidx.work.WorkerParameters r0 = new androidx.work.WorkerParameters
            java.lang.String r1 = r15.f17778c
            java.util.UUID r7 = java.util.UUID.fromString(r1)
            java.util.ArrayList r9 = r15.f17790o
            c3.o r1 = r15.f17780e
            int r10 = r1.f9654k
            androidx.work.b r1 = r15.f17784i
            java.util.concurrent.ExecutorService r11 = r1.f7873a
            e3.a r12 = r15.f17782g
            androidx.work.t r13 = r1.f7875c
            d3.q r1 = new d3.q
            d3.p r14 = new d3.p
            androidx.work.impl.WorkDatabase r1 = r15.f17786k
            b3.a r3 = r15.f17785j
            e3.a r4 = r15.f17782g
            r14.<init>(r1, r3, r4)
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            androidx.work.ListenableWorker r1 = r15.f17781f
            if (r1 != 0) goto L_0x01ff
            androidx.work.b r1 = r15.f17784i
            androidx.work.t r1 = r1.f7875c
            android.content.Context r3 = r15.f17777b
            c3.o r4 = r15.f17780e
            java.lang.String r4 = r4.f9646c
            androidx.work.ListenableWorker r1 = r1.mo12968a(r3, r4, r0)
            r15.f17781f = r1
        L_0x01ff:
            androidx.work.ListenableWorker r1 = r15.f17781f
            if (r1 != 0) goto L_0x0221
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f17776t
            java.lang.Object[] r2 = new java.lang.Object[r2]
            c3.o r3 = r15.f17780e
            java.lang.String r3 = r3.f9646c
            r2[r5] = r3
            java.lang.String r3 = "Could not create Worker %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.mo12927b(r1, r2, r3)
            r15.mo20739h()
            goto L_0x02c7
        L_0x0221:
            boolean r3 = r1.f7856e
            if (r3 == 0) goto L_0x0243
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f17776t
            java.lang.Object[] r2 = new java.lang.Object[r2]
            c3.o r3 = r15.f17780e
            java.lang.String r3 = r3.f9646c
            r2[r5] = r3
            java.lang.String r3 = "Received an already-used Worker %s; WorkerFactory should return new instances"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.mo12927b(r1, r2, r3)
            r15.mo20739h()
            goto L_0x02c7
        L_0x0243:
            r1.f7856e = r2
            androidx.work.impl.WorkDatabase r1 = r15.f17786k
            r1.mo11974c()
            c3.p r1 = r15.f17787l     // Catch:{ all -> 0x02c8 }
            java.lang.String r3 = r15.f17778c     // Catch:{ all -> 0x02c8 }
            c3.q r1 = (p034c3.C4394q) r1     // Catch:{ all -> 0x02c8 }
            androidx.work.WorkInfo$State r1 = r1.mo14330f(r3)     // Catch:{ all -> 0x02c8 }
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ all -> 0x02c8 }
            if (r1 != r3) goto L_0x0271
            c3.p r1 = r15.f17787l     // Catch:{ all -> 0x02c8 }
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.RUNNING     // Catch:{ all -> 0x02c8 }
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x02c8 }
            java.lang.String r6 = r15.f17778c     // Catch:{ all -> 0x02c8 }
            r4[r5] = r6     // Catch:{ all -> 0x02c8 }
            c3.q r1 = (p034c3.C4394q) r1     // Catch:{ all -> 0x02c8 }
            r1.mo14340p(r3, r4)     // Catch:{ all -> 0x02c8 }
            c3.p r1 = r15.f17787l     // Catch:{ all -> 0x02c8 }
            java.lang.String r3 = r15.f17778c     // Catch:{ all -> 0x02c8 }
            c3.q r1 = (p034c3.C4394q) r1     // Catch:{ all -> 0x02c8 }
            r1.mo14335k(r3)     // Catch:{ all -> 0x02c8 }
            goto L_0x0272
        L_0x0271:
            r2 = r5
        L_0x0272:
            androidx.work.impl.WorkDatabase r1 = r15.f17786k     // Catch:{ all -> 0x02c8 }
            r1.mo11984m()     // Catch:{ all -> 0x02c8 }
            androidx.work.impl.WorkDatabase r1 = r15.f17786k
            r1.mo11980i()
            if (r2 == 0) goto L_0x02c4
            boolean r1 = r15.mo20740i()
            if (r1 == 0) goto L_0x0285
            goto L_0x02c7
        L_0x0285:
            androidx.work.impl.utils.futures.a r1 = new androidx.work.impl.utils.futures.a
            r1.<init>()
            d3.n r8 = new d3.n
            android.content.Context r3 = r15.f17777b
            c3.o r4 = r15.f17780e
            androidx.work.ListenableWorker r5 = r15.f17781f
            androidx.work.g r6 = r0.f7868g
            e3.a r7 = r15.f17782g
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            e3.a r0 = r15.f17782g
            e3.b r0 = (p090e3.C6713b) r0
            e3.b$a r0 = r0.f14805c
            r0.execute(r8)
            androidx.work.impl.utils.futures.a<java.lang.Void> r0 = r8.f14657b
            u2.k r2 = new u2.k
            r2.<init>(r15, r0, r1)
            e3.a r3 = r15.f17782g
            e3.b r3 = (p090e3.C6713b) r3
            e3.b$a r3 = r3.f14805c
            r0.mo7981e(r2, r3)
            java.lang.String r0 = r15.f17791p
            u2.l r2 = new u2.l
            r2.<init>(r15, r1, r0)
            e3.a r0 = r15.f17782g
            e3.b r0 = (p090e3.C6713b) r0
            d3.j r0 = r0.f14803a
            r1.mo7981e(r2, r0)
            goto L_0x02c7
        L_0x02c4:
            r15.mo20738g()
        L_0x02c7:
            return
        L_0x02c8:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r15.f17786k
            r1.mo11980i()
            throw r0
        L_0x02cf:
            r0 = move-exception
            r3.close()
            r6.release()
            throw r0
        L_0x02d7:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r15.f17786k
            r1.mo11980i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p252u2.C8132m.run():void");
    }
}
