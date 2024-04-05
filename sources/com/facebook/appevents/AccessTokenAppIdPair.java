package com.facebook.appevents;

import com.facebook.AccessToken;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import p365hg.C12869i0;
import p453tf.C13418j;

public final class AccessTokenAppIdPair implements Serializable {
    public static final C12208a Companion = new C12208a();
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    public static final class SerializationProxyV1 implements Serializable {
        public static final C12207a Companion = new C12207a();
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        /* renamed from: com.facebook.appevents.AccessTokenAppIdPair$SerializationProxyV1$a */
        public static final class C12207a {
        }

        public SerializationProxyV1(String str, String str2) {
            C19383o.m32797g(str2, "appId");
            this.accessTokenString = str;
            this.appId = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    /* renamed from: com.facebook.appevents.AccessTokenAppIdPair$a */
    public static final class C12208a {
    }

    public AccessTokenAppIdPair(String str, String str2) {
        C19383o.m32797g(str2, "applicationId");
        this.applicationId = str2;
        this.accessTokenString = C12869i0.m20546B(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        return C12869i0.m20562a(accessTokenAppIdPair.accessTokenString, this.accessTokenString) && C12869i0.m20562a(accessTokenAppIdPair.applicationId, this.applicationId);
    }

    public final String getAccessTokenString() {
        return this.accessTokenString;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        String str = this.accessTokenString;
        return (str != null ? str.hashCode() : 0) ^ this.applicationId.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccessTokenAppIdPair(AccessToken accessToken) {
        this(accessToken.getToken(), C13418j.m21107c());
        C19383o.m32797g(accessToken, UriChallengeConstantKt.ACCESS_TOKEN);
    }
}
