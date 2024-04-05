package androidx.room;

import java.io.File;
import java.io.IOException;
import p112g2.C6831a;
import p112g2.C6832b;

/* renamed from: androidx.room.f0 */
public final class C3230f0 implements C6832b, C3240j {

    /* renamed from: b */
    public C3237i f7511b;

    /* renamed from: c */
    public boolean f7512c;

    /* renamed from: a */
    public final void mo12020a(File file) throws IOException {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    /* renamed from: b */
    public final void mo12021b(boolean z) {
        getDatabaseName();
        throw null;
    }

    public final synchronized void close() {
        throw null;
    }

    public final String getDatabaseName() {
        throw null;
    }

    public final C6832b getDelegate() {
        return null;
    }

    /* renamed from: j0 */
    public final synchronized C6831a mo12025j0() {
        if (!this.f7512c) {
            mo12021b(true);
            this.f7512c = true;
        }
        throw null;
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}
