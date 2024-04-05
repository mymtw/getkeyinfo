package p317bf;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.ReceiptApiModel;
import kotlin.jvm.internal.C19383o;

/* renamed from: bf.a */
public final class C8550a {

    /* renamed from: a */
    public final C8630b f18619a;

    public C8550a(C8630b bVar) {
        C19383o.m32797g(bVar, "moneyFactory");
        this.f18619a = bVar;
    }

    /* renamed from: a */
    public static final EtsyMoney m16951a(String str, C8550a aVar, ReceiptApiModel receiptApiModel) {
        return aVar.f18619a.mo21248a(str, receiptApiModel.getCurrencyCode());
    }
}
