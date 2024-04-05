package p029bh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.datatransport.cct.internal.C6511h;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.backends.C6535i;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.C19388s;
import p132hh.C6963a;
import p674sm.C18534a;

/* renamed from: bh.b */
public final class C3508b implements C6535i {

    /* renamed from: a */
    public final C18534a f8126a = C6511h.createDataEncoder();

    /* renamed from: b */
    public final ConnectivityManager f8127b;

    /* renamed from: c */
    public final Context f8128c;

    /* renamed from: d */
    public final URL f8129d;

    /* renamed from: e */
    public final C6963a f8130e;

    /* renamed from: f */
    public final C6963a f8131f;

    /* renamed from: g */
    public final int f8132g;

    /* renamed from: bh.b$a */
    public static final class C3509a {

        /* renamed from: a */
        public final URL f8133a;

        /* renamed from: b */
        public final C6511h f8134b;

        /* renamed from: c */
        public final String f8135c;

        public C3509a(URL url, C6511h hVar, String str) {
            this.f8133a = url;
            this.f8134b = hVar;
            this.f8135c = str;
        }
    }

    /* renamed from: bh.b$b */
    public static final class C3510b {

        /* renamed from: a */
        public final int f8136a;

        /* renamed from: b */
        public final URL f8137b;

        /* renamed from: c */
        public final long f8138c;

        public C3510b(int i, URL url, long j) {
            this.f8136a = i;
            this.f8137b = url;
            this.f8138c = j;
        }
    }

    public C3508b(Context context, C6963a aVar, C6963a aVar2) {
        this.f8128c = context;
        this.f8127b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8129d = m8330c(C3507a.f8121c);
        this.f8130e = aVar2;
        this.f8131f = aVar;
        this.f8132g = 40000;
    }

    /* renamed from: c */
    public static URL m8330c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(C0326j.m864i("Invalid url: ", str), e);
        }
    }

    /* renamed from: a */
    public final C6547k mo13003a(C6547k kVar) {
        int i;
        NetworkInfo activeNetworkInfo = this.f8127b.getActiveNetworkInfo();
        C6547k.C6548a addMetadata = kVar.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata("device", Build.DEVICE).addMetadata("product", Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata("manufacturer", Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        C6547k.C6548a addMetadata2 = addMetadata.addMetadata("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000)).addMetadata("net-type", activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : activeNetworkInfo.getType());
        int i2 = -1;
        if (activeNetworkInfo == null) {
            i = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            i = activeNetworkInfo.getSubtype();
            if (i == -1) {
                i = NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
            } else if (NetworkConnectionInfo.MobileSubtype.forNumber(i) == null) {
                i = 0;
            }
        }
        C6547k.C6548a addMetadata3 = addMetadata2.addMetadata("mobile-subtype", i).addMetadata("country", Locale.getDefault().getCountry()).addMetadata("locale", Locale.getDefault().getLanguage()).addMetadata("mcc_mnc", ((TelephonyManager) this.f8128c.getSystemService(ResponseConstants.PHONE)).getSimOperator());
        Context context = this.f8128c;
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(C19388s.m32864h0("CctTransportBackend"), "Unable to find version code for package", e);
        }
        return addMetadata3.addMetadata("application_build", Integer.toString(i2)).build();
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r6v1, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03c7 A[SYNTHETIC, Splitter:B:129:0x03c7] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0411 A[Catch:{ all -> 0x0395, IOException -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0423 A[Catch:{ all -> 0x0395, IOException -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0426 A[Catch:{ all -> 0x0395, IOException -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x043a A[Catch:{ all -> 0x0395, IOException -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0441 A[Catch:{ all -> 0x0395, IOException -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0434 A[EDGE_INSN: B:187:0x0434->B:157:0x0434 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03d0 A[EDGE_INSN: B:189:0x03d0->B:135:0x03d0 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.datatransport.runtime.backends.BackendResponse mo13004b(com.google.android.datatransport.runtime.backends.C6527c r24) {
        /*
            r23 = this;
            r1 = r23
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Iterable r2 = r24.getEvents()
            java.util.Iterator r2 = r2.iterator()
        L_0x000f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r2.next()
            com.google.android.datatransport.runtime.k r3 = (com.google.android.datatransport.runtime.C6547k) r3
            java.lang.String r4 = r3.getTransportName()
            boolean r5 = r0.containsKey(r4)
            if (r5 != 0) goto L_0x0031
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r3)
            r0.put(r4, r5)
            goto L_0x000f
        L_0x0031:
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            r4.add(r3)
            goto L_0x000f
        L_0x003b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0048:
            boolean r3 = r0.hasNext()
            r4 = 0
            java.lang.String r5 = "CctTransportBackend"
            r6 = 1
            if (r3 == 0) goto L_0x01fc
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r7 = r3.getValue()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r4)
            com.google.android.datatransport.runtime.k r7 = (com.google.android.datatransport.runtime.C6547k) r7
            com.google.android.datatransport.cct.internal.j$a r8 = com.google.android.datatransport.cct.internal.C6514j.builder()
            com.google.android.datatransport.cct.internal.QosTier r9 = com.google.android.datatransport.cct.internal.QosTier.DEFAULT
            com.google.android.datatransport.cct.internal.j$a r8 = r8.setQosTier(r9)
            hh.a r9 = r1.f8131f
            long r9 = r9.mo19124a()
            com.google.android.datatransport.cct.internal.j$a r8 = r8.setRequestTimeMs(r9)
            hh.a r9 = r1.f8130e
            long r9 = r9.mo19124a()
            com.google.android.datatransport.cct.internal.j$a r8 = r8.setRequestUptimeMs(r9)
            com.google.android.datatransport.cct.internal.ClientInfo$a r9 = com.google.android.datatransport.cct.internal.ClientInfo.builder()
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r10 = com.google.android.datatransport.cct.internal.ClientInfo.ClientType.ANDROID_FIREBASE
            com.google.android.datatransport.cct.internal.ClientInfo$a r9 = r9.setClientType(r10)
            com.google.android.datatransport.cct.internal.a$a r10 = com.google.android.datatransport.cct.internal.C6503a.builder()
            java.lang.String r11 = "sdk-version"
            int r11 = r7.getInteger(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setSdkVersion(r11)
            java.lang.String r11 = "model"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setModel(r11)
            java.lang.String r11 = "hardware"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setHardware(r11)
            java.lang.String r11 = "device"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setDevice(r11)
            java.lang.String r11 = "product"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setProduct(r11)
            java.lang.String r11 = "os-uild"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setOsBuild(r11)
            java.lang.String r11 = "manufacturer"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setManufacturer(r11)
            java.lang.String r11 = "fingerprint"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setFingerprint(r11)
            java.lang.String r11 = "country"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setCountry(r11)
            java.lang.String r11 = "locale"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setLocale(r11)
            java.lang.String r11 = "mcc_mnc"
            java.lang.String r11 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r10 = r10.setMccMnc(r11)
            java.lang.String r11 = "application_build"
            java.lang.String r7 = r7.get(r11)
            com.google.android.datatransport.cct.internal.a$a r7 = r10.setApplicationBuild(r7)
            com.google.android.datatransport.cct.internal.a r7 = r7.build()
            com.google.android.datatransport.cct.internal.ClientInfo$a r7 = r9.setAndroidClientInfo(r7)
            com.google.android.datatransport.cct.internal.ClientInfo r7 = r7.build()
            com.google.android.datatransport.cct.internal.j$a r7 = r8.setClientInfo(r7)
            java.lang.Object r8 = r3.getKey()     // Catch:{ NumberFormatException -> 0x012a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x012a }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x012a }
            r7.setSource((int) r8)     // Catch:{ NumberFormatException -> 0x012a }
            goto L_0x0133
        L_0x012a:
            java.lang.Object r8 = r3.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r7.setSource((java.lang.String) r8)
        L_0x0133:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0142:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x01f0
            java.lang.Object r9 = r3.next()
            com.google.android.datatransport.runtime.k r9 = (com.google.android.datatransport.runtime.C6547k) r9
            com.google.android.datatransport.runtime.j r10 = r9.getEncodedPayload()
            com.google.android.datatransport.a r11 = r10.f14482a
            com.google.android.datatransport.a r12 = new com.google.android.datatransport.a
            java.lang.String r13 = "proto"
            r12.<init>(r13)
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0168
            byte[] r10 = r10.f14483b
            com.google.android.datatransport.cct.internal.i$a r10 = com.google.android.datatransport.cct.internal.C6512i.protoBuilder(r10)
            goto L_0x0186
        L_0x0168:
            com.google.android.datatransport.a r12 = new com.google.android.datatransport.a
            java.lang.String r13 = "json"
            r12.<init>(r13)
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x01dd
            java.lang.String r11 = new java.lang.String
            byte[] r10 = r10.f14483b
            java.lang.String r12 = "UTF-8"
            java.nio.charset.Charset r12 = java.nio.charset.Charset.forName(r12)
            r11.<init>(r10, r12)
            com.google.android.datatransport.cct.internal.i$a r10 = com.google.android.datatransport.cct.internal.C6512i.jsonBuilder(r11)
        L_0x0186:
            long r11 = r9.getEventMillis()
            com.google.android.datatransport.cct.internal.i$a r11 = r10.setEventTimeMs(r11)
            long r12 = r9.getUptimeMillis()
            com.google.android.datatransport.cct.internal.i$a r11 = r11.setEventUptimeMs(r12)
            java.lang.String r12 = "tz-offset"
            long r12 = r9.getLong(r12)
            com.google.android.datatransport.cct.internal.i$a r11 = r11.setTimezoneOffsetSeconds(r12)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$a r12 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.builder()
            java.lang.String r13 = "net-type"
            int r13 = r9.getInteger(r13)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r13 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.forNumber(r13)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$a r12 = r12.setNetworkType(r13)
            java.lang.String r13 = "mobile-subtype"
            int r13 = r9.getInteger(r13)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r13 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype.forNumber(r13)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$a r12 = r12.setMobileSubtype(r13)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r12 = r12.build()
            r11.setNetworkConnectionInfo(r12)
            java.lang.Integer r11 = r9.getCode()
            if (r11 == 0) goto L_0x01d4
            java.lang.Integer r9 = r9.getCode()
            r10.setEventCode(r9)
        L_0x01d4:
            com.google.android.datatransport.cct.internal.i r9 = r10.build()
            r8.add(r9)
            goto L_0x0142
        L_0x01dd:
            java.lang.String r9 = kotlin.jvm.internal.C19388s.m32864h0(r5)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r4] = r11
            java.lang.String r11 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r10 = java.lang.String.format(r11, r10)
            android.util.Log.w(r9, r10)
            goto L_0x0142
        L_0x01f0:
            r7.setLogEvents(r8)
            com.google.android.datatransport.cct.internal.j r3 = r7.build()
            r2.add(r3)
            goto L_0x0048
        L_0x01fc:
            com.google.android.datatransport.cct.internal.h r0 = com.google.android.datatransport.cct.internal.C6511h.create(r2)
            java.net.URL r2 = r1.f8129d
            byte[] r3 = r24.getExtras()
            if (r3 == 0) goto L_0x0224
            byte[] r3 = r24.getExtras()     // Catch:{ IllegalArgumentException -> 0x021f }
            bh.a r3 = p029bh.C3507a.m8328a(r3)     // Catch:{ IllegalArgumentException -> 0x021f }
            java.lang.String r8 = r3.f8125b     // Catch:{ IllegalArgumentException -> 0x021f }
            if (r8 == 0) goto L_0x0215
            goto L_0x0216
        L_0x0215:
            r8 = 0
        L_0x0216:
            java.lang.String r3 = r3.f8124a     // Catch:{ IllegalArgumentException -> 0x021f }
            if (r3 == 0) goto L_0x0225
            java.net.URL r2 = m8330c(r3)     // Catch:{ IllegalArgumentException -> 0x021f }
            goto L_0x0225
        L_0x021f:
            com.google.android.datatransport.runtime.backends.BackendResponse r0 = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError()
            return r0
        L_0x0224:
            r8 = 0
        L_0x0225:
            r3 = 5
            bh.b$a r9 = new bh.b$a     // Catch:{ IOException -> 0x0379 }
            r9.<init>(r2, r0, r8)     // Catch:{ IOException -> 0x0379 }
            z8.e r2 = new z8.e     // Catch:{ IOException -> 0x0379 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0379 }
        L_0x0230:
            java.lang.Object r0 = r2.f18503b     // Catch:{ IOException -> 0x0379 }
            bh.b r0 = (p029bh.C3508b) r0     // Catch:{ IOException -> 0x0379 }
            r0.getClass()     // Catch:{ IOException -> 0x0379 }
            java.net.URL r8 = r9.f8133a     // Catch:{ IOException -> 0x0379 }
            java.lang.String r10 = "Making request to: %s"
            kotlin.jvm.internal.C19388s.m32845S(r8, r5, r10)     // Catch:{ IOException -> 0x0379 }
            java.net.URL r8 = r9.f8133a     // Catch:{ IOException -> 0x0379 }
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ IOException -> 0x0379 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ IOException -> 0x0379 }
            r10 = 30000(0x7530, float:4.2039E-41)
            r8.setConnectTimeout(r10)     // Catch:{ IOException -> 0x0379 }
            int r10 = r0.f8132g     // Catch:{ IOException -> 0x0379 }
            r8.setReadTimeout(r10)     // Catch:{ IOException -> 0x0379 }
            r8.setDoOutput(r6)     // Catch:{ IOException -> 0x0379 }
            r8.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r10 = "POST"
            r8.setRequestMethod(r10)     // Catch:{ IOException -> 0x0379 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0379 }
            java.lang.String r11 = "3.1.1"
            r10[r4] = r11     // Catch:{ IOException -> 0x0379 }
            java.lang.String r11 = "datatransport/%s android/"
            java.lang.String r10 = java.lang.String.format(r11, r10)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r11 = "User-Agent"
            r8.setRequestProperty(r11, r10)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r10 = "Content-Encoding"
            java.lang.String r11 = "gzip"
            r8.setRequestProperty(r10, r11)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r12 = "Content-Type"
            java.lang.String r13 = "application/json"
            r8.setRequestProperty(r12, r13)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r13 = "Accept-Encoding"
            r8.setRequestProperty(r13, r11)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r13 = r9.f8135c     // Catch:{ IOException -> 0x0379 }
            if (r13 == 0) goto L_0x0288
            java.lang.String r14 = "X-Goog-Api-Key"
            r8.setRequestProperty(r14, r13)     // Catch:{ IOException -> 0x0379 }
        L_0x0288:
            java.io.OutputStream r4 = r8.getOutputStream()     // Catch:{ ConnectException -> 0x03f8, UnknownHostException -> 0x03f4, EncodingException -> 0x03dd, IOException -> 0x03d9 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x03c1 }
            r6.<init>(r4)     // Catch:{ all -> 0x03c1 }
            sm.a r0 = r0.f8126a     // Catch:{ all -> 0x03b1 }
            com.google.android.datatransport.cct.internal.h r7 = r9.f8134b     // Catch:{ all -> 0x03b1 }
            java.io.BufferedWriter r14 = new java.io.BufferedWriter     // Catch:{ all -> 0x03b1 }
            java.io.OutputStreamWriter r15 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x03b1 }
            r15.<init>(r6)     // Catch:{ all -> 0x03b1 }
            r14.<init>(r15)     // Catch:{ all -> 0x03b1 }
            um.d r0 = (p690um.C18622d) r0     // Catch:{ all -> 0x03b1 }
            um.f r15 = new um.f     // Catch:{ all -> 0x03b1 }
            um.e r0 = r0.f41112a     // Catch:{ all -> 0x03b1 }
            java.util.HashMap r13 = r0.f41117a     // Catch:{ all -> 0x03b1 }
            java.util.HashMap r1 = r0.f41118b     // Catch:{ all -> 0x03b1 }
            r22 = r2
            um.a r2 = r0.f41119c     // Catch:{ all -> 0x03af }
            boolean r0 = r0.f41120d     // Catch:{ all -> 0x03af }
            r16 = r15
            r17 = r14
            r18 = r13
            r19 = r1
            r20 = r2
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x03af }
            r15.mo70132f(r7)     // Catch:{ all -> 0x03af }
            r15.mo70134h()     // Catch:{ all -> 0x03af }
            android.util.JsonWriter r0 = r15.f41123b     // Catch:{ all -> 0x03af }
            r0.flush()     // Catch:{ all -> 0x03af }
            r6.close()     // Catch:{ all -> 0x03bf }
            if (r4 == 0) goto L_0x02d1
            r4.close()     // Catch:{ ConnectException -> 0x03d7, UnknownHostException -> 0x03d5, EncodingException -> 0x03d3, IOException -> 0x03d1 }
        L_0x02d1:
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x0379 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0379 }
            r1.<init>()     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = "Status Code: "
            r1.append(r2)     // Catch:{ IOException -> 0x0379 }
            r1.append(r0)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = kotlin.jvm.internal.C19388s.m32864h0(r5)     // Catch:{ IOException -> 0x0379 }
            android.util.Log.i(r2, r1)     // Catch:{ IOException -> 0x0379 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0379 }
            r1.<init>()     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = "Content-Type: "
            r1.append(r2)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = r8.getHeaderField(r12)     // Catch:{ IOException -> 0x0379 }
            r1.append(r2)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = kotlin.jvm.internal.C19388s.m32864h0(r5)     // Catch:{ IOException -> 0x0379 }
            android.util.Log.i(r2, r1)     // Catch:{ IOException -> 0x0379 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0379 }
            r1.<init>()     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = "Content-Encoding: "
            r1.append(r2)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = r8.getHeaderField(r10)     // Catch:{ IOException -> 0x0379 }
            r1.append(r2)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = kotlin.jvm.internal.C19388s.m32864h0(r5)     // Catch:{ IOException -> 0x0379 }
            android.util.Log.i(r2, r1)     // Catch:{ IOException -> 0x0379 }
            r1 = 302(0x12e, float:4.23E-43)
            if (r0 == r1) goto L_0x039b
            r1 = 301(0x12d, float:4.22E-43)
            if (r0 == r1) goto L_0x039b
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L_0x0333
            goto L_0x039b
        L_0x0333:
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L_0x0341
            bh.b$b r1 = new bh.b$b     // Catch:{ IOException -> 0x0379 }
            r2 = 0
            r6 = 0
            r1.<init>(r0, r2, r6)     // Catch:{ IOException -> 0x0379 }
            goto L_0x03f2
        L_0x0341:
            java.io.InputStream r1 = r8.getInputStream()     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = r8.getHeaderField(r10)     // Catch:{ all -> 0x038d }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x038d }
            if (r2 == 0) goto L_0x0355
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x038d }
            r2.<init>(r1)     // Catch:{ all -> 0x038d }
            goto L_0x0356
        L_0x0355:
            r2 = r1
        L_0x0356:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x037f }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x037f }
            r6.<init>(r2)     // Catch:{ all -> 0x037f }
            r4.<init>(r6)     // Catch:{ all -> 0x037f }
            com.google.android.datatransport.cct.internal.k r4 = com.google.android.datatransport.cct.internal.C6516k.fromJson(r4)     // Catch:{ all -> 0x037f }
            long r6 = r4.getNextRequestWaitMillis()     // Catch:{ all -> 0x037f }
            bh.b$b r4 = new bh.b$b     // Catch:{ all -> 0x037f }
            r8 = 0
            r4.<init>(r0, r8, r6)     // Catch:{ all -> 0x037f }
            if (r2 == 0) goto L_0x0373
            r2.close()     // Catch:{ all -> 0x038d }
        L_0x0373:
            if (r1 == 0) goto L_0x037c
            r1.close()     // Catch:{ IOException -> 0x0379 }
            goto L_0x037c
        L_0x0379:
            r0 = move-exception
            goto L_0x045d
        L_0x037c:
            r1 = r4
            goto L_0x03f2
        L_0x037f:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x038c
            r2.close()     // Catch:{ all -> 0x0387 }
            goto L_0x038c
        L_0x0387:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ all -> 0x038d }
        L_0x038c:
            throw r3     // Catch:{ all -> 0x038d }
        L_0x038d:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x039a
            r1.close()     // Catch:{ all -> 0x0395 }
            goto L_0x039a
        L_0x0395:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x0379 }
        L_0x039a:
            throw r2     // Catch:{ IOException -> 0x0379 }
        L_0x039b:
            java.lang.String r1 = "Location"
            java.lang.String r1 = r8.getHeaderField(r1)     // Catch:{ IOException -> 0x0379 }
            bh.b$b r2 = new bh.b$b     // Catch:{ IOException -> 0x0379 }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x0379 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0379 }
            r6 = 0
            r2.<init>(r0, r4, r6)     // Catch:{ IOException -> 0x0379 }
            r1 = r2
            goto L_0x03f2
        L_0x03af:
            r0 = move-exception
            goto L_0x03b4
        L_0x03b1:
            r0 = move-exception
            r22 = r2
        L_0x03b4:
            r1 = r0
            r6.close()     // Catch:{ all -> 0x03b9 }
            goto L_0x03be
        L_0x03b9:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ all -> 0x03bf }
        L_0x03be:
            throw r1     // Catch:{ all -> 0x03bf }
        L_0x03bf:
            r0 = move-exception
            goto L_0x03c4
        L_0x03c1:
            r0 = move-exception
            r22 = r2
        L_0x03c4:
            r1 = r0
            if (r4 == 0) goto L_0x03d0
            r4.close()     // Catch:{ all -> 0x03cb }
            goto L_0x03d0
        L_0x03cb:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ ConnectException -> 0x03d7, UnknownHostException -> 0x03d5, EncodingException -> 0x03d3, IOException -> 0x03d1 }
        L_0x03d0:
            throw r1     // Catch:{ ConnectException -> 0x03d7, UnknownHostException -> 0x03d5, EncodingException -> 0x03d3, IOException -> 0x03d1 }
        L_0x03d1:
            r0 = move-exception
            goto L_0x03df
        L_0x03d3:
            r0 = move-exception
            goto L_0x03df
        L_0x03d5:
            r0 = move-exception
            goto L_0x03fa
        L_0x03d7:
            r0 = move-exception
            goto L_0x03fa
        L_0x03d9:
            r0 = move-exception
        L_0x03da:
            r22 = r2
            goto L_0x03df
        L_0x03dd:
            r0 = move-exception
            goto L_0x03da
        L_0x03df:
            java.lang.String r1 = kotlin.jvm.internal.C19388s.m32864h0(r5)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = "Couldn't encode request, returning with 400"
            android.util.Log.e(r1, r2, r0)     // Catch:{ IOException -> 0x0379 }
            bh.b$b r1 = new bh.b$b     // Catch:{ IOException -> 0x0379 }
            r2 = 400(0x190, float:5.6E-43)
            r4 = 0
            r6 = 0
            r1.<init>(r2, r4, r6)     // Catch:{ IOException -> 0x0379 }
        L_0x03f2:
            r4 = 0
            goto L_0x040d
        L_0x03f4:
            r0 = move-exception
        L_0x03f5:
            r22 = r2
            goto L_0x03fa
        L_0x03f8:
            r0 = move-exception
            goto L_0x03f5
        L_0x03fa:
            java.lang.String r1 = kotlin.jvm.internal.C19388s.m32864h0(r5)     // Catch:{ IOException -> 0x0379 }
            java.lang.String r2 = "Couldn't open connection, returning with 500"
            android.util.Log.e(r1, r2, r0)     // Catch:{ IOException -> 0x0379 }
            bh.b$b r1 = new bh.b$b     // Catch:{ IOException -> 0x0379 }
            r2 = 500(0x1f4, float:7.0E-43)
            r4 = 0
            r6 = 0
            r1.<init>(r2, r4, r6)     // Catch:{ IOException -> 0x0379 }
        L_0x040d:
            java.net.URL r0 = r1.f8137b     // Catch:{ IOException -> 0x0379 }
            if (r0 == 0) goto L_0x0423
            java.lang.String r2 = "Following redirect to: %s"
            kotlin.jvm.internal.C19388s.m32845S(r0, r5, r2)     // Catch:{ IOException -> 0x0379 }
            java.net.URL r0 = r1.f8137b     // Catch:{ IOException -> 0x0379 }
            bh.b$a r2 = new bh.b$a     // Catch:{ IOException -> 0x0379 }
            com.google.android.datatransport.cct.internal.h r6 = r9.f8134b     // Catch:{ IOException -> 0x0379 }
            java.lang.String r7 = r9.f8135c     // Catch:{ IOException -> 0x0379 }
            r2.<init>(r0, r6, r7)     // Catch:{ IOException -> 0x0379 }
            r9 = r2
            goto L_0x0424
        L_0x0423:
            r9 = r4
        L_0x0424:
            if (r9 == 0) goto L_0x0434
            int r3 = r3 + -1
            r2 = 1
            if (r3 >= r2) goto L_0x042c
            goto L_0x0434
        L_0x042c:
            r1 = r23
            r6 = r2
            r2 = r22
            r4 = 0
            goto L_0x0230
        L_0x0434:
            int r0 = r1.f8136a     // Catch:{ IOException -> 0x0379 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x0441
            long r0 = r1.f8138c     // Catch:{ IOException -> 0x0379 }
            com.google.android.datatransport.runtime.backends.BackendResponse r0 = com.google.android.datatransport.runtime.backends.BackendResponse.m12916ok(r0)     // Catch:{ IOException -> 0x0379 }
            return r0
        L_0x0441:
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L_0x0458
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto L_0x044a
            goto L_0x0458
        L_0x044a:
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L_0x0453
            com.google.android.datatransport.runtime.backends.BackendResponse r0 = com.google.android.datatransport.runtime.backends.BackendResponse.invalidPayload()     // Catch:{ IOException -> 0x0379 }
            return r0
        L_0x0453:
            com.google.android.datatransport.runtime.backends.BackendResponse r0 = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError()     // Catch:{ IOException -> 0x0379 }
            return r0
        L_0x0458:
            com.google.android.datatransport.runtime.backends.BackendResponse r0 = com.google.android.datatransport.runtime.backends.BackendResponse.transientError()     // Catch:{ IOException -> 0x0379 }
            return r0
        L_0x045d:
            java.lang.String r1 = kotlin.jvm.internal.C19388s.m32864h0(r5)
            java.lang.String r2 = "Could not make request to the backend"
            android.util.Log.e(r1, r2, r0)
            com.google.android.datatransport.runtime.backends.BackendResponse r0 = com.google.android.datatransport.runtime.backends.BackendResponse.transientError()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p029bh.C3508b.mo13004b(com.google.android.datatransport.runtime.backends.c):com.google.android.datatransport.runtime.backends.BackendResponse");
    }
}
