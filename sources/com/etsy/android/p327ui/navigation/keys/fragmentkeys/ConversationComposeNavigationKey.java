package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p343ee.C12694b;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey */
public final class ConversationComposeNavigationKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConversationComposeNavigationKey> CREATOR = new Creator();
    public static final C10698a Companion = new C10698a();
    public static final String DISPLAY_NAME = "DISPLAY_NAME";
    public static final String USER_ID = "USER_ID";
    private final boolean customerCentricMessagingEnabled;
    private final boolean isSignedIn;
    private final String message;
    private final String referrer;
    private final Bundle referrerBundle;
    private final String subject;
    private final String userDisplayName;
    private final Long userId;
    private final String username;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<ConversationComposeNavigationKey> {
        public final ConversationComposeNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ConversationComposeNavigationKey(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readBundle());
        }

        public final ConversationComposeNavigationKey[] newArray(int i) {
            return new ConversationComposeNavigationKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey$a */
    public static final class C10698a {
    }

    public ConversationComposeNavigationKey(String str, boolean z, String str2, String str3, Long l, String str4, String str5, boolean z2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.isSignedIn = z;
        this.username = str2;
        this.userDisplayName = str3;
        this.userId = l;
        this.subject = str4;
        this.message = str5;
        this.customerCentricMessagingEnabled = z2;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ ConversationComposeNavigationKey copy$default(ConversationComposeNavigationKey conversationComposeNavigationKey, String str, boolean z, String str2, String str3, Long l, String str4, String str5, boolean z2, Bundle bundle, int i, Object obj) {
        ConversationComposeNavigationKey conversationComposeNavigationKey2 = conversationComposeNavigationKey;
        int i2 = i;
        return conversationComposeNavigationKey.copy((i2 & 1) != 0 ? conversationComposeNavigationKey.getReferrer() : str, (i2 & 2) != 0 ? conversationComposeNavigationKey2.isSignedIn : z, (i2 & 4) != 0 ? conversationComposeNavigationKey2.username : str2, (i2 & 8) != 0 ? conversationComposeNavigationKey2.userDisplayName : str3, (i2 & 16) != 0 ? conversationComposeNavigationKey2.userId : l, (i2 & 32) != 0 ? conversationComposeNavigationKey2.subject : str4, (i2 & 64) != 0 ? conversationComposeNavigationKey2.message : str5, (i2 & 128) != 0 ? conversationComposeNavigationKey2.customerCentricMessagingEnabled : z2, (i2 & 256) != 0 ? conversationComposeNavigationKey.getReferrerBundle() : bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final boolean component2() {
        return this.isSignedIn;
    }

    public final String component3() {
        return this.username;
    }

    public final String component4() {
        return this.userDisplayName;
    }

    public final Long component5() {
        return this.userId;
    }

    public final String component6() {
        return this.subject;
    }

    public final String component7() {
        return this.message;
    }

    public final boolean component8() {
        return this.customerCentricMessagingEnabled;
    }

    public final Bundle component9() {
        return getReferrerBundle();
    }

    public final ConversationComposeNavigationKey copy(String str, boolean z, String str2, String str3, Long l, String str4, String str5, boolean z2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new ConversationComposeNavigationKey(str, z, str2, str3, l, str4, str5, z2, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationComposeNavigationKey)) {
            return false;
        }
        ConversationComposeNavigationKey conversationComposeNavigationKey = (ConversationComposeNavigationKey) obj;
        return C19383o.m32792b(getReferrer(), conversationComposeNavigationKey.getReferrer()) && this.isSignedIn == conversationComposeNavigationKey.isSignedIn && C19383o.m32792b(this.username, conversationComposeNavigationKey.username) && C19383o.m32792b(this.userDisplayName, conversationComposeNavigationKey.userDisplayName) && C19383o.m32792b(this.userId, conversationComposeNavigationKey.userId) && C19383o.m32792b(this.subject, conversationComposeNavigationKey.subject) && C19383o.m32792b(this.message, conversationComposeNavigationKey.message) && this.customerCentricMessagingEnabled == conversationComposeNavigationKey.customerCentricMessagingEnabled && C19383o.m32792b(getReferrerBundle(), conversationComposeNavigationKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.SLIDE_BOTTOM_ONTOP_MULTIBACKSTACK;
    }

    public C12693a getBackstackGenerator() {
        boolean z = this.isSignedIn;
        if (z) {
            return new C12694b(this.customerCentricMessagingEnabled);
        }
        if (!z) {
            return new C0005b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public String getClazzName() {
        String canonicalName = ConversationComposeFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final boolean getCustomerCentricMessagingEnabled() {
        return this.customerCentricMessagingEnabled;
    }

    public final String getMessage() {
        return this.message;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        if (C18263b.m30839d0(this.username)) {
            fVar.f28304a.put(ResponseConstants.USERNAME, this.username);
        }
        Long l = this.userId;
        if (l != null) {
            fVar.f28304a.put("user_id", l);
        }
        if (C18263b.m30839d0(this.subject)) {
            fVar.f28304a.put(ResponseConstants.SUBJECT, this.subject);
        }
        if (C18263b.m30839d0(this.message)) {
            fVar.f28304a.put("message", this.message);
        }
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        String str = this.userDisplayName;
        if (str != null) {
            fVar.f28304a.put("DISPLAY_NAME", str);
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getUserDisplayName() {
        return this.userDisplayName;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        boolean z = this.isSignedIn;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.username;
        int i2 = 0;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userDisplayName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.userId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.subject;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z3 = this.customerCentricMessagingEnabled;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode6 + (z2 ? 1 : 0)) * 31;
        if (getReferrerBundle() != null) {
            i2 = getReferrerBundle().hashCode();
        }
        return i3 + i2;
    }

    public boolean isDialog() {
        return true;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public final boolean isSignedIn() {
        return this.isSignedIn;
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ConversationComposeNavigationKey(referrer=");
        h.append(getReferrer());
        h.append(", isSignedIn=");
        h.append(this.isSignedIn);
        h.append(", username=");
        h.append(this.username);
        h.append(", userDisplayName=");
        h.append(this.userDisplayName);
        h.append(", userId=");
        h.append(this.userId);
        h.append(", subject=");
        h.append(this.subject);
        h.append(", message=");
        h.append(this.message);
        h.append(", customerCentricMessagingEnabled=");
        h.append(this.customerCentricMessagingEnabled);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeInt(this.isSignedIn ? 1 : 0);
        parcel.writeString(this.username);
        parcel.writeString(this.userDisplayName);
        Long l = this.userId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        parcel.writeString(this.subject);
        parcel.writeString(this.message);
        parcel.writeInt(this.customerCentricMessagingEnabled ? 1 : 0);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConversationComposeNavigationKey(java.lang.String r10, boolean r11, java.lang.String r12, java.lang.String r13, java.lang.Long r14, java.lang.String r15, java.lang.String r16, boolean r17, android.os.Bundle r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = r11
        L_0x0009:
            r2 = r0 & 4
            r3 = 0
            if (r2 == 0) goto L_0x0010
            r2 = r3
            goto L_0x0011
        L_0x0010:
            r2 = r12
        L_0x0011:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0017
            r4 = r3
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x001e
            r5 = r3
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0025
            r6 = r3
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002c
            r7 = r3
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0034
            r8 = 0
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = r18
        L_0x003d:
            r11 = r9
            r12 = r10
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, boolean, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
