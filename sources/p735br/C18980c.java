package p735br;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import okhttp3.C19928a0;
import okhttp3.C19932b0;
import okhttp3.C19994o;
import okhttp3.C19997p;
import okhttp3.C20002r;
import okhttp3.C20009t;
import okhttp3.C20016y;
import okhttp3.C20018z;
import okio.ByteString;
import p568fn.C17782b;
import p743fr.C19022a;
import p756lr.C19888c0;
import p756lr.C19893f;
import p756lr.C19897i;
import p756lr.C19908t;

/* renamed from: br.c */
public final class C18980c {

    /* renamed from: a */
    public static final byte[] f42301a;

    /* renamed from: b */
    public static final C19994o f42302b = C19994o.C19996b.m34216c(new String[0]);

    /* renamed from: c */
    public static final C19932b0 f42303c;

    /* renamed from: d */
    public static final C19908t f42304d;

    /* renamed from: e */
    public static final TimeZone f42305e;

    /* renamed from: f */
    public static final Regex f42306f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g */
    public static final String f42307g = C19459m.m33051t1(C19459m.m33050s1(C20009t.class.getName(), "okhttp3."), "Client");

    static {
        byte[] bArr = new byte[0];
        f42301a = bArr;
        C19994o.f44234c.getClass();
        C19928a0.f43959c.getClass();
        C19893f fVar = new C19893f();
        fVar.write(bArr);
        f42303c = new C19932b0((C20002r) null, (long) 0, fVar);
        C20016y.C20017a.m34283d(C20016y.f44360a, bArr, (C20002r) null, 7);
        C19908t.C19909a aVar = C19908t.f43902d;
        ByteString.Companion.getClass();
        ByteString[] byteStringArr = {ByteString.C20020a.m34294b("efbbbf"), ByteString.C20020a.m34294b("feff"), ByteString.C20020a.m34294b("fffe"), ByteString.C20020a.m34294b("0000ffff"), ByteString.C20020a.m34294b("ffff0000")};
        aVar.getClass();
        f42304d = C19908t.C19909a.m34005b(byteStringArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C19383o.m32794d(timeZone);
        f42305e = timeZone;
        Class<C20009t> cls = C20009t.class;
    }

    /* renamed from: a */
    public static final boolean m32097a(C19997p pVar, C19997p pVar2) {
        C19383o.m32797g(pVar, "$this$canReuseConnectionFor");
        C19383o.m32797g(pVar2, "other");
        return C19383o.m32792b(pVar.f44243e, pVar2.f44243e) && pVar.f44244f == pVar2.f44244f && C19383o.m32792b(pVar.f44240b, pVar2.f44240b);
    }

    /* renamed from: b */
    public static final int m32098b(long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = true;
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException("timeout too small.".toString());
                }
                throw new IllegalArgumentException("timeout too large.".toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException("timeout < 0".toString());
    }

    /* renamed from: c */
    public static final void m32099c(Closeable closeable) {
        C19383o.m32797g(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m32100d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C19383o.m32792b(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final int m32101e(String str, char c, int i, int i2) {
        C19383o.m32797g(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: f */
    public static final int m32102f(String str, int i, int i2, String str2) {
        C19383o.m32797g(str, "$this$delimiterOffset");
        while (i < i2) {
            if (C19459m.m33037f1(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: g */
    public static final boolean m32103g(C19888c0 c0Var, TimeUnit timeUnit) {
        C19383o.m32797g(c0Var, "$this$discard");
        C19383o.m32797g(timeUnit, "timeUnit");
        try {
            return m32115s(c0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static final String m32104h(String str, Object... objArr) {
        C19383o.m32797g(str, ResponseConstants.FORMAT);
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: i */
    public static final boolean m32105i(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C19383o.m32797g(strArr, "$this$hasIntersection");
        C19383o.m32797g(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public static final long m32106j(C20018z zVar) {
        String a = zVar.f44367h.mo72948a(HttpHeaders.CONTENT_LENGTH);
        if (a != null) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    /* renamed from: k */
    public static final <T> List<T> m32107k(T... tArr) {
        C19383o.m32797g(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C17782b.m29865e0(Arrays.copyOf(objArr, objArr.length)));
        C19383o.m32796f(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: l */
    public static final int m32108l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C19383o.m32799i(charAt, 31) <= 0 || C19383o.m32799i(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static final int m32109m(int i, int i2, String str) {
        C19383o.m32797g(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static final int m32110n(int i, int i2, String str) {
        C19383o.m32797g(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    /* renamed from: o */
    public static final String[] m32111o(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C19383o.m32797g(strArr2, "other");
        C19383o.m32797g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: p */
    public static final int m32112p(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: q */
    public static final Charset m32113q(C19897i iVar, Charset charset) throws IOException {
        Charset charset2;
        C19383o.m32797g(iVar, "$this$readBomAsCharset");
        C19383o.m32797g(charset, "default");
        int b0 = iVar.mo72728b0(f42304d);
        if (b0 == -1) {
            return charset;
        }
        if (b0 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            C19383o.m32796f(charset3, "UTF_8");
            return charset3;
        } else if (b0 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            C19383o.m32796f(charset4, "UTF_16BE");
            return charset4;
        } else if (b0 != 2) {
            if (b0 == 3) {
                C19446a.f43372a.getClass();
                charset2 = C19446a.f43376e;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32BE");
                    C19383o.m32796f(charset2, "forName(\"UTF-32BE\")");
                    C19446a.f43376e = charset2;
                }
            } else if (b0 == 4) {
                C19446a.f43372a.getClass();
                charset2 = C19446a.f43375d;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32LE");
                    C19383o.m32796f(charset2, "forName(\"UTF-32LE\")");
                    C19446a.f43375d = charset2;
                }
            } else {
                throw new AssertionError();
            }
            return charset2;
        } else {
            Charset charset5 = StandardCharsets.UTF_16LE;
            C19383o.m32796f(charset5, "UTF_16LE");
            return charset5;
        }
    }

    /* renamed from: r */
    public static final int m32114r(C19897i iVar) throws IOException {
        C19383o.m32797g(iVar, "$this$readMedium");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.mo68547m().mo72699a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.mo68547m().mo72702d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return r12;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m32115s(p756lr.C19888c0 r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "$this$skipAll"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            long r0 = java.lang.System.nanoTime()
            lr.d0 r2 = r11.mo68547m()
            boolean r2 = r2.mo72703e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            lr.d0 r2 = r11.mo68547m()
            long r5 = r2.mo72701c()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            lr.d0 r2 = r11.mo68547m()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo72702d(r12)
            lr.f r12 = new lr.f     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo68544J(r12, r7)     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.mo72726a()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            lr.d0 r11 = r11.mo68547m()
            r11.mo72699a()
            goto L_0x0080
        L_0x005b:
            lr.d0 r11 = r11.mo68547m()
            long r0 = r0 + r5
            r11.mo72702d(r0)
            goto L_0x0080
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0071
            lr.d0 r11 = r11.mo68547m()
            r11.mo72699a()
            goto L_0x0079
        L_0x0071:
            lr.d0 r11 = r11.mo68547m()
            long r0 = r0 + r5
            r11.mo72702d(r0)
        L_0x0079:
            throw r12
        L_0x007a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x0080:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p735br.C18980c.m32115s(lr.c0, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: t */
    public static final C19994o m32116t(List<C19022a> list) {
        C19383o.m32797g(list, "$this$toHeaders");
        C19994o.C19995a aVar = new C19994o.C19995a();
        for (C19022a next : list) {
            aVar.mo72960c(next.f42396b.utf8(), next.f42397c.utf8());
        }
        return aVar.mo72961d();
    }

    /* renamed from: u */
    public static final String m32117u(C19997p pVar, boolean z) {
        C19383o.m32797g(pVar, "$this$toHostHeader");
        String c = C19459m.m33036e1(pVar.f44243e, MessageDraft.IMAGE_DELIMITER, false) ? C0391c.m1057c(C0326j.m866k('['), pVar.f44243e, ']') : pVar.f44243e;
        if (!z) {
            int i = pVar.f44244f;
            C19997p.C19999b bVar = C19997p.f44238l;
            String str = pVar.f44240b;
            bVar.getClass();
            if (i == C19997p.C19999b.m34233b(str)) {
                return c;
            }
        }
        return c + ':' + pVar.f44244f;
    }

    /* renamed from: v */
    public static final <T> List<T> m32118v(List<? extends T> list) {
        C19383o.m32797g(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C19327t.m32661q1(list));
        C19383o.m32796f(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: w */
    public static final int m32119w(int i, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: x */
    public static final String m32120x(int i, int i2, String str) {
        int m = m32109m(i, i2, str);
        String substring = str.substring(m, m32110n(m, i2, str));
        C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: y */
    public static final void m32121y(IOException iOException, List list) {
        C19383o.m32797g(iOException, "$this$withSuppressed");
        C19383o.m32797g(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17782b.m29886t(iOException, (Exception) it.next());
        }
    }
}
