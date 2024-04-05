package com.bugsnag.android;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public final class DeviceIdStore {

    /* renamed from: a */
    public final C5813n2<C5806m0> f12110a;

    /* renamed from: b */
    public final File f12111b;

    /* renamed from: c */
    public final C5755h2 f12112c;

    /* renamed from: d */
    public final C5816o1 f12113d;

    public DeviceIdStore(Context context, C5755h2 h2Var, C5816o1 o1Var) {
        File file = new File(context.getFilesDir(), "device-id");
        C19383o.m32798h(context, ResponseConstants.CONTEXT);
        C19383o.m32798h(h2Var, "sharedPrefMigrator");
        C19383o.m32798h(o1Var, "logger");
        this.f12111b = file;
        this.f12112c = h2Var;
        this.f12113d = o1Var;
        try {
            file.createNewFile();
        } catch (Throwable th) {
            this.f12113d.mo16602b("Failed to created device ID file", th);
        }
        this.f12110a = new C5813n2<>(this.f12111b);
    }

    /* renamed from: a */
    public final C5806m0 mo16436a() {
        if (this.f12111b.length() <= 0) {
            return null;
        }
        try {
            return this.f12110a.mo16575a(new DeviceIdStore$loadDeviceIdInternal$1(C5806m0.f12419c));
        } catch (Throwable th) {
            this.f12113d.mo16602b("Failed to load device ID", th);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo16437b(FileChannel fileChannel, C19846a<UUID> aVar) {
        String str;
        FileLock fileLock;
        String str2;
        int i = 0;
        while (true) {
            str = null;
            if (i >= 20) {
                fileLock = null;
                break;
            }
            try {
                fileLock = fileChannel.tryLock();
                break;
            } catch (OverlappingFileLockException unused) {
                Thread.sleep(25);
                i++;
            }
        }
        if (fileLock == null) {
            return null;
        }
        try {
            C5806m0 a = mo16436a();
            if (a != null) {
                str = a.f12420b;
            }
            if (str != null) {
                str2 = a.f12420b;
            } else {
                str2 = aVar.invoke().toString();
                this.f12110a.mo16576b(new C5806m0(str2));
            }
            return str2;
        } finally {
            fileLock.release();
        }
    }
}
