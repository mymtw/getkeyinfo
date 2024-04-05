package com.etsy.android.p327ui.user.purchases;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.pastpurchase.ModulePlacement;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt;
import com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.user.purchases.b */
public interface C11629b {

    /* renamed from: com.etsy.android.ui.user.purchases.b$a */
    public static final class C11630a implements C11629b {

        /* renamed from: a */
        public final Throwable f25745a;

        /* renamed from: b */
        public final String f25746b;

        /* renamed from: c */
        public final String f25747c;

        public C11630a(String str, String str2, Exception exc) {
            this.f25745a = exc;
            this.f25746b = str;
            this.f25747c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11630a)) {
                return false;
            }
            C11630a aVar = (C11630a) obj;
            return C19383o.m32792b(this.f25745a, aVar.f25745a) && C19383o.m32792b(this.f25746b, aVar.f25746b) && C19383o.m32792b(this.f25747c, aVar.f25747c);
        }

        public final int hashCode() {
            int hashCode = this.f25745a.hashCode() * 31;
            String str = this.f25746b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25747c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f25745a);
            h.append(", errorMessage=");
            h.append(this.f25746b);
            h.append(", carouselErrorMessage=");
            return C0391c.m1057c(h, this.f25747c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.b$b */
    public static final class C11631b implements C11629b {

        /* renamed from: a */
        public final List<PastPurchaseReceipt> f25748a;

        /* renamed from: b */
        public final int f25749b;

        /* renamed from: c */
        public final List<ReviewCarouselItem> f25750c;

        /* renamed from: d */
        public final String f25751d;

        /* renamed from: e */
        public final ModulePlacement f25752e;

        public C11631b(List<PastPurchaseReceipt> list, int i, List<ReviewCarouselItem> list2, String str, ModulePlacement modulePlacement) {
            C19383o.m32797g(list, "receipts");
            C19383o.m32797g(list2, "carouselItems");
            this.f25748a = list;
            this.f25749b = i;
            this.f25750c = list2;
            this.f25751d = str;
            this.f25752e = modulePlacement;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11631b)) {
                return false;
            }
            C11631b bVar = (C11631b) obj;
            return C19383o.m32792b(this.f25748a, bVar.f25748a) && this.f25749b == bVar.f25749b && C19383o.m32792b(this.f25750c, bVar.f25750c) && C19383o.m32792b(this.f25751d, bVar.f25751d) && C19383o.m32792b(this.f25752e, bVar.f25752e);
        }

        public final int hashCode() {
            int g = C13983i.m21488g(this.f25750c, C0069a.m170a(this.f25749b, this.f25748a.hashCode() * 31, 31), 31);
            String str = this.f25751d;
            int i = 0;
            int hashCode = (g + (str == null ? 0 : str.hashCode())) * 31;
            ModulePlacement modulePlacement = this.f25752e;
            if (modulePlacement != null) {
                i = modulePlacement.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(receipts=");
            h.append(this.f25748a);
            h.append(", count=");
            h.append(this.f25749b);
            h.append(", carouselItems=");
            h.append(this.f25750c);
            h.append(", carouselErrorMessage=");
            h.append(this.f25751d);
            h.append(", modulePlacement=");
            h.append(this.f25752e);
            h.append(')');
            return h.toString();
        }
    }
}
