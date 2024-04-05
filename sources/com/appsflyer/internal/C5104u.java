package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;

/* renamed from: com.appsflyer.internal.u */
public final class C5104u {
    public final ExecutorService AFInAppEventParameterName;
    public final C5042bj valueOf;

    /* renamed from: com.appsflyer.internal.u$e */
    public interface C5106e {
        void AFInAppEventParameterName(String str, Exception exc);

        void values(String str, String str2);
    }

    public C5104u() {
    }

    public C5104u(C5042bj bjVar, ExecutorService executorService) {
        this.valueOf = bjVar;
        this.AFInAppEventParameterName = executorService;
    }
}
