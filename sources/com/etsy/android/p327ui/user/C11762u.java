package com.etsy.android.p327ui.user;

import com.etsy.android.lib.requests.ReceiptId;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.u */
public interface C11762u {
    @C20183f("/etsyapps/v3/bespoke/member/shops/receipts")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo38005a(@C20197t("receipt_id") String str);

    @C20183f("/etsyapps/v3/member/transaction/{transaction_id}/receipt-id")
    /* renamed from: b */
    C8071s<ReceiptId> mo38006b(@C20196s("transaction_id") String str);
}
