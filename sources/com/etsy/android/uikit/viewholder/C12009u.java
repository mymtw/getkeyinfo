package com.etsy.android.uikit.viewholder;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.ListingVideo;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19211l;

/* renamed from: com.etsy.android.uikit.viewholder.u */
public interface C12009u {

    /* renamed from: com.etsy.android.uikit.viewholder.u$a */
    public static abstract class C12010a {

        /* renamed from: com.etsy.android.uikit.viewholder.u$a$a */
        public static final class C12011a extends C12010a {

            /* renamed from: a */
            public final String f26770a;

            public C12011a(String str) {
                this.f26770a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12011a) && C19383o.m32792b(this.f26770a, ((C12011a) obj).f26770a);
            }

            public final int hashCode() {
                return this.f26770a.hashCode();
            }

            public final String toString() {
                return C0391c.m1057c(C0072d.m201h("Failure(errorMsg="), this.f26770a, ')');
            }
        }

        /* renamed from: com.etsy.android.uikit.viewholder.u$a$b */
        public static final class C12012b extends C12010a {

            /* renamed from: a */
            public final List<ListingImage> f26771a;

            /* renamed from: b */
            public final ListingVideo f26772b;

            public C12012b() {
                throw null;
            }

            public C12012b(List list) {
                this.f26771a = list;
                this.f26772b = null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12012b)) {
                    return false;
                }
                C12012b bVar = (C12012b) obj;
                return C19383o.m32792b(this.f26771a, bVar.f26771a) && C19383o.m32792b(this.f26772b, bVar.f26772b);
            }

            public final int hashCode() {
                int hashCode = this.f26771a.hashCode() * 31;
                ListingVideo listingVideo = this.f26772b;
                return hashCode + (listingVideo == null ? 0 : listingVideo.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Success(images=");
                h.append(this.f26771a);
                h.append(", video=");
                h.append(this.f26772b);
                h.append(')');
                return h.toString();
            }
        }
    }

    /* renamed from: a */
    C19211l mo38889a(long j, long j2);
}
