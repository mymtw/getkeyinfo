package com.etsy.android.p327ui.favorites.createalist;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListBody */
public final class CreateAListBody {

    /* renamed from: a */
    public final String f21653a;

    /* renamed from: b */
    public final List<Long> f21654b;

    /* renamed from: c */
    public final String f21655c;

    public CreateAListBody(String str, List<Long> list, String str2) {
        this.f21653a = str;
        this.f21654b = list;
        this.f21655c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAListBody)) {
            return false;
        }
        CreateAListBody createAListBody = (CreateAListBody) obj;
        return C19383o.m32792b(this.f21653a, createAListBody.f21653a) && C19383o.m32792b(this.f21654b, createAListBody.f21654b) && C19383o.m32792b(this.f21655c, createAListBody.f21655c);
    }

    public final int hashCode() {
        int hashCode = this.f21653a.hashCode() * 31;
        List<Long> list = this.f21654b;
        return this.f21655c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CreateAListBody(name=");
        h.append(this.f21653a);
        h.append(", listing_ids=");
        h.append(this.f21654b);
        h.append(", privacy_level=");
        return C0391c.m1057c(h, this.f21655c, ')');
    }
}
