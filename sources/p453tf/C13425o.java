package p453tf;

import com.facebook.GraphRequest;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

/* renamed from: tf.o */
public final class C13425o implements GraphRequest.C12198e {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f29409a;

    public C13425o(ArrayList arrayList) {
        this.f29409a = arrayList;
    }

    /* renamed from: a */
    public final void mo39239a(String str, String str2) throws IOException {
        C19383o.m32797g(str2, "value");
        ArrayList arrayList = this.f29409a;
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
        C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
        arrayList.add(format);
    }
}
