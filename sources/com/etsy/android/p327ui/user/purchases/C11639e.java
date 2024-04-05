package com.etsy.android.p327ui.user.purchases;

import com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt;
import com.etsy.android.p327ui.user.purchases.module.C11667h;
import com.etsy.android.p327ui.user.purchases.reviewcarousel.C11675c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.e */
public abstract class C11639e {

    /* renamed from: com.etsy.android.ui.user.purchases.e$a */
    public static final class C11640a extends C11639e {

        /* renamed from: a */
        public final int f25763a;

        /* renamed from: b */
        public final int f25764b;

        public C11640a(int i, int i2) {
            this.f25763a = i;
            this.f25764b = i2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.e$b */
    public static final class C11641b extends C11639e {

        /* renamed from: a */
        public final C11667h f25765a;

        public C11641b(C11667h hVar) {
            this.f25765a = hVar;
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.e$c */
    public static final class C11642c extends C11639e {

        /* renamed from: a */
        public final PastPurchaseReceipt f25766a;

        public C11642c(PastPurchaseReceipt pastPurchaseReceipt) {
            C19383o.m32797g(pastPurchaseReceipt, "receipt");
            this.f25766a = pastPurchaseReceipt;
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.e$d */
    public static final class C11643d extends C11639e {

        /* renamed from: a */
        public final List<C11675c> f25767a;

        public C11643d(ArrayList arrayList) {
            this.f25767a = arrayList;
        }
    }
}
