package com.etsy.android.config.flags;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.config.flags.p073ui.C6403c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.l */
public abstract class C6383l {

    /* renamed from: com.etsy.android.config.flags.l$a */
    public static final class C6384a extends C6383l {

        /* renamed from: a */
        public final Map<String, C6403c> f14208a;

        /* renamed from: b */
        public final String f14209b;

        /* renamed from: c */
        public final List<C6403c> f14210c;

        public C6384a(String str, Map map) {
            C19383o.m32797g(str, "searchQuery");
            this.f14208a = map;
            this.f14209b = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((C6403c) entry.getValue()).mo18196f()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry value : linkedHashMap.entrySet()) {
                arrayList.add((C6403c) value.getValue());
            }
            this.f14210c = C19327t.m32656l1(arrayList, new C6382k());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6384a)) {
                return false;
            }
            C6384a aVar = (C6384a) obj;
            return C19383o.m32792b(this.f14208a, aVar.f14208a) && C19383o.m32792b(this.f14209b, aVar.f14209b);
        }

        public final int hashCode() {
            return this.f14209b.hashCode() + (this.f14208a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ConfigFlags(configFlags=");
            h.append(this.f14208a);
            h.append(", searchQuery=");
            return C0391c.m1057c(h, this.f14209b, ')');
        }
    }

    /* renamed from: com.etsy.android.config.flags.l$b */
    public static final class C6385b extends C6383l {

        /* renamed from: a */
        public static final C6385b f14211a = new C6385b();
    }

    /* renamed from: com.etsy.android.config.flags.l$c */
    public static final class C6386c extends C6383l {

        /* renamed from: a */
        public static final C6386c f14212a = new C6386c();
    }

    /* renamed from: com.etsy.android.config.flags.l$d */
    public static final class C6387d extends C6383l {

        /* renamed from: a */
        public static final C6387d f14213a = new C6387d();
    }
}
