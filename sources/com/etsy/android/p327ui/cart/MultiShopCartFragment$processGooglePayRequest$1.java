package com.etsy.android.p327ui.cart;

import android.content.Intent;
import android.os.Bundle;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GooglePayCheckoutKey;
import com.google.android.gms.wallet.PaymentData;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p356ge.C12790b;
import p753kq.C19857l;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$processGooglePayRequest$1 */
public final class MultiShopCartFragment$processGooglePayRequest$1 extends Lambda implements C19857l<PaymentData, C19394m> {
    public final /* synthetic */ Intent $fData;
    public final /* synthetic */ GooglePayDataContract $fGooglePayData;
    public final /* synthetic */ MultiShopCartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiShopCartFragment$processGooglePayRequest$1(Intent intent, MultiShopCartFragment multiShopCartFragment, GooglePayDataContract googlePayDataContract) {
        super(1);
        this.$fData = intent;
        this.this$0 = multiShopCartFragment;
        this.$fGooglePayData = googlePayDataContract;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PaymentData) obj);
        return C19394m.f43287a;
    }

    public final void invoke(PaymentData paymentData) {
        if (paymentData != null && this.$fData.getExtras() != null) {
            Bundle extras = this.$fData.getExtras();
            C19383o.m32794d(extras);
            boolean z = extras.getBoolean(CartWithSavedFragment.CHECKED_OUT_IS_MSCO, false);
            GooglePayCheckoutKey.C10701a aVar = new GooglePayCheckoutKey.C10701a();
            aVar.f23601a = C12790b.m20432d(this.this$0);
            GooglePayDataContract googlePayDataContract = this.$fGooglePayData;
            C19383o.m32797g(googlePayDataContract, "dataContract");
            aVar.f23602b = googlePayDataContract;
            aVar.f23603c = paymentData;
            C19919a aVar2 = aVar.f23604d;
            C19410j<Object>[] jVarArr = GooglePayCheckoutKey.C10701a.f23600e;
            aVar2.mo72822a(aVar, jVarArr[0], Boolean.valueOf(z));
            String str = aVar.f23601a;
            if (str != null) {
                GooglePayDataContract googlePayDataContract2 = aVar.f23602b;
                if (googlePayDataContract2 != null) {
                    PaymentData paymentData2 = aVar.f23603c;
                    if (paymentData2 != null) {
                        C12790b.m20430b(this.this$0, new GooglePayCheckoutKey(str, googlePayDataContract2, paymentData2, ((Boolean) aVar.f23604d.getValue(aVar, jVarArr[0])).booleanValue()));
                        return;
                    }
                    C19383o.m32805o("paymentData");
                    throw null;
                }
                C19383o.m32805o("dataContract");
                throw null;
            }
            C19383o.m32805o("referrer");
            throw null;
        }
    }
}
