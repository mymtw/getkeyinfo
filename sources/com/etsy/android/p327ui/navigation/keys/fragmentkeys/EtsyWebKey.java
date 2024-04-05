package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.EtsyWebKey */
public final class EtsyWebKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EtsyWebKey> CREATOR = new Creator();
    private final String referrer;
    private final Bundle referrerBundle;
    private final String title;
    private final int type;
    private final String url;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.EtsyWebKey$Creator */
    public static final class Creator implements Parcelable.Creator<EtsyWebKey> {
        public final EtsyWebKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new EtsyWebKey(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public final EtsyWebKey[] newArray(int i) {
            return new EtsyWebKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.EtsyWebKey$a */
    public static final class C10700a {

        /* renamed from: d */
        public static final /* synthetic */ C19410j<Object>[] f23596d;

        /* renamed from: a */
        public String f23597a;

        /* renamed from: b */
        public final C19919a f23598b = new C19919a();

        /* renamed from: c */
        public String f23599c;

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C10700a.class, "type", "getType()I", 0);
            C19386q.f43269a.getClass();
            f23596d = new C19410j[]{mutablePropertyReference1Impl};
        }
    }

    public EtsyWebKey(String str, int i, String str2, String str3) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.type = i;
        this.url = str2;
        this.title = str3;
    }

    public static /* synthetic */ EtsyWebKey copy$default(EtsyWebKey etsyWebKey, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = etsyWebKey.getReferrer();
        }
        if ((i2 & 2) != 0) {
            i = etsyWebKey.type;
        }
        if ((i2 & 4) != 0) {
            str2 = etsyWebKey.url;
        }
        if ((i2 & 8) != 0) {
            str3 = etsyWebKey.title;
        }
        return etsyWebKey.copy(str, i, str2, str3);
    }

    public final String component1() {
        return getReferrer();
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.title;
    }

    public final EtsyWebKey copy(String str, int i, String str2, String str3) {
        C19383o.m32797g(str, "referrer");
        return new EtsyWebKey(str, i, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EtsyWebKey)) {
            return false;
        }
        EtsyWebKey etsyWebKey = (EtsyWebKey) obj;
        return C19383o.m32792b(getReferrer(), etsyWebKey.getReferrer()) && this.type == etsyWebKey.type && C19383o.m32792b(this.url, etsyWebKey.url) && C19383o.m32792b(this.title, etsyWebKey.title);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = EtsyWebFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("type", Integer.valueOf(this.type));
        fVar.f28304a.put("title", this.title);
        if (C18263b.m30839d0(this.url)) {
            fVar.f28304a.put("url", this.url);
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.type, getReferrer().hashCode() * 31, 31);
        String str = this.url;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
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
        StringBuilder h = C0072d.m201h("EtsyWebKey(referrer=");
        h.append(getReferrer());
        h.append(", type=");
        h.append(this.type);
        h.append(", url=");
        h.append(this.url);
        h.append(", title=");
        return C0391c.m1057c(h, this.title, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeInt(this.type);
        parcel.writeString(this.url);
        parcel.writeString(this.title);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EtsyWebKey(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
