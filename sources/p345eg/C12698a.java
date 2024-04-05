package p345eg;

import android.util.Patterns;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import kotlin.text.C19459m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p401mg.C13080a;

/* renamed from: eg.a */
public final class C12698a {

    /* renamed from: a */
    public static Map<String, String> f27974a;

    /* renamed from: b */
    public static Map<String, String> f27975b;

    /* renamed from: c */
    public static Map<String, String> f27976c;

    /* renamed from: d */
    public static JSONObject f27977d;

    /* renamed from: e */
    public static boolean f27978e;

    /* renamed from: f */
    public static final C12698a f27979f = new C12698a();

    /* renamed from: a */
    public static final float[] m20360a(String str, JSONObject jSONObject) {
        Class<C12698a> cls = C12698a.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(jSONObject, "viewHierarchy");
            if (!f27978e) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                String lowerCase = str.toLowerCase();
                C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                C12698a aVar = f27979f;
                aVar.mo45464h(jSONObject2, jSONArray);
                aVar.mo45467k(fArr, aVar.mo45463g(jSONObject2));
                JSONObject b = aVar.mo45460b(jSONObject2);
                if (b == null) {
                    return null;
                }
                C19383o.m32796f(optString, "screenName");
                String jSONObject3 = jSONObject2.toString();
                C19383o.m32796f(jSONObject3, "viewTree.toString()");
                aVar.mo45467k(fArr, aVar.mo45462f(b, jSONArray, optString, jSONObject3, lowerCase));
                return fArr;
            } catch (JSONException unused) {
                return fArr;
            }
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final String m20361c(String str, String str2, String str3) {
        Class<C12698a> cls = C12698a.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(str, "buttonText");
            C19383o.m32797g(str2, "activityName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: d */
    public static final void m20362d(File file) {
        Class<C12698a> cls = C12698a.class;
        if (!C13080a.m20762b(cls)) {
            try {
                f27977d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f27977d = new JSONObject(new String(bArr, C19446a.f43373b));
                try {
                    f27974a = C19294b0.m32562s0(new Pair("ENGLISH", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                    f27975b = C19294b0.m32562s0(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                    f27976c = C19294b0.m32562s0(new Pair("BUTTON_TEXT", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                    f27978e = true;
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final JSONObject mo45460b(JSONObject jSONObject) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C19383o.m32796f(jSONObject2, "children.getJSONObject(i)");
                JSONObject b = mo45460b(jSONObject2);
                if (b != null) {
                    return b;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
        }
    }

    /* renamed from: e */
    public final boolean mo45461e(String[] strArr, String[] strArr2) {
        if (C13080a.m20762b(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String e1 : strArr2) {
                    if (C19459m.m33036e1(e1, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0068 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float[] mo45462f(org.json.JSONObject r17, org.json.JSONArray r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r20
            java.lang.String r3 = "LEAD"
            java.lang.String r4 = "PURCHASE"
            java.lang.String r5 = "PAGE_TITLE"
            java.lang.String r6 = "BUTTON_TEXT"
            java.lang.String r7 = "COMPLETE_REGISTRATION"
            boolean r0 = p401mg.C13080a.m20762b(r16)
            r8 = 0
            if (r0 == 0) goto L_0x0016
            return r8
        L_0x0016:
            r0 = 30
            float[] r9 = new float[r0]     // Catch:{ all -> 0x0168 }
            r10 = 0
            r11 = r10
        L_0x001c:
            r12 = 0
            if (r11 >= r0) goto L_0x0024
            r9[r11] = r12     // Catch:{ all -> 0x0168 }
            int r11 = r11 + 1
            goto L_0x001c
        L_0x0024:
            int r0 = r18.length()     // Catch:{ all -> 0x0168 }
            r11 = 3
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1
            if (r0 <= r14) goto L_0x0031
            float r0 = (float) r0     // Catch:{ all -> 0x0168 }
            float r0 = r0 - r13
            goto L_0x0032
        L_0x0031:
            r0 = r12
        L_0x0032:
            r9[r11] = r0     // Catch:{ all -> 0x0168 }
            int r11 = r18.length()     // Catch:{ JSONException -> 0x006d }
            r15 = r10
        L_0x0039:
            if (r15 >= r11) goto L_0x006d
            r12 = r18
            org.json.JSONObject r0 = r12.getJSONObject(r15)     // Catch:{ JSONException -> 0x006d }
            java.lang.String r8 = "siblings.getJSONObject(i)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r8)     // Catch:{ JSONException -> 0x006d }
            boolean r8 = p401mg.C13080a.m20762b(r16)     // Catch:{ JSONException -> 0x006d }
            if (r8 == 0) goto L_0x004d
            goto L_0x005e
        L_0x004d:
            java.lang.String r8 = "classtypebitmask"
            int r0 = r0.optInt(r8)     // Catch:{ all -> 0x005a }
            r0 = r0 & r14
            int r0 = r0 << 5
            if (r0 <= 0) goto L_0x005e
            r0 = r14
            goto L_0x005f
        L_0x005a:
            r0 = move-exception
            p401mg.C13080a.m20761a(r1, r0)     // Catch:{ JSONException -> 0x006d }
        L_0x005e:
            r0 = r10
        L_0x005f:
            if (r0 == 0) goto L_0x0068
            r0 = 9
            r8 = r9[r0]     // Catch:{ JSONException -> 0x006d }
            float r8 = r8 + r13
            r9[r0] = r8     // Catch:{ JSONException -> 0x006d }
        L_0x0068:
            int r15 = r15 + 1
            r8 = 0
            r12 = 0
            goto L_0x0039
        L_0x006d:
            r0 = 13
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9[r0] = r8     // Catch:{ all -> 0x0168 }
            r0 = 14
            r9[r0] = r8     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0168 }
            r0.<init>()     // Catch:{ all -> 0x0168 }
            r8 = r19
            r0.append(r8)     // Catch:{ all -> 0x0168 }
            r8 = 124(0x7c, float:1.74E-43)
            r0.append(r8)     // Catch:{ all -> 0x0168 }
            r8 = r21
            r0.append(r8)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0168 }
            r8.<init>()     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0168 }
            r11.<init>()     // Catch:{ all -> 0x0168 }
            r12 = r17
            r1.mo45468l(r12, r11, r8)     // Catch:{ all -> 0x0168 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0168 }
            java.lang.String r12 = "hintSB.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r8, r12)     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0168 }
            java.lang.String r12 = "textSB.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r11, r12)     // Catch:{ all -> 0x0168 }
            r12 = 15
            boolean r14 = r1.mo45466j(r7, r6, r11)     // Catch:{ all -> 0x0168 }
            if (r14 == 0) goto L_0x00ba
            r14 = r13
            goto L_0x00bb
        L_0x00ba:
            r14 = 0
        L_0x00bb:
            r9[r12] = r14     // Catch:{ all -> 0x0168 }
            r12 = 16
            boolean r14 = r1.mo45466j(r7, r5, r0)     // Catch:{ all -> 0x0168 }
            if (r14 == 0) goto L_0x00c7
            r14 = r13
            goto L_0x00c8
        L_0x00c7:
            r14 = 0
        L_0x00c8:
            r9[r12] = r14     // Catch:{ all -> 0x0168 }
            r12 = 17
            java.lang.String r14 = "BUTTON_ID"
            boolean r7 = r1.mo45466j(r7, r14, r8)     // Catch:{ all -> 0x0168 }
            if (r7 == 0) goto L_0x00d6
            r7 = r13
            goto L_0x00d7
        L_0x00d6:
            r7 = 0
        L_0x00d7:
            r9[r12] = r7     // Catch:{ all -> 0x0168 }
            r7 = 18
            java.lang.String r8 = "password"
            boolean r8 = kotlin.text.C19459m.m33036e1(r2, r8, r10)     // Catch:{ all -> 0x0168 }
            if (r8 == 0) goto L_0x00e5
            r8 = r13
            goto L_0x00e6
        L_0x00e5:
            r8 = 0
        L_0x00e6:
            r9[r7] = r8     // Catch:{ all -> 0x0168 }
            r7 = 19
            java.lang.String r8 = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)"
            boolean r8 = r1.mo45465i(r8, r2)     // Catch:{ all -> 0x0168 }
            if (r8 == 0) goto L_0x00f4
            r8 = r13
            goto L_0x00f5
        L_0x00f4:
            r8 = 0
        L_0x00f5:
            r9[r7] = r8     // Catch:{ all -> 0x0168 }
            r7 = 20
            java.lang.String r8 = "(?i)(sign in)|login|signIn"
            boolean r8 = r1.mo45465i(r8, r2)     // Catch:{ all -> 0x0168 }
            if (r8 == 0) goto L_0x0103
            r8 = r13
            goto L_0x0104
        L_0x0103:
            r8 = 0
        L_0x0104:
            r9[r7] = r8     // Catch:{ all -> 0x0168 }
            r7 = 21
            java.lang.String r8 = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)"
            boolean r2 = r1.mo45465i(r8, r2)     // Catch:{ all -> 0x0168 }
            if (r2 == 0) goto L_0x0112
            r2 = r13
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            r9[r7] = r2     // Catch:{ all -> 0x0168 }
            r2 = 22
            boolean r7 = r1.mo45466j(r4, r6, r11)     // Catch:{ all -> 0x0168 }
            if (r7 == 0) goto L_0x011f
            r7 = r13
            goto L_0x0120
        L_0x011f:
            r7 = 0
        L_0x0120:
            r9[r2] = r7     // Catch:{ all -> 0x0168 }
            r2 = 24
            boolean r4 = r1.mo45466j(r4, r5, r0)     // Catch:{ all -> 0x0168 }
            if (r4 == 0) goto L_0x012c
            r4 = r13
            goto L_0x012d
        L_0x012c:
            r4 = 0
        L_0x012d:
            r9[r2] = r4     // Catch:{ all -> 0x0168 }
            r2 = 25
            java.lang.String r4 = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart"
            boolean r4 = r1.mo45465i(r4, r11)     // Catch:{ all -> 0x0168 }
            if (r4 == 0) goto L_0x013b
            r4 = r13
            goto L_0x013c
        L_0x013b:
            r4 = 0
        L_0x013c:
            r9[r2] = r4     // Catch:{ all -> 0x0168 }
            r2 = 27
            java.lang.String r4 = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy"
            boolean r4 = r1.mo45465i(r4, r0)     // Catch:{ all -> 0x0168 }
            if (r4 == 0) goto L_0x014a
            r4 = r13
            goto L_0x014b
        L_0x014a:
            r4 = 0
        L_0x014b:
            r9[r2] = r4     // Catch:{ all -> 0x0168 }
            r2 = 28
            boolean r4 = r1.mo45466j(r3, r6, r11)     // Catch:{ all -> 0x0168 }
            if (r4 == 0) goto L_0x0157
            r4 = r13
            goto L_0x0158
        L_0x0157:
            r4 = 0
        L_0x0158:
            r9[r2] = r4     // Catch:{ all -> 0x0168 }
            r2 = 29
            boolean r0 = r1.mo45466j(r3, r5, r0)     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0164
            r12 = r13
            goto L_0x0165
        L_0x0164:
            r12 = 0
        L_0x0165:
            r9[r2] = r12     // Catch:{ all -> 0x0168 }
            return r9
        L_0x0168:
            r0 = move-exception
            p401mg.C13080a.m20761a(r1, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p345eg.C12698a.mo45462f(org.json.JSONObject, org.json.JSONArray, java.lang.String, java.lang.String, java.lang.String):float[]");
    }

    /* renamed from: g */
    public final float[] mo45463g(JSONObject jSONObject) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            C19383o.m32796f(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString(ResponseConstants.HINT);
            C19383o.m32796f(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            C19383o.m32796f(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            C19383o.m32796f(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            C19383o.m32796f(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (mo45461e(new String[]{"$", ResponseConstants.AMOUNT, ResponseConstants.PRICE, ResponseConstants.TOTAL}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (mo45461e(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (mo45461e(new String[]{"tel", ResponseConstants.PHONE}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (mo45461e(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (C19459m.m33036e1(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (mo45461e(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (C19459m.m33036e1(lowerCase3, "radio", false) && C19459m.m33036e1(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    C19383o.m32796f(jSONObject2, "childViews.getJSONObject(i)");
                    mo45467k(fArr, mo45463g(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: h */
    public final boolean mo45464h(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (C13080a.m20762b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                int length3 = optJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    C19383o.m32796f(jSONObject2, "child");
                    if (mo45464h(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return false;
        }
    }

    /* renamed from: i */
    public final boolean mo45465i(String str, String str2) {
        if (C13080a.m20762b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return false;
        }
    }

    /* renamed from: j */
    public final boolean mo45466j(String str, String str2, String str3) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (C13080a.m20762b(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f27977d;
            String str4 = null;
            if (jSONObject != null) {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (optJSONObject3 != null) {
                    Map<String, String> map = f27974a;
                    if (map != null) {
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject(map.get("ENGLISH"));
                        if (!(optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("rulesForEvent")) == null)) {
                            Map<String, String> map2 = f27975b;
                            if (map2 != null) {
                                JSONObject optJSONObject5 = optJSONObject.optJSONObject(map2.get(str));
                                if (!(optJSONObject5 == null || (optJSONObject2 = optJSONObject5.optJSONObject("positiveRules")) == null)) {
                                    Map<String, String> map3 = f27976c;
                                    if (map3 != null) {
                                        str4 = optJSONObject2.optString(map3.get(str2));
                                    } else {
                                        C19383o.m32805o("textTypeInfo");
                                        throw null;
                                    }
                                }
                            } else {
                                C19383o.m32805o("eventInfo");
                                throw null;
                            }
                        }
                    } else {
                        C19383o.m32805o("languageInfo");
                        throw null;
                    }
                }
                if (str4 == null) {
                    return false;
                }
                return mo45465i(str4, str3);
            }
            C19383o.m32805o("rules");
            throw null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return false;
        }
    }

    /* renamed from: k */
    public final void mo45467k(float[] fArr, float[] fArr2) {
        if (!C13080a.m20762b(this)) {
            try {
                int length = fArr.length;
                for (int i = 0; i < length; i++) {
                    fArr[i] = fArr[i] + fArr2[i];
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: l */
    public final void mo45468l(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (!C13080a.m20762b(this)) {
            try {
                String optString = jSONObject.optString("text", "");
                C19383o.m32796f(optString, "view.optString(TEXT_KEY, \"\")");
                String lowerCase = optString.toLowerCase();
                C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase()");
                String optString2 = jSONObject.optString(ResponseConstants.HINT, "");
                C19383o.m32796f(optString2, "view.optString(HINT_KEY, \"\")");
                String lowerCase2 = optString2.toLowerCase();
                C19383o.m32796f(lowerCase2, "(this as java.lang.String).toLowerCase()");
                boolean z = true;
                if (lowerCase.length() > 0) {
                    sb.append(lowerCase);
                    sb.append(" ");
                }
                if (lowerCase2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    sb2.append(lowerCase2);
                    sb2.append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        try {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                            C19383o.m32796f(jSONObject2, "currentChildView");
                            mo45468l(jSONObject2, sb, sb2);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
