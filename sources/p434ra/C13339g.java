package p434ra;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.etsy.android.R;
import com.etsy.android.lib.push.notifications.InboxItemsList;
import com.etsy.android.lib.util.NotificationType;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import java.util.HashSet;
import org.apache.commons.lang3.StringEscapeUtils;
import p250u0.C8100m;
import p250u0.C8102o;
import p250u0.C8105q;

/* renamed from: ra.g */
public abstract class C13339g extends C13337e {

    /* renamed from: d */
    public final Object f29266d = new Object();

    /* renamed from: e */
    public InboxItemsList f29267e = new InboxItemsList();

    /* renamed from: ra.g$a */
    public static class C13340a {

        /* renamed from: a */
        public String f29268a = "";

        /* renamed from: b */
        public CharSequence f29269b = "";

        public C13340a(String str, CharSequence charSequence) {
            if (str != null) {
                this.f29268a = str;
            } else {
                this.f29268a = "";
            }
            if (charSequence != null) {
                this.f29269b = charSequence;
            } else {
                this.f29269b = "";
            }
        }
    }

    public C13339g(NotificationType notificationType) {
        super(notificationType);
    }

    /* renamed from: b */
    public final CharSequence mo46030b(Context context, String str) {
        StringBuilder sb = new StringBuilder(context.getString(R.string.inbox_notification_sender_prefix));
        HashSet hashSet = new HashSet();
        synchronized (this.f29266d) {
            int i = 0;
            for (C13340a aVar : this.f29267e.values()) {
                String str2 = aVar.f29268a;
                if (!hashSet.contains(str2)) {
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(" ");
                    sb.append(str2);
                    hashSet.add(str2);
                    i++;
                    if (i >= 5) {
                        break;
                    }
                }
            }
        }
        return sb;
    }

    /* renamed from: c */
    public final CharSequence mo46031c(Context context, Bundle bundle) {
        return mo46022j(context, "", bundle);
    }

    /* renamed from: f */
    public final int mo46032f(Bundle bundle) {
        InboxItemsList inboxItemsList = this.f29267e;
        if (inboxItemsList == null) {
            return 0;
        }
        return inboxItemsList.size();
    }

    /* renamed from: g */
    public final C8105q mo46033g(C13346l lVar, Context context, Bundle bundle, String str) {
        C8102o oVar;
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(bundle.getString(mo46024m()));
        CharSequence n = mo46025n(context, bundle);
        String k = mo46027k(bundle);
        synchronized (this.f29266d) {
            C13340a aVar = this.f29267e.get(k);
            if (aVar != null) {
                if (unescapeHtml4 != null) {
                    aVar.f29268a = unescapeHtml4;
                } else {
                    aVar.f29268a = "";
                }
                if (n != null) {
                    aVar.f29269b = n;
                } else {
                    aVar.f29269b = "";
                }
            } else {
                this.f29267e.put(k, new C13340a(unescapeHtml4, n));
            }
            oVar = new C8102o();
            oVar.f17693b = C8100m.m16287c(mo46022j(context, str, bundle));
            int i = 0;
            for (C13340a next : this.f29267e.valuesReversed()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString(next.f29268a);
                spannableString.setSpan(new StyleKitSpan.BoldSpan(context), 0, spannableString.length(), 17);
                spannableStringBuilder.append(spannableString);
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append(next.f29269b);
                oVar.f17683e.add(C8100m.m16287c(spannableStringBuilder));
                i++;
                if (i >= 5) {
                    break;
                }
            }
            oVar.f17694c = null;
            oVar.f17695d = true;
        }
        return oVar;
    }

    /* renamed from: h */
    public final void mo46034h() {
        synchronized (this.f29266d) {
            this.f29267e = new InboxItemsList();
        }
    }

    /* renamed from: j */
    public abstract String mo46022j(Context context, String str, Bundle bundle);

    /* renamed from: k */
    public String mo46027k(Bundle bundle) {
        mo46023l();
        return bundle.getString("o");
    }

    /* renamed from: l */
    public abstract void mo46023l();

    /* renamed from: m */
    public abstract String mo46024m();

    /* renamed from: n */
    public CharSequence mo46025n(Context context, Bundle bundle) {
        return StringEscapeUtils.unescapeHtml4(bundle.getString(mo46026o()));
    }

    /* renamed from: o */
    public abstract String mo46026o();
}
