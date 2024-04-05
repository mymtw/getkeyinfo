package com.etsy.android.p327ui.cart;

import com.etsy.android.lib.core.HttpMethod;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.apiv3.moshi.MoshiJsonMapConverter;
import com.etsy.android.lib.push.registration.C8834g;
import com.squareup.moshi.C17414y;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p409o9.C13138q;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.cart.x */
public final class C9420x {

    /* renamed from: a */
    public final MoshiJsonMapConverter f20897a;

    /* renamed from: b */
    public final C9421y f20898b;

    /* renamed from: c */
    public final C13138q f20899c;

    /* renamed from: d */
    public final C17414y f20900d;

    public C9420x(MoshiJsonMapConverter moshiJsonMapConverter, C9421y yVar, C13138q qVar, C17414y yVar2) {
        C19383o.m32797g(moshiJsonMapConverter, "moshiJsonMapConverter");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(yVar2, "moshi");
        this.f20897a = moshiJsonMapConverter;
        this.f20898b = yVar;
        this.f20899c = qVar;
        this.f20900d = yVar2;
    }

    /* renamed from: a */
    public static LinkedHashMap m17774a(EtsyAssociativeArray etsyAssociativeArray) {
        HashMap<String, Object> map;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(etsyAssociativeArray == null || (map = etsyAssociativeArray.getMap()) == null)) {
            for (Map.Entry next : map.entrySet()) {
                Object key = next.getKey();
                C19383o.m32796f(key, "it.key");
                if (next.getValue() instanceof EtsyAssociativeArray) {
                    Object value = next.getValue();
                    C19383o.m32795e(value, "null cannot be cast to non-null type com.etsy.android.lib.models.EtsyAssociativeArray");
                    obj = m17774a((EtsyAssociativeArray) value);
                } else {
                    obj = next.getValue();
                }
                C19383o.m32796f(obj, "if (it.value is EtsyAsso…   it.value\n            }");
                linkedHashMap.put(key, obj);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public final C19208j mo31850b(C9334s sVar) {
        C8071s<C20145v<C19928a0>> sVar2;
        C19383o.m32797g(sVar, "specs");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!sVar.f20609c) {
            linkedHashMap.put("guest_id", this.f20899c.f28895a);
        }
        linkedHashMap.putAll(m17774a(sVar.f20610d));
        if (sVar.f20608b) {
            linkedHashMap.put("supports_google_pay", "true");
        }
        linkedHashMap.put("remove_payment_methods", "true");
        linkedHashMap.put("remove_shipping_options", "true");
        linkedHashMap.put("cart_info_hierarchy_updates", "true");
        if (C19383o.m32792b(sVar.f20611e, HttpMethod.POST.name())) {
            sVar2 = this.f20898b.mo31851a(sVar.f20607a, linkedHashMap, this.f20897a.toJsonBody(linkedHashMap));
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
            }
            sVar2 = this.f20898b.mo31853c(sVar.f20607a, linkedHashMap2);
        }
        C8834g gVar = new C8834g(this, 4);
        sVar2.getClass();
        return new C19208j(sVar2, gVar);
    }
}
