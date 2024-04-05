package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import org.apache.commons.lang3.time.DateUtils;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
public final class C15096t4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33851b;

    /* renamed from: c */
    public final /* synthetic */ Object f33852c;

    public /* synthetic */ C15096t4(Object obj, int i) {
        this.f33851b = i;
        this.f33852c = obj;
    }

    public final void run() {
        switch (this.f33851b) {
            case 0:
                C15036m7 m7Var = ((C15007j5) this.f33852c).f33609o;
                m7Var.f33685a.mo52015a().mo51995g();
                if (m7Var.mo52250b()) {
                    if (m7Var.mo52251c()) {
                        m7Var.f33685a.mo52330q().f33316u.mo51938b((String) null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1);
                        m7Var.f33685a.mo52331s().mo52151m("auto", bundle, "_cmpx");
                    } else {
                        String a = m7Var.f33685a.mo52330q().f33316u.mo51937a();
                        if (TextUtils.isEmpty(a)) {
                            m7Var.f33685a.mo52016b().f33725h.mo52237a("Cache still valid but referrer not found");
                        } else {
                            long a2 = ((m7Var.f33685a.mo52330q().f33317v.mo52363a() / DateUtils.MILLIS_PER_HOUR) - 1) * DateUtils.MILLIS_PER_HOUR;
                            Uri parse = Uri.parse(a);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String next : parse.getQueryParameterNames()) {
                                bundle2.putString(next, parse.getQueryParameter(next));
                            }
                            ((Bundle) pair.second).putLong("_cc", a2);
                            Object obj = pair.first;
                            m7Var.f33685a.mo52331s().mo52151m(obj == null ? "app" : (String) obj, (Bundle) pair.second, "_cmp");
                        }
                        m7Var.f33685a.mo52330q().f33316u.mo51938b((String) null);
                    }
                    m7Var.f33685a.mo52330q().f33317v.mo52364b(0);
                    return;
                }
                return;
            default:
                C14999i6 i6Var = ((zzjn) this.f33852c).zza;
                i6Var.f33574e = null;
                i6Var.mo52131q();
                return;
        }
    }
}
