package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0070b;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;

@ShowFirstParty
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.icing.p2 */
public final class C14537p2 {
    @VisibleForTesting

    /* renamed from: a */
    public static final String[] f32678a = {"text1", "text2", ResponseConstants.ICON, "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};

    /* renamed from: b */
    public static final HashMap f32679b = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = f32678a;
            if (i < 10) {
                f32679b.put(strArr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m23140a(String str) {
        Integer num = (Integer) f32679b.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(C0070b.m184f(new StringBuilder(str.length() + 44), "[", str, "] is not a valid global search section name"));
    }
}
