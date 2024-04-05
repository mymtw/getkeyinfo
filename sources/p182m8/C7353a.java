package p182m8;

import android.annotation.SuppressLint;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.google.android.play.core.assetpacks.C15588c1;
import p163k8.C7208a;
import p192n8.C7492a;
import p201o8.C7636a;
import p201o8.C7637b;

/* renamed from: m8.a */
public final class C7353a implements C7208a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public static C7353a f16370a;

    /* renamed from: b */
    public static C7492a f16371b;

    /* renamed from: b */
    public static synchronized C7353a m14124b() {
        C7353a aVar;
        synchronized (C7353a.class) {
            C7492a g = C7492a.m14431g();
            f16371b = g;
            g.mo19848h("getInstance called");
            if (f16370a == null) {
                f16370a = new C7353a();
                f16371b.mo19848h("Instance created");
            }
            aVar = f16370a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo17848a(C6272b bVar) {
        f16371b.mo19848h("onCReqSuccess called");
        if (bVar.mo17792w().equalsIgnoreCase("Y") || bVar.mo17792w().equalsIgnoreCase("N") || !bVar.mo17776g().equalsIgnoreCase("N")) {
            f16371b.mo19848h("Transaction Timer ended");
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo17849a(String str, C15588c1 c1Var) {
        f16371b.mo19848h("onCReqError called");
        f16371b.mo19848h("Transaction Timer ended");
        if (str.equals("ProtocolError")) {
            C7636a aVar = (C7636a) c1Var;
            throw null;
        } else if (str.equals("RunTimeError")) {
            C7637b bVar = (C7637b) c1Var;
            throw null;
        } else if (!str.equals("TimeOutError")) {
            str.equals("CancelTimeout");
            throw null;
        } else {
            throw null;
        }
    }
}
