package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C19994o;
import okhttp3.C19997p;
import okhttp3.C20002r;

/* renamed from: retrofit2.u */
public final class C20143u {

    /* renamed from: a */
    public final Method f44578a;

    /* renamed from: b */
    public final C19997p f44579b;

    /* renamed from: c */
    public final String f44580c;

    /* renamed from: d */
    public final String f44581d;

    /* renamed from: e */
    public final C19994o f44582e;

    /* renamed from: f */
    public final C20002r f44583f;

    /* renamed from: g */
    public final boolean f44584g;

    /* renamed from: h */
    public final boolean f44585h;

    /* renamed from: i */
    public final boolean f44586i;

    /* renamed from: j */
    public final C20122r<?>[] f44587j;

    /* renamed from: k */
    public final boolean f44588k;

    /* renamed from: retrofit2.u$a */
    public static final class C20144a {

        /* renamed from: x */
        public static final Pattern f44589x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f44590y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C20146w f44591a;

        /* renamed from: b */
        public final Method f44592b;

        /* renamed from: c */
        public final Annotation[] f44593c;

        /* renamed from: d */
        public final Annotation[][] f44594d;

        /* renamed from: e */
        public final Type[] f44595e;

        /* renamed from: f */
        public boolean f44596f;

        /* renamed from: g */
        public boolean f44597g;

        /* renamed from: h */
        public boolean f44598h;

        /* renamed from: i */
        public boolean f44599i;

        /* renamed from: j */
        public boolean f44600j;

        /* renamed from: k */
        public boolean f44601k;

        /* renamed from: l */
        public boolean f44602l;

        /* renamed from: m */
        public boolean f44603m;

        /* renamed from: n */
        public String f44604n;

        /* renamed from: o */
        public boolean f44605o;

        /* renamed from: p */
        public boolean f44606p;

        /* renamed from: q */
        public boolean f44607q;

        /* renamed from: r */
        public String f44608r;

        /* renamed from: s */
        public C19994o f44609s;

        /* renamed from: t */
        public C20002r f44610t;

        /* renamed from: u */
        public LinkedHashSet f44611u;

        /* renamed from: v */
        public C20122r<?>[] f44612v;

        /* renamed from: w */
        public boolean f44613w;

        public C20144a(C20146w wVar, Method method) {
            this.f44591a = wVar;
            this.f44592b = method;
            this.f44593c = method.getAnnotations();
            this.f44595e = method.getGenericParameterTypes();
            this.f44594d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m34436a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: b */
        public final void mo74382b(String str, String str2, boolean z) {
            String str3 = this.f44604n;
            if (str3 == null) {
                this.f44604n = str;
                this.f44605o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f44589x.matcher(substring).find()) {
                            throw C20085a0.m34347j(this.f44592b, (Exception) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f44608r = str2;
                    Matcher matcher = f44589x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.f44611u = linkedHashSet;
                    return;
                }
                return;
            }
            throw C20085a0.m34347j(this.f44592b, (Exception) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: c */
        public final void mo74383c(int i, Type type) {
            if (C20085a0.m34345h(type)) {
                throw C20085a0.m34348k(this.f44592b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C20143u(C20144a aVar) {
        this.f44578a = aVar.f44592b;
        this.f44579b = aVar.f44591a.f44619c;
        this.f44580c = aVar.f44604n;
        this.f44581d = aVar.f44608r;
        this.f44582e = aVar.f44609s;
        this.f44583f = aVar.f44610t;
        this.f44584g = aVar.f44605o;
        this.f44585h = aVar.f44606p;
        this.f44586i = aVar.f44607q;
        this.f44587j = aVar.f44612v;
        this.f44588k = aVar.f44613w;
    }
}
