package com.facebook.appevents;

import androidx.compose.animation.C0388a;
import com.facebook.FacebookException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import p312ag.C8527d;
import p365hg.C12869i0;

public final class AppEvent implements Serializable {
    public static final C12210a Companion = new C12210a();

    /* renamed from: b */
    public static final HashSet<String> f27251b = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    public static final class SerializationProxyV2 implements Serializable {
        public static final C12209a Companion = new C12209a();
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        /* renamed from: com.facebook.appevents.AppEvent$SerializationProxyV2$a */
        public static final class C12209a {
        }

        public SerializationProxyV2(String str, boolean z, boolean z2, String str2) {
            C19383o.m32797g(str, "jsonString");
            this.jsonString = str;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str2;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.facebook.appevents.AppEvent$a */
    public static final class C12210a {
        /* renamed from: a */
        public static final String m20035a(C12210a aVar, String str) {
            aVar.getClass();
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                C19383o.m32796f(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
                    instance.update(bytes, 0, bytes.length);
                    byte[] digest = instance.digest();
                    C19383o.m32796f(digest, "digest.digest()");
                    return C8527d.m16930a(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (NoSuchAlgorithmException e) {
                C12869i0.m20550F("Failed to generate checksum: ", e);
                return "0";
            } catch (UnsupportedEncodingException e2) {
                C12869i0.m20550F("Failed to generate checksum: ", e2);
                return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            }
        }

        /* renamed from: b */
        public static final void m20036b(C12210a aVar, String str) {
            boolean contains;
            aVar.getClass();
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (AppEvent.f27251b) {
                        contains = AppEvent.f27251b.contains(str);
                        C19394m mVar = C19394m.f43287a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(str)) {
                        synchronized (AppEvent.f27251b) {
                            AppEvent.f27251b.add(str);
                        }
                        return;
                    }
                    throw new FacebookException(C0388a.m1049e(new Object[]{str}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format(format, *args)"));
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047 A[Catch:{ all -> 0x0040, all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppEvent(java.lang.String r8, java.lang.String r9, java.lang.Double r10, android.os.Bundle r11, boolean r12, boolean r13, java.util.UUID r14) throws org.json.JSONException, com.facebook.FacebookException {
        /*
            r7 = this;
            java.lang.String r0 = "contextName"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r7.<init>()
            r7.isImplicit = r12
            r7.inBackground = r13
            r7.name = r9
            java.lang.Class<dg.a> r12 = p339dg.C12655a.class
            com.facebook.appevents.AppEvent$a r13 = Companion
            com.facebook.appevents.AppEvent.C12210a.m20036b(r13, r9)
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            boolean r1 = p339dg.C12655a.f27914a
            boolean r1 = p401mg.C13080a.m20762b(r12)
            r2 = 0
            if (r1 == 0) goto L_0x0029
            goto L_0x004e
        L_0x0029:
            boolean r1 = p339dg.C12655a.f27914a     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x004f
            dg.a r1 = p339dg.C12655a.f27918e     // Catch:{ all -> 0x004a }
            r1.getClass()     // Catch:{ all -> 0x004a }
            boolean r3 = p401mg.C13080a.m20762b(r1)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0039
            goto L_0x0044
        L_0x0039:
            java.util.concurrent.CopyOnWriteArraySet r3 = p339dg.C12655a.f27917d     // Catch:{ all -> 0x0040 }
            boolean r1 = r3.contains(r9)     // Catch:{ all -> 0x0040 }
            goto L_0x0045
        L_0x0040:
            r3 = move-exception
            p401mg.C13080a.m20761a(r1, r3)     // Catch:{ all -> 0x004a }
        L_0x0044:
            r1 = r2
        L_0x0045:
            if (r1 == 0) goto L_0x004f
            java.lang.String r9 = "_removed_"
            goto L_0x004f
        L_0x004a:
            r9 = move-exception
            p401mg.C13080a.m20761a(r12, r9)
        L_0x004e:
            r9 = 0
        L_0x004f:
            java.lang.String r1 = "_eventName"
            r13.put(r1, r9)
            com.facebook.appevents.AppEvent$a r1 = Companion
            java.lang.String r9 = com.facebook.appevents.AppEvent.C12210a.m20035a(r1, r9)
            java.lang.String r1 = "_eventName_md5"
            r13.put(r1, r9)
            long r3 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r9
            long r3 = r3 / r5
            java.lang.String r9 = "_logTime"
            r13.put(r9, r3)
            java.lang.String r9 = "_ui"
            r13.put(r9, r8)
            if (r14 == 0) goto L_0x0078
            java.lang.String r8 = "_session_id"
            r13.put(r8, r14)
        L_0x0078:
            r8 = 1
            if (r11 == 0) goto L_0x0245
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Set r14 = r11.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0088:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = r14.next()
            java.lang.String r1 = (java.lang.String) r1
            com.facebook.appevents.AppEvent$a r3 = Companion
            java.lang.String r4 = "key"
            kotlin.jvm.internal.C19383o.m32796f(r1, r4)
            com.facebook.appevents.AppEvent.C12210a.m20036b(r3, r1)
            java.lang.Object r3 = r11.get(r1)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L_0x00c0
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L_0x00ab
            goto L_0x00c0
        L_0x00ab:
            com.facebook.FacebookException r9 = new com.facebook.FacebookException
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r2] = r3
            r11[r8] = r1
            java.lang.String r8 = "Parameter value '%s' for key '%s' should be a string or a numeric type."
            java.lang.String r12 = "java.lang.String.format(format, *args)"
            java.lang.String r8 = androidx.compose.animation.C0388a.m1049e(r11, r10, r8, r12)
            r9.<init>((java.lang.String) r8)
            throw r9
        L_0x00c0:
            java.lang.String r3 = r3.toString()
            r9.put(r1, r3)
            goto L_0x0088
        L_0x00c8:
            boolean r11 = p501zf.C13963a.f30705a
            java.lang.Class<zf.a> r11 = p501zf.C13963a.class
            boolean r14 = p401mg.C13080a.m20762b(r11)
            if (r14 == 0) goto L_0x00d4
            goto L_0x0145
        L_0x00d4:
            boolean r14 = p501zf.C13963a.f30705a     // Catch:{ all -> 0x0141 }
            if (r14 == 0) goto L_0x0145
            boolean r14 = r9.isEmpty()     // Catch:{ all -> 0x0141 }
            if (r14 == 0) goto L_0x00df
            goto L_0x0145
        L_0x00df:
            java.util.Set r14 = r9.keySet()     // Catch:{ Exception -> 0x0145 }
            java.util.List r14 = kotlin.collections.C19327t.m32660p1(r14)     // Catch:{ Exception -> 0x0145 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0145 }
            r1.<init>()     // Catch:{ Exception -> 0x0145 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x0145 }
        L_0x00f0:
            boolean r3 = r14.hasNext()     // Catch:{ Exception -> 0x0145 }
            if (r3 == 0) goto L_0x012c
            java.lang.Object r3 = r14.next()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0145 }
            java.lang.Object r4 = r9.get(r3)     // Catch:{ Exception -> 0x0145 }
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0145 }
            zf.a r5 = p501zf.C13963a.f30707c     // Catch:{ Exception -> 0x0145 }
            boolean r6 = r5.mo46781a(r3)     // Catch:{ Exception -> 0x0145 }
            if (r6 != 0) goto L_0x0112
            boolean r5 = r5.mo46781a(r4)     // Catch:{ Exception -> 0x0145 }
            if (r5 == 0) goto L_0x00f0
        L_0x0112:
            r9.remove(r3)     // Catch:{ Exception -> 0x0145 }
            boolean r5 = p501zf.C13963a.f30706b     // Catch:{ Exception -> 0x0145 }
            if (r5 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            java.lang.String r4 = ""
        L_0x011c:
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0145 }
            goto L_0x00f0
        L_0x0120:
            java.lang.String r14 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0145 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0145 }
            r1.<init>(r14)     // Catch:{ Exception -> 0x0145 }
            throw r1     // Catch:{ Exception -> 0x0145 }
        L_0x012c:
            int r14 = r1.length()     // Catch:{ Exception -> 0x0145 }
            if (r14 == 0) goto L_0x0145
            java.lang.String r14 = "_onDeviceParams"
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r3 = "restrictiveParamJson.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r1, r3)     // Catch:{ Exception -> 0x0145 }
            r9.put(r14, r1)     // Catch:{ Exception -> 0x0145 }
            goto L_0x0145
        L_0x0141:
            r14 = move-exception
            p401mg.C13080a.m20761a(r11, r14)
        L_0x0145:
            kotlin.jvm.internal.C19389t.m32909c(r9)
            java.lang.String r11 = r7.name
            boolean r14 = p339dg.C12655a.f27914a
            boolean r14 = p401mg.C13080a.m20762b(r12)
            if (r14 == 0) goto L_0x0154
            goto L_0x01c7
        L_0x0154:
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)     // Catch:{ all -> 0x01c3 }
            boolean r14 = p339dg.C12655a.f27914a     // Catch:{ all -> 0x01c3 }
            if (r14 != 0) goto L_0x015c
            goto L_0x01c7
        L_0x015c:
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x01c3 }
            r14.<init>()     // Catch:{ all -> 0x01c3 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x01c3 }
            java.util.Set r3 = r9.keySet()     // Catch:{ all -> 0x01c3 }
            r1.<init>(r3)     // Catch:{ all -> 0x01c3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01c3 }
        L_0x016e:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x0189
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01c3 }
            dg.a r4 = p339dg.C12655a.f27918e     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = r4.mo45434a(r11, r3)     // Catch:{ all -> 0x01c3 }
            if (r4 == 0) goto L_0x016e
            r14.put(r3, r4)     // Catch:{ all -> 0x01c3 }
            r9.remove(r3)     // Catch:{ all -> 0x01c3 }
            goto L_0x016e
        L_0x0189:
            boolean r11 = r14.isEmpty()     // Catch:{ all -> 0x01c3 }
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x01c7
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01c7 }
            r11.<init>()     // Catch:{ JSONException -> 0x01c7 }
            java.util.Set r14 = r14.entrySet()     // Catch:{ JSONException -> 0x01c7 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ JSONException -> 0x01c7 }
        L_0x019d:
            boolean r1 = r14.hasNext()     // Catch:{ JSONException -> 0x01c7 }
            if (r1 == 0) goto L_0x01b9
            java.lang.Object r1 = r14.next()     // Catch:{ JSONException -> 0x01c7 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ JSONException -> 0x01c7 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ JSONException -> 0x01c7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x01c7 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ JSONException -> 0x01c7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x01c7 }
            r11.put(r3, r1)     // Catch:{ JSONException -> 0x01c7 }
            goto L_0x019d
        L_0x01b9:
            java.lang.String r14 = "_restrictedParams"
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x01c7 }
            r9.put(r14, r11)     // Catch:{ JSONException -> 0x01c7 }
            goto L_0x01c7
        L_0x01c3:
            r11 = move-exception
            p401mg.C13080a.m20761a(r12, r11)
        L_0x01c7:
            kotlin.jvm.internal.C19389t.m32909c(r9)
            java.lang.String r11 = r7.name
            boolean r12 = p484xf.C13882a.f30540a
            java.lang.Class<xf.a> r12 = p484xf.C13882a.class
            boolean r14 = p401mg.C13080a.m20762b(r12)
            if (r14 == 0) goto L_0x01d7
            goto L_0x0229
        L_0x01d7:
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)     // Catch:{ all -> 0x0225 }
            boolean r14 = p484xf.C13882a.f30540a     // Catch:{ all -> 0x0225 }
            if (r14 != 0) goto L_0x01df
            goto L_0x0229
        L_0x01df:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0225 }
            java.util.Set r0 = r9.keySet()     // Catch:{ all -> 0x0225 }
            r14.<init>(r0)     // Catch:{ all -> 0x0225 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0225 }
            java.util.ArrayList r1 = p484xf.C13882a.f30541b     // Catch:{ all -> 0x0225 }
            r0.<init>(r1)     // Catch:{ all -> 0x0225 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0225 }
        L_0x01f3:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0225 }
            if (r1 == 0) goto L_0x0229
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0225 }
            xf.a$a r1 = (p484xf.C13882a.C13883a) r1     // Catch:{ all -> 0x0225 }
            java.lang.String r3 = r1.f30544a     // Catch:{ all -> 0x0225 }
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r11)     // Catch:{ all -> 0x0225 }
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0209
            goto L_0x01f3
        L_0x0209:
            java.util.Iterator r3 = r14.iterator()     // Catch:{ all -> 0x0225 }
        L_0x020d:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0225 }
            if (r4 == 0) goto L_0x01f3
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0225 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0225 }
            java.util.List<java.lang.String> r5 = r1.f30545b     // Catch:{ all -> 0x0225 }
            boolean r5 = r5.contains(r4)     // Catch:{ all -> 0x0225 }
            if (r5 == 0) goto L_0x020d
            r9.remove(r4)     // Catch:{ all -> 0x0225 }
            goto L_0x020d
        L_0x0225:
            r11 = move-exception
            p401mg.C13080a.m20761a(r12, r11)
        L_0x0229:
            java.util.Set r11 = r9.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0231:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0245
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r9.get(r12)
            r13.put(r12, r14)
            goto L_0x0231
        L_0x0245:
            if (r10 == 0) goto L_0x0250
            double r9 = r10.doubleValue()
            java.lang.String r11 = "_valueToSum"
            r13.put(r11, r9)
        L_0x0250:
            boolean r9 = r7.inBackground
            java.lang.String r10 = "1"
            if (r9 == 0) goto L_0x025b
            java.lang.String r9 = "_inBackground"
            r13.put(r9, r10)
        L_0x025b:
            boolean r9 = r7.isImplicit
            if (r9 == 0) goto L_0x0265
            java.lang.String r8 = "_implicitlyLogged"
            r13.put(r8, r10)
            goto L_0x027d
        L_0x0265:
            hg.c0$a r9 = p365hg.C12845c0.f28334f
            com.facebook.LoggingBehavior r10 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r11 = r13.toString()
            java.lang.String r12 = "eventObject.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r11, r12)
            r8[r2] = r11
            java.lang.String r11 = "AppEvents"
            java.lang.String r12 = "Created app event '%s'"
            r9.mo45627c(r10, r11, r12, r8)
        L_0x027d:
            r7.jsonObject = r13
            com.facebook.appevents.AppEvent$a r8 = Companion
            java.lang.String r9 = r13.toString()
            java.lang.String r10 = "jsonObject.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r9, r10)
            java.lang.String r8 = com.facebook.appevents.AppEvent.C12210a.m20035a(r8, r9)
            r7.checksum = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEvent.<init>(java.lang.String, java.lang.String, java.lang.Double, android.os.Bundle, boolean, boolean, java.util.UUID):void");
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.jsonObject.toString();
        C19383o.m32796f(jSONObject, "jsonObject.toString()");
        return new SerializationProxyV2(jSONObject, this.isImplicit, this.inBackground, this.checksum);
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    public final JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        C12210a aVar = Companion;
        String jSONObject = this.jsonObject.toString();
        C19383o.m32796f(jSONObject, "jsonObject.toString()");
        return C19383o.m32792b(C12210a.m20035a(aVar, jSONObject), this.checksum);
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public String toString() {
        return C0388a.m1049e(new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format(format, *args)");
    }

    public AppEvent(String str, boolean z, boolean z2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z;
        String optString = jSONObject.optString("_eventName");
        C19383o.m32796f(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.name = optString;
        this.checksum = str2;
        this.inBackground = z2;
    }
}
