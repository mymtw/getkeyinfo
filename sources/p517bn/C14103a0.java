package p517bn;

import android.support.p013v4.media.C0070b;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* renamed from: bn.a0 */
public final class C14103a0 {

    /* renamed from: d */
    public static final Pattern f31056d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f31057a;

    /* renamed from: b */
    public final String f31058b;

    /* renamed from: c */
    public final String f31059c;

    public C14103a0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str}));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f31056d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f31057a = str3;
        this.f31058b = str;
        this.f31059c = C0070b.m184f(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14103a0)) {
            return false;
        }
        C14103a0 a0Var = (C14103a0) obj;
        return this.f31057a.equals(a0Var.f31057a) && this.f31058b.equals(a0Var.f31058b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f31058b, this.f31057a);
    }
}
