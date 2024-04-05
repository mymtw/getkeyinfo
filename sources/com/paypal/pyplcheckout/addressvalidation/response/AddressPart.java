package com.paypal.pyplcheckout.addressvalidation.response;

import android.support.p013v4.media.C0069a;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class AddressPart {
    private final List<AllowedValue> allowedValues;
    private final boolean isRequired;
    private final String label;
    private final int maxLength;
    private final int minLength;
    private final String name;
    private final String regex;

    public AddressPart(String str, String str2, boolean z, String str3, int i, int i2, List<AllowedValue> list) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C19383o.m32797g(str3, "regex");
        C19383o.m32797g(list, "allowedValues");
        this.name = str;
        this.label = str2;
        this.isRequired = z;
        this.regex = str3;
        this.minLength = i;
        this.maxLength = i2;
        this.allowedValues = list;
    }

    public static /* synthetic */ AddressPart copy$default(AddressPart addressPart, String str, String str2, boolean z, String str3, int i, int i2, List<AllowedValue> list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = addressPart.name;
        }
        if ((i3 & 2) != 0) {
            str2 = addressPart.label;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            z = addressPart.isRequired;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            str3 = addressPart.regex;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i = addressPart.minLength;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = addressPart.maxLength;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            list = addressPart.allowedValues;
        }
        return addressPart.copy(str, str4, z2, str5, i4, i5, list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.label;
    }

    public final boolean component3() {
        return this.isRequired;
    }

    public final String component4() {
        return this.regex;
    }

    public final int component5() {
        return this.minLength;
    }

    public final int component6() {
        return this.maxLength;
    }

    public final List<AllowedValue> component7() {
        return this.allowedValues;
    }

    public final AddressPart copy(String str, String str2, boolean z, String str3, int i, int i2, List<AllowedValue> list) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C19383o.m32797g(str3, "regex");
        List<AllowedValue> list2 = list;
        C19383o.m32797g(list2, "allowedValues");
        return new AddressPart(str, str2, z, str3, i, i2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressPart)) {
            return false;
        }
        AddressPart addressPart = (AddressPart) obj;
        return C19383o.m32792b(this.name, addressPart.name) && C19383o.m32792b(this.label, addressPart.label) && this.isRequired == addressPart.isRequired && C19383o.m32792b(this.regex, addressPart.regex) && this.minLength == addressPart.minLength && this.maxLength == addressPart.maxLength && C19383o.m32792b(this.allowedValues, addressPart.allowedValues);
    }

    public final List<AllowedValue> getAllowedValues() {
        return this.allowedValues;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final int getMinLength() {
        return this.minLength;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRegex() {
        return this.regex;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.label, this.name.hashCode() * 31, 31);
        boolean z = this.isRequired;
        if (z) {
            z = true;
        }
        return this.allowedValues.hashCode() + C0069a.m170a(this.maxLength, C0069a.m170a(this.minLength, C0023f.m105e(this.regex, (e + (z ? 1 : 0)) * 31, 31), 31), 31);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.label;
        boolean z = this.isRequired;
        String str3 = this.regex;
        int i = this.minLength;
        int i2 = this.maxLength;
        List<AllowedValue> list = this.allowedValues;
        StringBuilder f = C0388a.m1050f("AddressPart(name=", str, ", label=", str2, ", isRequired=");
        f.append(z);
        f.append(", regex=");
        f.append(str3);
        f.append(", minLength=");
        f.append(i);
        f.append(", maxLength=");
        f.append(i2);
        f.append(", allowedValues=");
        return C0326j.m865j(f, list, ")");
    }
}
