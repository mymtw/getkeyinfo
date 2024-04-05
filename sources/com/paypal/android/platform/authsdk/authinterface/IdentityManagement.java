package com.paypal.android.platform.authsdk.authinterface;

import android.content.Context;
import androidx.annotation.Keep;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

public interface IdentityManagement {

    public enum AuthenticationMethod {
        BIOMETRIC,
        DEVICECRYPTO
    }

    @Keep
    public static final class AuthenticationMethodResult {
        private final Map<AuthenticationMethod, ResultStatus<Boolean>> status;

        public AuthenticationMethodResult(Map<AuthenticationMethod, ? extends ResultStatus<Boolean>> map) {
            C19383o.m32797g(map, ResponseConstants.STATUS);
            this.status = map;
        }

        public static /* synthetic */ AuthenticationMethodResult copy$default(AuthenticationMethodResult authenticationMethodResult, Map<AuthenticationMethod, ResultStatus<Boolean>> map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = authenticationMethodResult.status;
            }
            return authenticationMethodResult.copy(map);
        }

        public final Map<AuthenticationMethod, ResultStatus<Boolean>> component1() {
            return this.status;
        }

        public final AuthenticationMethodResult copy(Map<AuthenticationMethod, ? extends ResultStatus<Boolean>> map) {
            C19383o.m32797g(map, ResponseConstants.STATUS);
            return new AuthenticationMethodResult(map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthenticationMethodResult) && C19383o.m32792b(this.status, ((AuthenticationMethodResult) obj).status);
        }

        public final Map<AuthenticationMethod, ResultStatus<Boolean>> getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            Map<AuthenticationMethod, ResultStatus<Boolean>> map = this.status;
            return "AuthenticationMethodResult(status=" + map + ")";
        }
    }

    public interface Listener {
        void onError(IOException iOException);

        void onSuccess(AuthenticationMethodResult authenticationMethodResult);
    }

    void changePasswordMethod(Context context, AuthenticationPrompt authenticationPrompt, CommonListener<C19394m, IOException> commonListener);

    void changePasswordMethod(Context context, Token token, CommonListener<C19394m, IOException> commonListener);

    void disableAuthenticationMethod(AuthenticationMethod authenticationMethod, Listener listener);

    void enableAuthenticationMethod(Context context, EnableAuthenticationMethodContext enableAuthenticationMethodContext, Listener listener);

    void enableAuthenticationMethod(EnableAuthenticationMethodContext enableAuthenticationMethodContext, Listener listener);
}
