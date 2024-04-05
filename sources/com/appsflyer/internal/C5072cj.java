package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.appsflyer.internal.cj */
public abstract class C5072cj extends Observable {
    public final Map<String, Object> AFInAppEventParameterName = new HashMap();
    public final Runnable AFInAppEventType;
    public C5074e AFKeystoreWrapper = C5074e.NOT_STARTED;
    private long valueOf;
    public final String values;

    /* renamed from: com.appsflyer.internal.cj$e */
    public enum C5074e {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public C5072cj(String str, Runnable runnable) {
        this.AFInAppEventType = runnable;
        this.values = str;
    }

    public abstract void AFInAppEventType(Context context);

    public final void AFKeystoreWrapper() {
        this.AFInAppEventParameterName.put("source", this.values);
        this.AFInAppEventParameterName.putAll(new C5071ci());
        this.AFInAppEventParameterName.put("latency", Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.AFKeystoreWrapper = C5074e.FINISHED;
        setChanged();
        notifyObservers();
    }

    public final void valueOf() {
        this.valueOf = System.currentTimeMillis();
        this.AFKeystoreWrapper = C5074e.STARTED;
        addObserver(new Observer() {
            public final void update(Observable observable, Object obj) {
                C5072cj.this.AFInAppEventType.run();
            }
        });
    }
}
