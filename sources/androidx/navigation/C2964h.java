package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import androidx.navigation.C2957f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p193o.C7507j;
import p514bk.C14088a;
import p772tq.C20203a;

/* renamed from: androidx.navigation.h */
public class C2964h {

    /* renamed from: b */
    public final String f6726b;

    /* renamed from: c */
    public C2966i f6727c;

    /* renamed from: d */
    public int f6728d;

    /* renamed from: e */
    public String f6729e;

    /* renamed from: f */
    public CharSequence f6730f;

    /* renamed from: g */
    public ArrayList<C2957f> f6731g;

    /* renamed from: h */
    public C7507j<C14088a> f6732h;

    /* renamed from: i */
    public HashMap<String, C2952c> f6733i;

    /* renamed from: androidx.navigation.h$a */
    public static class C2965a implements Comparable<C2965a> {

        /* renamed from: b */
        public final C2964h f6734b;

        /* renamed from: c */
        public final Bundle f6735c;

        /* renamed from: d */
        public final boolean f6736d;

        /* renamed from: e */
        public final boolean f6737e;

        /* renamed from: f */
        public final int f6738f;

        public C2965a(C2964h hVar, Bundle bundle, boolean z, boolean z2, int i) {
            this.f6734b = hVar;
            this.f6735c = bundle;
            this.f6736d = z;
            this.f6737e = z2;
            this.f6738f = i;
        }

        /* renamed from: a */
        public final int compareTo(C2965a aVar) {
            boolean z = this.f6736d;
            if (z && !aVar.f6736d) {
                return 1;
            }
            if (!z && aVar.f6736d) {
                return -1;
            }
            Bundle bundle = this.f6735c;
            if (bundle != null && aVar.f6735c == null) {
                return 1;
            }
            if (bundle == null && aVar.f6735c != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f6735c.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f6737e;
            if (z2 && !aVar.f6737e) {
                return 1;
            }
            if (z2 || !aVar.f6737e) {
                return this.f6738f - aVar.f6738f;
            }
            return -1;
        }
    }

    static {
        new HashMap();
    }

    public C2964h(C2990p<? extends C2964h> pVar) {
        this.f6726b = C2992q.m7001b(pVar.getClass());
    }

    /* renamed from: c */
    public static String m6910c(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    /* renamed from: a */
    public final Bundle mo10967a(Bundle bundle) {
        HashMap<String, C2952c> hashMap;
        if (bundle == null && ((hashMap = this.f6733i) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, C2952c> hashMap2 = this.f6733i;
        if (hashMap2 != null) {
            for (Map.Entry next : hashMap2.entrySet()) {
                C2952c cVar = (C2952c) next.getValue();
                String str = (String) next.getKey();
                if (cVar.f6686c) {
                    cVar.f6684a.mo10984d(bundle2, cVar.f6687d, str);
                }
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, C2952c> hashMap3 = this.f6733i;
            if (hashMap3 != null) {
                for (Map.Entry next2 : hashMap3.entrySet()) {
                    C2952c cVar2 = (C2952c) next2.getValue();
                    String str2 = (String) next2.getKey();
                    boolean z = false;
                    if (cVar2.f6685b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                        try {
                            cVar2.f6684a.mo10981a(bundle2, str2);
                            z = true;
                            continue;
                        } catch (ClassCastException unused) {
                            continue;
                        }
                    }
                    if (!z) {
                        StringBuilder h = C0072d.m201h("Wrong argument type for '");
                        h.append((String) next2.getKey());
                        h.append("' in argument bundle. ");
                        h.append(((C2952c) next2.getValue()).f6684a.mo10982b());
                        h.append(" expected.");
                        throw new IllegalArgumentException(h.toString());
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: e */
    public C2965a mo10968e(C2963g gVar) {
        Bundle bundle;
        int i;
        int i2;
        Bundle bundle2;
        Matcher matcher;
        Uri uri;
        boolean z;
        boolean z2;
        C2963g gVar2 = gVar;
        ArrayList<C2957f> arrayList = this.f6731g;
        if (arrayList == null) {
            return null;
        }
        Iterator<C2957f> it = arrayList.iterator();
        C2965a aVar = null;
        while (it.hasNext()) {
            C2957f next = it.next();
            Uri uri2 = gVar2.f6723a;
            if (uri2 != null) {
                HashMap<String, C2952c> hashMap = this.f6733i;
                Map<String, C2952c> emptyMap = hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(hashMap);
                Matcher matcher2 = next.f6704c.matcher(uri2.toString());
                if (matcher2.matches()) {
                    bundle2 = new Bundle();
                    int size = next.f6702a.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            String str = next.f6702a.get(i3);
                            i3++;
                            String decode = Uri.decode(matcher2.group(i3));
                            C2952c cVar = emptyMap.get(str);
                            if (cVar != null) {
                                C2972n nVar = cVar.f6684a;
                                try {
                                    nVar.mo10984d(bundle2, nVar.mo10983c(decode), str);
                                } catch (IllegalArgumentException unused) {
                                    z2 = true;
                                }
                            } else {
                                bundle2.putString(str, decode);
                            }
                            z2 = false;
                            if (z2) {
                                break;
                            }
                        } else if (next.f6706e) {
                            Iterator it2 = next.f6703b.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String str2 = (String) it2.next();
                                C2957f.C2958a aVar2 = (C2957f.C2958a) next.f6703b.get(str2);
                                String queryParameter = uri2.getQueryParameter(str2);
                                if (queryParameter != null) {
                                    matcher = Pattern.compile(aVar2.f6710a).matcher(queryParameter);
                                    if (!matcher.matches()) {
                                        break;
                                    }
                                } else {
                                    matcher = null;
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 < aVar2.f6711b.size()) {
                                        String decode2 = matcher != null ? Uri.decode(matcher.group(i4 + 1)) : null;
                                        String str3 = aVar2.f6711b.get(i4);
                                        C2952c cVar2 = emptyMap.get(str3);
                                        if (decode2 != null) {
                                            uri = uri2;
                                            if (decode2.replaceAll("[{}]", "").equals(str3)) {
                                                continue;
                                            } else {
                                                if (cVar2 != null) {
                                                    C2972n nVar2 = cVar2.f6684a;
                                                    try {
                                                        nVar2.mo10984d(bundle2, nVar2.mo10983c(decode2), str3);
                                                    } catch (IllegalArgumentException unused2) {
                                                        z = true;
                                                    }
                                                } else {
                                                    bundle2.putString(str3, decode2);
                                                }
                                                z = false;
                                                if (z) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            uri = uri2;
                                        }
                                        i4++;
                                        uri2 = uri;
                                    }
                                }
                            }
                        }
                    }
                    bundle = bundle2;
                }
                bundle2 = null;
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str4 = gVar2.f6724b;
            boolean z3 = str4 != null && str4.equals(next.f6707f);
            String str5 = gVar2.f6725c;
            if (str5 != null) {
                if (next.f6709h == null || !next.f6708g.matcher(str5).matches()) {
                    i2 = -1;
                } else {
                    String[] split = next.f6709h.split("/", -1);
                    String str6 = split[0];
                    String str7 = split[1];
                    String[] split2 = str5.split("/", -1);
                    String str8 = split2[0];
                    String str9 = split2[1];
                    i2 = str6.equals(str8) ? 2 : 0;
                    if (str7.equals(str9)) {
                        i2++;
                    }
                }
                i = i2;
            } else {
                i = -1;
            }
            if (bundle != null || z3 || i > -1) {
                C2965a aVar3 = new C2965a(this, bundle, next.f6705d, z3, i);
                if (aVar == null || aVar3.compareTo(aVar) > 0) {
                    aVar = aVar3;
                }
            }
        }
        return aVar;
    }

    /* renamed from: g */
    public void mo10954g(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C20203a.f44792v);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        this.f6728d = resourceId;
        this.f6729e = null;
        this.f6729e = m6910c(context, resourceId);
        this.f6730f = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f6729e;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f6728d));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.f6730f != null) {
            sb.append(" label=");
            sb.append(this.f6730f);
        }
        return sb.toString();
    }
}
