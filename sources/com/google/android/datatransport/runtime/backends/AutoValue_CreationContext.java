package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import p003a2.C0023f;
import p132hh.C6963a;

final class AutoValue_CreationContext extends C6529d {
    private final Context applicationContext;
    private final String backendName;
    private final C6963a monotonicClock;
    private final C6963a wallClock;

    public AutoValue_CreationContext(Context context, C6963a aVar, C6963a aVar2, String str) {
        if (context != null) {
            this.applicationContext = context;
            if (aVar != null) {
                this.wallClock = aVar;
                if (aVar2 != null) {
                    this.monotonicClock = aVar2;
                    if (str != null) {
                        this.backendName = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6529d)) {
            return false;
        }
        C6529d dVar = (C6529d) obj;
        return this.applicationContext.equals(dVar.getApplicationContext()) && this.wallClock.equals(dVar.getWallClock()) && this.monotonicClock.equals(dVar.getMonotonicClock()) && this.backendName.equals(dVar.getBackendName());
    }

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public String getBackendName() {
        return this.backendName;
    }

    public C6963a getMonotonicClock() {
        return this.monotonicClock;
    }

    public C6963a getWallClock() {
        return this.wallClock;
    }

    public int hashCode() {
        return ((((((this.applicationContext.hashCode() ^ 1000003) * 1000003) ^ this.wallClock.hashCode()) * 1000003) ^ this.monotonicClock.hashCode()) * 1000003) ^ this.backendName.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CreationContext{applicationContext=");
        h.append(this.applicationContext);
        h.append(", wallClock=");
        h.append(this.wallClock);
        h.append(", monotonicClock=");
        h.append(this.monotonicClock);
        h.append(", backendName=");
        return C0023f.m110k(h, this.backendName, "}");
    }
}
