package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

public final class TestAccountToolResponse {
    public static final int $stable = 0;
    private final String oAuthToken;
    private final String oAuthTokenSecret;

    public TestAccountToolResponse(String str, String str2) {
        this.oAuthToken = str;
        this.oAuthTokenSecret = str2;
    }

    public static /* synthetic */ TestAccountToolResponse copy$default(TestAccountToolResponse testAccountToolResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testAccountToolResponse.oAuthToken;
        }
        if ((i & 2) != 0) {
            str2 = testAccountToolResponse.oAuthTokenSecret;
        }
        return testAccountToolResponse.copy(str, str2);
    }

    public final String component1() {
        return this.oAuthToken;
    }

    public final String component2() {
        return this.oAuthTokenSecret;
    }

    public final TestAccountToolResponse copy(String str, String str2) {
        return new TestAccountToolResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestAccountToolResponse)) {
            return false;
        }
        TestAccountToolResponse testAccountToolResponse = (TestAccountToolResponse) obj;
        return C19383o.m32792b(this.oAuthToken, testAccountToolResponse.oAuthToken) && C19383o.m32792b(this.oAuthTokenSecret, testAccountToolResponse.oAuthTokenSecret);
    }

    public final String getOAuthToken() {
        return this.oAuthToken;
    }

    public final String getOAuthTokenSecret() {
        return this.oAuthTokenSecret;
    }

    public int hashCode() {
        String str = this.oAuthToken;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.oAuthTokenSecret;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TestAccountToolResponse(oAuthToken=");
        h.append(this.oAuthToken);
        h.append(", oAuthTokenSecret=");
        return C0391c.m1057c(h, this.oAuthTokenSecret, ')');
    }
}
