package com.paypal.pyplcheckout.p539ab;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.cache.Cache;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.ab.AbUUIDProvider */
public final class AbUUIDProvider {
    public static final AbUUIDProvider INSTANCE = new AbUUIDProvider();

    private AbUUIDProvider() {
    }

    public static final String getUUID(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return Cache.getOrCreateUUID(context);
    }
}
