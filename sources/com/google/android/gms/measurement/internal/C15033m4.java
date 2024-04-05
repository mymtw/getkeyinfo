package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.dataflow.qual.Pure;
import p772tq.C20203a;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
public class C15033m4 implements C15051o4, C15009j7 {

    /* renamed from: b */
    public final C15051o4 f33681b;

    public /* synthetic */ C15033m4(C15007j5 j5Var) {
        this.f33681b = j5Var;
    }

    public /* synthetic */ C15033m4(C15103u3 u3Var) {
        Preconditions.checkNotNull(u3Var);
        this.f33681b = u3Var;
    }

    @Pure
    /* renamed from: a */
    public final C15086s3 mo52015a() {
        throw null;
    }

    @Pure
    /* renamed from: b */
    public final C15049o2 mo52016b() {
        throw null;
    }

    @Pure
    /* renamed from: c */
    public final Clock mo52017c() {
        throw null;
    }

    @Pure
    /* renamed from: d */
    public final C20203a mo52018d() {
        throw null;
    }

    @Pure
    /* renamed from: f */
    public final Context mo52020f() {
        throw null;
    }

    /* renamed from: g */
    public void mo51995g() {
        ((C15103u3) this.f33681b).mo52015a().mo51995g();
    }

    public final void zza(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C15007j5 j5Var = (C15007j5) this.f33681b;
            j5Var.mo52150l("auto", "_err", bundle, true, true, ((C15103u3) j5Var.f33681b).f33885o.currentTimeMillis());
            return;
        }
        ((C15007j5) this.f33681b).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
