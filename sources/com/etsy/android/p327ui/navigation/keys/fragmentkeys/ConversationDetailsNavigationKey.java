package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p343ee.C12694b;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey */
public final class ConversationDetailsNavigationKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConversationDetailsNavigationKey> CREATOR = new Creator();
    public static final C10699a Companion = new C10699a();
    public static final String DISPLAY_NAME = "DISPLAY_NAME";
    public static final String MESSAGE = "MESSAGE";
    public static final String REFERRING_LINK = "REFERRING_LINK";
    public static final String USERNAME = "USERNAME";
    private final Long conversationId;
    private final boolean customerCentricMessagingEnabled;
    private final boolean isSignedIn;
    private final String message;
    private final String referrer;
    private final Bundle referrerBundle;
    private final boolean shouldReplaceTop;
    private final String userDisplayName;
    private final Long userId;
    private final String username;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey$Creator */
    public static final class Creator implements Parcelable.Creator<ConversationDetailsNavigationKey> {
        public final ConversationDetailsNavigationKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ConversationDetailsNavigationKey(parcel.readString(), parcel.readBundle(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        public final ConversationDetailsNavigationKey[] newArray(int i) {
            return new ConversationDetailsNavigationKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey$a */
    public static final class C10699a {
    }

    public ConversationDetailsNavigationKey(String str, Bundle bundle, Long l, String str2, String str3, Long l2, boolean z, boolean z2, String str4, boolean z3) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.referrerBundle = bundle;
        this.userId = l;
        this.username = str2;
        this.userDisplayName = str3;
        this.conversationId = l2;
        this.isSignedIn = z;
        this.customerCentricMessagingEnabled = z2;
        this.message = str4;
        this.shouldReplaceTop = z3;
    }

    public int describeContents() {
        return 0;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
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
        if (this.customerCentricMessagingEnabled) {
            String canonicalName = ConversationDetailsFragment.class.getCanonicalName();
            C19383o.m32794d(canonicalName);
            return canonicalName;
        }
        String canonicalName2 = LegacyConversationDetailsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName2);
        return canonicalName2;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final Long getConversationId() {
        return this.conversationId;
    }

    public final boolean getCustomerCentricMessagingEnabled() {
        return this.customerCentricMessagingEnabled;
    }

    public final String getMessage() {
        return this.message;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(REFERRING_LINK, getReferrer());
        fVar.f28304a.put("user_id", this.userId);
        fVar.f28304a.put("DISPLAY_NAME", this.userDisplayName);
        fVar.f28304a.put(USERNAME, this.username);
        fVar.f28304a.put(MESSAGE, this.message);
        fVar.f28304a.put("convo_id", this.conversationId);
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final boolean getShouldReplaceTop() {
        return this.shouldReplaceTop;
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

    public boolean isDialog() {
        return false;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public final boolean isSignedIn() {
        return this.isSignedIn;
    }

    public boolean shouldReplaceTop() {
        return this.shouldReplaceTop;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeBundle(this.referrerBundle);
        Long l = this.userId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        parcel.writeString(this.username);
        parcel.writeString(this.userDisplayName);
        Long l2 = this.conversationId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l2);
        }
        parcel.writeInt(this.isSignedIn ? 1 : 0);
        parcel.writeInt(this.customerCentricMessagingEnabled ? 1 : 0);
        parcel.writeString(this.message);
        parcel.writeInt(this.shouldReplaceTop ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConversationDetailsNavigationKey(java.lang.String r15, android.os.Bundle r16, java.lang.Long r17, java.lang.String r18, java.lang.String r19, java.lang.Long r20, boolean r21, boolean r22, java.lang.String r23, boolean r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r16
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r17
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r18
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r2
            goto L_0x0023
        L_0x0021:
            r8 = r19
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r20
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0032
            r1 = 1
            r10 = r1
            goto L_0x0034
        L_0x0032:
            r10 = r21
        L_0x0034:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003a
            r12 = r2
            goto L_0x003c
        L_0x003a:
            r12 = r23
        L_0x003c:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            r13 = r0
            goto L_0x0045
        L_0x0043:
            r13 = r24
        L_0x0045:
            r3 = r14
            r4 = r15
            r11 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey.<init>(java.lang.String, android.os.Bundle, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, boolean, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
