package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingMachineTranslationTranslatedFields {
    public static final int $stable = 8;
    private final String description;
    private final String descriptionPlaintext;
    private final String language;
    private final Long listingId;
    private final List<String> materials;
    private final String promotionDescription;
    private final List<String> tags;
    private final String title;

    public ListingMachineTranslationTranslatedFields() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    public ListingMachineTranslationTranslatedFields(@C17402n(name = "listing_id") Long l, @C17402n(name = "language") String str, @C17402n(name = "title") String str2, @C17402n(name = "description") String str3, @C17402n(name = "description_plaintext") String str4, @C17402n(name = "tags") List<String> list, @C17402n(name = "promotion_description") String str5, @C17402n(name = "materials") List<String> list2) {
        this.listingId = l;
        this.language = str;
        this.title = str2;
        this.description = str3;
        this.descriptionPlaintext = str4;
        this.tags = list;
        this.promotionDescription = str5;
        this.materials = list2;
    }

    public static /* synthetic */ ListingMachineTranslationTranslatedFields copy$default(ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields, Long l, String str, String str2, String str3, String str4, List list, String str5, List list2, int i, Object obj) {
        ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields2 = listingMachineTranslationTranslatedFields;
        int i2 = i;
        return listingMachineTranslationTranslatedFields.copy((i2 & 1) != 0 ? listingMachineTranslationTranslatedFields2.listingId : l, (i2 & 2) != 0 ? listingMachineTranslationTranslatedFields2.language : str, (i2 & 4) != 0 ? listingMachineTranslationTranslatedFields2.title : str2, (i2 & 8) != 0 ? listingMachineTranslationTranslatedFields2.description : str3, (i2 & 16) != 0 ? listingMachineTranslationTranslatedFields2.descriptionPlaintext : str4, (i2 & 32) != 0 ? listingMachineTranslationTranslatedFields2.tags : list, (i2 & 64) != 0 ? listingMachineTranslationTranslatedFields2.promotionDescription : str5, (i2 & 128) != 0 ? listingMachineTranslationTranslatedFields2.materials : list2);
    }

    public final Long component1() {
        return this.listingId;
    }

    public final String component2() {
        return this.language;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.descriptionPlaintext;
    }

    public final List<String> component6() {
        return this.tags;
    }

    public final String component7() {
        return this.promotionDescription;
    }

    public final List<String> component8() {
        return this.materials;
    }

    public final ListingMachineTranslationTranslatedFields copy(@C17402n(name = "listing_id") Long l, @C17402n(name = "language") String str, @C17402n(name = "title") String str2, @C17402n(name = "description") String str3, @C17402n(name = "description_plaintext") String str4, @C17402n(name = "tags") List<String> list, @C17402n(name = "promotion_description") String str5, @C17402n(name = "materials") List<String> list2) {
        return new ListingMachineTranslationTranslatedFields(l, str, str2, str3, str4, list, str5, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingMachineTranslationTranslatedFields)) {
            return false;
        }
        ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields = (ListingMachineTranslationTranslatedFields) obj;
        return C19383o.m32792b(this.listingId, listingMachineTranslationTranslatedFields.listingId) && C19383o.m32792b(this.language, listingMachineTranslationTranslatedFields.language) && C19383o.m32792b(this.title, listingMachineTranslationTranslatedFields.title) && C19383o.m32792b(this.description, listingMachineTranslationTranslatedFields.description) && C19383o.m32792b(this.descriptionPlaintext, listingMachineTranslationTranslatedFields.descriptionPlaintext) && C19383o.m32792b(this.tags, listingMachineTranslationTranslatedFields.tags) && C19383o.m32792b(this.promotionDescription, listingMachineTranslationTranslatedFields.promotionDescription) && C19383o.m32792b(this.materials, listingMachineTranslationTranslatedFields.materials);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionPlaintext() {
        return this.descriptionPlaintext;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Long getListingId() {
        return this.listingId;
    }

    public final List<String> getMaterials() {
        return this.materials;
    }

    public final String getPromotionDescription() {
        return this.promotionDescription;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Long l = this.listingId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.language;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.descriptionPlaintext;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.tags;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.promotionDescription;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list2 = this.materials;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingMachineTranslationTranslatedFields(listingId=");
        h.append(this.listingId);
        h.append(", language=");
        h.append(this.language);
        h.append(", title=");
        h.append(this.title);
        h.append(", description=");
        h.append(this.description);
        h.append(", descriptionPlaintext=");
        h.append(this.descriptionPlaintext);
        h.append(", tags=");
        h.append(this.tags);
        h.append(", promotionDescription=");
        h.append(this.promotionDescription);
        h.append(", materials=");
        return C0070b.m186i(h, this.materials, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingMachineTranslationTranslatedFields(java.lang.Long r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.List r15, java.lang.String r16, java.util.List r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
