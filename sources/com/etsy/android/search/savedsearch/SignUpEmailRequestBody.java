package com.etsy.android.search.savedsearch;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class SignUpEmailRequestBody {

    /* renamed from: a */
    public List<String> f19807a;

    /* renamed from: b */
    public boolean f19808b;

    public SignUpEmailRequestBody() {
        this((List) null, false, 3, (DefaultConstructorMarker) null);
    }

    public SignUpEmailRequestBody(@C17402n(name = "campaign_slugs") List<String> list, @C17402n(name = "subscribe") boolean z) {
        C19383o.m32797g(list, "campaignSlugs");
        this.f19807a = list;
        this.f19808b = z;
    }

    public final SignUpEmailRequestBody copy(@C17402n(name = "campaign_slugs") List<String> list, @C17402n(name = "subscribe") boolean z) {
        C19383o.m32797g(list, "campaignSlugs");
        return new SignUpEmailRequestBody(list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpEmailRequestBody)) {
            return false;
        }
        SignUpEmailRequestBody signUpEmailRequestBody = (SignUpEmailRequestBody) obj;
        return C19383o.m32792b(this.f19807a, signUpEmailRequestBody.f19807a) && this.f19808b == signUpEmailRequestBody.f19808b;
    }

    public final int hashCode() {
        int hashCode = this.f19807a.hashCode() * 31;
        boolean z = this.f19808b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SignUpEmailRequestBody(campaignSlugs=");
        h.append(this.f19807a);
        h.append(", subscribe=");
        return C0391c.m1058d(h, this.f19808b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SignUpEmailRequestBody(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? true : z);
    }
}
