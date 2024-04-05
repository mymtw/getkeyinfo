package com.appsflyer.internal;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.be */
public final class C5037be implements C5039bg {
    private ExecutorService AFInAppEventParameterName;
    public Context AFInAppEventType;
    private C5022av AFKeystoreWrapper;
    private C5104u AFVersionDeclaration;
    private C5036bd valueOf;
    private final int values = ((int) TimeUnit.SECONDS.toMillis(30));

    public final C5040bh AFInAppEventType() {
        if (this.AFVersionDeclaration == null) {
            C5042bj bjVar = new C5042bj(this.values);
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = Executors.newCachedThreadPool();
            }
            this.AFVersionDeclaration = new C5104u(bjVar, this.AFInAppEventParameterName);
        }
        C5104u uVar = this.AFVersionDeclaration;
        Context context = this.AFInAppEventType;
        if (context != null) {
            return new C5040bh(uVar, new C5100n(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    public final C5022av AFKeystoreWrapper() {
        if (this.AFKeystoreWrapper == null) {
            if (this.valueOf == null) {
                this.valueOf = new C5036bd();
            }
            C5036bd bdVar = this.valueOf;
            Context context = this.AFInAppEventType;
            if (context != null) {
                C5038bf bfVar = new C5038bf(context);
                Context context2 = this.AFInAppEventType;
                if (context2 != null) {
                    C5033ba baVar = new C5033ba(C4986ag.AFInAppEventParameterName(context2));
                    if (this.AFInAppEventParameterName == null) {
                        this.AFInAppEventParameterName = Executors.newCachedThreadPool();
                    }
                    this.AFKeystoreWrapper = new C5022av(bdVar, bfVar, baVar, this.AFInAppEventParameterName, AFInAppEventType());
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.AFKeystoreWrapper;
    }
}
