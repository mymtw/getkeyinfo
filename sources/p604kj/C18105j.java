package p604kj;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C14999i6;
import com.google.android.gms.measurement.internal.C15007j5;
import com.google.android.gms.measurement.internal.C15018k7;
import com.google.android.gms.measurement.internal.C15033m4;
import com.google.android.gms.measurement.internal.C15103u3;
import com.google.android.gms.measurement.internal.C15145z5;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzjn;
import com.google.android.gms.measurement.internal.zzp;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Iterator;
import java.util.TreeSet;
import p605kk.C18121e;
import p605kk.C18123g;
import p605kk.C18124h;
import p605kk.C18136t;

/* renamed from: kj.j */
public final /* synthetic */ class C18105j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39532b;

    /* renamed from: c */
    public /* synthetic */ Object f39533c;

    /* renamed from: d */
    public /* synthetic */ Object f39534d;

    public /* synthetic */ C18105j(int i, Object obj, Object obj2) {
        this.f39532b = i;
        this.f39533c = obj;
        this.f39534d = obj2;
    }

    public final void run() {
        switch (this.f39532b) {
            case 0:
                C18106k kVar = (C18106k) this.f39533c;
                int i = ((C18109n) this.f39534d).f39543a;
                synchronized (kVar) {
                    C18109n nVar = kVar.f39539f.get(i);
                    if (nVar != null) {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Timing out request: ");
                        sb.append(i);
                        Log.w("MessengerIpcClient", sb.toString());
                        kVar.f39539f.remove(i);
                        nVar.mo69647c(new zzq(3, "Timed out waiting for response", (Throwable) null));
                        kVar.mo69641c();
                    }
                }
                return;
            case 1:
                C15007j5 j5Var = (C15007j5) this.f39533c;
                Bundle bundle = (Bundle) this.f39534d;
                if (bundle == null) {
                    ((C15103u3) j5Var.f33681b).mo52330q().f33318w.mo52359b(new Bundle());
                    return;
                }
                Bundle a = ((C15103u3) j5Var.f33681b).mo52330q().f33318w.mo52358a();
                for (String next : bundle.keySet()) {
                    Object obj = bundle.get(next);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        ((C15103u3) j5Var.f33681b).mo52335w().getClass();
                        if (C15018k7.m24468P(obj)) {
                            C15018k7 w = ((C15103u3) j5Var.f33681b).mo52335w();
                            C15033m4 m4Var = j5Var.f33611q;
                            w.getClass();
                            C15018k7.m24482v(m4Var, (String) null, 27, (String) null, (String) null, 0);
                        }
                        ((C15103u3) j5Var.f33681b).mo52016b().f33729l.mo52239c(next, "Invalid default event parameter type. Name, value", obj);
                    } else if (C15018k7.m24469R(next)) {
                        ((C15103u3) j5Var.f33681b).mo52016b().f33729l.mo52238b(next, "Invalid default event parameter name. Name");
                    } else if (obj == null) {
                        a.remove(next);
                    } else {
                        C15018k7 w2 = ((C15103u3) j5Var.f33681b).mo52335w();
                        ((C15103u3) j5Var.f33681b).getClass();
                        if (w2.mo52195I("param", next, 100, obj)) {
                            ((C15103u3) j5Var.f33681b).mo52335w().mo52223w(a, obj, next);
                        }
                    }
                }
                ((C15103u3) j5Var.f33681b).mo52335w();
                int j = ((C15103u3) j5Var.f33681b).f33878h.mo51967j();
                if (a.size() > j) {
                    Iterator it = new TreeSet(a.keySet()).iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        i2++;
                        if (i2 > j) {
                            a.remove(str);
                        }
                    }
                    C15018k7 w3 = ((C15103u3) j5Var.f33681b).mo52335w();
                    C15033m4 m4Var2 = j5Var.f33611q;
                    w3.getClass();
                    C15018k7.m24482v(m4Var2, (String) null, 26, (String) null, (String) null, 0);
                    ((C15103u3) j5Var.f33681b).mo52016b().f33729l.mo52237a("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                ((C15103u3) j5Var.f33681b).mo52330q().f33318w.mo52359b(a);
                C14999i6 u = ((C15103u3) j5Var.f33681b).mo52333u();
                u.mo51995g();
                u.mo51946h();
                u.mo52133s(new C15145z5(u, u.mo52130p(false), a));
                return;
            case 2:
                ((C15007j5) this.f39534d).mo52162x((Boolean) this.f39533c, true);
                return;
            case 3:
                C14999i6 i6Var = (C14999i6) this.f39534d;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull((zzp) this.f39533c);
                    zzeb.zzm((zzp) this.f39533c);
                } catch (RemoteException e) {
                    ((C15103u3) ((C14999i6) this.f39534d).f33681b).mo52016b().f33724g.mo52238b(e, "Failed to reset data on the service: remote exception");
                }
                ((C14999i6) this.f39534d).mo52132r();
                return;
            case 4:
                C14999i6.m24411u(((zzjn) this.f39534d).zza, (ComponentName) this.f39533c);
                return;
            case 5:
                synchronized (((C18136t) this.f39534d).f39597c) {
                    C18121e<? super TResult> eVar = ((C18136t) this.f39534d).f39598d;
                    if (eVar != null) {
                        eVar.onSuccess(((C18123g) this.f39533c).mo69664k());
                    }
                }
                return;
            default:
                ((FirebaseMessaging) this.f39533c).mo59166x6c2cd681((C18124h) this.f39534d);
                return;
        }
    }

    public /* synthetic */ C18105j(Object obj, Object obj2, int i) {
        this.f39532b = i;
        this.f39534d = obj;
        this.f39533c = obj2;
    }
}
