package retrofit2;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19994o;
import okhttp3.C20004s;
import okhttp3.C20016y;
import org.apache.http.entity.mime.MIME;
import p003a2.C0023f;
import p010a9.C0048b;
import p504ai.C13983i;
import p756lr.C19893f;
import retrofit2.C20078a;

/* renamed from: retrofit2.r */
public abstract class C20122r<T> {

    /* renamed from: retrofit2.r$a */
    public static final class C20123a<T> extends C20122r<T> {

        /* renamed from: a */
        public final Method f44520a;

        /* renamed from: b */
        public final int f44521b;

        /* renamed from: c */
        public final C20099f<T, C20016y> f44522c;

        public C20123a(Method method, int i, C20099f<T, C20016y> fVar) {
            this.f44520a = method;
            this.f44521b = i;
            this.f44522c = fVar;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, T t) {
            if (t != null) {
                try {
                    tVar.f44575k = this.f44522c.convert(t);
                } catch (IOException e) {
                    throw C20085a0.m34349l(this.f44520a, e, this.f44521b, C13983i.m21494m("Unable to convert ", t, " to RequestBody"), new Object[0]);
                }
            } else {
                throw C20085a0.m34348k(this.f44520a, this.f44521b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: retrofit2.r$b */
    public static final class C20124b<T> extends C20122r<T> {

        /* renamed from: a */
        public final String f44523a;

        /* renamed from: b */
        public final C20099f<T, String> f44524b;

        /* renamed from: c */
        public final boolean f44525c;

        public C20124b(String str, boolean z) {
            C20078a.C20082d dVar = C20078a.C20082d.f44465a;
            Objects.requireNonNull(str, "name == null");
            this.f44523a = str;
            this.f44524b = dVar;
            this.f44525c = z;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.f44524b.convert(t)) != null) {
                tVar.mo74379a(this.f44523a, convert, this.f44525c);
            }
        }
    }

    /* renamed from: retrofit2.r$c */
    public static final class C20125c<T> extends C20122r<Map<String, T>> {

        /* renamed from: a */
        public final Method f44526a;

        /* renamed from: b */
        public final int f44527b;

        /* renamed from: c */
        public final boolean f44528c;

        public C20125c(Method method, int i, boolean z) {
            this.f44526a = method;
            this.f44527b = i;
            this.f44528c = z;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                tVar.mo74379a(str, obj2, this.f44528c);
                            } else {
                                Method method = this.f44526a;
                                int i = this.f44527b;
                                throw C20085a0.m34348k(method, i, "Field map value '" + value + "' converted to null by " + C20078a.C20082d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw C20085a0.m34348k(this.f44526a, this.f44527b, C0048b.m163a("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C20085a0.m34348k(this.f44526a, this.f44527b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C20085a0.m34348k(this.f44526a, this.f44527b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.r$d */
    public static final class C20126d<T> extends C20122r<T> {

        /* renamed from: a */
        public final String f44529a;

        /* renamed from: b */
        public final C20099f<T, String> f44530b;

        public C20126d(String str) {
            C20078a.C20082d dVar = C20078a.C20082d.f44465a;
            Objects.requireNonNull(str, "name == null");
            this.f44529a = str;
            this.f44530b = dVar;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.f44530b.convert(t)) != null) {
                tVar.mo74380b(this.f44529a, convert);
            }
        }
    }

    /* renamed from: retrofit2.r$e */
    public static final class C20127e<T> extends C20122r<Map<String, T>> {

        /* renamed from: a */
        public final Method f44531a;

        /* renamed from: b */
        public final int f44532b;

        public C20127e(Method method, int i) {
            this.f44531a = method;
            this.f44532b = i;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            tVar.mo74380b(str, value.toString());
                        } else {
                            throw C20085a0.m34348k(this.f44531a, this.f44532b, C0048b.m163a("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C20085a0.m34348k(this.f44531a, this.f44532b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C20085a0.m34348k(this.f44531a, this.f44532b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.r$f */
    public static final class C20128f extends C20122r<C19994o> {

        /* renamed from: a */
        public final Method f44533a;

        /* renamed from: b */
        public final int f44534b;

        public C20128f(int i, Method method) {
            this.f44533a = method;
            this.f44534b = i;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, Object obj) throws IOException {
            C19994o oVar = (C19994o) obj;
            if (oVar != null) {
                C19994o.C19995a aVar = tVar.f44570f;
                aVar.getClass();
                int length = oVar.f44235b.length / 2;
                for (int i = 0; i < length; i++) {
                    aVar.mo72960c(oVar.mo72949c(i), oVar.mo72955m(i));
                }
                return;
            }
            throw C20085a0.m34348k(this.f44533a, this.f44534b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.r$g */
    public static final class C20129g<T> extends C20122r<T> {

        /* renamed from: a */
        public final Method f44535a;

        /* renamed from: b */
        public final int f44536b;

        /* renamed from: c */
        public final C19994o f44537c;

        /* renamed from: d */
        public final C20099f<T, C20016y> f44538d;

        public C20129g(Method method, int i, C19994o oVar, C20099f<T, C20016y> fVar) {
            this.f44535a = method;
            this.f44536b = i;
            this.f44537c = oVar;
            this.f44538d = fVar;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, T t) {
            if (t != null) {
                try {
                    C20016y convert = this.f44538d.convert(t);
                    C19994o oVar = this.f44537c;
                    C20004s.C20005a aVar = tVar.f44573i;
                    aVar.getClass();
                    C19383o.m32797g(convert, DetailsBottomSheetNavigationKey.PARAM_BODY);
                    C20004s.C20007c.f44276c.getClass();
                    aVar.f44275c.add(C20004s.C20007c.C20008a.m34253a(oVar, convert));
                } catch (IOException e) {
                    throw C20085a0.m34348k(this.f44535a, this.f44536b, C13983i.m21494m("Unable to convert ", t, " to RequestBody"), e);
                }
            }
        }
    }

    /* renamed from: retrofit2.r$h */
    public static final class C20130h<T> extends C20122r<Map<String, T>> {

        /* renamed from: a */
        public final Method f44539a;

        /* renamed from: b */
        public final int f44540b;

        /* renamed from: c */
        public final C20099f<T, C20016y> f44541c;

        /* renamed from: d */
        public final String f44542d;

        public C20130h(Method method, int i, C20099f<T, C20016y> fVar, String str) {
            this.f44539a = method;
            this.f44540b = i;
            this.f44541c = fVar;
            this.f44542d = str;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String[] strArr = {MIME.CONTENT_DISPOSITION, C0048b.m163a("form-data; name=\"", str, "\""), MIME.CONTENT_TRANSFER_ENC, this.f44542d};
                            C19994o.f44234c.getClass();
                            C19994o c = C19994o.C19996b.m34216c(strArr);
                            C20016y convert = this.f44541c.convert(value);
                            C20004s.C20005a aVar = tVar.f44573i;
                            aVar.getClass();
                            C19383o.m32797g(convert, DetailsBottomSheetNavigationKey.PARAM_BODY);
                            C20004s.C20007c.f44276c.getClass();
                            aVar.f44275c.add(C20004s.C20007c.C20008a.m34253a(c, convert));
                        } else {
                            throw C20085a0.m34348k(this.f44539a, this.f44540b, C0048b.m163a("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C20085a0.m34348k(this.f44539a, this.f44540b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C20085a0.m34348k(this.f44539a, this.f44540b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.r$i */
    public static final class C20131i<T> extends C20122r<T> {

        /* renamed from: a */
        public final Method f44543a;

        /* renamed from: b */
        public final int f44544b;

        /* renamed from: c */
        public final String f44545c;

        /* renamed from: d */
        public final C20099f<T, String> f44546d;

        /* renamed from: e */
        public final boolean f44547e;

        public C20131i(Method method, int i, String str, boolean z) {
            C20078a.C20082d dVar = C20078a.C20082d.f44465a;
            this.f44543a = method;
            this.f44544b = i;
            Objects.requireNonNull(str, "name == null");
            this.f44545c = str;
            this.f44546d = dVar;
            this.f44547e = z;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, T t) throws IOException {
            String str;
            int i;
            int i2;
            C20141t tVar2 = tVar;
            T t2 = t;
            if (t2 != null) {
                String str2 = this.f44545c;
                String convert = this.f44546d.convert(t2);
                boolean z = this.f44547e;
                if (tVar2.f44567c != null) {
                    int length = convert.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            str = convert;
                            break;
                        }
                        int codePointAt = convert.codePointAt(i3);
                        i = -1;
                        i2 = 127;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            C19893f fVar = new C19893f();
                            fVar.mo72714F0(0, i3, convert);
                            C19893f fVar2 = null;
                        } else {
                            i3 += Character.charCount(codePointAt);
                        }
                    }
                    C19893f fVar3 = new C19893f();
                    fVar3.mo72714F0(0, i3, convert);
                    C19893f fVar22 = null;
                    while (i3 < length) {
                        int codePointAt2 = convert.codePointAt(i3);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= i2 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new C19893f();
                                }
                                fVar22.mo72717H0(codePointAt2);
                                while (!fVar22.mo72733e0()) {
                                    byte readByte = fVar22.readByte() & 255;
                                    fVar3.mo72771x0(37);
                                    char[] cArr = C20141t.f44563l;
                                    fVar3.mo72771x0(cArr[(readByte >> 4) & 15]);
                                    fVar3.mo72771x0(cArr[readByte & 15]);
                                }
                            } else {
                                fVar3.mo72717H0(codePointAt2);
                            }
                        }
                        i3 += Character.charCount(codePointAt2);
                        i = -1;
                        i2 = 127;
                    }
                    str = fVar3.mo72708B();
                    String replace = tVar2.f44567c.replace("{" + str2 + "}", str);
                    if (!C20141t.f44564m.matcher(replace).matches()) {
                        tVar2.f44567c = replace;
                        return;
                    }
                    throw new IllegalArgumentException(C0326j.m864i("@Path parameters shouldn't perform path traversal ('.' or '..'): ", convert));
                }
                throw new AssertionError();
            }
            throw C20085a0.m34348k(this.f44543a, this.f44544b, C0023f.m110k(C0072d.m201h("Path parameter \""), this.f44545c, "\" value must not be null."), new Object[0]);
        }
    }

    /* renamed from: retrofit2.r$j */
    public static final class C20132j<T> extends C20122r<T> {

        /* renamed from: a */
        public final String f44548a;

        /* renamed from: b */
        public final C20099f<T, String> f44549b;

        /* renamed from: c */
        public final boolean f44550c;

        public C20132j(String str, boolean z) {
            C20078a.C20082d dVar = C20078a.C20082d.f44465a;
            Objects.requireNonNull(str, "name == null");
            this.f44548a = str;
            this.f44549b = dVar;
            this.f44550c = z;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.f44549b.convert(t)) != null) {
                tVar.mo74381c(this.f44548a, convert, this.f44550c);
            }
        }
    }

    /* renamed from: retrofit2.r$k */
    public static final class C20133k<T> extends C20122r<Map<String, T>> {

        /* renamed from: a */
        public final Method f44551a;

        /* renamed from: b */
        public final int f44552b;

        /* renamed from: c */
        public final boolean f44553c;

        public C20133k(Method method, int i, boolean z) {
            this.f44551a = method;
            this.f44552b = i;
            this.f44553c = z;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                tVar.mo74381c(str, obj2, this.f44553c);
                            } else {
                                Method method = this.f44551a;
                                int i = this.f44552b;
                                throw C20085a0.m34348k(method, i, "Query map value '" + value + "' converted to null by " + C20078a.C20082d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw C20085a0.m34348k(this.f44551a, this.f44552b, C0048b.m163a("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C20085a0.m34348k(this.f44551a, this.f44552b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C20085a0.m34348k(this.f44551a, this.f44552b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: retrofit2.r$l */
    public static final class C20134l<T> extends C20122r<T> {

        /* renamed from: a */
        public final boolean f44554a;

        public C20134l(boolean z) {
            this.f44554a = z;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, T t) throws IOException {
            if (t != null) {
                tVar.mo74381c(t.toString(), (String) null, this.f44554a);
            }
        }
    }

    /* renamed from: retrofit2.r$m */
    public static final class C20135m extends C20122r<C20004s.C20007c> {

        /* renamed from: a */
        public static final C20135m f44555a = new C20135m();

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, Object obj) throws IOException {
            C20004s.C20007c cVar = (C20004s.C20007c) obj;
            if (cVar != null) {
                C20004s.C20005a aVar = tVar.f44573i;
                aVar.getClass();
                aVar.f44275c.add(cVar);
            }
        }
    }

    /* renamed from: retrofit2.r$n */
    public static final class C20136n extends C20122r<Object> {

        /* renamed from: a */
        public final Method f44556a;

        /* renamed from: b */
        public final int f44557b;

        public C20136n(int i, Method method) {
            this.f44556a = method;
            this.f44557b = i;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, Object obj) {
            if (obj != null) {
                tVar.f44567c = obj.toString();
                return;
            }
            throw C20085a0.m34348k(this.f44556a, this.f44557b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.r$o */
    public static final class C20137o<T> extends C20122r<T> {

        /* renamed from: a */
        public final Class<T> f44558a;

        public C20137o(Class<T> cls) {
            this.f44558a = cls;
        }

        /* renamed from: a */
        public final void mo74375a(C20141t tVar, T t) {
            tVar.f44569e.mo73002e(this.f44558a, t);
        }
    }

    /* renamed from: a */
    public abstract void mo74375a(C20141t tVar, T t) throws IOException;
}
