package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.text.a */
public final class C19446a {

    /* renamed from: a */
    public static final C19446a f43372a = new C19446a();

    /* renamed from: b */
    public static final Charset f43373b;

    /* renamed from: c */
    public static final Charset f43374c;

    /* renamed from: d */
    public static Charset f43375d;

    /* renamed from: e */
    public static Charset f43376e;

    static {
        Charset forName = Charset.forName("UTF-8");
        C19383o.m32796f(forName, "forName(\"UTF-8\")");
        f43373b = forName;
        C19383o.m32796f(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        C19383o.m32796f(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        C19383o.m32796f(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Charset forName2 = Charset.forName("US-ASCII");
        C19383o.m32796f(forName2, "forName(\"US-ASCII\")");
        f43374c = forName2;
        C19383o.m32796f(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
