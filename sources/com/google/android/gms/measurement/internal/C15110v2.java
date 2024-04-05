package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.v2 */
public final class C15110v2 extends BroadcastReceiver {

    /* renamed from: a */
    public final C14973f7 f33906a;

    /* renamed from: b */
    public boolean f33907b;

    /* renamed from: c */
    public boolean f33908c;

    static {
        Class<C15110v2> cls = C15110v2.class;
    }

    public C15110v2(C14973f7 f7Var) {
        Preconditions.checkNotNull(f7Var);
        this.f33906a = f7Var;
    }

    /* renamed from: a */
    public final void mo52341a() {
        this.f33906a.mo52021g();
        this.f33906a.mo52015a().mo51995g();
        this.f33906a.mo52015a().mo51995g();
        if (this.f33907b) {
            this.f33906a.mo52016b().f33732o.mo52237a("Unregistering connectivity change receiver");
            this.f33907b = false;
            this.f33908c = false;
            try {
                this.f33906a.f33497m.f33872b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f33906a.mo52016b().f33724g.mo52238b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f33906a.mo52021g();
        String action = intent.getAction();
        this.f33906a.mo52016b().f33732o.mo52238b(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C15094t2 t2Var = this.f33906a.f33487c;
            C14973f7.m24287I(t2Var);
            boolean k = t2Var.mo52315k();
            if (this.f33908c != k) {
                this.f33908c = k;
                this.f33906a.mo52015a().mo52308o(new C15102u2(this, k));
                return;
            }
            return;
        }
        this.f33906a.mo52016b().f33727j.mo52238b(action, "NetworkBroadcastReceiver received unknown action");
    }
}
