package com.paypal.pyplcheckout.merchantIntegration;

import androidx.annotation.Keep;
import com.paypal.pyplcheckout.interfaces.Environment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p010a9.C0048b;

@Keep
public enum RunTimeEnvironment implements Environment {
    LIVE("Live"),
    SANDBOX("Sandbox"),
    STAGE("StageT24"),
    LOCAL("Local");
    
    public static final Companion Companion = null;
    private final String paypalEnvironment;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RunTimeEnvironment fromString(String str) {
            RunTimeEnvironment[] values = RunTimeEnvironment.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                RunTimeEnvironment runTimeEnvironment = values[i];
                i++;
                if (C19457k.m33019W0(runTimeEnvironment.toString(), str, true)) {
                    return runTimeEnvironment;
                }
            }
            throw new IllegalArgumentException(C0048b.m163a("no environment with text ", str, " found"));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private RunTimeEnvironment(String str) {
        this.paypalEnvironment = str;
    }

    public String toString() {
        return this.paypalEnvironment;
    }
}
