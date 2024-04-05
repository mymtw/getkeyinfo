package p435rb;

/* renamed from: rb.c */
public final class C13352c {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m21021a(android.view.View r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            int r0 = r4.getId()
            r1 = -1
            if (r0 == r1) goto L_0x0020
            int r0 = r4.getId()
            if (r0 != 0) goto L_0x0013
            goto L_0x0020
        L_0x0013:
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ NotFoundException -> 0x0020 }
            int r4 = r4.getId()     // Catch:{ NotFoundException -> 0x0020 }
            java.lang.String r4 = r0.getResourceName(r4)     // Catch:{ NotFoundException -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            java.lang.String r4 = "unknown ID"
        L_0x0022:
            java.lang.String r0 = "current"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            r2 = 0
            java.util.List r0 = kotlin.text.C19459m.m33056y1(r4, r0, r2, r1)
            int r1 = r0.size()
            r3 = 1
            if (r1 <= r3) goto L_0x003b
            r2 = r3
        L_0x003b:
            if (r2 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            java.lang.String r0 = "humanReadableId"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p435rb.C13352c.m21021a(android.view.View):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    @android.annotation.SuppressLint({"ApiNew"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m21022b(android.view.View r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.util.List<java.lang.String> r0 = com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities.f19885a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r3
        L_0x0012:
            if (r0 == 0) goto L_0x005e
            int r0 = r4.getSourceLayoutResId()
            r1 = -1
            if (r0 == r1) goto L_0x002f
            int r0 = r4.getSourceLayoutResId()
            if (r0 != 0) goto L_0x0022
            goto L_0x002f
        L_0x0022:
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ NotFoundException -> 0x002f }
            int r4 = r4.getSourceLayoutResId()     // Catch:{ NotFoundException -> 0x002f }
            java.lang.String r4 = r0.getResourceName(r4)     // Catch:{ NotFoundException -> 0x002f }
            goto L_0x0031
        L_0x002f:
            java.lang.String r4 = "unknown layout"
        L_0x0031:
            java.lang.String r0 = "current"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            java.util.List r0 = kotlin.text.C19459m.m33056y1(r4, r0, r3, r1)
            int r1 = r0.size()
            if (r1 <= r2) goto L_0x0048
            r3 = r2
        L_0x0048:
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r4 = r0
        L_0x0058:
            java.lang.String r0 = "humanReadableLayoutResId"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            return r4
        L_0x005e:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p435rb.C13352c.m21022b(android.view.View):java.lang.String");
    }
}
