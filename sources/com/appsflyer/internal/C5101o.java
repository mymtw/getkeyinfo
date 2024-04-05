package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.appsflyer.internal.o */
public final class C5101o {
    public final String[] AFInAppEventType;

    /* renamed from: com.appsflyer.internal.o$d */
    public interface C5103d {
        void valueOf(String str);

        void valueOf(String str, String str2, String str3);
    }

    public C5101o() {
    }

    public C5101o(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFInAppEventType = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !compile.matcher(str).matches()) {
                AFLogger.AppsFlyer2dXConversionCallback("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase());
            }
        }
        if (arrayList.contains("all")) {
            this.AFInAppEventType = new String[]{"all"};
        } else if (!arrayList.isEmpty()) {
            this.AFInAppEventType = (String[]) arrayList.toArray(new String[0]);
        } else {
            this.AFInAppEventType = null;
        }
    }
}
