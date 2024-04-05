package com.etsy.android.lib.models.apiv3.addresses;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class UserAddress {
    public static final int $stable = 8;
    private final String city;
    private final Integer country_id;
    private final String country_name;
    private final Long create_date;
    private final String first_line;
    private final UserAddressFormat format;
    private final Boolean is_default_shipping;
    private final String name;
    private final String phone;
    private final Long replacement_address_id;
    private final String second_line;
    private final String state;
    private final Long update_date;
    private final Long user_address_id;
    private final Long user_id;
    private final Integer verification_state;
    private final String zip;

    public UserAddress() {
        this((String) null, (Integer) null, (String) null, (Long) null, (String) null, (Boolean) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Integer) null, (String) null, (UserAddressFormat) null, 131071, (DefaultConstructorMarker) null);
    }

    public UserAddress(String str, Integer num, String str2, Long l, String str3, Boolean bool, String str4, String str5, Long l2, String str6, String str7, Long l3, Long l4, Long l5, Integer num2, String str8, UserAddressFormat userAddressFormat) {
        this.city = str;
        this.country_id = num;
        this.country_name = str2;
        this.create_date = l;
        this.first_line = str3;
        this.is_default_shipping = bool;
        this.name = str4;
        this.phone = str5;
        this.replacement_address_id = l2;
        this.second_line = str6;
        this.state = str7;
        this.update_date = l3;
        this.user_address_id = l4;
        this.user_id = l5;
        this.verification_state = num2;
        this.zip = str8;
        this.format = userAddressFormat;
    }

    public static /* synthetic */ UserAddress copy$default(UserAddress userAddress, String str, Integer num, String str2, Long l, String str3, Boolean bool, String str4, String str5, Long l2, String str6, String str7, Long l3, Long l4, Long l5, Integer num2, String str8, UserAddressFormat userAddressFormat, int i, Object obj) {
        UserAddress userAddress2 = userAddress;
        int i2 = i;
        return userAddress.copy((i2 & 1) != 0 ? userAddress2.city : str, (i2 & 2) != 0 ? userAddress2.country_id : num, (i2 & 4) != 0 ? userAddress2.country_name : str2, (i2 & 8) != 0 ? userAddress2.create_date : l, (i2 & 16) != 0 ? userAddress2.first_line : str3, (i2 & 32) != 0 ? userAddress2.is_default_shipping : bool, (i2 & 64) != 0 ? userAddress2.name : str4, (i2 & 128) != 0 ? userAddress2.phone : str5, (i2 & 256) != 0 ? userAddress2.replacement_address_id : l2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? userAddress2.second_line : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? userAddress2.state : str7, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? userAddress2.update_date : l3, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? userAddress2.user_address_id : l4, (i2 & 8192) != 0 ? userAddress2.user_id : l5, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? userAddress2.verification_state : num2, (i2 & 32768) != 0 ? userAddress2.zip : str8, (i2 & 65536) != 0 ? userAddress2.format : userAddressFormat);
    }

    public final String component1() {
        return this.city;
    }

    public final String component10() {
        return this.second_line;
    }

    public final String component11() {
        return this.state;
    }

    public final Long component12() {
        return this.update_date;
    }

    public final Long component13() {
        return this.user_address_id;
    }

    public final Long component14() {
        return this.user_id;
    }

    public final Integer component15() {
        return this.verification_state;
    }

    public final String component16() {
        return this.zip;
    }

    public final UserAddressFormat component17() {
        return this.format;
    }

    public final Integer component2() {
        return this.country_id;
    }

    public final String component3() {
        return this.country_name;
    }

    public final Long component4() {
        return this.create_date;
    }

    public final String component5() {
        return this.first_line;
    }

    public final Boolean component6() {
        return this.is_default_shipping;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.phone;
    }

    public final Long component9() {
        return this.replacement_address_id;
    }

    public final UserAddress copy(String str, Integer num, String str2, Long l, String str3, Boolean bool, String str4, String str5, Long l2, String str6, String str7, Long l3, Long l4, Long l5, Integer num2, String str8, UserAddressFormat userAddressFormat) {
        return new UserAddress(str, num, str2, l, str3, bool, str4, str5, l2, str6, str7, l3, l4, l5, num2, str8, userAddressFormat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddress)) {
            return false;
        }
        UserAddress userAddress = (UserAddress) obj;
        return C19383o.m32792b(this.city, userAddress.city) && C19383o.m32792b(this.country_id, userAddress.country_id) && C19383o.m32792b(this.country_name, userAddress.country_name) && C19383o.m32792b(this.create_date, userAddress.create_date) && C19383o.m32792b(this.first_line, userAddress.first_line) && C19383o.m32792b(this.is_default_shipping, userAddress.is_default_shipping) && C19383o.m32792b(this.name, userAddress.name) && C19383o.m32792b(this.phone, userAddress.phone) && C19383o.m32792b(this.replacement_address_id, userAddress.replacement_address_id) && C19383o.m32792b(this.second_line, userAddress.second_line) && C19383o.m32792b(this.state, userAddress.state) && C19383o.m32792b(this.update_date, userAddress.update_date) && C19383o.m32792b(this.user_address_id, userAddress.user_address_id) && C19383o.m32792b(this.user_id, userAddress.user_id) && C19383o.m32792b(this.verification_state, userAddress.verification_state) && C19383o.m32792b(this.zip, userAddress.zip) && C19383o.m32792b(this.format, userAddress.format);
    }

    public final String getCity() {
        return this.city;
    }

    public final Integer getCountry_id() {
        return this.country_id;
    }

    public final String getCountry_name() {
        return this.country_name;
    }

    public final Long getCreate_date() {
        return this.create_date;
    }

    public final String getFirst_line() {
        return this.first_line;
    }

    public final UserAddressFormat getFormat() {
        return this.format;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Long getReplacement_address_id() {
        return this.replacement_address_id;
    }

    public final String getSecond_line() {
        return this.second_line;
    }

    public final String getState() {
        return this.state;
    }

    public final Long getUpdate_date() {
        return this.update_date;
    }

    public final Long getUser_address_id() {
        return this.user_address_id;
    }

    public final Long getUser_id() {
        return this.user_id;
    }

    public final Integer getVerification_state() {
        return this.verification_state;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        String str = this.city;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.country_id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.country_name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.create_date;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.first_line;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.is_default_shipping;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.name;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phone;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.replacement_address_id;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str6 = this.second_line;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l3 = this.update_date;
        int hashCode12 = (hashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.user_address_id;
        int hashCode13 = (hashCode12 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.user_id;
        int hashCode14 = (hashCode13 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num2 = this.verification_state;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.zip;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UserAddressFormat userAddressFormat = this.format;
        if (userAddressFormat != null) {
            i = userAddressFormat.hashCode();
        }
        return hashCode16 + i;
    }

    public final Boolean is_default_shipping() {
        return this.is_default_shipping;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("UserAddress(city=");
        h.append(this.city);
        h.append(", country_id=");
        h.append(this.country_id);
        h.append(", country_name=");
        h.append(this.country_name);
        h.append(", create_date=");
        h.append(this.create_date);
        h.append(", first_line=");
        h.append(this.first_line);
        h.append(", is_default_shipping=");
        h.append(this.is_default_shipping);
        h.append(", name=");
        h.append(this.name);
        h.append(", phone=");
        h.append(this.phone);
        h.append(", replacement_address_id=");
        h.append(this.replacement_address_id);
        h.append(", second_line=");
        h.append(this.second_line);
        h.append(", state=");
        h.append(this.state);
        h.append(", update_date=");
        h.append(this.update_date);
        h.append(", user_address_id=");
        h.append(this.user_address_id);
        h.append(", user_id=");
        h.append(this.user_id);
        h.append(", verification_state=");
        h.append(this.verification_state);
        h.append(", zip=");
        h.append(this.zip);
        h.append(", format=");
        h.append(this.format);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserAddress(java.lang.String r19, java.lang.Integer r20, java.lang.String r21, java.lang.Long r22, java.lang.String r23, java.lang.Boolean r24, java.lang.String r25, java.lang.String r26, java.lang.Long r27, java.lang.String r28, java.lang.String r29, java.lang.Long r30, java.lang.Long r31, java.lang.Long r32, java.lang.Integer r33, java.lang.String r34, com.etsy.android.lib.models.apiv3.addresses.UserAddressFormat r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r23
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r24
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r25
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r26
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r27
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r28
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r29
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r30
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r31
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r32
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r33
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r34
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r35
        L_0x0090:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.addresses.UserAddress.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, com.etsy.android.lib.models.apiv3.addresses.UserAddressFormat, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
