package android.app.slice;

import android.annotation.NonNull;
import android.net.Uri;
import java.util.List;
import java.util.Set;

public /* synthetic */ class SliceManager {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ List<Uri> getPinnedSlices();

    @NonNull
    public native /* synthetic */ Set<SliceSpec> getPinnedSpecs(Uri uri);
}
