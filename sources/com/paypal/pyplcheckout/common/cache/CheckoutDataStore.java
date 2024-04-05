package com.paypal.pyplcheckout.common.cache;

import android.content.Context;
import androidx.datastore.preferences.core.C2493b;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.cache.PreferenceConstants;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;

public final class CheckoutDataStore extends PreferenceStoreImpl {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutDataStore(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        HashMap hashMap = new HashMap();
        StringPreferenceConstants[] values = StringPreferenceConstants.values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            StringPreferenceConstants stringPreferenceConstants = values[i2];
            i2++;
            hashMap.put(stringPreferenceConstants.name(), PreferenceConstants.PreferenceType.StringValue);
        }
        BooleanPrefConstants[] values2 = BooleanPrefConstants.values();
        int length2 = values2.length;
        int i3 = 0;
        while (i3 < length2) {
            BooleanPrefConstants booleanPrefConstants = values2[i3];
            i3++;
            hashMap.put(booleanPrefConstants.name(), PreferenceConstants.PreferenceType.StringValue);
        }
        IntPrefConstants[] values3 = IntPrefConstants.values();
        int length3 = values3.length;
        while (i < length3) {
            IntPrefConstants intPrefConstants = values3[i];
            i++;
            hashMap.put(intPrefConstants.name(), PreferenceConstants.PreferenceType.StringValue);
        }
        convertToPreferenceKey(hashMap);
    }

    public final void setBooleanDataStorePref(String str, boolean z) {
        C19383o.m32797g(str, "key");
        String valueOf = String.valueOf(getHashData().get(str));
        boolean z2 = true;
        if (!(C19383o.m32792b(valueOf, BooleanPrefConstants.FINISH_CHECKOUT_AND_APPROVE_FIRED.name()) ? true : C19383o.m32792b(valueOf, BooleanPrefConstants.ADD_MANUALLY.name()) ? true : C19383o.m32792b(valueOf, BooleanPrefConstants.BLOCK_NON_DOMESTIC_SHIPPING.name()) ? true : C19383o.m32792b(valueOf, BooleanPrefConstants.COMING_FROM_REVIEW.name()) ? true : C19383o.m32792b(valueOf, BooleanPrefConstants.IS_SMART_PAYMENT.name()) ? true : C19383o.m32792b(valueOf, BooleanPrefConstants.DID_CCT_OPEN.name()) ? true : C19383o.m32792b(valueOf, BooleanPrefConstants.IS_FALLBACK.name()))) {
            z2 = C19383o.m32792b(valueOf, BooleanPrefConstants.IS_ORDER_CREATED.name());
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

    public final void setIntDataStorePref(String str, int i) {
        C19383o.m32797g(str, "key");
        if (C19383o.m32792b(String.valueOf(getHashData().get(str)), IntPrefConstants.COUNTRY_POSITION.name())) {
            C2493b.C2494a<?> aVar = getHashData().get(str);
            if (aVar != null) {
                setValueInt(aVar, i);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences.Key<kotlin.Int>");
        }
    }

    public final void setStringDataStorePref(String str, String str2) {
        C19383o.m32797g(str, "key");
        String valueOf = String.valueOf(getHashData().get(str));
        boolean z = true;
        if (!(C19383o.m32792b(valueOf, StringPreferenceConstants.BUTTON_SESSION_ID.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.STICKINESS_ID.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.ORDER_ID.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.SPB_TOKEN.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.FACILITATOR_ID.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.DOMAIN.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.FUNDING_SOURCE.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.ADD_SHIPPING.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.FULL_ADDRESS.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.STATE.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.POSTAL_CODE.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.CITY.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.SEARCH_SCREEN_TITLE.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.HINT_TITLE.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.SAVED_ADDRESS.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.COUNTRY_ID.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.MERCHANT_COUNTRY.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.ORDER_CAPTURE_URL.name()) ? true : C19383o.m32792b(valueOf, StringPreferenceConstants.ORDER_AUTHORIZE_URL.name()))) {
            z = C19383o.m32792b(valueOf, StringPreferenceConstants.ORDER_PATCH_URL.name());
        }
        if (z) {
            if (str2 != null) {
                C2493b.C2494a<?> aVar = getHashData().get(str);
                if (aVar != null) {
                    setValueString(aVar, str2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences.Key<kotlin.String>");
            }
        } else if (C19383o.m32792b(valueOf, StringPreferenceConstants.FB_SESSION_UID.name())) {
            if (str2 != null) {
                C2493b.C2494a<?> aVar2 = getHashData().get(str);
                if (aVar2 != null) {
                    setValueString(aVar2, str2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences.Key<kotlin.String>");
            }
        } else if (C19383o.m32792b(valueOf, StringPreferenceConstants.FIREBASE_DB_INSTANCE_ID.name()) && str2 != null) {
            C2493b.C2494a<?> aVar3 = getHashData().get(str);
            if (aVar3 != null) {
                setValueString(aVar3, str2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences.Key<kotlin.String>");
        }
    }
}
