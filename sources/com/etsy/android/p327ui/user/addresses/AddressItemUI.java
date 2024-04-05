package com.etsy.android.p327ui.user.addresses;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.addresses.UserAddressFormat;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.addresses.AddressItemUI */
public final class AddressItemUI implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressItemUI> CREATOR = new Creator();
    private final String administrative_area;
    private final int countryId;
    private final String country_name;
    private final String first_line;
    private final UserAddressFormat formattingInfo;
    private final boolean is_default_address;
    private final String locality;
    private final String name;
    private final String phoneNumber;
    private final String postal_code;
    private final String second_line;
    private final Map<String, String> uppercasedPropertiesMap;
    private final long userAddressId;

    /* renamed from: com.etsy.android.ui.user.addresses.AddressItemUI$Creator */
    public static final class Creator implements Parcelable.Creator<AddressItemUI> {
        public final AddressItemUI createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C19383o.m32797g(parcel2, "parcel");
            return new AddressItemUI(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() == 0 ? null : UserAddressFormat.CREATOR.createFromParcel(parcel2));
        }

        public final AddressItemUI[] newArray(int i) {
            return new AddressItemUI[i];
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0145, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016b, code lost:
        r3.put(r4.getFirst(), r4.getSecond());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AddressItemUI(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, boolean r23, long r24, com.etsy.android.lib.models.apiv3.addresses.UserAddressFormat r26) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r26
            java.lang.String r9 = "name"
            kotlin.jvm.internal.C19383o.m32797g(r14, r9)
            java.lang.String r10 = "first_line"
            kotlin.jvm.internal.C19383o.m32797g(r15, r10)
            java.lang.String r11 = "second_line"
            kotlin.jvm.internal.C19383o.m32797g(r3, r11)
            java.lang.String r12 = "locality"
            kotlin.jvm.internal.C19383o.m32797g(r4, r12)
            java.lang.String r12 = "administrative_area"
            kotlin.jvm.internal.C19383o.m32797g(r5, r12)
            java.lang.String r12 = "postal_code"
            kotlin.jvm.internal.C19383o.m32797g(r6, r12)
            java.lang.String r12 = "country_name"
            kotlin.jvm.internal.C19383o.m32797g(r7, r12)
            r13.<init>()
            r0.name = r1
            r0.first_line = r2
            r0.second_line = r3
            r0.locality = r4
            r0.administrative_area = r5
            r0.postal_code = r6
            r0.country_name = r7
            r1 = r21
            r0.countryId = r1
            r1 = r22
            r0.phoneNumber = r1
            r1 = r23
            r0.is_default_address = r1
            r1 = r24
            r0.userAddressId = r1
            r0.formattingInfo = r8
            if (r8 == 0) goto L_0x0178
            java.util.List r1 = r26.getUppercaseFields()
            if (r1 == 0) goto L_0x0178
            int r2 = kotlin.collections.C19322o.m32624F0(r1)
            int r2 = kotlin.reflect.C19421p.m32930T(r2)
            r3 = 16
            if (r2 >= r3) goto L_0x006a
            r2 = r3
        L_0x006a:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0073:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x017c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r2.hashCode()
            java.lang.String r5 = "this as java.lang.String).toUpperCase(locale)"
            java.lang.String r6 = "getDefault()"
            switch(r4) {
                case -161037277: goto L_0x0147;
                case 120609: goto L_0x0127;
                case 3053931: goto L_0x0108;
                case 3373707: goto L_0x00ea;
                case 109757585: goto L_0x00ca;
                case 265211103: goto L_0x00ab;
                case 1481386388: goto L_0x008c;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x0164
        L_0x008c:
            boolean r4 = r2.equals(r12)
            if (r4 != 0) goto L_0x0094
            goto L_0x0164
        L_0x0094:
            java.lang.String r2 = r0.country_name
            java.util.Locale r4 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            java.lang.String r2 = r2.toUpperCase(r4)
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r12, r2)
            goto L_0x016b
        L_0x00ab:
            boolean r4 = r2.equals(r11)
            if (r4 != 0) goto L_0x00b3
            goto L_0x0164
        L_0x00b3:
            java.lang.String r2 = r0.second_line
            java.util.Locale r4 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            java.lang.String r2 = r2.toUpperCase(r4)
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r11, r2)
            goto L_0x016b
        L_0x00ca:
            java.lang.String r4 = "state"
            boolean r7 = r2.equals(r4)
            if (r7 != 0) goto L_0x00d4
            goto L_0x0164
        L_0x00d4:
            java.lang.String r2 = r0.administrative_area
            java.util.Locale r7 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C19383o.m32796f(r7, r6)
            java.lang.String r2 = r2.toUpperCase(r7)
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r4, r2)
            goto L_0x0145
        L_0x00ea:
            boolean r4 = r2.equals(r9)
            if (r4 != 0) goto L_0x00f2
            goto L_0x0164
        L_0x00f2:
            java.lang.String r2 = r0.name
            java.util.Locale r4 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            java.lang.String r2 = r2.toUpperCase(r4)
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r9, r2)
            goto L_0x016b
        L_0x0108:
            java.lang.String r4 = "city"
            boolean r7 = r2.equals(r4)
            if (r7 != 0) goto L_0x0111
            goto L_0x0164
        L_0x0111:
            java.lang.String r2 = r0.locality
            java.util.Locale r7 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C19383o.m32796f(r7, r6)
            java.lang.String r2 = r2.toUpperCase(r7)
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r4, r2)
            goto L_0x0145
        L_0x0127:
            java.lang.String r4 = "zip"
            boolean r7 = r2.equals(r4)
            if (r7 != 0) goto L_0x0130
            goto L_0x0164
        L_0x0130:
            java.lang.String r2 = r0.postal_code
            java.util.Locale r7 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C19383o.m32796f(r7, r6)
            java.lang.String r2 = r2.toUpperCase(r7)
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r4, r2)
        L_0x0145:
            r4 = r5
            goto L_0x016b
        L_0x0147:
            boolean r4 = r2.equals(r10)
            if (r4 != 0) goto L_0x014e
            goto L_0x0164
        L_0x014e:
            java.lang.String r2 = r0.first_line
            java.util.Locale r4 = java.util.Locale.getDefault()
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            java.lang.String r2 = r2.toUpperCase(r4)
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r10, r2)
            goto L_0x016b
        L_0x0164:
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r5 = ""
            r4.<init>(r2, r5)
        L_0x016b:
            java.lang.Object r2 = r4.getFirst()
            java.lang.Object r4 = r4.getSecond()
            r3.put(r2, r4)
            goto L_0x0073
        L_0x0178:
            java.util.Map r3 = kotlin.collections.C19294b0.m32559p0()
        L_0x017c:
            r0.uppercasedPropertiesMap = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.addresses.AddressItemUI.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, long, com.etsy.android.lib.models.apiv3.addresses.UserAddressFormat):void");
    }

    public static /* synthetic */ AddressItemUI copy$default(AddressItemUI addressItemUI, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, long j, UserAddressFormat userAddressFormat, int i2, Object obj) {
        AddressItemUI addressItemUI2 = addressItemUI;
        int i3 = i2;
        return addressItemUI.copy((i3 & 1) != 0 ? addressItemUI2.name : str, (i3 & 2) != 0 ? addressItemUI2.first_line : str2, (i3 & 4) != 0 ? addressItemUI2.second_line : str3, (i3 & 8) != 0 ? addressItemUI2.locality : str4, (i3 & 16) != 0 ? addressItemUI2.administrative_area : str5, (i3 & 32) != 0 ? addressItemUI2.postal_code : str6, (i3 & 64) != 0 ? addressItemUI2.country_name : str7, (i3 & 128) != 0 ? addressItemUI2.countryId : i, (i3 & 256) != 0 ? addressItemUI2.phoneNumber : str8, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? addressItemUI2.is_default_address : z, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? addressItemUI2.userAddressId : j, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? addressItemUI2.formattingInfo : userAddressFormat);
    }

    public static /* synthetic */ void getUppercasedPropertiesMap$annotations() {
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.is_default_address;
    }

    public final long component11() {
        return this.userAddressId;
    }

    public final UserAddressFormat component12() {
        return this.formattingInfo;
    }

    public final String component2() {
        return this.first_line;
    }

    public final String component3() {
        return this.second_line;
    }

    public final String component4() {
        return this.locality;
    }

    public final String component5() {
        return this.administrative_area;
    }

    public final String component6() {
        return this.postal_code;
    }

    public final String component7() {
        return this.country_name;
    }

    public final int component8() {
        return this.countryId;
    }

    public final String component9() {
        return this.phoneNumber;
    }

    public final AddressItemUI copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, long j, UserAddressFormat userAddressFormat) {
        String str9 = str;
        C19383o.m32797g(str9, "name");
        String str10 = str2;
        C19383o.m32797g(str10, ResponseConstants.FIRST_LINE);
        String str11 = str3;
        C19383o.m32797g(str11, ResponseConstants.SECOND_LINE);
        String str12 = str4;
        C19383o.m32797g(str12, "locality");
        String str13 = str5;
        C19383o.m32797g(str13, "administrative_area");
        String str14 = str6;
        C19383o.m32797g(str14, ResponseConstants.POSTAL_CODE);
        String str15 = str7;
        C19383o.m32797g(str15, "country_name");
        return new AddressItemUI(str9, str10, str11, str12, str13, str14, str15, i, str8, z, j, userAddressFormat);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressItemUI)) {
            return false;
        }
        AddressItemUI addressItemUI = (AddressItemUI) obj;
        return C19383o.m32792b(this.name, addressItemUI.name) && C19383o.m32792b(this.first_line, addressItemUI.first_line) && C19383o.m32792b(this.second_line, addressItemUI.second_line) && C19383o.m32792b(this.locality, addressItemUI.locality) && C19383o.m32792b(this.administrative_area, addressItemUI.administrative_area) && C19383o.m32792b(this.postal_code, addressItemUI.postal_code) && C19383o.m32792b(this.country_name, addressItemUI.country_name) && this.countryId == addressItemUI.countryId && C19383o.m32792b(this.phoneNumber, addressItemUI.phoneNumber) && this.is_default_address == addressItemUI.is_default_address && this.userAddressId == addressItemUI.userAddressId && C19383o.m32792b(this.formattingInfo, addressItemUI.formattingInfo);
    }

    public final String getAdministrative_area() {
        return this.administrative_area;
    }

    public final int getCountryId() {
        return this.countryId;
    }

    public final String getCountry_name() {
        return this.country_name;
    }

    public final String getFirst_line() {
        return this.first_line;
    }

    public final UserAddressFormat getFormattingInfo() {
        return this.formattingInfo;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPostal_code() {
        return this.postal_code;
    }

    public final String getSecond_line() {
        return this.second_line;
    }

    public final Map<String, String> getUppercasedPropertiesMap() {
        return this.uppercasedPropertiesMap;
    }

    public final long getUserAddressId() {
        return this.userAddressId;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.countryId, C0023f.m105e(this.country_name, C0023f.m105e(this.postal_code, C0023f.m105e(this.administrative_area, C0023f.m105e(this.locality, C0023f.m105e(this.second_line, C0023f.m105e(this.first_line, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        String str = this.phoneNumber;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.is_default_address;
        if (z) {
            z = true;
        }
        int b = C0071c.m190b(this.userAddressId, (hashCode + (z ? 1 : 0)) * 31, 31);
        UserAddressFormat userAddressFormat = this.formattingInfo;
        if (userAddressFormat != null) {
            i = userAddressFormat.hashCode();
        }
        return b + i;
    }

    public final boolean is_default_address() {
        return this.is_default_address;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AddressItemUI(name=");
        h.append(this.name);
        h.append(", first_line=");
        h.append(this.first_line);
        h.append(", second_line=");
        h.append(this.second_line);
        h.append(", locality=");
        h.append(this.locality);
        h.append(", administrative_area=");
        h.append(this.administrative_area);
        h.append(", postal_code=");
        h.append(this.postal_code);
        h.append(", country_name=");
        h.append(this.country_name);
        h.append(", countryId=");
        h.append(this.countryId);
        h.append(", phoneNumber=");
        h.append(this.phoneNumber);
        h.append(", is_default_address=");
        h.append(this.is_default_address);
        h.append(", userAddressId=");
        h.append(this.userAddressId);
        h.append(", formattingInfo=");
        h.append(this.formattingInfo);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.first_line);
        parcel.writeString(this.second_line);
        parcel.writeString(this.locality);
        parcel.writeString(this.administrative_area);
        parcel.writeString(this.postal_code);
        parcel.writeString(this.country_name);
        parcel.writeInt(this.countryId);
        parcel.writeString(this.phoneNumber);
        parcel.writeInt(this.is_default_address ? 1 : 0);
        parcel.writeLong(this.userAddressId);
        UserAddressFormat userAddressFormat = this.formattingInfo;
        if (userAddressFormat == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        userAddressFormat.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressItemUI(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, long j, UserAddressFormat userAddressFormat, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, i, (i2 & 256) != 0 ? null : str8, z, j, userAddressFormat);
    }
}
