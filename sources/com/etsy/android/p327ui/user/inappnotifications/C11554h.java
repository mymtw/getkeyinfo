package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationType;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.h */
public final class C11554h {

    /* renamed from: a */
    public final C11587z f25589a;

    /* renamed from: b */
    public List<InAppNotification> f25590b;

    /* renamed from: com.etsy.android.ui.user.inappnotifications.h$a */
    public /* synthetic */ class C11555a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25591a;

        static {
            int[] iArr = new int[InAppNotificationType.values().length];
            iArr[InAppNotificationType.RECOMMENDED_SHOPS_STANDARD.ordinal()] = 1;
            iArr[InAppNotificationType.RECOMMENDED_SHOPS_HIGHLIGHTED.ordinal()] = 2;
            iArr[InAppNotificationType.RFC.ordinal()] = 3;
            iArr[InAppNotificationType.ABANDONED_CART_OFFER.ordinal()] = 4;
            iArr[InAppNotificationType.YFNOS.ordinal()] = 5;
            iArr[InAppNotificationType.NFYFS.ordinal()] = 6;
            iArr[InAppNotificationType.SHOPSALE.ordinal()] = 7;
            iArr[InAppNotificationType.CLOS.ordinal()] = 8;
            iArr[InAppNotificationType.FBIS.ordinal()] = 9;
            iArr[InAppNotificationType.COLLECTION_RECS.ordinal()] = 10;
            iArr[InAppNotificationType.ONE_FAVORITE_LEFT.ordinal()] = 11;
            iArr[InAppNotificationType.FIRST.ordinal()] = 12;
            iArr[InAppNotificationType.UNKNOWN.ordinal()] = 13;
            iArr[InAppNotificationType.FAVORITE_SHOPS_PROMO.ordinal()] = 14;
            iArr[InAppNotificationType.SYNTHETIC_FOOTER.ordinal()] = 15;
            iArr[InAppNotificationType.SYNTHETIC_HEADER.ordinal()] = 16;
            iArr[InAppNotificationType.THANK_YOU_COUPON.ordinal()] = 17;
            iArr[InAppNotificationType.THANK_YOU_COUPON_REMINDER.ordinal()] = 18;
            f25591a = iArr;
        }
    }

    public C11554h(C11587z zVar) {
        C19383o.m32797g(zVar, "endpoint");
        this.f25589a = zVar;
    }
}
