package com.etsy.android.lib.push.registration;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p145io.reactivex.internal.operators.observable.C19160f;
import p248tp.C8061n;
import p248tp.C8065q;
import p346fa.C12703a;
import p456ua.C13461f;
import p753kq.C19857l;

final class TokenUploader$upload$1$2 extends Lambda implements C19857l<Integer, C8065q<? extends Object>> {
    public final /* synthetic */ C8841n this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenUploader$upload$1$2(C8841n nVar) {
        super(1);
        this.this$0 = nVar;
    }

    public final C8065q<? extends Object> invoke(Integer num) {
        C19383o.m32797g(num, "retryCount");
        C12703a aVar = this.this$0.f19447b;
        StringBuilder h = C0072d.m201h("notification_token.failure_uploading_token_to_etsy_apiV3.");
        h.append(num.intValue());
        aVar.mo45474a(h.toString());
        int intValue = num.intValue();
        C8841n nVar = this.this$0;
        if (intValue >= nVar.f19451f) {
            nVar.f19448c.mo21308c();
            C8841n nVar2 = this.this$0;
            C8694h hVar = nVar2.f19448c;
            StringBuilder h2 = C0072d.m201h("Error registering with Etsy for a token after ");
            h2.append(nVar2.f19451f);
            hVar.mo21306a(h2.toString());
            C12703a aVar2 = nVar2.f19447b;
            aVar2.mo45474a("notification_token.failure_uploading_to_etsy_token_with_max_retries_" + "apiV3" + ClassUtils.PACKAGE_SEPARATOR_CHAR + nVar2.f19451f);
            return C19160f.f42828b;
        }
        C8694h hVar2 = nVar.f19448c;
        long j = this.this$0.f19452g;
        num.intValue();
        hVar2.mo21308c();
        C8841n nVar3 = this.this$0;
        long j2 = nVar3.f19452g;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nVar3.f19450e.getClass();
        return C8061n.m16235j(j2, timeUnit, C13461f.m21235b());
    }
}
