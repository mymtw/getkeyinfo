package com.etsy.android.lib.user;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import okhttp3.C19928a0;
import p753kq.C19857l;
import retrofit2.C20145v;

public final class TimeZoneRepository$update$2 extends Lambda implements C19857l<C20145v<Void>, C19394m> {
    public final /* synthetic */ TimeZoneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneRepository$update$2(TimeZoneRepository timeZoneRepository) {
        super(1);
        this.this$0 = timeZoneRepository;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C20145v<Void>) (C20145v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C20145v<Void> vVar) {
        if (!vVar.mo74384a()) {
            C8694h hVar = this.this$0.f19574c;
            StringBuilder h = C0072d.m201h("Error sending timezone to server: ");
            C19928a0 a0Var = vVar.f44616c;
            h.append(a0Var != null ? a0Var.mo72844g() : null);
            hVar.mo21306a(h.toString());
        }
    }
}
