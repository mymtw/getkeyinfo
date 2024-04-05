package p004a3;

import android.content.Context;
import androidx.work.C3422l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p090e3.C6712a;
import p290y2.C8366a;

/* renamed from: a3.d */
public abstract class C0028d<T> {

    /* renamed from: f */
    public static final String f59f = C3422l.m8214e("ConstraintTracker");

    /* renamed from: a */
    public final C6712a f60a;

    /* renamed from: b */
    public final Context f61b;

    /* renamed from: c */
    public final Object f62c = new Object();

    /* renamed from: d */
    public final LinkedHashSet f63d = new LinkedHashSet();

    /* renamed from: e */
    public T f64e;

    /* renamed from: a3.d$a */
    public class C0029a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ List f65b;

        public C0029a(ArrayList arrayList) {
            this.f65b = arrayList;
        }

        public final void run() {
            for (C8366a a : this.f65b) {
                a.mo20955a(C0028d.this.f64e);
            }
        }
    }

    public C0028d(Context context, C6712a aVar) {
        this.f61b = context.getApplicationContext();
        this.f60a = aVar;
    }

    /* renamed from: a */
    public abstract T mo57a();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63b(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f62c
            monitor-enter(r0)
            T r1 = r3.f64e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f64e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.LinkedHashSet r1 = r3.f63d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            e3.a r1 = r3.f60a     // Catch:{ all -> 0x002b }
            e3.b r1 = (p090e3.C6713b) r1     // Catch:{ all -> 0x002b }
            e3.b$a r1 = r1.f14805c     // Catch:{ all -> 0x002b }
            a3.d$a r2 = new a3.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p004a3.C0028d.mo63b(java.lang.Object):void");
    }

    /* renamed from: c */
    public abstract void mo60c();

    /* renamed from: d */
    public abstract void mo61d();
}
