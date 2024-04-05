package androidx.navigation;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p010a9.C0048b;

/* renamed from: androidx.navigation.f */
public final class C2957f {

    /* renamed from: i */
    public static final Pattern f6701i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    public final ArrayList<String> f6702a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap f6703b = new HashMap();

    /* renamed from: c */
    public Pattern f6704c = null;

    /* renamed from: d */
    public boolean f6705d;

    /* renamed from: e */
    public boolean f6706e;

    /* renamed from: f */
    public final String f6707f;

    /* renamed from: g */
    public Pattern f6708g;

    /* renamed from: h */
    public final String f6709h;

    /* renamed from: androidx.navigation.f$a */
    public static class C2958a {

        /* renamed from: a */
        public String f6710a;

        /* renamed from: b */
        public ArrayList<String> f6711b = new ArrayList<>();
    }

    public C2957f(String str, String str2, String str3) {
        int i = 0;
        this.f6705d = false;
        this.f6706e = false;
        this.f6708g = null;
        this.f6707f = str2;
        this.f6709h = str3;
        int i2 = 1;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f6706e = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f6701i.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f6706e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    mo10960a(str.substring(0, matcher.start()), sb, compile);
                }
                this.f6705d = false;
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    C2958a aVar = new C2958a();
                    while (matcher2.find()) {
                        aVar.f6711b.add(matcher2.group(i2));
                        sb2.append(Pattern.quote(queryParameter.substring(i, matcher2.start())));
                        sb2.append("(.+?)?");
                        i = matcher2.end();
                        i2 = 1;
                    }
                    if (i < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i)));
                    }
                    aVar.f6710a = sb2.toString().replace(".*", "\\E.*\\Q");
                    this.f6703b.put(next, aVar);
                    i2 = 1;
                    i = 0;
                }
            } else {
                this.f6705d = mo10960a(str, sb, compile);
            }
            this.f6704c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            String[] split = str3.split("/", -1);
            this.f6708g = Pattern.compile(C0048b.m164c("^(", split[0], "|[*]+)/(", split[1], "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException(C0048b.m163a("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
    }

    /* renamed from: a */
    public final boolean mo10960a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i = 0;
        while (matcher.find()) {
            this.f6702a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i, matcher.start())));
            sb.append("(.+?)");
            i = matcher.end();
            z = false;
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }
}
