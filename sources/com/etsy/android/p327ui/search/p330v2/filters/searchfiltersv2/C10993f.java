package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.f */
public final class C10993f {

    /* renamed from: a */
    public final Context f24381a;

    public C10993f(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f24381a = context;
    }

    /* renamed from: a */
    public final String mo36550a(Integer num) {
        if (num == null || num.intValue() == 0) {
            return "";
        }
        String string = this.f24381a.getString(num.intValue());
        C19383o.m32796f(string, "context.getString(resId)");
        return string;
    }
}
