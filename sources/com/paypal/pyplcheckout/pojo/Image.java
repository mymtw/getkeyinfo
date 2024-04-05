package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Image {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("height")
    private final Integer height;
    @C18417a("url")
    private final Url url;
    @C18417a("width")
    private final Integer width;

    public Image() {
        this((Url) null, (Integer) null, (Integer) null, (Map) null, 15, (DefaultConstructorMarker) null);
    }

    public Image(Url url2, Integer num, Integer num2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.url = url2;
        this.width = num;
        this.height = num2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Image copy$default(Image image, Url url2, Integer num, Integer num2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            url2 = image.url;
        }
        if ((i & 2) != 0) {
            num = image.width;
        }
        if ((i & 4) != 0) {
            num2 = image.height;
        }
        if ((i & 8) != 0) {
            map = image.additionalProperties;
        }
        return image.copy(url2, num, num2, map);
    }

    public final Url component1() {
        return this.url;
    }

    public final Integer component2() {
        return this.width;
    }

    public final Integer component3() {
        return this.height;
    }

    public final Map<String, Object> component4() {
        return this.additionalProperties;
    }

    public final Image copy(Url url2, Integer num, Integer num2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new Image(url2, num, num2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return C19383o.m32792b(this.url, image.url) && C19383o.m32792b(this.width, image.width) && C19383o.m32792b(this.height, image.height) && C19383o.m32792b(this.additionalProperties, image.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Url getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Url url2 = this.url;
        int i = 0;
        int hashCode = (url2 == null ? 0 : url2.hashCode()) * 31;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode2 + i) * 31);
    }

    public String toString() {
        Url url2 = this.url;
        Integer num = this.width;
        Integer num2 = this.height;
        Map<String, Object> map = this.additionalProperties;
        return "Image(url=" + url2 + ", width=" + num + ", height=" + num2 + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Image(Url url2, Integer num, Integer num2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : url2, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? new HashMap() : map);
    }
}
