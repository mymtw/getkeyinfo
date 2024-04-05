package com.paypal.pyplcheckout.threeds;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public final class AssetUtils {
    public static final AssetUtils INSTANCE = new AssetUtils();

    private AssetUtils() {
    }

    public final String generate3DS10HTML(String str, String str2) {
        C19383o.m32797g(str, "url");
        C19383o.m32797g(str2, "jwt");
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body onload=\"document.frmLaunch.submit();\">");
        sb.append("<form name=\"frmLaunch\" method=\"POST\" action=\"" + str + "\">");
        sb.append("<input type=\"hidden\" name=\"JWT\" value=\"" + str2 + "\">");
        sb.append("</form>");
        sb.append("</body>");
        sb.append("</html>");
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "htmlBuilder.toString()");
        return sb2;
    }

    public final String generateHtmlContentWithInputParams(String str, HashMap<String, String> hashMap) {
        C19383o.m32797g(str, "url");
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body onload=\"document.frmThreeds.submit();\">");
        sb.append("<form name=\"frmThreeds\" id=\"frmThreeds\" action=\"");
        sb.append(str);
        sb.append("\" method=\"post\">");
        boolean z = false;
        if (hashMap != null && (!hashMap.isEmpty())) {
            z = true;
        }
        if (z) {
            for (Map.Entry next : hashMap.entrySet()) {
                sb.append("<input");
                sb.append(" type=\"hidden\"");
                sb.append(" name=\"");
                sb.append((String) next.getKey());
                sb.append("\"");
                sb.append(" value=\"");
                sb.append((String) next.getValue());
                sb.append("\">");
            }
        }
        sb.append("</form>");
        sb.append("</body>");
        sb.append("</html>");
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "htmlBuilder.toString()");
        return sb2;
    }
}
