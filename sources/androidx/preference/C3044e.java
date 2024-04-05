package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import com.appboy.Constants;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.preference.e */
public final class C3044e {

    /* renamed from: e */
    public static final Class<?>[] f6930e = {Context.class, AttributeSet.class};

    /* renamed from: f */
    public static final HashMap<String, Constructor> f6931f = new HashMap<>();

    /* renamed from: a */
    public final Context f6932a;

    /* renamed from: b */
    public final Object[] f6933b = new Object[2];

    /* renamed from: c */
    public C3045f f6934c;

    /* renamed from: d */
    public String[] f6935d;

    public C3044e(Context context, C3045f fVar) {
        this.f6932a = context;
        this.f6934c = fVar;
        this.f6935d = new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0 = new android.view.InflateException(r13.getPositionDescription() + ": Error inflating class " + r11);
        r0.initCause(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[ExcHandler: Exception (r12v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.Preference mo11200a(java.lang.String r11, java.lang.String[] r12, android.util.AttributeSet r13) throws java.lang.ClassNotFoundException, android.view.InflateException {
        /*
            r10 = this;
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor> r0 = f6931f
            java.lang.Object r0 = r0.get(r11)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.String r1 = ": Error inflating class "
            r2 = 1
            if (r0 != 0) goto L_0x006d
            android.content.Context r0 = r10.f6932a     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r3 = 0
            if (r12 == 0) goto L_0x005b
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            if (r4 != 0) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r5 = 0
            r6 = r3
            r7 = r5
        L_0x001e:
            if (r6 >= r4) goto L_0x003a
            r8 = r12[r6]     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.append(r8)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.append(r11)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            java.lang.String r8 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            java.lang.Class r5 = java.lang.Class.forName(r8, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            goto L_0x003a
        L_0x0036:
            r7 = move-exception
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003a:
            if (r5 != 0) goto L_0x005f
            if (r7 != 0) goto L_0x005a
            android.view.InflateException r12 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.String r2 = r13.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r1)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r11)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            throw r12     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005a:
            throw r7     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005b:
            java.lang.Class r5 = java.lang.Class.forName(r11, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005f:
            java.lang.Class<?>[] r12 = f6930e     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.reflect.Constructor r0 = r5.getConstructor(r12)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor> r12 = f6931f     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12.put(r11, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x006d:
            java.lang.Object[] r12 = r10.f6933b     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12[r2] = r13     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.Object r12 = r0.newInstance(r12)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            androidx.preference.Preference r12 = (androidx.preference.Preference) r12     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            return r12
        L_0x0078:
            r12 = move-exception
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r2.append(r13)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            r0.initCause(r12)
            throw r0
        L_0x0098:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C3044e.mo11200a(java.lang.String, java.lang.String[], android.util.AttributeSet):androidx.preference.Preference");
    }

    /* renamed from: b */
    public final Preference mo11201b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? mo11200a(str, this.f6935d, attributeSet) : mo11200a(str, (String[]) null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[SYNTHETIC, Splitter:B:18:0x0033] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.PreferenceGroup mo11202c(android.content.res.XmlResourceParser r6, androidx.preference.PreferenceGroup r7) {
        /*
            r5 = this;
            java.lang.Object[] r0 = r5.f6933b
            monitor-enter(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ all -> 0x0083 }
            java.lang.Object[] r2 = r5.f6933b     // Catch:{ all -> 0x0083 }
            r3 = 0
            android.content.Context r4 = r5.f6932a     // Catch:{ all -> 0x0083 }
            r2[r3] = r4     // Catch:{ all -> 0x0083 }
        L_0x000e:
            int r2 = r6.next()     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            r3 = 2
            if (r2 == r3) goto L_0x0018
            r4 = 1
            if (r2 != r4) goto L_0x000e
        L_0x0018:
            if (r2 != r3) goto L_0x0033
            java.lang.String r2 = r6.getName()     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            androidx.preference.Preference r2 = r5.mo11201b(r2, r1)     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            if (r7 != 0) goto L_0x002c
            androidx.preference.f r7 = r5.f6934c     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            r2.mo11060m(r7)     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            r7 = r2
        L_0x002c:
            r5.mo11203d(r6, r7, r1)     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            return r7
        L_0x0031:
            r7 = move-exception
            goto L_0x004e
        L_0x0033:
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            java.lang.String r2 = r6.getPositionDescription()     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            r1.append(r2)     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            java.lang.String r2 = ": No start tag found!"
            r1.append(r2)     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            java.lang.String r1 = r1.toString()     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            r7.<init>(r1)     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
            throw r7     // Catch:{ InflateException -> 0x0081, XmlPullParserException -> 0x0073, IOException -> 0x0031 }
        L_0x004e:
            android.view.InflateException r1 = new android.view.InflateException     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = r6.getPositionDescription()     // Catch:{ all -> 0x0083 }
            r2.append(r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = r7.getMessage()     // Catch:{ all -> 0x0083 }
            r2.append(r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0083 }
            r1.<init>(r6)     // Catch:{ all -> 0x0083 }
            r1.initCause(r7)     // Catch:{ all -> 0x0083 }
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0073:
            r6 = move-exception
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0083 }
            r7.<init>(r1)     // Catch:{ all -> 0x0083 }
            r7.initCause(r6)     // Catch:{ all -> 0x0083 }
            throw r7     // Catch:{ all -> 0x0083 }
        L_0x0081:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C3044e.mo11202c(android.content.res.XmlResourceParser, androidx.preference.PreferenceGroup):androidx.preference.PreferenceGroup");
    }

    /* renamed from: d */
    public final void mo11203d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f6833n = Intent.parseIntent(this.f6932a.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if (Constants.APPBOY_PUSH_EXTRAS_KEY.equals(name)) {
                    Resources resources = this.f6932a.getResources();
                    if (preference.f6835p == null) {
                        preference.f6835p = new Bundle();
                    }
                    resources.parseBundleExtra(Constants.APPBOY_PUSH_EXTRAS_KEY, attributeSet, preference.f6835p);
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b = mo11201b(name, attributeSet);
                    ((PreferenceGroup) preference).mo11148L(b);
                    mo11203d(xmlResourceParser, b, attributeSet);
                }
            }
        }
    }
}
