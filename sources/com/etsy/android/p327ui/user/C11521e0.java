package com.etsy.android.p327ui.user;

import com.etsy.android.lib.models.Transaction;
import p145io.reactivex.functions.Consumer;
import p321cc.C8569c;

/* renamed from: com.etsy.android.ui.user.e0 */
public final /* synthetic */ class C11521e0 implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ TransactionAdapter f25418b;

    /* renamed from: c */
    public final /* synthetic */ Transaction f25419c;

    public /* synthetic */ C11521e0(TransactionAdapter transactionAdapter, Transaction transaction) {
        this.f25418b = transactionAdapter;
        this.f25419c = transaction;
    }

    public final void accept(Object obj) {
        this.f25418b.lambda$queryListingForAnalyticsEvent$0(this.f25419c, (C8569c.C8570a) obj);
    }
}
