package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.s3 */
public final class C4174s3 {

    /* renamed from: b */
    public static final C4175a f9272b = new C4175a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f9273a;

    /* renamed from: bo.app.s3$a */
    public static final class C4175a {
        private C4175a() {
        }

        public /* synthetic */ C4175a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.s3$b */
    public static final class C4176b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9274b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4176b(String str) {
            super(0);
            this.f9274b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9274b, "Stored user ID is longer than 997 bytes. Truncating. Original user ID: ");
        }
    }

    /* renamed from: bo.app.s3$c */
    public static final class C4177c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4177c f9275b = new C4177c();

        public C4177c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "userId is empty in updateLastUserId. Rejecting.";
        }
    }

    /* renamed from: bo.app.s3$d */
    public static final class C4178d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9276b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4178d(String str) {
            super(0);
            this.f9276b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9276b, "Offline user storage provider was given user ID longer than 997. Rejecting. User ID: ");
        }
    }

    public C4174s3(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f9273a = sharedPreferences;
    }

    /* renamed from: a */
    public final String mo14055a() {
        String str = "";
        String string = this.f9273a.getString("last_user", str);
        if (string != null) {
            str = string;
        }
        if (StringUtils.m11340a(str) > 997) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4176b(str), 6);
            if (StringUtils.m11340a(str) > ((long) 997)) {
                StringBuilder sb = new StringBuilder();
                char[] charArray = str.toCharArray();
                C19383o.m32796f(charArray, "this as java.lang.String).toCharArray()");
                int length = charArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    char c = charArray[i];
                    i++;
                    i2 += (int) StringUtils.m11340a(String.valueOf(c));
                    if (i2 > 997) {
                        break;
                    }
                    sb.append(c);
                }
                String sb2 = sb.toString();
                C19383o.m32796f(sb2, "truncatedStringBuilder.toString()");
                str = sb2;
            }
            mo14056a(str);
        }
        return str;
    }

    /* renamed from: a */
    public final void mo14056a(String str) {
        C19383o.m32797g(str, "userId");
        if (str.length() == 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4177c.f9275b, 6);
        } else if (StringUtils.m11340a(str) > 997) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4178d(str), 6);
        } else {
            SharedPreferences.Editor edit = this.f9273a.edit();
            edit.putString("last_user", str);
            edit.apply();
        }
    }
}
