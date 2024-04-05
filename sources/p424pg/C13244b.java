package p424pg;

import android.content.res.Resources;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.conversation.MessageDraft;
import kotlin.jvm.internal.C19383o;

/* renamed from: pg.b */
public final class C13244b {
    /* renamed from: a */
    public static final String m20905a(Resources resources, int i) throws Resources.NotFoundException {
        String str;
        if (resources == null) {
            StringBuilder h = C0072d.m201h("#");
            h.append(Integer.toHexString(i));
            return h.toString();
        }
        String str2 = "";
        if (((i >>> 24) & 255) != 127) {
            str2 = resources.getResourcePackageName(i);
            C19383o.m32796f(str2, "r.getResourcePackageName(resourceId)");
            str = MessageDraft.IMAGE_DELIMITER;
        } else {
            str = str2;
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        int length = str.length() + str2.length() + 1;
        StringBuilder sb = new StringBuilder(resourceEntryName.length() + resourceTypeName.length() + length + 1);
        C0391c.m1061h(sb, "@", str2, str, resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "sb.toString()");
        return sb2;
    }
}
