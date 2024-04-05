package com.etsy.android.lib.models.apiv3.addresses;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class UserAddressFormat implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserAddressFormat> CREATOR = new Creator();
    private final String country;
    private final String error;
    private String format;
    private final String inputFormat;
    private String localInputFormat;
    private final List<String> requiredFields;
    private List<String> uppercaseFields;

    public static final class Creator implements Parcelable.Creator<UserAddressFormat> {
        public final UserAddressFormat createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new UserAddressFormat(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final UserAddressFormat[] newArray(int i) {
            return new UserAddressFormat[i];
        }
    }

    public UserAddressFormat(@C17402n(name = "uppercase_fields") List<String> list, @C17402n(name = "required_fields") List<String> list2, String str, @C17402n(name = "input_format") String str2, String str3, @C17402n(name = "local_input_format") String str4, String str5) {
        this.uppercaseFields = list;
        this.requiredFields = list2;
        this.country = str;
        this.inputFormat = str2;
        this.format = str3;
        this.localInputFormat = str4;
        this.error = str5;
    }

    public static /* synthetic */ UserAddressFormat copy$default(UserAddressFormat userAddressFormat, List<String> list, List<String> list2, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userAddressFormat.uppercaseFields;
        }
        if ((i & 2) != 0) {
            list2 = userAddressFormat.requiredFields;
        }
        List<String> list3 = list2;
        if ((i & 4) != 0) {
            str = userAddressFormat.country;
        }
        String str6 = str;
        if ((i & 8) != 0) {
            str2 = userAddressFormat.inputFormat;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            str3 = userAddressFormat.format;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            str4 = userAddressFormat.localInputFormat;
        }
        String str9 = str4;
        if ((i & 64) != 0) {
            str5 = userAddressFormat.error;
        }
        return userAddressFormat.copy(list, list3, str6, str7, str8, str9, str5);
    }

    public final List<String> component1() {
        return this.uppercaseFields;
    }

    public final List<String> component2() {
        return this.requiredFields;
    }

    public final String component3() {
        return this.country;
    }

    public final String component4() {
        return this.inputFormat;
    }

    public final String component5() {
        return this.format;
    }

    public final String component6() {
        return this.localInputFormat;
    }

    public final String component7() {
        return this.error;
    }

    public final UserAddressFormat copy(@C17402n(name = "uppercase_fields") List<String> list, @C17402n(name = "required_fields") List<String> list2, String str, @C17402n(name = "input_format") String str2, String str3, @C17402n(name = "local_input_format") String str4, String str5) {
        return new UserAddressFormat(list, list2, str, str2, str3, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddressFormat)) {
            return false;
        }
        UserAddressFormat userAddressFormat = (UserAddressFormat) obj;
        return C19383o.m32792b(this.uppercaseFields, userAddressFormat.uppercaseFields) && C19383o.m32792b(this.requiredFields, userAddressFormat.requiredFields) && C19383o.m32792b(this.country, userAddressFormat.country) && C19383o.m32792b(this.inputFormat, userAddressFormat.inputFormat) && C19383o.m32792b(this.format, userAddressFormat.format) && C19383o.m32792b(this.localInputFormat, userAddressFormat.localInputFormat) && C19383o.m32792b(this.error, userAddressFormat.error);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getError() {
        return this.error;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getInputFormat() {
        return this.inputFormat;
    }

    public final String getLocalInputFormat() {
        return this.localInputFormat;
    }

    public final List<String> getRequiredFields() {
        return this.requiredFields;
    }

    public final List<String> getUppercaseFields() {
        return this.uppercaseFields;
    }

    public int hashCode() {
        List<String> list = this.uppercaseFields;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.requiredFields;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.country;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inputFormat;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.format;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.localInputFormat;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.error;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setLocalInputFormat(String str) {
        this.localInputFormat = str;
    }

    public final void setUppercaseFields(List<String> list) {
        this.uppercaseFields = list;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("UserAddressFormat(uppercaseFields=");
        h.append(this.uppercaseFields);
        h.append(", requiredFields=");
        h.append(this.requiredFields);
        h.append(", country=");
        h.append(this.country);
        h.append(", inputFormat=");
        h.append(this.inputFormat);
        h.append(", format=");
        h.append(this.format);
        h.append(", localInputFormat=");
        h.append(this.localInputFormat);
        h.append(", error=");
        return C0391c.m1057c(h, this.error, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeStringList(this.uppercaseFields);
        parcel.writeStringList(this.requiredFields);
        parcel.writeString(this.country);
        parcel.writeString(this.inputFormat);
        parcel.writeString(this.format);
        parcel.writeString(this.localInputFormat);
        parcel.writeString(this.error);
    }
}
