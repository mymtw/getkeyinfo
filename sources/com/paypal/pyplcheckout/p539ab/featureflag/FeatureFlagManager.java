package com.paypal.pyplcheckout.p539ab.featureflag;

import com.paypal.pyplcheckout.p539ab.featureflag.FeatureResponse;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.ab.featureflag.FeatureFlagManager */
public final class FeatureFlagManager {
    public static final FeatureFlagManager INSTANCE = new FeatureFlagManager();
    private static final List<Feature> enabledFeatures = C17782b.m29865e0(Feature.AMPLITUDE_REST_API, Feature.ADD_CARD, Feature.SHIPPING_CALLBACK, Feature.ADD_SHIPPING, Feature.NATIVE_BA, Feature.CRYPTO_PAYMENTS, Feature.ADD_CARD_3DS, Feature.THIRD_PARTY_3DS);
    private static final Set<Feature> localOverrideRuntimeFeatures = new LinkedHashSet();

    private FeatureFlagManager() {
    }

    public static final FeatureResponse isEnabled(Feature feature) {
        C19383o.m32797g(feature, "feature");
        return isEnabled$default(feature, false, 2, (Object) null);
    }

    public static final FeatureResponse isEnabled(Feature feature, boolean z) {
        C19383o.m32797g(feature, "feature");
        return (!z || !localOverrideRuntimeFeatures.contains(feature)) ? enabledFeatures.contains(feature) ? FeatureResponse.Enabled.INSTANCE : FeatureResponse.Disabled.INSTANCE : FeatureResponse.EnableOverride.INSTANCE;
    }

    public static /* synthetic */ FeatureResponse isEnabled$default(Feature feature, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return isEnabled(feature, z);
    }

    public final void disable(Feature feature) {
        C19383o.m32797g(feature, "feature");
        Set<Feature> set = localOverrideRuntimeFeatures;
        if (set.contains(feature)) {
            set.remove(feature);
        }
    }

    public final void enable(Feature feature) {
        C19383o.m32797g(feature, "feature");
        localOverrideRuntimeFeatures.add(feature);
    }

    public final Set<Feature> getLocalOverrideRuntimeFeatures() {
        return localOverrideRuntimeFeatures;
    }
}
