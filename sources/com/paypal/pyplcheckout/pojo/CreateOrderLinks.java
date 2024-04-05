package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p650pn.C18417a;

public final class CreateOrderLinks {
    @C18417a("href")
    private final String href;
    @C18417a("method")
    private final String method;
    @C18417a("rel")
    private final String rel;

    public CreateOrderLinks(String str, String str2, String str3) {
        C0048b.m167f(str, "href", str2, "rel", str3, ResponseConstants.METHOD);
        this.href = str;
        this.rel = str2;
        this.method = str3;
    }

    public static /* synthetic */ CreateOrderLinks copy$default(CreateOrderLinks createOrderLinks, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createOrderLinks.href;
        }
        if ((i & 2) != 0) {
            str2 = createOrderLinks.rel;
        }
        if ((i & 4) != 0) {
            str3 = createOrderLinks.method;
        }
        return createOrderLinks.copy(str, str2, str3);
    }

    public final String component1() {
        return this.href;
    }

    public final String component2() {
        return this.rel;
    }

    public final String component3() {
        return this.method;
    }

    public final CreateOrderLinks copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "href");
        C19383o.m32797g(str2, "rel");
        C19383o.m32797g(str3, ResponseConstants.METHOD);
        return new CreateOrderLinks(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderLinks)) {
            return false;
        }
        CreateOrderLinks createOrderLinks = (CreateOrderLinks) obj;
        return C19383o.m32792b(this.href, createOrderLinks.href) && C19383o.m32792b(this.rel, createOrderLinks.rel) && C19383o.m32792b(this.method, createOrderLinks.method);
    }

    public final String getHref() {
        return this.href;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getRel() {
        return this.rel;
    }

    public int hashCode() {
        return this.method.hashCode() + C0023f.m105e(this.rel, this.href.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.href;
        String str2 = this.rel;
        return C0023f.m110k(C0388a.m1050f("CreateOrderLinks(href=", str, ", rel=", str2, ", method="), this.method, ")");
    }
}
