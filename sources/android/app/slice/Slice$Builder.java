package android.app.slice;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.net.Uri;
import java.util.List;

public /* synthetic */ class Slice$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ Slice$Builder(@NonNull Uri uri, SliceSpec sliceSpec) {
    }

    public native /* synthetic */ Slice$Builder addAction(@NonNull PendingIntent pendingIntent, @NonNull Slice slice, @Nullable String str);

    public native /* synthetic */ Slice$Builder addHints(List<String> list);

    public native /* synthetic */ Slice$Builder addIcon(Icon icon, @Nullable String str, List<String> list);

    public native /* synthetic */ Slice$Builder addInt(int i, @Nullable String str, List<String> list);

    public native /* synthetic */ Slice$Builder addLong(long j, @Nullable String str, List<String> list);

    public native /* synthetic */ Slice$Builder addRemoteInput(RemoteInput remoteInput, @Nullable String str, List<String> list);

    public native /* synthetic */ Slice$Builder addSubSlice(@NonNull Slice slice, @Nullable String str);

    public native /* synthetic */ Slice$Builder addText(CharSequence charSequence, @Nullable String str, List<String> list);

    public native /* synthetic */ Slice build();
}
