package com.paypal.pyplcheckout.p539ab.featureflag;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.pyplcheckout.ab.featureflag.FeatureResponse */
public abstract class FeatureResponse {

    /* renamed from: com.paypal.pyplcheckout.ab.featureflag.FeatureResponse$Disabled */
    public static final class Disabled extends FeatureResponse {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.pyplcheckout.ab.featureflag.FeatureResponse$EnableOverride */
    public static final class EnableOverride extends FeatureResponse {
        public static final EnableOverride INSTANCE = new EnableOverride();

        private EnableOverride() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.pyplcheckout.ab.featureflag.FeatureResponse$Enabled */
    public static final class Enabled extends FeatureResponse {
        public static final Enabled INSTANCE = new Enabled();

        private Enabled() {
            super((DefaultConstructorMarker) null);
        }
    }

    private FeatureResponse() {
    }

    public /* synthetic */ FeatureResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isEnabled() {
        return C19383o.m32792b(this, Enabled.INSTANCE) || C19383o.m32792b(this, EnableOverride.INSTANCE);
    }
}
