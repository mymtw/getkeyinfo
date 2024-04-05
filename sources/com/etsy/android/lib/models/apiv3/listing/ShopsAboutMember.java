package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopsAboutMember {
    public static final int $stable = 8;
    private final String bio;
    private final Image image;
    private final Integer isOwner;
    private final String name;
    private final String role;
    private final Long shopAboutMemberId;

    public ShopsAboutMember(@C17402n(name = "bio") String str, @C17402n(name = "image") Image image2, @C17402n(name = "is_owner") Integer num, @C17402n(name = "name") String str2, @C17402n(name = "role") String str3, @C17402n(name = "shop_about_member_id") Long l) {
        this.bio = str;
        this.image = image2;
        this.isOwner = num;
        this.name = str2;
        this.role = str3;
        this.shopAboutMemberId = l;
    }

    public static /* synthetic */ ShopsAboutMember copy$default(ShopsAboutMember shopsAboutMember, String str, Image image2, Integer num, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopsAboutMember.bio;
        }
        if ((i & 2) != 0) {
            image2 = shopsAboutMember.image;
        }
        Image image3 = image2;
        if ((i & 4) != 0) {
            num = shopsAboutMember.isOwner;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str2 = shopsAboutMember.name;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = shopsAboutMember.role;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            l = shopsAboutMember.shopAboutMemberId;
        }
        return shopsAboutMember.copy(str, image3, num2, str4, str5, l);
    }

    public final String component1() {
        return this.bio;
    }

    public final Image component2() {
        return this.image;
    }

    public final Integer component3() {
        return this.isOwner;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.role;
    }

    public final Long component6() {
        return this.shopAboutMemberId;
    }

    public final ShopsAboutMember copy(@C17402n(name = "bio") String str, @C17402n(name = "image") Image image2, @C17402n(name = "is_owner") Integer num, @C17402n(name = "name") String str2, @C17402n(name = "role") String str3, @C17402n(name = "shop_about_member_id") Long l) {
        return new ShopsAboutMember(str, image2, num, str2, str3, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopsAboutMember)) {
            return false;
        }
        ShopsAboutMember shopsAboutMember = (ShopsAboutMember) obj;
        return C19383o.m32792b(this.bio, shopsAboutMember.bio) && C19383o.m32792b(this.image, shopsAboutMember.image) && C19383o.m32792b(this.isOwner, shopsAboutMember.isOwner) && C19383o.m32792b(this.name, shopsAboutMember.name) && C19383o.m32792b(this.role, shopsAboutMember.role) && C19383o.m32792b(this.shopAboutMemberId, shopsAboutMember.shopAboutMemberId);
    }

    public final String getBio() {
        return this.bio;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRole() {
        return this.role;
    }

    public final Long getShopAboutMemberId() {
        return this.shopAboutMemberId;
    }

    public int hashCode() {
        String str = this.bio;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image2 = this.image;
        int hashCode2 = (hashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.isOwner;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.role;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.shopAboutMemberId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode5 + i;
    }

    public final Integer isOwner() {
        return this.isOwner;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopsAboutMember(bio=");
        h.append(this.bio);
        h.append(", image=");
        h.append(this.image);
        h.append(", isOwner=");
        h.append(this.isOwner);
        h.append(", name=");
        h.append(this.name);
        h.append(", role=");
        h.append(this.role);
        h.append(", shopAboutMemberId=");
        h.append(this.shopAboutMemberId);
        h.append(')');
        return h.toString();
    }
}
