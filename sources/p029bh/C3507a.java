package p029bh;

import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.C6545i;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import kotlinx.coroutines.C19543e0;

/* renamed from: bh.a */
public final class C3507a implements C6545i {

    /* renamed from: c */
    public static final String f8121c = C19543e0.m33308a0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    public static final Set<C6493a> f8122d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C6493a[]{new C6493a("proto"), new C6493a("json")})));

    /* renamed from: e */
    public static final C3507a f8123e;

    /* renamed from: a */
    public final String f8124a;

    /* renamed from: b */
    public final String f8125b;

    static {
        String a0 = C19543e0.m33308a0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a02 = C19543e0.m33308a0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8123e = new C3507a(a0, a02);
    }

    public C3507a(String str, String str2) {
        this.f8124a = str;
        this.f8125b = str2;
    }

    /* renamed from: a */
    public static C3507a m8328a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C3507a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: b */
    public final byte[] mo13002b() {
        String str = this.f8125b;
        if (str == null && this.f8124a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f8124a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
