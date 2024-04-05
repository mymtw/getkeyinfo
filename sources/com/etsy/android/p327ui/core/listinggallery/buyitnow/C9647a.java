package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import kotlin.jvm.internal.C19383o;
import p321cc.C8569c;
import p361hc.C12811c;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.a */
public final class C9647a {

    /* renamed from: a */
    public final C8569c f21366a;

    /* renamed from: b */
    public final C13461f f21367b;

    /* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.a$a */
    public static final class C9648a {

        /* renamed from: a */
        public final AppsInventoryAddToCartContext f21368a;

        public C9648a() {
            this((AppsInventoryAddToCartContext) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9648a) && C19383o.m32792b(this.f21368a, ((C9648a) obj).f21368a);
        }

        public final int hashCode() {
            AppsInventoryAddToCartContext appsInventoryAddToCartContext = this.f21368a;
            if (appsInventoryAddToCartContext == null) {
                return 0;
            }
            return appsInventoryAddToCartContext.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ResolveAppsInventoryAddToCartContextResult(inventoryContext=");
            h.append(this.f21368a);
            h.append(')');
            return h.toString();
        }

        public C9648a(AppsInventoryAddToCartContext appsInventoryAddToCartContext) {
            this.f21368a = appsInventoryAddToCartContext;
        }
    }

    public C9647a(C8569c cVar, C12811c cVar2, C13461f fVar) {
        this.f21366a = cVar;
        this.f21367b = fVar;
    }
}
