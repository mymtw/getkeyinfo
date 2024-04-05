package com.etsy.android.p327ui.user;

import android.content.Context;
import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.util.C12045h;
import com.etsy.android.util.C12049i;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p248tp.C8071s;
import p425q9.C13265p;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.b */
public final class C11488b {

    /* renamed from: a */
    public final C13265p f25338a;

    /* renamed from: b */
    public final C11358a f25339b;

    /* renamed from: c */
    public final C12049i f25340c;

    /* renamed from: d */
    public final C11786n f25341d;

    /* renamed from: e */
    public final C9323l f25342e;

    public C11488b(C13265p pVar, C11358a aVar, C12049i iVar, C11786n nVar, C9323l lVar) {
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(aVar, "endpoint");
        C19383o.m32797g(iVar, "eventTrack");
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(lVar, "cartRefreshEventManager");
        this.f25338a = pVar;
        this.f25339b = aVar;
        this.f25340c = iVar;
        this.f25341d = nVar;
        this.f25342e = lVar;
    }

    /* renamed from: a */
    public final C8071s<AddToCartResponse> mo37350a(C11490c cVar) {
        this.f25340c.mo38929b(new C12045h.C12046a(this.f25338a.mo45958c().toString()), AddToCartRepository$trackAppsFlyerEvent$1.INSTANCE, AddToCartRepository$trackAppsFlyerEvent$2.INSTANCE);
        this.f25342e.f20595a.onNext(C9315k.C9319d.f20591a);
        if (cVar.f25351c) {
            return this.f25339b.mo37127b(cVar.f25350b, mo37351b(cVar));
        }
        C11358a aVar = this.f25339b;
        String str = cVar.f25353e;
        if (str != null) {
            return aVar.mo37126a(str, cVar.f25350b, mo37351b(cVar));
        }
        throw new IllegalArgumentException("guestId required for addToGuestCart");
    }

    /* renamed from: b */
    public final LinkedHashMap mo37351b(C11490c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("listing_id", cVar.f25349a);
        Context applicationContext = this.f25341d.f26257a.getApplicationContext();
        C19383o.m32796f(applicationContext, "application.applicationContext");
        linkedHashMap.put("is_tablet", String.valueOf(C1948d.m4275g(applicationContext)));
        linkedHashMap.put("include_post_add_to_cart_recs", String.valueOf(cVar.f25357i));
        linkedHashMap.put("include_additional_listing_images", String.valueOf(cVar.f25358j));
        Integer num = cVar.f25352d;
        if (num != null) {
            linkedHashMap.put(ResponseConstants.QUANTITY, num.toString());
        }
        Long l = cVar.f25355g;
        if (l != null) {
            linkedHashMap.put("listing_inventory_id", l.toString());
        } else {
            List<Pair<Variation, VariationValue>> list = cVar.f25356h;
            if (list != null) {
                JSONObject jSONObject = new JSONObject();
                for (Pair pair : list) {
                    VariationValue variationValue = (VariationValue) pair.component2();
                    Long propertyId = ((Variation) pair.component1()).getPropertyId();
                    long j = 0;
                    long longValue = propertyId != null ? propertyId.longValue() : 0;
                    Long valueId = variationValue.getValueId();
                    if (valueId != null) {
                        j = valueId.longValue();
                    }
                    jSONObject.put(String.valueOf(longValue), String.valueOf(j));
                }
                String jSONObject2 = jSONObject.toString();
                C19383o.m32796f(jSONObject2, "selectedValues.toString()");
                linkedHashMap.put(ResponseConstants.SELECTED_VARIATIONS, jSONObject2);
            }
        }
        if (C18263b.m30839d0(cVar.f25354f)) {
            linkedHashMap.put(ResponseConstants.PERSONALIZATION, cVar.f25354f);
        }
        return linkedHashMap;
    }
}
