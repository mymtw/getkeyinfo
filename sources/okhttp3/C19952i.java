package okhttp3;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.session.C0087d;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.pyplcheckout.addshipping.ShippingUtilsKt;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p003a2.C0023f;
import p735br.C18980c;
import p739dr.C19002c;

/* renamed from: okhttp3.i */
public final class C19952i {

    /* renamed from: j */
    public static final Pattern f44049j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f44050k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f44051l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f44052m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final C19953a f44053n = new C19953a();

    /* renamed from: a */
    public final String f44054a;

    /* renamed from: b */
    public final String f44055b;

    /* renamed from: c */
    public final long f44056c;

    /* renamed from: d */
    public final String f44057d;

    /* renamed from: e */
    public final String f44058e;

    /* renamed from: f */
    public final boolean f44059f;

    /* renamed from: g */
    public final boolean f44060g;

    /* renamed from: h */
    public final boolean f44061h;

    /* renamed from: i */
    public final boolean f44062i;

    /* renamed from: okhttp3.i$a */
    public static final class C19953a {
        /* renamed from: a */
        public static int m34115a(int i, int i2, String str, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* renamed from: b */
        public static long m34116b(int i, String str) {
            int a = m34115a(0, i, str, false);
            Matcher matcher = C19952i.f44052m.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            while (a < i) {
                int a2 = m34115a(a + 1, i, str, true);
                matcher.region(a, a2);
                if (i3 == -1 && matcher.usePattern(C19952i.f44052m).matches()) {
                    String group = matcher.group(1);
                    C19383o.m32796f(group, "matcher.group(1)");
                    i3 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C19383o.m32796f(group2, "matcher.group(2)");
                    i6 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C19383o.m32796f(group3, "matcher.group(3)");
                    i7 = Integer.parseInt(group3);
                } else if (i4 != -1 || !matcher.usePattern(C19952i.f44051l).matches()) {
                    if (i5 == -1) {
                        Pattern pattern = C19952i.f44050k;
                        if (matcher.usePattern(pattern).matches()) {
                            String group4 = matcher.group(1);
                            C19383o.m32796f(group4, "matcher.group(1)");
                            Locale locale = Locale.US;
                            String g = C0087d.m237g(locale, "Locale.US", group4, locale, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            C19383o.m32796f(pattern2, "MONTH_PATTERN.pattern()");
                            i5 = C19459m.m33043l1(pattern2, g, 0, false, 6) / 4;
                        }
                    }
                    if (i2 == -1 && matcher.usePattern(C19952i.f44049j).matches()) {
                        String group5 = matcher.group(1);
                        C19383o.m32796f(group5, "matcher.group(1)");
                        i2 = Integer.parseInt(group5);
                    }
                } else {
                    String group6 = matcher.group(1);
                    C19383o.m32796f(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
                a = m34115a(a2 + 1, i, str, false);
            }
            if (70 <= i2 && 99 >= i2) {
                i2 += ShippingUtilsKt.lowHeightScreen;
            }
            if (i2 >= 0 && 69 >= i2) {
                i2 += RecyclerView.MAX_SCROLL_DURATION;
            }
            if (i2 >= 1601) {
                if (i5 != -1) {
                    if (1 <= i4 && 31 >= i4) {
                        if (i3 >= 0 && 23 >= i3) {
                            if (i6 >= 0 && 59 >= i6) {
                                if (i7 >= 0 && 59 >= i7) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C18980c.f42305e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i2);
                                    gregorianCalendar.set(2, i5 - 1);
                                    gregorianCalendar.set(5, i4);
                                    gregorianCalendar.set(11, i3);
                                    gregorianCalendar.set(12, i6);
                                    gregorianCalendar.set(13, i7);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public C19952i(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f44054a = str;
        this.f44055b = str2;
        this.f44056c = j;
        this.f44057d = str3;
        this.f44058e = str4;
        this.f44059f = z;
        this.f44060g = z2;
        this.f44061h = z3;
        this.f44062i = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19952i) {
            C19952i iVar = (C19952i) obj;
            return C19383o.m32792b(iVar.f44054a, this.f44054a) && C19383o.m32792b(iVar.f44055b, this.f44055b) && iVar.f44056c == this.f44056c && C19383o.m32792b(iVar.f44057d, this.f44057d) && C19383o.m32792b(iVar.f44058e, this.f44058e) && iVar.f44059f == this.f44059f && iVar.f44060g == this.f44060g && iVar.f44061h == this.f44061h && iVar.f44062i == this.f44062i;
        }
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int e = C0023f.m105e(this.f44058e, C0023f.m105e(this.f44057d, C0071c.m190b(this.f44056c, C0023f.m105e(this.f44055b, C0023f.m105e(this.f44054a, 527, 31), 31), 31), 31), 31);
        int hashCode = Boolean.hashCode(this.f44060g);
        int hashCode2 = Boolean.hashCode(this.f44061h);
        return Boolean.hashCode(this.f44062i) + ((hashCode2 + ((hashCode + ((Boolean.hashCode(this.f44059f) + e) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44054a);
        sb.append('=');
        sb.append(this.f44055b);
        if (this.f44061h) {
            if (this.f44056c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) C19002c.f42343a.get()).format(new Date(this.f44056c));
                C19383o.m32796f(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f44062i) {
            sb.append("; domain=");
            sb.append(this.f44057d);
        }
        sb.append("; path=");
        sb.append(this.f44058e);
        if (this.f44059f) {
            sb.append("; secure");
        }
        if (this.f44060g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "toString()");
        return sb2;
    }
}
