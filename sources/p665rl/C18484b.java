package p665rl;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.C19382n;

/* renamed from: rl.b */
public final class C18484b {
    /* renamed from: a */
    public static final int m31190a(AssetManager assetManager, File file) {
        int intValue = ((Integer) C19382n.m32720L0(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        Log.d("SplitCompat", sb.toString());
        return intValue;
    }
}
