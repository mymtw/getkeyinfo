package p592in;

import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import p568fn.C17781a;
import p576gn.C17801b;

/* renamed from: in.h */
public final class C17876h {

    /* renamed from: a */
    public static final Pattern f38820a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m30011a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C17781a.m29823d().mo69014a("The content-length value is not a valid number");
            return null;
        }
    }

    /* renamed from: b */
    public static String m30012b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* renamed from: c */
    public static void m30013c(C17801b bVar) {
        if (!((NetworkRequestMetric) bVar.f38700e.f37158c).mo59383a0()) {
            NetworkRequestMetric.C16642b bVar2 = bVar.f38700e;
            NetworkRequestMetric.NetworkClientErrorReason networkClientErrorReason = NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
            bVar2.mo59761u();
            NetworkRequestMetric.m27500A((NetworkRequestMetric) bVar2.f37158c, networkClientErrorReason);
        }
        bVar.mo69034a();
    }
}
