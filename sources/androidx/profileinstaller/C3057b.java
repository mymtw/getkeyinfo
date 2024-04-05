package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C3063h;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.b */
public final class C3057b {

    /* renamed from: a */
    public final AssetManager f6958a;

    /* renamed from: b */
    public final Executor f6959b;

    /* renamed from: c */
    public final C3063h.C3066c f6960c;

    /* renamed from: d */
    public final byte[] f6961d;

    /* renamed from: e */
    public final File f6962e;

    /* renamed from: f */
    public boolean f6963f = false;

    /* renamed from: g */
    public C3058c[] f6964g;

    /* renamed from: h */
    public byte[] f6965h;

    public C3057b(AssetManager assetManager, Executor executor, C3063h.C3066c cVar, String str, File file) {
        byte[] bArr;
        this.f6958a = assetManager;
        this.f6959b = executor;
        this.f6960c = cVar;
        this.f6962e = file;
        switch (Build.VERSION.SDK_INT) {
            case 26:
                bArr = C3072n.f6995d;
                break;
            case 27:
                bArr = C3072n.f6994c;
                break;
            case 28:
            case 29:
            case 30:
                bArr = C3072n.f6993b;
                break;
            case 31:
                bArr = C3072n.f6992a;
                break;
            default:
                bArr = null;
                break;
        }
        this.f6961d = bArr;
    }

    /* renamed from: a */
    public final void mo11218a(int i, Serializable serializable) {
        this.f6959b.execute(new C3056a(this, i, serializable));
    }
}
