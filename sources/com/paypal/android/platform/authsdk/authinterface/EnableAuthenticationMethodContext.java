package com.paypal.android.platform.authsdk.authinterface;

import com.paypal.android.platform.authsdk.authinterface.IdentityManagement;
import java.util.List;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19318k;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;
import p753kq.C19846a;
import p753kq.C19857l;

public abstract class EnableAuthenticationMethodContext {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<IdentityManagement.AuthenticationMethod> authenticationMethod;
    private final boolean isConsentNeeded;
    private final AuthenticationPrompt loginPrompt;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnableAuthenticationMethodContext buildWith(IdentityManagement.AuthenticationMethod[] authenticationMethodArr, C19857l<? super Builder, C19394m> lVar) {
            C19383o.m32797g(authenticationMethodArr, "authenticationMethod");
            C19383o.m32797g(lVar, "initializer");
            Builder builder = new Builder(C19318k.m32599Q0(authenticationMethodArr), (AuthenticationPrompt) null, false, 6, (DefaultConstructorMarker) null);
            lVar.invoke(builder);
            return builder.build();
        }
    }

    public static final class InvalidEnabledAuthenticationContext extends EnableAuthenticationMethodContext {
        public static final InvalidEnabledAuthenticationContext INSTANCE = new InvalidEnabledAuthenticationContext();

        private InvalidEnabledAuthenticationContext() {
            super(EmptyList.INSTANCE, (AuthenticationPrompt) null, false, 6, (DefaultConstructorMarker) null);
        }
    }

    private EnableAuthenticationMethodContext(List<? extends IdentityManagement.AuthenticationMethod> list, AuthenticationPrompt authenticationPrompt, boolean z) {
        this.authenticationMethod = list;
        this.loginPrompt = authenticationPrompt;
        this.isConsentNeeded = z;
    }

    public /* synthetic */ EnableAuthenticationMethodContext(List list, AuthenticationPrompt authenticationPrompt, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, authenticationPrompt, z);
    }

    public final List<IdentityManagement.AuthenticationMethod> getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    public final AuthenticationPrompt getLoginPrompt() {
        return this.loginPrompt;
    }

    public final boolean isConsentNeeded() {
        return this.isConsentNeeded;
    }

    public static final class BiometricAuthenticationMethodContext extends EnableAuthenticationMethodContext {
        public BiometricAuthenticationMethodContext() {
            this((AuthenticationPrompt) null, false, 3, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BiometricAuthenticationMethodContext(AuthenticationPrompt authenticationPrompt, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AuthenticationPrompt.Undefined : authenticationPrompt, (i & 2) != 0 ? false : z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BiometricAuthenticationMethodContext(AuthenticationPrompt authenticationPrompt, boolean z) {
            super(C17782b.m29864d0(IdentityManagement.AuthenticationMethod.BIOMETRIC), authenticationPrompt, z, (DefaultConstructorMarker) null);
            C19383o.m32797g(authenticationPrompt, "loginPrompt");
        }
    }

    public static final class DeviceCryptoAuthenticationMethodContext extends EnableAuthenticationMethodContext {
        public DeviceCryptoAuthenticationMethodContext() {
            this((AuthenticationPrompt) null, false, 3, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceCryptoAuthenticationMethodContext(AuthenticationPrompt authenticationPrompt, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AuthenticationPrompt.Undefined : authenticationPrompt, (i & 2) != 0 ? false : z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeviceCryptoAuthenticationMethodContext(AuthenticationPrompt authenticationPrompt, boolean z) {
            super(C17782b.m29864d0(IdentityManagement.AuthenticationMethod.DEVICECRYPTO), authenticationPrompt, z, (DefaultConstructorMarker) null);
            C19383o.m32797g(authenticationPrompt, "loginPrompt");
        }
    }

    public static final class MultiEnableAuthenticationMethodContext extends EnableAuthenticationMethodContext {
        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MultiEnableAuthenticationMethodContext(List list, AuthenticationPrompt authenticationPrompt, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? AuthenticationPrompt.Undefined : authenticationPrompt, (i & 4) != 0 ? false : z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiEnableAuthenticationMethodContext(List<? extends IdentityManagement.AuthenticationMethod> list, AuthenticationPrompt authenticationPrompt, boolean z) {
            super(list, authenticationPrompt, z, (DefaultConstructorMarker) null);
            C19383o.m32797g(list, "authenticationMethods");
            C19383o.m32797g(authenticationPrompt, "loginPrompt");
        }
    }

    public static final class Builder {
        private final List<IdentityManagement.AuthenticationMethod> authenticationMethods;
        private boolean isConsentNeeded;
        private AuthenticationPrompt loginPrompt;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IdentityManagement.AuthenticationMethod.values().length];
                iArr[IdentityManagement.AuthenticationMethod.BIOMETRIC.ordinal()] = 1;
                iArr[IdentityManagement.AuthenticationMethod.DEVICECRYPTO.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Builder(List<? extends IdentityManagement.AuthenticationMethod> list, AuthenticationPrompt authenticationPrompt, boolean z) {
            C19383o.m32797g(list, "authenticationMethods");
            C19383o.m32797g(authenticationPrompt, "loginPrompt");
            this.authenticationMethods = list;
            this.loginPrompt = authenticationPrompt;
            this.isConsentNeeded = z;
        }

        public final EnableAuthenticationMethodContext build() {
            int size = this.authenticationMethods.size();
            if (size == 0) {
                return InvalidEnabledAuthenticationContext.INSTANCE;
            }
            if (size != 1) {
                return new MultiEnableAuthenticationMethodContext(this.authenticationMethods, this.loginPrompt, this.isConsentNeeded);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[this.authenticationMethods.get(0).ordinal()];
            if (i == 1) {
                return new BiometricAuthenticationMethodContext(this.loginPrompt, this.isConsentNeeded);
            }
            if (i == 2) {
                return new DeviceCryptoAuthenticationMethodContext(this.loginPrompt, this.isConsentNeeded);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final void isConsentNeeded(C19846a<Boolean> aVar) {
            C19383o.m32797g(aVar, "initializer");
            this.isConsentNeeded = aVar.invoke().booleanValue();
        }

        public final void loginPrompt(C19846a<? extends AuthenticationPrompt> aVar) {
            C19383o.m32797g(aVar, "initializer");
            this.loginPrompt = (AuthenticationPrompt) aVar.invoke();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(List list, AuthenticationPrompt authenticationPrompt, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? AuthenticationPrompt.Undefined : authenticationPrompt, (i & 4) != 0 ? false : z);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EnableAuthenticationMethodContext(List list, AuthenticationPrompt authenticationPrompt, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? AuthenticationPrompt.Undefined : authenticationPrompt, (i & 4) != 0 ? false : z, (DefaultConstructorMarker) null);
    }
}
