package p033c2;

import android.content.Context;
import android.net.Uri;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: c2.c */
public final class C4366c extends C4363b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4366c(Context context, Uri uri) {
        super(context, uri);
        C19383o.m32798h(context, ResponseConstants.CONTEXT);
        C19383o.m32798h(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
    }
}
