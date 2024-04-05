package com.etsy.android.lib.requests;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.EtsyLocale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public interface LocaleResult {

    public static final class Success implements LocaleResult {
        public static final int $stable = 8;
        private final EtsyLocale locale;

        public Success(EtsyLocale etsyLocale) {
            C19383o.m32797g(etsyLocale, "locale");
            this.locale = etsyLocale;
        }

        public static /* synthetic */ Success copy$default(Success success, EtsyLocale etsyLocale, int i, Object obj) {
            if ((i & 1) != 0) {
                etsyLocale = success.locale;
            }
            return success.copy(etsyLocale);
        }

        public final EtsyLocale component1() {
            return this.locale;
        }

        public final Success copy(EtsyLocale etsyLocale) {
            C19383o.m32797g(etsyLocale, "locale");
            return new Success(etsyLocale);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C19383o.m32792b(this.locale, ((Success) obj).locale);
        }

        public final EtsyLocale getLocale() {
            return this.locale;
        }

        public int hashCode() {
            return this.locale.hashCode();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Success(locale=");
            h.append(this.locale);
            h.append(')');
            return h.toString();
        }
    }

    public static final class Error implements LocaleResult {
        public static final int $stable = 8;
        private final int code;
        private final String errorMessage;
        private final Throwable exception;

        public Error(String str, int i, Throwable th) {
            this.errorMessage = str;
            this.code = i;
            this.exception = th;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Throwable th, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.errorMessage;
            }
            if ((i2 & 2) != 0) {
                i = error.code;
            }
            if ((i2 & 4) != 0) {
                th = error.exception;
            }
            return error.copy(str, i, th);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final int component2() {
            return this.code;
        }

        public final Throwable component3() {
            return this.exception;
        }

        public final Error copy(String str, int i, Throwable th) {
            return new Error(str, i, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return C19383o.m32792b(this.errorMessage, error.errorMessage) && this.code == error.code && C19383o.m32792b(this.exception, error.exception);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final Throwable getException() {
            return this.exception;
        }

        public int hashCode() {
            String str = this.errorMessage;
            int i = 0;
            int a = C0069a.m170a(this.code, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.exception;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.errorMessage);
            h.append(", code=");
            h.append(this.code);
            h.append(", exception=");
            return C0070b.m185h(h, this.exception, ')');
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(String str, int i, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? null : th);
        }
    }
}
