package com.etsy.android.p327ui.favorites.add;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.CollectionsUpdateResponse;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.add.d0 */
public abstract class C9760d0 {

    /* renamed from: com.etsy.android.ui.favorites.add.d0$a */
    public static final class C9761a extends C9760d0 {

        /* renamed from: a */
        public static final C9761a f21596a = new C9761a();
    }

    /* renamed from: com.etsy.android.ui.favorites.add.d0$b */
    public static final class C9762b extends C9760d0 {

        /* renamed from: a */
        public final CollectionsUpdateResponse f21597a;

        public C9762b(CollectionsUpdateResponse collectionsUpdateResponse) {
            C19383o.m32797g(collectionsUpdateResponse, ResponseConstants.RESPONSE);
            this.f21597a = collectionsUpdateResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9762b) && C19383o.m32792b(this.f21597a, ((C9762b) obj).f21597a);
        }

        public final int hashCode() {
            return this.f21597a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(response=");
            h.append(this.f21597a);
            h.append(')');
            return h.toString();
        }
    }
}
