package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C14451R;

/* renamed from: com.google.android.gms.measurement.internal.o3 */
public final class C15050o3 {
    /* renamed from: a */
    public static String m24586a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C14451R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m24587b(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }
}
