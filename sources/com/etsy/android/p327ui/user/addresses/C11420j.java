package com.etsy.android.p327ui.user.addresses;

import java.util.List;
import kotlin.text.C19457k;
import kotlin.text.C19459m;

/* renamed from: com.etsy.android.ui.user.addresses.j */
public final class C11420j {

    /* renamed from: com.etsy.android.ui.user.addresses.j$a */
    public /* synthetic */ class C11421a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25177a;

        static {
            int[] iArr = new int[AddressFormatType.values().length];
            iArr[AddressFormatType.DEFAULT_INPUT_FORMAT.ordinal()] = 1;
            iArr[AddressFormatType.FORMAT.ordinal()] = 2;
            iArr[AddressFormatType.LOCAL_INPUT_FORMAT.ordinal()] = 3;
            iArr[AddressFormatType.INPUT_FORMAT.ordinal()] = 4;
            f25177a = iArr;
        }
    }

    /* renamed from: a */
    public static List m19268a(String str, String str2) {
        return str == null || str.length() == 0 ? C19459m.m33056y1(C19457k.m33023a1(str2, "%", "", false), new String[]{"\\n", " "}, 0, 6) : C19459m.m33056y1(C19457k.m33023a1(str, "%", "", false), new String[]{"\\n", " "}, 0, 6);
    }
}
