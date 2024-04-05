package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.user.circles.CirclesTabContainerFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import p003a2.C0023f;
import p343ee.C12693a;
import p343ee.C12695c;
import p363he.C12822e;
import p363he.C12824f;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CirclesTabContainerKey */
public final class CirclesTabContainerKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CirclesTabContainerKey> CREATOR = new Creator();
    private final String displayName;
    private final String referrer;
    private final int type;
    private final EtsyId userId;
    private final String username;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CirclesTabContainerKey$Creator */
    public static final class Creator implements Parcelable.Creator<CirclesTabContainerKey> {
        public final CirclesTabContainerKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new CirclesTabContainerKey(parcel.readString(), (EtsyId) parcel.readSerializable(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        public final CirclesTabContainerKey[] newArray(int i) {
            return new CirclesTabContainerKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.CirclesTabContainerKey$a */
    public static final class C10697a {

        /* renamed from: f */
        public static final /* synthetic */ C19410j<Object>[] f23590f;

        /* renamed from: a */
        public String f23591a;

        /* renamed from: b */
        public EtsyId f23592b;

        /* renamed from: c */
        public String f23593c;

        /* renamed from: d */
        public String f23594d;

        /* renamed from: e */
        public final C19919a f23595e = new C19919a();

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C10697a.class, "type", "getType()I", 0);
            C19386q.f43269a.getClass();
            f23590f = new C19410j[]{mutablePropertyReference1Impl};
        }

        /* renamed from: a */
        public final CirclesTabContainerKey mo34677a() {
            String str = this.f23591a;
            if (str != null) {
                EtsyId etsyId = this.f23592b;
                if (etsyId != null) {
                    String str2 = this.f23593c;
                    if (str2 != null) {
                        int intValue = ((Number) this.f23595e.getValue(this, f23590f[0])).intValue();
                        String str3 = this.f23594d;
                        if (str3 != null) {
                            return new CirclesTabContainerKey(str, etsyId, str2, intValue, str3);
                        }
                        C19383o.m32805o(ResponseConstants.DISPLAY_NAME_CAMELCASE);
                        throw null;
                    }
                    C19383o.m32805o(ResponseConstants.USERNAME);
                    throw null;
                }
                C19383o.m32805o("userId");
                throw null;
            }
            C19383o.m32805o("referrer");
            throw null;
        }
    }

    public CirclesTabContainerKey(String str, EtsyId etsyId, String str2, int i, String str3) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(etsyId, "userId");
        C19383o.m32797g(str2, ResponseConstants.USERNAME);
        C19383o.m32797g(str3, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        this.referrer = str;
        this.userId = etsyId;
        this.username = str2;
        this.type = i;
        this.displayName = str3;
    }

    public static /* synthetic */ CirclesTabContainerKey copy$default(CirclesTabContainerKey circlesTabContainerKey, String str, EtsyId etsyId, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = circlesTabContainerKey.getReferrer();
        }
        if ((i2 & 2) != 0) {
            etsyId = circlesTabContainerKey.userId;
        }
        EtsyId etsyId2 = etsyId;
        if ((i2 & 4) != 0) {
            str2 = circlesTabContainerKey.username;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            i = circlesTabContainerKey.type;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = circlesTabContainerKey.displayName;
        }
        return circlesTabContainerKey.copy(str, etsyId2, str4, i3, str3);
    }

    public final String component1() {
        return getReferrer();
    }

    public final EtsyId component2() {
        return this.userId;
    }

    public final String component3() {
        return this.username;
    }

    public final int component4() {
        return this.type;
    }

    public final String component5() {
        return this.displayName;
    }

    public final CirclesTabContainerKey copy(String str, EtsyId etsyId, String str2, int i, String str3) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(etsyId, "userId");
        C19383o.m32797g(str2, ResponseConstants.USERNAME);
        C19383o.m32797g(str3, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        return new CirclesTabContainerKey(str, etsyId, str2, i, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CirclesTabContainerKey)) {
            return false;
        }
        CirclesTabContainerKey circlesTabContainerKey = (CirclesTabContainerKey) obj;
        return C19383o.m32792b(getReferrer(), circlesTabContainerKey.getReferrer()) && C19383o.m32792b(this.userId, circlesTabContainerKey.userId) && C19383o.m32792b(this.username, circlesTabContainerKey.username) && this.type == circlesTabContainerKey.type && C19383o.m32792b(this.displayName, circlesTabContainerKey.displayName);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C12695c(false);
    }

    public String getClazzName() {
        String canonicalName = CirclesTabContainerFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("user_id", Long.valueOf(this.userId.getIdAsLong()));
        fVar.f28304a.put(ResponseConstants.USERNAME, this.username);
        fVar.f28304a.put("type", Integer.valueOf(this.type));
        fVar.f28304a.put("DISPLAY_NAME", this.displayName);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public final int getType() {
        return this.type;
    }

    public final EtsyId getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = this.userId.hashCode();
        return this.displayName.hashCode() + C0069a.m170a(this.type, C0023f.m105e(this.username, (hashCode + (getReferrer().hashCode() * 31)) * 31, 31), 31);
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CirclesTabContainerKey(referrer=");
        h.append(getReferrer());
        h.append(", userId=");
        h.append(this.userId);
        h.append(", username=");
        h.append(this.username);
        h.append(", type=");
        h.append(this.type);
        h.append(", displayName=");
        return C0391c.m1057c(h, this.displayName, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.userId);
        parcel.writeString(this.username);
        parcel.writeInt(this.type);
        parcel.writeString(this.displayName);
    }
}
