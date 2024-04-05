package p684to;

import java.util.regex.Pattern;
import p568fn.C17782b;

/* renamed from: to.c */
public final class C18570c {

    /* renamed from: a */
    public static final Pattern f40890a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    /* renamed from: a */
    public static void m31323a(String str) {
        boolean z = true;
        C17782b.m29832B(43 <= str.length(), "codeVerifier length is shorter than allowed by the PKCE specification");
        if (str.length() > 128) {
            z = false;
        }
        C17782b.m29832B(z, "codeVerifier length is longer than allowed by the PKCE specification");
        C17782b.m29832B(f40890a.matcher(str).matches(), "codeVerifier string contains illegal characters");
    }
}
