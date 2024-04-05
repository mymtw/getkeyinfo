package com.etsy.android.lib.push.registration;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8694h;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.internal.operators.flowable.C19107d;
import p145io.reactivex.internal.operators.flowable.FlowableTimer;
import p248tp.C8054g;
import p248tp.C8066r;
import p346fa.C12703a;
import p456ua.C13461f;
import p753kq.C19857l;
import p762or.C20023b;

final class FcmTokenRequest$requestFcmToken$1$2 extends Lambda implements C19857l<Integer, C20023b<? extends Object>> {
    public final /* synthetic */ int $maxRetries;
    public final /* synthetic */ long $secondsUntilRetry;
    public final /* synthetic */ C8835h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FcmTokenRequest$requestFcmToken$1$2(C8835h hVar, int i, long j) {
        super(1);
        this.this$0 = hVar;
        this.$maxRetries = i;
        this.$secondsUntilRetry = j;
    }

    public final C20023b<? extends Object> invoke(Integer num) {
        C19383o.m32797g(num, "retryCount");
        C12703a aVar = this.this$0.f19432c;
        StringBuilder h = C0072d.m201h("notification_token.failure_obtaining_token.");
        h.append(num.intValue());
        aVar.mo45474a(h.toString());
        if (num.intValue() >= this.$maxRetries) {
            this.this$0.f19433d.mo21308c();
            C8835h hVar = this.this$0;
            int d = hVar.f19430a.f19441a.mo21134d(C8592b.C8605m.f18907a);
            C8694h hVar2 = hVar.f19433d;
            hVar2.mo21306a("Error registering with FCM for a token after " + d);
            C12703a aVar2 = hVar.f19432c;
            aVar2.mo45474a("notification_token.failure_obtaining_token_with_max_retries." + d);
            int i = C8054g.f17572b;
            return C19107d.f42672c;
        }
        C8694h hVar3 = this.this$0.f19433d;
        num.intValue();
        hVar3.mo21308c();
        long j = this.$secondsUntilRetry;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.this$0.f19434e.getClass();
        C8066r b = C13461f.m21235b();
        int i2 = C8054g.f17572b;
        if (timeUnit != null) {
            return new FlowableTimer(Math.max(0, j), timeUnit, b);
        }
        throw new NullPointerException("unit is null");
    }
}
