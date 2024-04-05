package com.paypal.pyplcheckout.p539ab.featureflag;

import android.content.Context;
import androidx.datastore.preferences.core.C2493b;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.cache.BooleanPrefConstants;
import com.paypal.pyplcheckout.common.cache.PreferenceConstants;
import com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.ab.featureflag.DeveloperSettingsFFCache */
public final class DeveloperSettingsFFCache extends PreferenceStoreImpl {
    private final Context context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeveloperSettingsFFCache(Context context2) {
        super(context2);
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.context = context2;
        HashMap hashMap = new HashMap();
        BooleanPrefConstants[] values = BooleanPrefConstants.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            BooleanPrefConstants booleanPrefConstants = values[i];
            i++;
            hashMap.put(booleanPrefConstants.name(), PreferenceConstants.PreferenceType.StringValue);
        }
        convertToPreferenceKey(hashMap);
    }

    public final void setBooleanDataStorePref(String str, boolean z) {
        C19383o.m32797g(str, "key");
        String valueOf = String.valueOf(getHashData().get(str));
        boolean z2 = true;
        if (!(C19383o.m32792b(valueOf, Feature.ADD_SHIPPING.name()) ? true : C19383o.m32792b(valueOf, Feature.ADD_CARD.name()))) {
            z2 = C19383o.m32792b(valueOf, Feature.SHIPPING_CALLBACK.name());
        }
        if (z2) {
            C2493b.C2494a<?> aVar = getHashData().get(str);
            if (aVar != null) {
                setValueBoolean(aVar, z);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences.Key<kotlin.Boolean>");
        }
    }
}
