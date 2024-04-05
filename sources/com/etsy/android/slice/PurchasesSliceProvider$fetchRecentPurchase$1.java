package com.etsy.android.slice;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction;
import com.etsy.android.p327ui.user.purchases.C11629b;
import com.etsy.android.p327ui.user.purchases.C11632c;
import com.etsy.android.p327ui.user.purchases.PurchasesRepository;
import com.etsy.android.slice.PurchasesSliceProvider;
import java.util.List;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19543e0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.slice.PurchasesSliceProvider$fetchRecentPurchase$1", mo70541f = "PurchasesSliceProvider.kt", mo70542l = {188}, mo70543m = "invokeSuspend")
public final class PurchasesSliceProvider$fetchRecentPurchase$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Uri $sliceUri;
    public Object L$0;
    public int label;
    public final /* synthetic */ PurchasesSliceProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesSliceProvider$fetchRecentPurchase$1(PurchasesSliceProvider purchasesSliceProvider, Context context, Uri uri, C19340c<? super PurchasesSliceProvider$fetchRecentPurchase$1> cVar) {
        super(2, cVar);
        this.this$0 = purchasesSliceProvider;
        this.$context = context;
        this.$sliceUri = uri;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PurchasesSliceProvider$fetchRecentPurchase$1(this.this$0, this.$context, this.$sliceUri, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PurchasesSliceProvider$fetchRecentPurchase$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        PurchasesSliceProvider purchasesSliceProvider;
        PurchasesSliceProvider.C9010b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            PurchasesSliceProvider purchasesSliceProvider2 = this.this$0;
            PurchasesRepository purchasesRepository = purchasesSliceProvider2.getPurchasesRepository();
            C11632c cVar = new C11632c(1, 0, false);
            this.L$0 = purchasesSliceProvider2;
            this.label = 1;
            Object a = purchasesRepository.mo37701a(cVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            purchasesSliceProvider = purchasesSliceProvider2;
            obj = a;
        } else if (i == 1) {
            purchasesSliceProvider = (PurchasesSliceProvider) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11629b bVar2 = (C11629b) obj;
        if (bVar2 instanceof C11629b.C11631b) {
            PastPurchaseReceipt pastPurchaseReceipt = (PastPurchaseReceipt) C19327t.m32640V0(((C11629b.C11631b) bVar2).f25748a);
            List<PastPurchaseTransaction> transactions = pastPurchaseReceipt != null ? pastPurchaseReceipt.getTransactions() : null;
            bVar = (pastPurchaseReceipt == null || !C19543e0.m33306Y(transactions)) ? PurchasesSliceProvider.C9010b.C9014d.f19883a : new PurchasesSliceProvider.C9010b.C9012b(pastPurchaseReceipt, this.this$0.fetchItemImages(transactions));
        } else if (bVar2 instanceof C11629b.C11630a) {
            bVar = PurchasesSliceProvider.C9010b.C9013c.f19882a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        purchasesSliceProvider.currentRecentOrderFetchStatus = bVar;
        this.$context.getContentResolver().notifyChange(this.$sliceUri, (ContentObserver) null);
        return C19394m.f43287a;
    }
}
