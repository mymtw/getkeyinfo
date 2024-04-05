package com.etsy.android.lib.models.enums;

import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import java.util.List;
import p628nj.C18263b;

public enum EtsyReceiptType {
    RECEIPT_TYPE_STANDARD,
    RECEIPT_TYPE_CUSTOM_SHOP,
    RECEIPT_TYPE_GUEST_USER,
    RECEIPT_TYPE_CRAFT;

    public static EtsyReceiptType resolveReceiptType(int i) {
        if (i == 0) {
            return RECEIPT_TYPE_STANDARD;
        }
        if (i != 1) {
            return i != 2 ? i != 3 ? RECEIPT_TYPE_STANDARD : RECEIPT_TYPE_CRAFT : RECEIPT_TYPE_GUEST_USER;
        }
        List<String> list = C8591a.f18700r;
        return C18263b.f40056T.f18706f.mo21132b(C8592b.f18780c0) ? RECEIPT_TYPE_CUSTOM_SHOP : RECEIPT_TYPE_STANDARD;
    }
}
