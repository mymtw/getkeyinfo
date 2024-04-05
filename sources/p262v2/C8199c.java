package p262v2;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.C3373b;
import androidx.work.C3376c;
import androidx.work.C3422l;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p034c3.C4391o;
import p079d3.C6636i;
import p090e3.C6713b;
import p252u2.C8119a;
import p252u2.C8123d;
import p252u2.C8129j;
import p290y2.C8368c;
import p290y2.C8369d;

/* renamed from: v2.c */
public final class C8199c implements C8123d, C8368c, C8119a {

    /* renamed from: j */
    public static final String f17979j = C3422l.m8214e("GreedyScheduler");

    /* renamed from: b */
    public final Context f17980b;

    /* renamed from: c */
    public final C8129j f17981c;

    /* renamed from: d */
    public final C8369d f17982d;

    /* renamed from: e */
    public final HashSet f17983e = new HashSet();

    /* renamed from: f */
    public C8198b f17984f;

    /* renamed from: g */
    public boolean f17985g;

    /* renamed from: h */
    public final Object f17986h;

    /* renamed from: i */
    public Boolean f17987i;

    public C8199c(Context context, C3373b bVar, C6713b bVar2, C8129j jVar) {
        this.f17980b = context;
        this.f17981c = jVar;
        this.f17982d = new C8369d(context, bVar2, this);
        this.f17984f = new C8198b(this, bVar.f7877e);
        this.f17986h = new Object();
    }

    /* renamed from: a */
    public final void mo20722a(String str) {
        Runnable runnable;
        if (this.f17987i == null) {
            this.f17987i = Boolean.valueOf(C6636i.m13018a(this.f17980b, this.f17981c.f17762b));
        }
        if (!this.f17987i.booleanValue()) {
            C3422l.m8213c().mo12928d(f17979j, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f17985g) {
            this.f17981c.f17766f.mo20714a(this);
            this.f17985g = true;
        }
        C3422l.m8213c().mo12926a(f17979j, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        C8198b bVar = this.f17984f;
        if (!(bVar == null || (runnable = (Runnable) bVar.f17978c.remove(str)) == null)) {
            ((Handler) bVar.f17977b.f4088a).removeCallbacks(runnable);
        }
        this.f17981c.mo20729j(str);
    }

    /* renamed from: b */
    public final void mo12868b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C3422l.m8213c().mo12926a(f17979j, String.format("Constraints not met: Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
            this.f17981c.mo20729j(str);
        }
    }

    /* renamed from: c */
    public final void mo20723c(C4391o... oVarArr) {
        if (this.f17987i == null) {
            this.f17987i = Boolean.valueOf(C6636i.m13018a(this.f17980b, this.f17981c.f17762b));
        }
        if (!this.f17987i.booleanValue()) {
            C3422l.m8213c().mo12928d(f17979j, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f17985g) {
            this.f17981c.f17766f.mo20714a(this);
            this.f17985g = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C4391o oVar : oVarArr) {
            long a = oVar.mo14317a();
            long currentTimeMillis = System.currentTimeMillis();
            if (oVar.f9645b == WorkInfo$State.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C8198b bVar = this.f17984f;
                    if (bVar != null) {
                        Runnable runnable = (Runnable) bVar.f17978c.remove(oVar.f9644a);
                        if (runnable != null) {
                            ((Handler) bVar.f17977b.f4088a).removeCallbacks(runnable);
                        }
                        C8197a aVar = new C8197a(bVar, oVar);
                        bVar.f17978c.put(oVar.f9644a, aVar);
                        ((Handler) bVar.f17977b.f4088a).postDelayed(aVar, oVar.mo14317a() - System.currentTimeMillis());
                    }
                } else if (oVar.mo14318b()) {
                    C3376c cVar = oVar.f9653j;
                    if (cVar.f7884c) {
                        C3422l.m8213c().mo12926a(f17979j, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{oVar}), new Throwable[0]);
                    } else {
                        if (cVar.f7889h.f7894a.size() > 0) {
                            C3422l.m8213c().mo12926a(f17979j, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{oVar}), new Throwable[0]);
                        } else {
                            hashSet.add(oVar);
                            hashSet2.add(oVar.f9644a);
                        }
                    }
                } else {
                    C3422l.m8213c().mo12926a(f17979j, String.format("Starting work for %s", new Object[]{oVar.f9644a}), new Throwable[0]);
                    this.f17981c.mo20728i(oVar.f9644a, (WorkerParameters.C3371a) null);
                }
            }
        }
        synchronized (this.f17986h) {
            if (!hashSet.isEmpty()) {
                C3422l.m8213c().mo12926a(f17979j, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f17983e.addAll(hashSet);
                this.f17982d.mo20960b(this.f17983e);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo20724d() {
        return false;
    }

    /* renamed from: e */
    public final void mo12871e(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C3422l.m8213c().mo12926a(f17979j, String.format("Constraints met: Scheduling work ID %s", new Object[]{str}), new Throwable[0]);
            this.f17981c.mo20728i(str, (WorkerParameters.C3371a) null);
        }
    }

    public final void onExecuted(String str, boolean z) {
        synchronized (this.f17986h) {
            Iterator it = this.f17983e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4391o oVar = (C4391o) it.next();
                if (oVar.f9644a.equals(str)) {
                    C3422l.m8213c().mo12926a(f17979j, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f17983e.remove(oVar);
                    this.f17982d.mo20960b(this.f17983e);
                    break;
                }
            }
        }
    }
}
