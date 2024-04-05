package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.appsflyer.internal.bm */
public final class C5045bm<ResponseBody> {
    public final C5052br<ResponseBody> AFInAppEventParameterName;
    public final C5107v AFInAppEventType;
    public final C5042bj AFKeystoreWrapper;
    public final ExecutorService valueOf;
    public final AtomicBoolean values = new AtomicBoolean(false);

    public C5045bm(C5107v vVar, ExecutorService executorService, C5042bj bjVar, C5052br<ResponseBody> brVar) {
        this.AFInAppEventType = vVar;
        this.valueOf = executorService;
        this.AFKeystoreWrapper = bjVar;
        this.AFInAppEventParameterName = brVar;
    }
}
