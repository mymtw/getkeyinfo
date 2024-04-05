package p434ra;

import android.content.Context;
import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.NotificationType;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* renamed from: ra.d */
public final class C13336d extends C13339g {

    /* renamed from: f */
    public static C13336d f29262f;

    public C13336d() {
        super(NotificationType.CONVERSATION);
    }

    /* renamed from: j */
    public final String mo46022j(Context context, String str, Bundle bundle) {
        String string = bundle.getString("sm");
        if (string != null && string.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            return str;
        }
        return context.getResources().getQuantityString(R.plurals.convo_big_title, mo46032f(bundle), new Object[]{Integer.valueOf(mo46032f(bundle))});
    }

    /* renamed from: l */
    public final void mo46023l() {
    }

    /* renamed from: m */
    public final String mo46024m() {
        return ResponseConstants.USERNAME;
    }

    /* renamed from: o */
    public final String mo46026o() {
        return "message";
    }
}
