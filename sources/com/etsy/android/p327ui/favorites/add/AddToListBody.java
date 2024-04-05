package com.etsy.android.p327ui.favorites.add;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.favorites.add.AddToListBody */
public final class AddToListBody {

    /* renamed from: a */
    public final String f21548a;

    /* renamed from: b */
    public final List<Long> f21549b;

    /* renamed from: c */
    public final String f21550c;

    public AddToListBody(String str, List<Long> list, String str2) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, ResponseConstants.PRIVACY_LEVEL);
        this.f21548a = str;
        this.f21549b = list;
        this.f21550c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToListBody)) {
            return false;
        }
        AddToListBody addToListBody = (AddToListBody) obj;
        return C19383o.m32792b(this.f21548a, addToListBody.f21548a) && C19383o.m32792b(this.f21549b, addToListBody.f21549b) && C19383o.m32792b(this.f21550c, addToListBody.f21550c);
    }

    public final int hashCode() {
        int hashCode = this.f21548a.hashCode() * 31;
        List<Long> list = this.f21549b;
        return this.f21550c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AddToListBody(name=");
        h.append(this.f21548a);
        h.append(", listing_ids=");
        h.append(this.f21549b);
        h.append(", privacy_level=");
        return C0391c.m1057c(h, this.f21550c, ')');
    }
}
