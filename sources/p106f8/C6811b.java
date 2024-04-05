package p106f8;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C14581b;
import com.google.android.gms.internal.measurement.C14594c;
import com.google.android.gms.internal.measurement.C14595c0;
import com.google.android.gms.internal.measurement.C14598c3;
import com.google.android.gms.internal.measurement.C14672i;
import com.google.android.gms.internal.measurement.C14750o;
import com.google.android.gms.internal.measurement.C14763p;
import com.google.android.gms.internal.measurement.C14770p6;
import com.google.android.gms.measurement.internal.C14973f7;
import com.google.android.gms.measurement.internal.C14983h;
import com.google.android.gms.measurement.internal.C15067q2;
import com.google.android.gms.measurement.internal.C15094t2;
import com.google.android.gms.measurement.internal.C15103u3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.C19388s;

/* renamed from: f8.b */
public final class C6811b implements C14595c0, C15067q2 {

    /* renamed from: b */
    public final Serializable f14991b;

    /* renamed from: c */
    public final Object f14992c;

    public /* synthetic */ C6811b(Object obj, String str) {
        this.f14992c = obj;
        this.f14991b = str;
    }

    /* renamed from: a */
    public final C14598c3 mo5884a(C14763p pVar) {
        C14598c3 b = ((C14598c3) this.f14992c).mo50399b();
        b.mo50403f((String) this.f14991b, pVar);
        return b;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo18935b(String str, int i, Throwable th, byte[] bArr, Map map) {
        C14983h hVar;
        C14973f7 f7Var = (C14973f7) this.f14992c;
        f7Var.mo52015a().mo51995g();
        f7Var.mo52021g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (SQLiteException e) {
                f7Var.mo52016b().f33724g.mo52238b(e, "Database error while trying to delete uploaded bundles");
                f7Var.f33500p = f7Var.mo52017c().elapsedRealtime();
                f7Var.mo52016b().f33732o.mo52238b(Long.valueOf(f7Var.f33500p), "Disable upload, time");
            } catch (Throwable th2) {
                f7Var.f33505u = false;
                f7Var.mo51999A();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(f7Var.f33509y);
        f7Var.f33509y = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            f7Var.mo52016b().f33732o.mo52239c(Integer.valueOf(i), "Network upload failed. Will retry later. code, error", th);
            f7Var.f33494j.f33618k.mo52364b(f7Var.mo52017c().currentTimeMillis());
            if (i == 503 || i == 429) {
                f7Var.f33494j.f33616i.mo52364b(f7Var.mo52017c().currentTimeMillis());
            }
            C14983h hVar2 = f7Var.f33488d;
            C14973f7.m24287I(hVar2);
            hVar2.mo52068R(list);
            f7Var.mo52002D();
            f7Var.f33505u = false;
            f7Var.mo51999A();
        }
        if (th == null) {
            f7Var.f33494j.f33617j.mo52364b(f7Var.mo52017c().currentTimeMillis());
            f7Var.f33494j.f33618k.mo52364b(0);
            f7Var.mo52002D();
            f7Var.mo52016b().f33732o.mo52239c(Integer.valueOf(i), "Successful upload. Got network response. code, size", Integer.valueOf(bArr.length));
            C14983h hVar3 = f7Var.f33488d;
            C14973f7.m24287I(hVar3);
            hVar3.mo52065O();
            try {
                for (Long l : list) {
                    try {
                        hVar = f7Var.f33488d;
                        C14973f7.m24287I(hVar);
                        long longValue = l.longValue();
                        hVar.mo51995g();
                        hVar.mo51942h();
                        if (hVar.mo52052B().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e2) {
                        ((C15103u3) hVar.f33681b).mo52016b().f33724g.mo52238b(e2, "Failed to delete a bundle in a queue table");
                        throw e2;
                    } catch (SQLiteException e3) {
                        ArrayList arrayList = f7Var.f33510z;
                        if (arrayList == null || !arrayList.contains(l)) {
                            throw e3;
                        }
                    }
                }
                C14983h hVar4 = f7Var.f33488d;
                C14973f7.m24287I(hVar4);
                hVar4.mo52071m();
                C14983h hVar5 = f7Var.f33488d;
                C14973f7.m24287I(hVar5);
                hVar5.mo52067Q();
                f7Var.f33510z = null;
                C15094t2 t2Var = f7Var.f33487c;
                C14973f7.m24287I(t2Var);
                if (!t2Var.mo52315k() || !f7Var.mo52005G()) {
                    f7Var.f33483A = -1;
                    f7Var.mo52002D();
                } else {
                    f7Var.mo52034t();
                }
                f7Var.f33500p = 0;
                f7Var.f33505u = false;
                f7Var.mo51999A();
            } catch (Throwable th3) {
                C14983h hVar6 = f7Var.f33488d;
                C14973f7.m24287I(hVar6);
                hVar6.mo52067Q();
                throw th3;
            }
        }
        f7Var.mo52016b().f33732o.mo52239c(Integer.valueOf(i), "Network upload failed. Will retry later. code, error", th);
        f7Var.f33494j.f33618k.mo52364b(f7Var.mo52017c().currentTimeMillis());
        f7Var.f33494j.f33616i.mo52364b(f7Var.mo52017c().currentTimeMillis());
        C14983h hVar22 = f7Var.f33488d;
        C14973f7.m24287I(hVar22);
        hVar22.mo52068R(list);
        f7Var.mo52002D();
        f7Var.f33505u = false;
        f7Var.mo51999A();
    }

    /* renamed from: c */
    public final void mo18936c(C14598c3 c3Var, C14594c cVar) {
        C14770p6 p6Var = new C14770p6(cVar);
        for (Integer num : ((TreeMap) this.f14991b).keySet()) {
            C14581b a = cVar.f32769b.clone();
            C14763p b = ((C14750o) ((TreeMap) this.f14991b).get(num)).mo50553b(c3Var, Collections.singletonList(p6Var));
            int J0 = b instanceof C14672i ? C19388s.m32828J0(b.zzh().doubleValue()) : -1;
            if (J0 == 2 || J0 == -1) {
                cVar.f32769b = a;
            }
        }
        for (Integer num2 : ((TreeMap) this.f14992c).keySet()) {
            C14763p b2 = ((C14750o) ((TreeMap) this.f14992c).get(num2)).mo50553b(c3Var, Collections.singletonList(p6Var));
            if (b2 instanceof C14672i) {
                C19388s.m32828J0(b2.zzh().doubleValue());
            }
        }
    }

    public /* synthetic */ C6811b() {
        this.f14991b = new TreeMap();
        this.f14992c = new TreeMap();
    }
}
