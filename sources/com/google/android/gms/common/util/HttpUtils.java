package com.google.android.gms.common.util;

import androidx.compose.p015ui.text.font.C1962p;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.C14468h;
import com.google.android.gms.internal.common.C14470j;
import com.google.android.gms.internal.common.C14471k;
import com.google.android.gms.internal.common.C14473m;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@KeepForSdk
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    @KeepForSdk
    public static Map<String, String> parse(URI uri, String str) {
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        HashMap hashMap = emptyMap;
        if (rawQuery != null) {
            hashMap = emptyMap;
            if (rawQuery.length() > 0) {
                HashMap hashMap2 = new HashMap();
                C1962p pVar = new C1962p((Object) new C14468h('='));
                C14470j jVar = C14470j.f32600c;
                C14473m mVar = new C14473m(pVar, false, jVar);
                C14473m mVar2 = new C14473m(new C1962p((Object) new C14468h('&')), true, jVar);
                C14471k kVar = new C14471k(mVar2.f32610c, mVar2, rawQuery);
                while (kVar.hasNext()) {
                    String str2 = (String) kVar.next();
                    str2.getClass();
                    C14471k kVar2 = new C14471k(mVar.f32610c, mVar, str2);
                    ArrayList arrayList = new ArrayList();
                    while (kVar2.hasNext()) {
                        arrayList.add((String) kVar2.next());
                    }
                    List unmodifiableList = Collections.unmodifiableList(arrayList);
                    if (unmodifiableList.isEmpty() || unmodifiableList.size() > 2) {
                        throw new IllegalArgumentException("bad parameter");
                    }
                    hashMap2.put(zza((String) unmodifiableList.get(0), str), unmodifiableList.size() == 2 ? zza((String) unmodifiableList.get(1), str) : null);
                }
                hashMap = hashMap2;
            }
        }
        return hashMap;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
