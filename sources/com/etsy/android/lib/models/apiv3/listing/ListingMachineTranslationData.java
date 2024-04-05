package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingMachineTranslationData {
    public static final int $stable = 8;
    private final String fromLangCode;
    private final String fromLanguageInSentence;
    private final String fromLanguageStandalone;
    private final Long listingId;
    private final String mode;
    private final Boolean showStyledDisclaimer;
    private final String toLangCode;
    private final String toLanguageInSentence;
    private final String toLanguageStandalone;
    private final ListingMachineTranslationTranslatedFields translated;
    private final ListingMachineTranslationTranslatedFields untranslated;

    public ListingMachineTranslationData() {
        this((String) null, (Long) null, (String) null, (String) null, (ListingMachineTranslationTranslatedFields) null, (ListingMachineTranslationTranslatedFields) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
    }

    public ListingMachineTranslationData(@C17402n(name = "from_lang_code") String str, @C17402n(name = "listing_id") Long l, @C17402n(name = "mode") String str2, @C17402n(name = "to_lang_code") String str3, @C17402n(name = "translated") ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields, @C17402n(name = "untranslated") ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields2, @C17402n(name = "to_language_standalone") String str4, @C17402n(name = "to_language_in_sentence") String str5, @C17402n(name = "from_language_standalone") String str6, @C17402n(name = "from_language_in_sentence") String str7, @C17402n(name = "show_styled_disclaimer") Boolean bool) {
        this.fromLangCode = str;
        this.listingId = l;
        this.mode = str2;
        this.toLangCode = str3;
        this.translated = listingMachineTranslationTranslatedFields;
        this.untranslated = listingMachineTranslationTranslatedFields2;
        this.toLanguageStandalone = str4;
        this.toLanguageInSentence = str5;
        this.fromLanguageStandalone = str6;
        this.fromLanguageInSentence = str7;
        this.showStyledDisclaimer = bool;
    }

    public static /* synthetic */ ListingMachineTranslationData copy$default(ListingMachineTranslationData listingMachineTranslationData, String str, Long l, String str2, String str3, ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields, ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields2, String str4, String str5, String str6, String str7, Boolean bool, int i, Object obj) {
        ListingMachineTranslationData listingMachineTranslationData2 = listingMachineTranslationData;
        int i2 = i;
        return listingMachineTranslationData.copy((i2 & 1) != 0 ? listingMachineTranslationData2.fromLangCode : str, (i2 & 2) != 0 ? listingMachineTranslationData2.listingId : l, (i2 & 4) != 0 ? listingMachineTranslationData2.mode : str2, (i2 & 8) != 0 ? listingMachineTranslationData2.toLangCode : str3, (i2 & 16) != 0 ? listingMachineTranslationData2.translated : listingMachineTranslationTranslatedFields, (i2 & 32) != 0 ? listingMachineTranslationData2.untranslated : listingMachineTranslationTranslatedFields2, (i2 & 64) != 0 ? listingMachineTranslationData2.toLanguageStandalone : str4, (i2 & 128) != 0 ? listingMachineTranslationData2.toLanguageInSentence : str5, (i2 & 256) != 0 ? listingMachineTranslationData2.fromLanguageStandalone : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingMachineTranslationData2.fromLanguageInSentence : str7, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingMachineTranslationData2.showStyledDisclaimer : bool);
    }

    public final String component1() {
        return this.fromLangCode;
    }

    public final String component10() {
        return this.fromLanguageInSentence;
    }

    public final Boolean component11() {
        return this.showStyledDisclaimer;
    }

    public final Long component2() {
        return this.listingId;
    }

    public final String component3() {
        return this.mode;
    }

    public final String component4() {
        return this.toLangCode;
    }

    public final ListingMachineTranslationTranslatedFields component5() {
        return this.translated;
    }

    public final ListingMachineTranslationTranslatedFields component6() {
        return this.untranslated;
    }

    public final String component7() {
        return this.toLanguageStandalone;
    }

    public final String component8() {
        return this.toLanguageInSentence;
    }

    public final String component9() {
        return this.fromLanguageStandalone;
    }

    public final ListingMachineTranslationData copy(@C17402n(name = "from_lang_code") String str, @C17402n(name = "listing_id") Long l, @C17402n(name = "mode") String str2, @C17402n(name = "to_lang_code") String str3, @C17402n(name = "translated") ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields, @C17402n(name = "untranslated") ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields2, @C17402n(name = "to_language_standalone") String str4, @C17402n(name = "to_language_in_sentence") String str5, @C17402n(name = "from_language_standalone") String str6, @C17402n(name = "from_language_in_sentence") String str7, @C17402n(name = "show_styled_disclaimer") Boolean bool) {
        return new ListingMachineTranslationData(str, l, str2, str3, listingMachineTranslationTranslatedFields, listingMachineTranslationTranslatedFields2, str4, str5, str6, str7, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingMachineTranslationData)) {
            return false;
        }
        ListingMachineTranslationData listingMachineTranslationData = (ListingMachineTranslationData) obj;
        return C19383o.m32792b(this.fromLangCode, listingMachineTranslationData.fromLangCode) && C19383o.m32792b(this.listingId, listingMachineTranslationData.listingId) && C19383o.m32792b(this.mode, listingMachineTranslationData.mode) && C19383o.m32792b(this.toLangCode, listingMachineTranslationData.toLangCode) && C19383o.m32792b(this.translated, listingMachineTranslationData.translated) && C19383o.m32792b(this.untranslated, listingMachineTranslationData.untranslated) && C19383o.m32792b(this.toLanguageStandalone, listingMachineTranslationData.toLanguageStandalone) && C19383o.m32792b(this.toLanguageInSentence, listingMachineTranslationData.toLanguageInSentence) && C19383o.m32792b(this.fromLanguageStandalone, listingMachineTranslationData.fromLanguageStandalone) && C19383o.m32792b(this.fromLanguageInSentence, listingMachineTranslationData.fromLanguageInSentence) && C19383o.m32792b(this.showStyledDisclaimer, listingMachineTranslationData.showStyledDisclaimer);
    }

    public final String getFromLangCode() {
        return this.fromLangCode;
    }

    public final String getFromLanguageInSentence() {
        return this.fromLanguageInSentence;
    }

    public final String getFromLanguageStandalone() {
        return this.fromLanguageStandalone;
    }

    public final Long getListingId() {
        return this.listingId;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Boolean getShowStyledDisclaimer() {
        return this.showStyledDisclaimer;
    }

    public final String getToLangCode() {
        return this.toLangCode;
    }

    public final String getToLanguageInSentence() {
        return this.toLanguageInSentence;
    }

    public final String getToLanguageStandalone() {
        return this.toLanguageStandalone;
    }

    public final ListingMachineTranslationTranslatedFields getTranslated() {
        return this.translated;
    }

    public final ListingMachineTranslationTranslatedFields getUntranslated() {
        return this.untranslated;
    }

    public int hashCode() {
        String str = this.fromLangCode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.listingId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.mode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.toLangCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields = this.translated;
        int hashCode5 = (hashCode4 + (listingMachineTranslationTranslatedFields == null ? 0 : listingMachineTranslationTranslatedFields.hashCode())) * 31;
        ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields2 = this.untranslated;
        int hashCode6 = (hashCode5 + (listingMachineTranslationTranslatedFields2 == null ? 0 : listingMachineTranslationTranslatedFields2.hashCode())) * 31;
        String str4 = this.toLanguageStandalone;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.toLanguageInSentence;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fromLanguageStandalone;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fromLanguageInSentence;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.showStyledDisclaimer;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingMachineTranslationData(fromLangCode=");
        h.append(this.fromLangCode);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", mode=");
        h.append(this.mode);
        h.append(", toLangCode=");
        h.append(this.toLangCode);
        h.append(", translated=");
        h.append(this.translated);
        h.append(", untranslated=");
        h.append(this.untranslated);
        h.append(", toLanguageStandalone=");
        h.append(this.toLanguageStandalone);
        h.append(", toLanguageInSentence=");
        h.append(this.toLanguageInSentence);
        h.append(", fromLanguageStandalone=");
        h.append(this.fromLanguageStandalone);
        h.append(", fromLanguageInSentence=");
        h.append(this.fromLanguageInSentence);
        h.append(", showStyledDisclaimer=");
        h.append(this.showStyledDisclaimer);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingMachineTranslationData(java.lang.String r13, java.lang.Long r14, java.lang.String r15, java.lang.String r16, com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r17, com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.Boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields, com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
