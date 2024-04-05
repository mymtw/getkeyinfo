package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.editable.EditableListing;
import java.util.EnumSet;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bo.app.x4 */
public final class C4279x4 {

    /* renamed from: b */
    public static final C4280a f9435b = new C4280a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f9436a;

    /* renamed from: bo.app.x4$a */
    public static final class C4280a {
        private C4280a() {
        }

        public /* synthetic */ C4280a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4279x4(Context context, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "userId");
        C19383o.m32797g(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str, str2), "com.braze.storage.sdk_metadata_cache"), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f9436a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo14176a(EnumSet<BrazeSdkMetadata> enumSet) {
        C19383o.m32797g(enumSet, "sdkMetadata");
        this.f9436a.edit().putStringSet(EditableListing.FIELD_TAGS, C4230u0.m9700a(enumSet)).apply();
    }

    /* renamed from: b */
    public final EnumSet<BrazeSdkMetadata> mo14177b(EnumSet<BrazeSdkMetadata> enumSet) {
        C19383o.m32797g(enumSet, "newSdkMetadata");
        if (C19383o.m32792b(C4230u0.m9700a(enumSet), this.f9436a.getStringSet(EditableListing.FIELD_TAGS, EmptySet.INSTANCE))) {
            return null;
        }
        return enumSet;
    }
}
