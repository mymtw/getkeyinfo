package com.etsy.android.lib.models.apiv3.vespa;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p010a9.C0048b;

public final class ServerDrivenActionParcelable implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ServerDrivenActionParcelable> CREATOR = new Creator();
    private boolean authNeeded;
    private String deepLink;
    private boolean fromSignIn;
    private String icon;
    private final EtsyAssociativeArray params;
    private String path;
    private boolean refreshNeeded;
    private String requestMethod;

    public static final class Creator implements Parcelable.Creator<ServerDrivenActionParcelable> {
        public final ServerDrivenActionParcelable createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ServerDrivenActionParcelable(parcel.readString(), parcel.readString(), (EtsyAssociativeArray) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final ServerDrivenActionParcelable[] newArray(int i) {
            return new ServerDrivenActionParcelable[i];
        }
    }

    public ServerDrivenActionParcelable() {
        this((String) null, (String) null, (EtsyAssociativeArray) null, false, false, (String) null, (String) null, false, 255, (DefaultConstructorMarker) null);
    }

    public ServerDrivenActionParcelable(String str, String str2, EtsyAssociativeArray etsyAssociativeArray, boolean z, boolean z2, String str3, String str4, boolean z3) {
        C0048b.m167f(str, "requestMethod", str3, ResponseConstants.ICON, str4, "deepLink");
        this.requestMethod = str;
        this.path = str2;
        this.params = etsyAssociativeArray;
        this.authNeeded = z;
        this.refreshNeeded = z2;
        this.icon = str3;
        this.deepLink = str4;
        this.fromSignIn = z3;
    }

    public static /* synthetic */ ServerDrivenActionParcelable copy$default(ServerDrivenActionParcelable serverDrivenActionParcelable, String str, String str2, EtsyAssociativeArray etsyAssociativeArray, boolean z, boolean z2, String str3, String str4, boolean z3, int i, Object obj) {
        ServerDrivenActionParcelable serverDrivenActionParcelable2 = serverDrivenActionParcelable;
        int i2 = i;
        return serverDrivenActionParcelable.copy((i2 & 1) != 0 ? serverDrivenActionParcelable2.requestMethod : str, (i2 & 2) != 0 ? serverDrivenActionParcelable2.path : str2, (i2 & 4) != 0 ? serverDrivenActionParcelable2.params : etsyAssociativeArray, (i2 & 8) != 0 ? serverDrivenActionParcelable2.authNeeded : z, (i2 & 16) != 0 ? serverDrivenActionParcelable2.refreshNeeded : z2, (i2 & 32) != 0 ? serverDrivenActionParcelable2.icon : str3, (i2 & 64) != 0 ? serverDrivenActionParcelable2.deepLink : str4, (i2 & 128) != 0 ? serverDrivenActionParcelable2.fromSignIn : z3);
    }

    public final String component1() {
        return this.requestMethod;
    }

    public final String component2() {
        return this.path;
    }

    public final EtsyAssociativeArray component3() {
        return this.params;
    }

    public final boolean component4() {
        return this.authNeeded;
    }

    public final boolean component5() {
        return this.refreshNeeded;
    }

    public final String component6() {
        return this.icon;
    }

    public final String component7() {
        return this.deepLink;
    }

    public final boolean component8() {
        return this.fromSignIn;
    }

    public final ServerDrivenActionParcelable copy(String str, String str2, EtsyAssociativeArray etsyAssociativeArray, boolean z, boolean z2, String str3, String str4, boolean z3) {
        C19383o.m32797g(str, "requestMethod");
        String str5 = str3;
        C19383o.m32797g(str5, ResponseConstants.ICON);
        String str6 = str4;
        C19383o.m32797g(str6, "deepLink");
        return new ServerDrivenActionParcelable(str, str2, etsyAssociativeArray, z, z2, str5, str6, z3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerDrivenActionParcelable)) {
            return false;
        }
        ServerDrivenActionParcelable serverDrivenActionParcelable = (ServerDrivenActionParcelable) obj;
        return C19383o.m32792b(this.requestMethod, serverDrivenActionParcelable.requestMethod) && C19383o.m32792b(this.path, serverDrivenActionParcelable.path) && C19383o.m32792b(this.params, serverDrivenActionParcelable.params) && this.authNeeded == serverDrivenActionParcelable.authNeeded && this.refreshNeeded == serverDrivenActionParcelable.refreshNeeded && C19383o.m32792b(this.icon, serverDrivenActionParcelable.icon) && C19383o.m32792b(this.deepLink, serverDrivenActionParcelable.deepLink) && this.fromSignIn == serverDrivenActionParcelable.fromSignIn;
    }

    public final boolean getAuthNeeded() {
        return this.authNeeded;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final boolean getFromSignIn() {
        return this.fromSignIn;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final EtsyAssociativeArray getParams() {
        return this.params;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getRefreshNeeded() {
        return this.refreshNeeded;
    }

    public final String getRequestMethod() {
        return this.requestMethod;
    }

    public int hashCode() {
        int hashCode = this.requestMethod.hashCode() * 31;
        String str = this.path;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EtsyAssociativeArray etsyAssociativeArray = this.params;
        if (etsyAssociativeArray != null) {
            i = etsyAssociativeArray.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.authNeeded;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.refreshNeeded;
        if (z3) {
            z3 = true;
        }
        int e = C0023f.m105e(this.deepLink, C0023f.m105e(this.icon, (i3 + (z3 ? 1 : 0)) * 31, 31), 31);
        boolean z4 = this.fromSignIn;
        if (!z4) {
            z2 = z4;
        }
        return e + (z2 ? 1 : 0);
    }

    public final void setAuthNeeded(boolean z) {
        this.authNeeded = z;
    }

    public final void setDeepLink(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.deepLink = str;
    }

    public final void setFromSignIn(boolean z) {
        this.fromSignIn = z;
    }

    public final void setIcon(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.icon = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setRefreshNeeded(boolean z) {
        this.refreshNeeded = z;
    }

    public final void setRequestMethod(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.requestMethod = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ServerDrivenActionParcelable(requestMethod=");
        h.append(this.requestMethod);
        h.append(", path=");
        h.append(this.path);
        h.append(", params=");
        h.append(this.params);
        h.append(", authNeeded=");
        h.append(this.authNeeded);
        h.append(", refreshNeeded=");
        h.append(this.refreshNeeded);
        h.append(", icon=");
        h.append(this.icon);
        h.append(", deepLink=");
        h.append(this.deepLink);
        h.append(", fromSignIn=");
        return C0391c.m1058d(h, this.fromSignIn, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.requestMethod);
        parcel.writeString(this.path);
        parcel.writeSerializable(this.params);
        parcel.writeInt(this.authNeeded ? 1 : 0);
        parcel.writeInt(this.refreshNeeded ? 1 : 0);
        parcel.writeString(this.icon);
        parcel.writeString(this.deepLink);
        parcel.writeInt(this.fromSignIn ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ServerDrivenActionParcelable(java.lang.String r11, java.lang.String r12, com.etsy.android.lib.models.EtsyAssociativeArray r13, boolean r14, boolean r15, java.lang.String r16, java.lang.String r17, boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r11
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            com.etsy.android.lib.models.EtsyAssociativeArray r4 = new com.etsy.android.lib.models.EtsyAssociativeArray
            r4.<init>()
            goto L_0x001d
        L_0x001c:
            r4 = r13
        L_0x001d:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0024
            r5 = r6
            goto L_0x0025
        L_0x0024:
            r5 = r14
        L_0x0025:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002b
            r7 = r6
            goto L_0x002c
        L_0x002b:
            r7 = r15
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r2
            goto L_0x0034
        L_0x0032:
            r8 = r16
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r2 = r17
        L_0x003b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r6 = r18
        L_0x0042:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r7
            r17 = r8
            r18 = r2
            r19 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.vespa.ServerDrivenActionParcelable.<init>(java.lang.String, java.lang.String, com.etsy.android.lib.models.EtsyAssociativeArray, boolean, boolean, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
