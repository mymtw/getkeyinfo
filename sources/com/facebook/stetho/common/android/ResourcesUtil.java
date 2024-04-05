package com.facebook.stetho.common.android;

import android.content.res.Resources;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.conversation.MessageDraft;
import com.facebook.stetho.common.LogUtil;
import p003a2.C0023f;

public class ResourcesUtil {
    private ResourcesUtil() {
    }

    private static String getFallbackIdString(int i) {
        StringBuilder h = C0072d.m201h("#");
        h.append(Integer.toHexString(i));
        return h.toString();
    }

    public static String getIdString(Resources resources, int i) throws Resources.NotFoundException {
        String str;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        String str2 = "";
        if (getResourcePackageId(i) != 127) {
            str2 = resources.getResourcePackageName(i);
            str = MessageDraft.IMAGE_DELIMITER;
        } else {
            str = str2;
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        int length = str.length() + str2.length() + 1;
        StringBuilder sb = new StringBuilder(resourceEntryName.length() + resourceTypeName.length() + length + 1);
        C0391c.m1061h(sb, "@", str2, str, resourceTypeName);
        return C0023f.m110k(sb, "/", resourceEntryName);
    }

    public static String getIdStringQuietly(Object obj, Resources resources, int i) {
        try {
            return getIdString(resources, i);
        } catch (Resources.NotFoundException unused) {
            String fallbackIdString = getFallbackIdString(i);
            LogUtil.m20249w("Unknown identifier encountered on " + obj + ": " + fallbackIdString);
            return fallbackIdString;
        }
    }

    private static int getResourcePackageId(int i) {
        return (i >>> 24) & 255;
    }
}
