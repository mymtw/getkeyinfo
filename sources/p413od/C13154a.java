package p413od;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.listing.p329ui.VariationType;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: od.a */
public final class C13154a {

    /* renamed from: a */
    public final String f28930a;

    /* renamed from: b */
    public final VariationType f28931b;

    /* renamed from: c */
    public final C13155a f28932c;

    /* renamed from: od.a$a */
    public static abstract class C13155a {

        /* renamed from: od.a$a$a */
        public static final class C13156a extends C13155a {

            /* renamed from: a */
            public final List<AppsInventoryUiOption> f28933a;

            /* renamed from: b */
            public final Map<Long, ListingImage> f28934b;

            public C13156a(List<AppsInventoryUiOption> list, Map<Long, ListingImage> map) {
                C19383o.m32797g(list, ResponseConstants.ITEMS);
                this.f28933a = list;
                this.f28934b = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13156a)) {
                    return false;
                }
                C13156a aVar = (C13156a) obj;
                return C19383o.m32792b(this.f28933a, aVar.f28933a) && C19383o.m32792b(this.f28934b, aVar.f28934b);
            }

            public final int hashCode() {
                int hashCode = this.f28933a.hashCode() * 31;
                Map<Long, ListingImage> map = this.f28934b;
                return hashCode + (map == null ? 0 : map.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("InventoryUiOptions(items=");
                h.append(this.f28933a);
                h.append(", listingImageMap=");
                h.append(this.f28934b);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: od.a$a$b */
        public static final class C13157b extends C13155a {

            /* renamed from: a */
            public final List<VariationValue> f28935a;

            public C13157b(List<VariationValue> list) {
                C19383o.m32797g(list, ResponseConstants.ITEMS);
                this.f28935a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13157b) && C19383o.m32792b(this.f28935a, ((C13157b) obj).f28935a);
            }

            public final int hashCode() {
                return this.f28935a.hashCode();
            }

            public final String toString() {
                return C0070b.m186i(C0072d.m201h("ListingOptions(items="), this.f28935a, ')');
            }
        }
    }

    public C13154a(String str, VariationType variationType, C13155a aVar) {
        C19383o.m32797g(str, ResponseConstants.LABEL);
        C19383o.m32797g(variationType, "variationType");
        this.f28930a = str;
        this.f28931b = variationType;
        this.f28932c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13154a)) {
            return false;
        }
        C13154a aVar = (C13154a) obj;
        return C19383o.m32792b(this.f28930a, aVar.f28930a) && this.f28931b == aVar.f28931b && C19383o.m32792b(this.f28932c, aVar.f28932c);
    }

    public final int hashCode() {
        int hashCode = this.f28931b.hashCode();
        return this.f28932c.hashCode() + ((hashCode + (this.f28930a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VariationSelectionBottomSheet(label=");
        h.append(this.f28930a);
        h.append(", variationType=");
        h.append(this.f28931b);
        h.append(", options=");
        h.append(this.f28932c);
        h.append(')');
        return h.toString();
    }
}
