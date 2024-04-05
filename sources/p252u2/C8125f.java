package p252u2;

import android.text.TextUtils;
import androidx.work.C3422l;
import androidx.work.C3429n;
import androidx.work.C3436p;
import androidx.work.C3438r;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p079d3.C6632e;
import p090e3.C6713b;

/* renamed from: u2.f */
public final class C8125f extends C3436p {

    /* renamed from: j */
    public static final String f17745j = C3422l.m8214e("WorkContinuationImpl");

    /* renamed from: a */
    public final C8129j f17746a;

    /* renamed from: b */
    public final String f17747b;

    /* renamed from: c */
    public final ExistingWorkPolicy f17748c;

    /* renamed from: d */
    public final List<? extends C3438r> f17749d;

    /* renamed from: e */
    public final ArrayList f17750e;

    /* renamed from: f */
    public final ArrayList f17751f;

    /* renamed from: g */
    public final List<C8125f> f17752g;

    /* renamed from: h */
    public boolean f17753h;

    /* renamed from: i */
    public C8120b f17754i;

    public C8125f() {
        throw null;
    }

    public C8125f(C8129j jVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends C3438r> list) {
        this(jVar, str, existingWorkPolicy, list, 0);
    }

    /* renamed from: N */
    public static boolean m16339N(C8125f fVar, HashSet hashSet) {
        hashSet.addAll(fVar.f17750e);
        HashSet O = m16340O(fVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (O.contains((String) it.next())) {
                return true;
            }
        }
        List<C8125f> list = fVar.f17752g;
        if (list != null && !list.isEmpty()) {
            for (C8125f N : list) {
                if (m16339N(N, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(fVar.f17750e);
        return false;
    }

    /* renamed from: O */
    public static HashSet m16340O(C8125f fVar) {
        HashSet hashSet = new HashSet();
        List<C8125f> list = fVar.f17752g;
        if (list != null && !list.isEmpty()) {
            for (C8125f fVar2 : list) {
                hashSet.addAll(fVar2.f17750e);
            }
        }
        return hashSet;
    }

    /* renamed from: M */
    public final C3429n mo20725M() {
        if (!this.f17753h) {
            C6632e eVar = new C6632e(this);
            ((C6713b) this.f17746a.f17764d).mo18901a(eVar);
            this.f17754i = eVar.f14637c;
        } else {
            C3422l.m8213c().mo12929f(f17745j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f17750e)}), new Throwable[0]);
        }
        return this.f17754i;
    }

    public C8125f(C8129j jVar, String str, ExistingWorkPolicy existingWorkPolicy, List list, int i) {
        this.f17746a = jVar;
        this.f17747b = str;
        this.f17748c = existingWorkPolicy;
        this.f17749d = list;
        this.f17752g = null;
        this.f17750e = new ArrayList(list.size());
        this.f17751f = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((C3438r) list.get(i2)).f8038a.toString();
            this.f17750e.add(uuid);
            this.f17751f.add(uuid);
        }
    }
}
