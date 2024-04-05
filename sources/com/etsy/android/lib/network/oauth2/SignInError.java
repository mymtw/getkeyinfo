package com.etsy.android.lib.network.oauth2;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.appboy.Constants;
import com.etsy.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class SignInError extends Throwable {
    public static final int $stable = 0;

    public static final class AtoError extends SignInError {
        public static final int $stable = 0;
        private final SignInType signInType;
        private final String uri;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AtoError(SignInType signInType2, String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(signInType2, "signInType");
            C19383o.m32797g(str, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            this.signInType = signInType2;
            this.uri = str;
        }

        public final SignInType getSignInType() {
            return this.signInType;
        }

        public final String getUri() {
            return this.uri;
        }
    }

    public static final class AuthFailed extends SignInError {
        public static final int $stable = 0;
        private final SignInType signInType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AuthFailed(SignInType signInType2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(signInType2, "signInType");
            this.signInType = signInType2;
        }

        public final SignInType getSignInType() {
            return this.signInType;
        }
    }

    public static final class AuthenticationServiceFailed extends SignInError {
        public static final int $stable = 0;
        public static final AuthenticationServiceFailed INSTANCE = new AuthenticationServiceFailed();

        private AuthenticationServiceFailed() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class FacebookError extends SignInError {
        public static final int $stable = 0;
        public static final FacebookError INSTANCE = new FacebookError();

        private FacebookError() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class GoogleError extends SignInError {
        public static final int $stable = 0;
        public static final GoogleError INSTANCE = new GoogleError();

        private GoogleError() {
            super((DefaultConstructorMarker) null);
        }
    }

    public enum SignInType {
        THIRD_PARTY,
        WEB_AUTH,
        SIGN_IN_AS
    }

    public static final class Unknown extends SignInError {
        public static final int $stable = 0;
        private final SignInType signInType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unknown(SignInType signInType2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(signInType2, "signInType");
            this.signInType = signInType2;
        }

        public final SignInType getSignInType() {
            return this.signInType;
        }
    }

    public static final class UserCancel extends SignInError {
        public static final int $stable = 0;
        public static final UserCancel INSTANCE = new UserCancel();

        private UserCancel() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.etsy.android.lib.network.oauth2.SignInError$a */
    public static final class C8742a {

        /* renamed from: a */
        public final int f19214a;

        /* renamed from: b */
        public final int f19215b;

        /* renamed from: c */
        public final int f19216c;

        /* renamed from: d */
        public final String f19217d;

        public /* synthetic */ C8742a(int i) {
            this(i, 0, 0, "");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8742a)) {
                return false;
            }
            C8742a aVar = (C8742a) obj;
            return this.f19214a == aVar.f19214a && this.f19215b == aVar.f19215b && this.f19216c == aVar.f19216c && C19383o.m32792b(this.f19217d, aVar.f19217d);
        }

        public final int hashCode() {
            return this.f19217d.hashCode() + C0069a.m170a(this.f19216c, C0069a.m170a(this.f19215b, Integer.hashCode(this.f19214a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ErrorAction(message=");
            h.append(this.f19214a);
            h.append(", title=");
            h.append(this.f19215b);
            h.append(", actionTitle=");
            h.append(this.f19216c);
            h.append(", uri=");
            return C0391c.m1057c(h, this.f19217d, ')');
        }

        public C8742a(int i, int i2, int i3, String str) {
            C19383o.m32797g(str, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            this.f19214a = i;
            this.f19215b = i2;
            this.f19216c = i3;
            this.f19217d = str;
        }
    }

    /* renamed from: com.etsy.android.lib.network.oauth2.SignInError$b */
    public /* synthetic */ class C8743b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19218a;

        static {
            int[] iArr = new int[SignInType.values().length];
            iArr[SignInType.THIRD_PARTY.ordinal()] = 1;
            iArr[SignInType.SIGN_IN_AS.ordinal()] = 2;
            iArr[SignInType.WEB_AUTH.ordinal()] = 3;
            f19218a = iArr;
        }
    }

    private SignInError() {
    }

    public /* synthetic */ SignInError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final C8742a getErrorAction() {
        boolean z = true;
        if (this instanceof Unknown) {
            int i = C8743b.f19218a[((Unknown) this).getSignInType().ordinal()];
            if (i == 1) {
                return null;
            }
            if (i == 2 || i == 3) {
                return new C8742a(R.string.sign_in_error_generic);
            }
            throw new NoWhenBranchMatchedException();
        } else if (this instanceof AuthFailed) {
            int i2 = C8743b.f19218a[((AuthFailed) this).getSignInType().ordinal()];
            if (i2 == 1 || i2 == 2) {
                return null;
            }
            if (i2 == 3) {
                return new C8742a(R.string.sign_in_error_generic);
            }
            throw new NoWhenBranchMatchedException();
        } else if (this instanceof AtoError) {
            AtoError atoError = (AtoError) this;
            int i3 = C8743b.f19218a[atoError.getSignInType().ordinal()];
            if (i3 == 1) {
                return new C8742a(R.string.sign_in_error_ato_message, R.string.sign_in_error_ato_title, R.string.sign_in_error_ato_action, atoError.getUri());
            }
            if (i3 == 2 || i3 == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        } else {
            if (!(this instanceof GoogleError)) {
                z = this instanceof FacebookError;
            }
            if (z) {
                return new C8742a(R.string.sign_in_error_sso);
            }
            return null;
        }
    }
}
