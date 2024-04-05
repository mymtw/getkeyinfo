package com.appsflyer.internal;

import androidx.core.internal.view.SupportMenu;

/* renamed from: com.appsflyer.internal.ct */
public final class C5084ct {
    public static void AFInAppEventParameterName(char[] cArr, char[] cArr2, int i) {
        char c = cArr2[(i + 2) % 4];
        int i2 = (i + 3) % 4;
        cArr2[i2] = (char) (((cArr[i2] * 32718) + c) / SupportMenu.USER_MASK);
        cArr[i2] = (char) (((cArr[i % 4] * 32718) + c) % SupportMenu.USER_MASK);
    }
}
