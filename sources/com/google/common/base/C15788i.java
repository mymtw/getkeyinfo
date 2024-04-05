package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.base.i */
public final class C15788i {

    /* renamed from: com.google.common.base.i$a */
    public static final class C15789a {

        /* renamed from: a */
        public final String f35568a;

        /* renamed from: b */
        public final C15790a f35569b;

        /* renamed from: c */
        public C15790a f35570c;

        /* renamed from: com.google.common.base.i$a$a */
        public static final class C15790a {
            @NullableDecl

            /* renamed from: a */
            public String f35571a;
            @NullableDecl

            /* renamed from: b */
            public Object f35572b;
            @NullableDecl

            /* renamed from: c */
            public C15790a f35573c;
        }

        public C15789a(String str) {
            C15790a aVar = new C15790a();
            this.f35569b = aVar;
            this.f35570c = aVar;
            this.f35568a = str;
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final void mo55781a(long j, String str) {
            mo55782b(String.valueOf(j), str);
        }

        /* renamed from: b */
        public final void mo55782b(@NullableDecl Serializable serializable, String str) {
            C15790a aVar = new C15790a();
            this.f35570c.f35573c = aVar;
            this.f35570c = aVar;
            aVar.f35572b = serializable;
            aVar.f35571a = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f35568a);
            sb.append('{');
            C15790a aVar = this.f35569b.f35573c;
            String str = "";
            while (aVar != null) {
                Object obj = aVar.f35572b;
                sb.append(str);
                String str2 = aVar.f35571a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                aVar = aVar.f35573c;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static <T> T m25602a(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static C15789a m25603b(Object obj) {
        return new C15789a(obj.getClass().getSimpleName());
    }
}
