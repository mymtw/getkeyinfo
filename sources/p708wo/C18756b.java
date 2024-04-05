package p708wo;

import android.net.Uri;
import android.text.TextUtils;
import com.etsy.android.lib.requests.EtsyRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wo.b */
public final class C18756b {
    /* renamed from: a */
    public static void m31633a(Uri.Builder builder, String str, Object obj) {
        if (obj != null && obj.toString() != null) {
            builder.appendQueryParameter(str, obj.toString());
        }
    }

    /* renamed from: b */
    public static String m31634b(HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                arrayList.add(((String) entry.getKey()) + "=" + URLEncoder.encode((String) entry.getValue(), EtsyRequest.CONTENT_ENCODING));
            } catch (UnsupportedEncodingException unused) {
                C18755a.m31631b().mo70245c(6, (Exception) null, "Could not utf-8 encode.", new Object[0]);
            }
        }
        return TextUtils.join("&", arrayList);
    }
}
