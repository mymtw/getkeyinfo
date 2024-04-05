package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.WebDialog;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import java.io.File;
import java.io.FileNotFoundException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p401mg.C13080a;

/* renamed from: com.facebook.share.internal.m */
public final class C12378m {

    /* renamed from: com.facebook.share.internal.m$a */
    public static class C12379a {
        /* renamed from: a */
        public final JSONObject mo39772a(SharePhoto sharePhoto) {
            Uri imageUrl = sharePhoto.getImageUrl();
            if (C12869i0.m20547C(imageUrl)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", imageUrl.toString());
                    return jSONObject;
                } catch (JSONException e) {
                    throw new FacebookException("Unable to attach images", (Throwable) e);
                }
            } else {
                throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        p401mg.C13080a.m20761a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p365hg.C12828a m20213a(int r4, android.content.Intent r5) {
        /*
            java.lang.Class<com.facebook.share.internal.m> r0 = com.facebook.share.internal.C12378m.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.UUID r5 = p365hg.C12851e0.m20507g(r5)     // Catch:{ all -> 0x002f }
            if (r5 != 0) goto L_0x0011
            return r2
        L_0x0011:
            hg.a r1 = p365hg.C12828a.f28315a     // Catch:{ all -> 0x002f }
            java.lang.Class<hg.a> r1 = p365hg.C12828a.class
            monitor-enter(r1)     // Catch:{ all -> 0x002f }
            boolean r3 = p401mg.C13080a.m20762b(r1)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x001d
            goto L_0x002a
        L_0x001d:
            hg.a$a r3 = p365hg.C12828a.f28316b     // Catch:{ all -> 0x0026 }
            hg.a r4 = r3.mo45611a(r5, r4)     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            r2 = r4
            goto L_0x002b
        L_0x0026:
            r4 = move-exception
            p401mg.C13080a.m20761a(r1, r4)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
        L_0x002b:
            return r2
        L_0x002c:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            throw r4     // Catch:{ all -> 0x002f }
        L_0x002f:
            r4 = move-exception
            p401mg.C13080a.m20761a(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C12378m.m20213a(int, android.content.Intent):hg.a");
    }

    /* renamed from: b */
    public static Pair<String, String> m20214b(String str) {
        String str2;
        int i;
        Class<C12378m> cls = C12378m.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
                str2 = null;
            } else {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
            }
            return new Pair<>(str2, str);
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021 A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[ADDED_TO_REGION, Catch:{ all -> 0x002f }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.GraphRequest m20215c(com.facebook.AccessToken r12, android.net.Uri r13, com.facebook.internal.WebDialog.C12269f.C12270a r14) throws java.io.FileNotFoundException {
        /*
            java.lang.Class<com.facebook.share.internal.m> r0 = com.facebook.share.internal.C12378m.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = p365hg.C12869i0.f28368a     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "file"
            r3 = 0
            r4 = 1
            if (r13 == 0) goto L_0x001e
            java.lang.String r5 = r13.getScheme()     // Catch:{ all -> 0x002f }
            boolean r5 = kotlin.text.C19457k.m33019W0(r1, r5, r4)     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r3
        L_0x001f:
            if (r5 == 0) goto L_0x0031
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x002f }
            java.lang.String r13 = r13.getPath()     // Catch:{ all -> 0x002f }
            r1.<init>(r13)     // Catch:{ all -> 0x002f }
            com.facebook.GraphRequest r12 = m20216d(r12, r1, r14)     // Catch:{ all -> 0x002f }
            return r12
        L_0x002f:
            r12 = move-exception
            goto L_0x0066
        L_0x0031:
            if (r13 == 0) goto L_0x0040
            java.lang.String r5 = r13.getScheme()     // Catch:{ all -> 0x002f }
            java.lang.String r6 = "content"
            boolean r5 = kotlin.text.C19457k.m33019W0(r6, r5, r4)     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x0040
            r3 = r4
        L_0x0040:
            if (r3 == 0) goto L_0x005e
            com.facebook.GraphRequest$ParcelableResourceWithMimeType r3 = new com.facebook.GraphRequest$ParcelableResourceWithMimeType     // Catch:{ all -> 0x002f }
            java.lang.String r5 = "image/png"
            r3.<init>(r13, (java.lang.String) r5)     // Catch:{ all -> 0x002f }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x002f }
            r9.<init>(r4)     // Catch:{ all -> 0x002f }
            r9.putParcelable(r1, r3)     // Catch:{ all -> 0x002f }
            com.facebook.GraphRequest r13 = new com.facebook.GraphRequest     // Catch:{ all -> 0x002f }
            java.lang.String r8 = "me/staging_resources"
            com.facebook.HttpMethod r10 = com.facebook.HttpMethod.POST     // Catch:{ all -> 0x002f }
            r6 = r13
            r7 = r12
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x002f }
            return r13
        L_0x005e:
            com.facebook.FacebookException r12 = new com.facebook.FacebookException     // Catch:{ all -> 0x002f }
            java.lang.String r13 = "The image Uri must be either a file:// or content:// Uri"
            r12.<init>((java.lang.String) r13)     // Catch:{ all -> 0x002f }
            throw r12     // Catch:{ all -> 0x002f }
        L_0x0066:
            p401mg.C13080a.m20761a(r0, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C12378m.m20215c(com.facebook.AccessToken, android.net.Uri, com.facebook.internal.WebDialog$f$a):com.facebook.GraphRequest");
    }

    /* renamed from: d */
    public static GraphRequest m20216d(AccessToken accessToken, File file, WebDialog.C12269f.C12270a aVar) throws FileNotFoundException {
        Class<C12378m> cls = C12378m.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(ResponseConstants.FILE, parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, aVar);
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: e */
    public static JSONArray m20217e(JSONArray jSONArray) throws JSONException {
        Class<C12378m> cls = C12378m.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = m20217e((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = m20218f((JSONObject) obj, true);
                }
                jSONArray2.put(obj);
            }
            return jSONArray2;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        throw new com.facebook.FacebookException("Failed to create json object from share content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        p401mg.C13080a.m20761a(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0091 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m20218f(org.json.JSONObject r11, boolean r12) {
        /*
            java.lang.Class<com.facebook.share.internal.m> r0 = com.facebook.share.internal.C12378m.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            if (r11 != 0) goto L_0x000d
            return r2
        L_0x000d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r1.<init>()     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r3.<init>()     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r4 = r11.names()     // Catch:{ JSONException -> 0x0091 }
            r5 = 0
        L_0x001c:
            int r6 = r4.length()     // Catch:{ JSONException -> 0x0091 }
            if (r5 >= r6) goto L_0x0083
            java.lang.String r6 = r4.getString(r5)     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r7 = r11.get(r6)     // Catch:{ JSONException -> 0x0091 }
            boolean r8 = r7 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            if (r8 == 0) goto L_0x0036
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x0091 }
            r8 = 1
            org.json.JSONObject r7 = m20218f(r7, r8)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0040
        L_0x0036:
            boolean r8 = r7 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x0091 }
            if (r8 == 0) goto L_0x0040
            org.json.JSONArray r7 = (org.json.JSONArray) r7     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r7 = m20217e(r7)     // Catch:{ JSONException -> 0x0091 }
        L_0x0040:
            android.util.Pair r8 = m20214b(r6)     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r9 = r8.first     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r8 = r8.second     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x0091 }
            if (r12 == 0) goto L_0x006f
            if (r9 == 0) goto L_0x005c
            java.lang.String r10 = "fbsdk"
            boolean r10 = r9.equals(r10)     // Catch:{ JSONException -> 0x0091 }
            if (r10 == 0) goto L_0x005c
            r1.put(r6, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x005c:
            if (r9 == 0) goto L_0x006b
            java.lang.String r6 = "og"
            boolean r6 = r9.equals(r6)     // Catch:{ JSONException -> 0x0091 }
            if (r6 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            r3.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x006b:
            r1.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x006f:
            if (r9 == 0) goto L_0x007d
            java.lang.String r10 = "fb"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0091 }
            if (r9 == 0) goto L_0x007d
            r1.put(r6, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x007d:
            r1.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x001c
        L_0x0083:
            int r11 = r3.length()     // Catch:{ JSONException -> 0x0091 }
            if (r11 <= 0) goto L_0x008e
            java.lang.String r11 = "data"
            r1.put(r11, r3)     // Catch:{ JSONException -> 0x0091 }
        L_0x008e:
            return r1
        L_0x008f:
            r11 = move-exception
            goto L_0x0099
        L_0x0091:
            com.facebook.FacebookException r11 = new com.facebook.FacebookException     // Catch:{ all -> 0x008f }
            java.lang.String r12 = "Failed to create json object from share content"
            r11.<init>((java.lang.String) r12)     // Catch:{ all -> 0x008f }
            throw r11     // Catch:{ all -> 0x008f }
        L_0x0099:
            p401mg.C13080a.m20761a(r0, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C12378m.m20218f(org.json.JSONObject, boolean):org.json.JSONObject");
    }

    /* renamed from: g */
    public static JSONObject m20219g(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        Class<C12378m> cls = C12378m.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            ShareOpenGraphAction action = shareOpenGraphContent.getAction();
            C12379a aVar = new C12379a();
            if (action == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            for (String next : action.keySet()) {
                jSONObject.put(next, C12377l.m20212a(action.get(next), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }
}
