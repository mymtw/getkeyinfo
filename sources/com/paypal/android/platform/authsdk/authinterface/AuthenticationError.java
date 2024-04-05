package com.paypal.android.platform.authsdk.authinterface;

import com.paypal.android.platform.authsdk.authinterface.IdentityManagement;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class AuthenticationError extends IOException {
    private final String code;
    private final String debugId;
    private final String message;
    private final String name;
    private final String title;

    public static final class Auth extends AuthenticationError {
        private final AuthError authError;
        private final String code;
        private final String message;
        private final String name;
        private final String title;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Auth(String str, String str2, String str3, String str4, AuthError authError2) {
            super(str, str2, str4, (String) null, (String) null, 24, (DefaultConstructorMarker) null);
            C19383o.m32797g(authError2, "authError");
            this.name = str;
            this.title = str2;
            this.code = str3;
            this.message = str4;
            this.authError = authError2;
        }

        public final AuthError getAuthError() {
            return this.authError;
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public String getName() {
            return this.name;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public static abstract class AuthError {

        public static final class AuthenticationFailure extends AuthError {
            public static final AuthenticationFailure INSTANCE = new AuthenticationFailure();

            private AuthenticationFailure() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class UserCancelled extends AuthError {
            public static final UserCancelled INSTANCE = new UserCancelled();

            private UserCancelled() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class UserSwitchedAccount extends AuthError {
            public static final UserSwitchedAccount INSTANCE = new UserSwitchedAccount();

            private UserSwitchedAccount() {
                super((DefaultConstructorMarker) null);
            }
        }

        private AuthError() {
        }

        public /* synthetic */ AuthError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class BiometricEnrollment extends AuthenticationError {
        private final BiometricEnrollmentError biometricEnrollmentError;
        private final String code;
        private final String message;
        private final String name;
        private final String title;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BiometricEnrollment(String str, String str2, String str3, String str4, BiometricEnrollmentError biometricEnrollmentError2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, biometricEnrollmentError2);
        }

        public final BiometricEnrollmentError getBiometricEnrollmentError() {
            return this.biometricEnrollmentError;
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public String getName() {
            return this.name;
        }

        public String getTitle() {
            return this.title;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BiometricEnrollment(String str, String str2, String str3, String str4, BiometricEnrollmentError biometricEnrollmentError2) {
            super((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            C19383o.m32797g(biometricEnrollmentError2, "biometricEnrollmentError");
            this.name = str;
            this.title = str2;
            this.code = str3;
            this.message = str4;
            this.biometricEnrollmentError = biometricEnrollmentError2;
        }
    }

    public static abstract class BiometricEnrollmentError {

        public static final class AlreadyEnrolledBiometric extends BiometricEnrollmentError {
            public static final AlreadyEnrolledBiometric INSTANCE = new AlreadyEnrolledBiometric();

            private AlreadyEnrolledBiometric() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class BiometricServiceError extends BiometricEnrollmentError {
            public static final BiometricServiceError INSTANCE = new BiometricServiceError();

            private BiometricServiceError() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class InEligibleForBiometric extends BiometricEnrollmentError {
            public static final InEligibleForBiometric INSTANCE = new InEligibleForBiometric();

            private InEligibleForBiometric() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class NoBiometricEnrolledOnDevice extends BiometricEnrollmentError {
            public static final NoBiometricEnrolledOnDevice INSTANCE = new NoBiometricEnrolledOnDevice();

            private NoBiometricEnrolledOnDevice() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class NoPermissionForHostApp extends BiometricEnrollmentError {
            public static final NoPermissionForHostApp INSTANCE = new NoPermissionForHostApp();

            private NoPermissionForHostApp() {
                super((DefaultConstructorMarker) null);
            }
        }

        private BiometricEnrollmentError() {
        }

        public /* synthetic */ BiometricEnrollmentError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class ConfirmEmail extends AuthenticationError {
        private final String code;
        private final ConfirmEmailError confirmEmailError;
        private final String message;
        private final String name;
        private final String title;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ConfirmEmail(String str, String str2, String str3, String str4, ConfirmEmailError confirmEmailError2) {
            super(str, str2, str4, (String) null, (String) null, 24, (DefaultConstructorMarker) null);
            C19383o.m32797g(confirmEmailError2, "confirmEmailError");
            this.name = str;
            this.title = str2;
            this.code = str3;
            this.message = str4;
            this.confirmEmailError = confirmEmailError2;
        }

        public String getCode() {
            return this.code;
        }

        public final ConfirmEmailError getConfirmEmailError() {
            return this.confirmEmailError;
        }

        public String getMessage() {
            return this.message;
        }

        public String getName() {
            return this.name;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public static abstract class ConfirmEmailError {

        public static final class ConfirmEmailCanceledByUser extends ConfirmEmailError {
            public static final ConfirmEmailCanceledByUser INSTANCE = new ConfirmEmailCanceledByUser();

            private ConfirmEmailCanceledByUser() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class EmailMismatch extends ConfirmEmailError {
            private final String message;

            public EmailMismatch() {
                this((String) null, 1, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ EmailMismatch(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "email not associated with current logged in user" : str);
            }

            public final String getMessage() {
                return this.message;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public EmailMismatch(String str) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(str, "message");
                this.message = str;
            }
        }

        public static final class FailedToConfirmEmail extends ConfirmEmailError {
            private final Throwable reason;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public FailedToConfirmEmail(Throwable th) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(th, "reason");
                this.reason = th;
            }

            public final Throwable getReason() {
                return this.reason;
            }
        }

        private ConfirmEmailError() {
        }

        public /* synthetic */ ConfirmEmailError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class ContextNotFound extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ContextNotFound(String str) {
            super(str, (String) null, (String) null, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }
    }

    public static final class DeviceCryptoEnrollment extends AuthenticationError {
        private final String code;
        private final DeviceCryptoEnrollmentError deviceCryptoEnrollmentError;
        private final String message;
        private final String name;
        private final String title;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceCryptoEnrollment(String str, String str2, String str3, String str4, DeviceCryptoEnrollmentError deviceCryptoEnrollmentError2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, deviceCryptoEnrollmentError2);
        }

        public String getCode() {
            return this.code;
        }

        public final DeviceCryptoEnrollmentError getDeviceCryptoEnrollmentError() {
            return this.deviceCryptoEnrollmentError;
        }

        public String getMessage() {
            return this.message;
        }

        public String getName() {
            return this.name;
        }

        public String getTitle() {
            return this.title;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeviceCryptoEnrollment(String str, String str2, String str3, String str4, DeviceCryptoEnrollmentError deviceCryptoEnrollmentError2) {
            super((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            C19383o.m32797g(deviceCryptoEnrollmentError2, "deviceCryptoEnrollmentError");
            this.name = str;
            this.title = str2;
            this.code = str3;
            this.message = str4;
            this.deviceCryptoEnrollmentError = deviceCryptoEnrollmentError2;
        }
    }

    public static abstract class DeviceCryptoEnrollmentError {

        public static final class AlreadyEnrolledDeviceCrypto extends DeviceCryptoEnrollmentError {
            public static final AlreadyEnrolledDeviceCrypto INSTANCE = new AlreadyEnrolledDeviceCrypto();

            private AlreadyEnrolledDeviceCrypto() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class DeviceCryptoServiceError extends DeviceCryptoEnrollmentError {
            public static final DeviceCryptoServiceError INSTANCE = new DeviceCryptoServiceError();

            private DeviceCryptoServiceError() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class InEligibleForDeviceCrypto extends DeviceCryptoEnrollmentError {
            public static final InEligibleForDeviceCrypto INSTANCE = new InEligibleForDeviceCrypto();

            private InEligibleForDeviceCrypto() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class NoDeviceLock extends DeviceCryptoEnrollmentError {
            public static final NoDeviceLock INSTANCE = new NoDeviceLock();

            private NoDeviceLock() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class UnsupportedDevice extends DeviceCryptoEnrollmentError {
            public static final UnsupportedDevice INSTANCE = new UnsupportedDevice();

            private UnsupportedDevice() {
                super((DefaultConstructorMarker) null);
            }
        }

        private DeviceCryptoEnrollmentError() {
        }

        public /* synthetic */ DeviceCryptoEnrollmentError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class InCompleteChallenge extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InCompleteChallenge(String str) {
            super(str, (String) null, (String) null, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }
    }

    public static final class InvalidArgument extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InvalidArgument(String str) {
            super(str, (String) null, (String) null, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }
    }

    public static final class MultiAuthMethodEnrollmentError extends AuthenticationError {
        private final String code;
        private final Map<IdentityManagement.AuthenticationMethod, ResultStatus<Boolean>> errors;
        private final String message;
        private final String name;
        private final String title;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MultiAuthMethodEnrollmentError(String str, String str2, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, map);
        }

        public String getCode() {
            return this.code;
        }

        public final Map<IdentityManagement.AuthenticationMethod, ResultStatus<Boolean>> getErrors() {
            return this.errors;
        }

        public String getMessage() {
            return this.message;
        }

        public String getName() {
            return this.name;
        }

        public String getTitle() {
            return this.title;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiAuthMethodEnrollmentError(String str, String str2, String str3, String str4, Map<IdentityManagement.AuthenticationMethod, ? extends ResultStatus<Boolean>> map) {
            super((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            C19383o.m32797g(map, "errors");
            this.name = str;
            this.title = str2;
            this.code = str3;
            this.message = str4;
            this.errors = map;
        }
    }

    public static final class NOT_IMPLEMENTED extends AuthenticationError {
        public static final NOT_IMPLEMENTED INSTANCE = new NOT_IMPLEMENTED();

        private NOT_IMPLEMENTED() {
            super((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }
    }

    public static final class Network extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Network(String str) {
            super(str, (String) null, (String) null, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }
    }

    public static final class NoSupportedAuthOptions extends AuthenticationError {
        private final String code;
        private final String message;
        private final String name;
        private final NoSupportedAuthOptionsError noSupportedAuthOptionsError;
        private final String title;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NoSupportedAuthOptions(String str, String str2, String str3, String str4, NoSupportedAuthOptionsError noSupportedAuthOptionsError2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, noSupportedAuthOptionsError2);
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public String getName() {
            return this.name;
        }

        public final NoSupportedAuthOptionsError getNoSupportedAuthOptionsError() {
            return this.noSupportedAuthOptionsError;
        }

        public String getTitle() {
            return this.title;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NoSupportedAuthOptions(String str, String str2, String str3, String str4, NoSupportedAuthOptionsError noSupportedAuthOptionsError2) {
            super((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            C19383o.m32797g(noSupportedAuthOptionsError2, "noSupportedAuthOptionsError");
            this.name = str;
            this.title = str2;
            this.code = str3;
            this.message = str4;
            this.noSupportedAuthOptionsError = noSupportedAuthOptionsError2;
        }
    }

    public static abstract class NoSupportedAuthOptionsError {

        public static final class NoSupportedAuthOptionsPublicCredential extends NoSupportedAuthOptionsError {
            private final String userName;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public NoSupportedAuthOptionsPublicCredential(String str) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(str, "userName");
                this.userName = str;
            }

            public final String getUserName() {
                return this.userName;
            }
        }

        private NoSupportedAuthOptionsError() {
        }

        public /* synthetic */ NoSupportedAuthOptionsError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class Service extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Service(String str) {
            super(str, (String) null, (String) null, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }
    }

    public static final class Unknown extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unknown(String str) {
            super(str, (String) null, (String) null, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthenticationError(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ AuthenticationError(String str, String str2, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5);
    }

    public static /* synthetic */ void getCode$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public String getCode() {
        return this.code;
    }

    public final String getDebugId() {
        return this.debugId;
    }

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    private AuthenticationError(String str, String str2, String str3, String str4, String str5) {
        this.name = str;
        this.title = str2;
        this.message = str3;
        this.code = str4;
        this.debugId = str5;
    }
}
