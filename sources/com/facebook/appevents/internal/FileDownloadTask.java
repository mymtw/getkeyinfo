package com.facebook.appevents.internal;

import android.os.AsyncTask;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

public final class FileDownloadTask extends AsyncTask<String, Void, Boolean> {
    private final File destFile;
    private final C12231a onSuccess;
    private final String uriStr;

    /* renamed from: com.facebook.appevents.internal.FileDownloadTask$a */
    public interface C12231a {
        /* renamed from: a */
        void mo39346a(File file);
    }

    public FileDownloadTask(String str, File file, C12231a aVar) {
        C19383o.m32797g(str, "uriStr");
        C19383o.m32797g(file, "destFile");
        C19383o.m32797g(aVar, "onSuccess");
        this.uriStr = str;
        this.destFile = file;
        this.onSuccess = aVar;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            return doInBackground((String[]) objArr);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C13080a.m20762b(this)) {
            try {
                onPostExecute(((Boolean) obj).booleanValue());
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean doInBackground(java.lang.String... r5) {
        /*
            r4 = this;
            boolean r0 = p401mg.C13080a.m20762b(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "args"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)     // Catch:{ all -> 0x004d }
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = r4.uriStr     // Catch:{ Exception -> 0x004a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x004a }
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ Exception -> 0x004a }
            java.lang.String r2 = "conn"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)     // Catch:{ Exception -> 0x004a }
            int r0 = r0.getContentLength()     // Catch:{ Exception -> 0x004a }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x004a }
            java.io.InputStream r5 = r5.openStream()     // Catch:{ Exception -> 0x004a }
            r2.<init>(r5)     // Catch:{ Exception -> 0x004a }
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x004a }
            r2.readFully(r5)     // Catch:{ Exception -> 0x004a }
            r2.close()     // Catch:{ Exception -> 0x004a }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x004a }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004a }
            java.io.File r3 = r4.destFile     // Catch:{ Exception -> 0x004a }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x004a }
            r0.write(r5)     // Catch:{ Exception -> 0x004a }
            r0.flush()     // Catch:{ Exception -> 0x004a }
            r0.close()     // Catch:{ Exception -> 0x004a }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x004a }
            return r5
        L_0x004a:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004d }
            return r5
        L_0x004d:
            r5 = move-exception
            p401mg.C13080a.m20761a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.FileDownloadTask.doInBackground(java.lang.String[]):java.lang.Boolean");
    }

    public void onPostExecute(boolean z) {
        if (!C13080a.m20762b(this) && z) {
            try {
                this.onSuccess.mo39346a(this.destFile);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
