package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import android.support.p013v4.media.C0073e;
import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@Keep
/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaUriData */
public final class CaptchaUriData {
    private final String challengeUri;
    private final String objectType;
    private final String returnUri;
    private final String returnUriParam;

    public CaptchaUriData(String str, String str2, String str3, String str4) {
        C0391c.m1060g(str, UriChallengeConstantKt.CHALLENGE_URI, str2, UriChallengeConstantKt.RETURN_URI, str3, UriChallengeConstantKt.RETURN_URI_PARAMS, str4, "objectType");
        this.challengeUri = str;
        this.returnUri = str2;
        this.returnUriParam = str3;
        this.objectType = str4;
    }

    public static /* synthetic */ CaptchaUriData copy$default(CaptchaUriData captchaUriData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captchaUriData.challengeUri;
        }
        if ((i & 2) != 0) {
            str2 = captchaUriData.returnUri;
        }
        if ((i & 4) != 0) {
            str3 = captchaUriData.returnUriParam;
        }
        if ((i & 8) != 0) {
            str4 = captchaUriData.objectType;
        }
        return captchaUriData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.challengeUri;
    }

    public final String component2() {
        return this.returnUri;
    }

    public final String component3() {
        return this.returnUriParam;
    }

    public final String component4() {
        return this.objectType;
    }

    public final CaptchaUriData copy(String str, String str2, String str3, String str4) {
        C19383o.m32797g(str, UriChallengeConstantKt.CHALLENGE_URI);
        C19383o.m32797g(str2, UriChallengeConstantKt.RETURN_URI);
        C19383o.m32797g(str3, UriChallengeConstantKt.RETURN_URI_PARAMS);
        C19383o.m32797g(str4, "objectType");
        return new CaptchaUriData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptchaUriData)) {
            return false;
        }
        CaptchaUriData captchaUriData = (CaptchaUriData) obj;
        return C19383o.m32792b(this.challengeUri, captchaUriData.challengeUri) && C19383o.m32792b(this.returnUri, captchaUriData.returnUri) && C19383o.m32792b(this.returnUriParam, captchaUriData.returnUriParam) && C19383o.m32792b(this.objectType, captchaUriData.objectType);
    }

    public final String getChallengeUri() {
        return this.challengeUri;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getReturnUri() {
        return this.returnUri;
    }

    public final String getReturnUriParam() {
        return this.returnUriParam;
    }

    public int hashCode() {
        return this.objectType.hashCode() + C0023f.m105e(this.returnUriParam, C0023f.m105e(this.returnUri, this.challengeUri.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.challengeUri;
        String str2 = this.returnUri;
        return C0073e.m210j(C0388a.m1050f("CaptchaUriData(challengeUri=", str, ", returnUri=", str2, ", returnUriParam="), this.returnUriParam, ", objectType=", this.objectType, ")");
    }
}
