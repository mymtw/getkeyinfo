package com.paypal.pyplcheckout.threeds;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class ValidateResponseAlias implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);
    private final String actionCode;
    private final String errorDescription;
    private final int errorNumber;

    public static final class CREATOR implements Parcelable.Creator<ValidateResponseAlias> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ValidateResponseAlias createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ValidateResponseAlias(parcel);
        }

        public ValidateResponseAlias[] newArray(int i) {
            return new ValidateResponseAlias[i];
        }
    }

    public ValidateResponseAlias(String str, int i, String str2) {
        this.actionCode = str;
        this.errorNumber = i;
        this.errorDescription = str2;
    }

    public static /* synthetic */ ValidateResponseAlias copy$default(ValidateResponseAlias validateResponseAlias, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = validateResponseAlias.actionCode;
        }
        if ((i2 & 2) != 0) {
            i = validateResponseAlias.errorNumber;
        }
        if ((i2 & 4) != 0) {
            str2 = validateResponseAlias.errorDescription;
        }
        return validateResponseAlias.copy(str, i, str2);
    }

    public final String component1() {
        return this.actionCode;
    }

    public final int component2() {
        return this.errorNumber;
    }

    public final String component3() {
        return this.errorDescription;
    }

    public final ValidateResponseAlias copy(String str, int i, String str2) {
        return new ValidateResponseAlias(str, i, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateResponseAlias)) {
            return false;
        }
        ValidateResponseAlias validateResponseAlias = (ValidateResponseAlias) obj;
        return C19383o.m32792b(this.actionCode, validateResponseAlias.actionCode) && this.errorNumber == validateResponseAlias.errorNumber && C19383o.m32792b(this.errorDescription, validateResponseAlias.errorDescription);
    }

    public final String getActionCode() {
        return this.actionCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final int getErrorNumber() {
        return this.errorNumber;
    }

    public int hashCode() {
        String str = this.actionCode;
        int i = 0;
        int a = C0069a.m170a(this.errorNumber, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.errorDescription;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return a + i;
    }

    public String toString() {
        String str = this.actionCode;
        int i = this.errorNumber;
        String str2 = this.errorDescription;
        StringBuilder sb = new StringBuilder();
        sb.append("ValidateResponseAlias(actionCode=");
        sb.append(str);
        sb.append(", errorNumber=");
        sb.append(i);
        sb.append(", errorDescription=");
        return C0023f.m110k(sb, str2, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "parcel");
        parcel.writeString(this.actionCode);
        parcel.writeInt(this.errorNumber);
        parcel.writeString(this.errorDescription);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ValidateResponseAlias(Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readString());
        C19383o.m32797g(parcel, "parcel");
    }
}
