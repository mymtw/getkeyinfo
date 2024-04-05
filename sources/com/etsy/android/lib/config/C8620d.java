package com.etsy.android.lib.config;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JsonNode;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.config.d */
public interface C8620d {

    /* renamed from: com.etsy.android.lib.config.d$a */
    public static final class C8621a implements C8620d {

        /* renamed from: a */
        public final Throwable f18949a;

        public C8621a(GetConfigException getConfigException) {
            this.f18949a = getConfigException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8621a) && C19383o.m32792b(this.f18949a, ((C8621a) obj).f18949a);
        }

        public final int hashCode() {
            return this.f18949a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Failure(cause="), this.f18949a, ')');
        }
    }

    /* renamed from: com.etsy.android.lib.config.d$b */
    public static final class C8622b implements C8620d {

        /* renamed from: a */
        public final JsonNode f18950a;

        public C8622b(JsonNode jsonNode) {
            this.f18950a = jsonNode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8622b) && C19383o.m32792b(this.f18950a, ((C8622b) obj).f18950a);
        }

        public final int hashCode() {
            return this.f18950a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(data=");
            h.append(this.f18950a);
            h.append(')');
            return h.toString();
        }
    }
}
