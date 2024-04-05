package com.etsy.android.p327ui.cart.googlepay;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.C0326j;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.R;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.cart.googlepay.models.GooglePayIsReadyToPay;
import com.etsy.android.p327ui.cart.googlepay.models.GooglePayMerchantInfo;
import com.etsy.android.p327ui.cart.googlepay.models.GooglePayPaymentDataRequest;
import com.etsy.android.p327ui.cart.googlepay.models.GooglePayTransactionInfo;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import java.util.List;
import java.util.Locale;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p340ea.C12673n;
import p346fa.C12703a;
import p568fn.C17782b;
import p605kk.C18119c;
import p605kk.C18123g;
import p613lk.C18192b;
import p613lk.C18193c;
import p613lk.C18196d;
import p613lk.C18197e;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.googlepay.a */
public final class C9303a {

    /* renamed from: a */
    public final C8694h f20523a;

    /* renamed from: b */
    public final C12673n f20524b;

    /* renamed from: c */
    public final C12703a f20525c;

    /* renamed from: d */
    public C18192b f20526d;

    /* renamed from: e */
    public C9305c f20527e = new C9305c();

    public C9303a(Context context, C8694h hVar, C12673n nVar, C12703a aVar, C8591a aVar2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(hVar, "logcat");
        C19383o.m32797g(nVar, "elkLogger");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(aVar2, "config");
        this.f20523a = hVar;
        this.f20524b = nVar;
        this.f20525c = aVar;
        C18193c.C18194a.C18195a aVar3 = new C18193c.C18194a.C18195a();
        int i = (C0326j.m869n(BuildTarget.Companion) || aVar2.f18705e.equals(aVar2.f18701a)) ? 3 : 1;
        if (i == 0 || i == 0 || i == 2 || i == 1 || i == 3) {
            aVar3.f39841a = i;
            C18193c.C18194a aVar4 = new C18193c.C18194a(aVar3);
            Api<C18193c.C18194a> api = C18193c.f39838a;
            this.f20526d = new C18192b(context, aVar4);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: c */
    public static void m17695c(C9303a aVar, C18119c cVar) {
        aVar.getClass();
        C9305c cVar2 = aVar.f20527e;
        Boolean bool = Boolean.TRUE;
        cVar2.getClass();
        IsReadyToPayRequest fromJson = IsReadyToPayRequest.fromJson(new GooglePayIsReadyToPay(2, 0, bool, C17782b.m29864d0(C9305c.m17699a(false, false))).toString());
        if (fromJson != null) {
            C18192b bVar = aVar.f20526d;
            bVar.getClass();
            bVar.doRead(new C18196d(fromJson)).mo69656c(cVar);
        }
    }

    /* renamed from: d */
    public static void m17696d(C9303a aVar, Activity activity, GooglePayDataContract googlePayDataContract) {
        aVar.getClass();
        C19383o.m32797g(googlePayDataContract, "dataContract");
        aVar.f20527e.getClass();
        List d0 = C17782b.m29864d0(C9305c.m17699a(true, false));
        String bigDecimal = googlePayDataContract.getTotal().getAmount().toString();
        C19383o.m32796f(bigDecimal, "dataContract.total.getAmount().toString()");
        String currencyCode = googlePayDataContract.getTotal().getCurrency().getCurrencyCode();
        C19383o.m32796f(currencyCode, AppsFlyerProperties.CURRENCY_CODE);
        PaymentDataRequest fromJson = PaymentDataRequest.fromJson(new GooglePayPaymentDataRequest(2, 0, new GooglePayMerchantInfo(C0326j.m864i("Etsy - ", googlePayDataContract.getShopName())), d0, new GooglePayTransactionInfo(bigDecimal, "FINAL", currencyCode)).toString());
        if (fromJson != null) {
            C18192b bVar = aVar.f20526d;
            bVar.getClass();
            C18123g doWrite = bVar.doWrite(new C18197e(fromJson));
            int i = AutoResolveHelper.f34051c;
            AutoResolveHelper.C15147a aVar2 = new AutoResolveHelper.C15147a();
            int incrementAndGet = AutoResolveHelper.C15147a.f34054g.incrementAndGet();
            aVar2.f34055b = incrementAndGet;
            AutoResolveHelper.C15147a.f34053f.put(incrementAndGet, aVar2);
            AutoResolveHelper.C15147a.f34052e.postDelayed(aVar2, AutoResolveHelper.f34049a);
            doWrite.mo69656c(aVar2);
            FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
            Fragment zzb = AutoResolveHelper.zzb.zza(aVar2.f34055b, 45056);
            int i2 = aVar2.f34055b;
            StringBuilder sb = new StringBuilder(58);
            sb.append("com.google.android.gms.wallet.AutoResolveHelper");
            sb.append(i2);
            beginTransaction.add(zzb, sb.toString()).commit();
        }
    }

    /* renamed from: a */
    public final void mo31652a(Context context, GooglePayDataContract googlePayDataContract, int i, int i2, Intent intent, C19857l<? super PaymentData, C19394m> lVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if ((i & 65280) != 45056) {
            return;
        }
        if (i2 == -1) {
            C19383o.m32794d(intent);
            lVar.invoke(PaymentData.getFromIntent(intent));
        } else if (i2 == 1) {
            C19383o.m32794d(intent);
            mo31653b(intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", -1), context, googlePayDataContract.getCartId());
        }
    }

    /* renamed from: b */
    public final void mo31653b(int i, Context context, long j) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (i == 7 || i == 8) {
            C8901g0.m17338d(context, context.getString(R.string.network_unavailable));
            C8694h hVar = this.f20523a;
            hVar.mo21312f("Network error: " + i);
            C12673n nVar = this.f20524b;
            nVar.mo45451c("GooglePayHelper", "Network error: " + i);
        } else {
            if (!(i == 402 || i == 409)) {
                switch (i) {
                    case HttpStatus.HTTP_NOT_FOUND /*404*/:
                    case 405:
                        break;
                    case 406:
                        C8901g0.m17338d(context, context.getString(R.string.google_pay_error_spending_limit_exceeded));
                        break;
                    default:
                        switch (i) {
                            case 411:
                            case 412:
                            case 413:
                                break;
                            default:
                                C8901g0.m17337c(context, R.string.google_pay_error_unavailable);
                                C8694h hVar2 = this.f20523a;
                                hVar2.mo21312f("Unrecoverable error when checking out with Google Pay: " + i + ". Cart id: " + j);
                                C12673n nVar2 = this.f20524b;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unrecoverable error when checking out with Google Pay: ");
                                sb.append(i);
                                nVar2.mo45451c("GooglePayHelper", sb.toString());
                                break;
                        }
                }
            }
            C8901g0.m17337c(context, R.string.google_pay_error_unavailable);
            C8694h hVar3 = this.f20523a;
            hVar3.mo21312f("Unrecoverable error when checking out with Google Pay: " + i + ". Cart id: " + j);
            C12673n nVar3 = this.f20524b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unrecoverable error when checking out with Google Pay: ");
            sb2.append(i);
            nVar3.mo45451c("GooglePayHelper", sb2.toString());
        }
        C12703a aVar = this.f20525c;
        aVar.mo45474a("google_pay" + ".error." + i);
    }
}
