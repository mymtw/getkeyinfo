package org.apache.commons.codec.language;

import com.appboy.Constants;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import java.util.Locale;

public class Caverphone1 extends AbstractCaverphone {
    private static final String SIX_1 = "111111";

    public String encode(String str) {
        if (str == null || str.length() == 0) {
            return SIX_1;
        }
        String replaceAll = str.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replaceAll("cq", "2q").replaceAll("ci", "si").replaceAll("ce", "se").replaceAll("cy", "sy").replaceAll("tch", "2ch").replaceAll("c", "k").replaceAll(SearchCategoryRedirectPage.PARAM_QUERY, "k").replaceAll(EtsyDialogFragment.OPT_X_BUTTON, "k").replaceAll("v", "f").replaceAll("dg", "2g").replaceAll("tio", "sio").replaceAll("tia", "sia").replaceAll("d", Constants.APPBOY_PUSH_TITLE_KEY).replaceAll("ph", "fh").replaceAll("b", Constants.APPBOY_PUSH_PRIORITY_KEY).replaceAll("sh", "s2").replaceAll("z", Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY).replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", "3").replaceAll("3gh3", "3kh3").replaceAll("gh", "22").replaceAll("g", "k").replaceAll("s+", "S").replaceAll("t+", "T").replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replaceAll("w3", "W3").replaceAll("wy", "Wy").replaceAll("wh3", "Wh3").replaceAll("why", "Why").replaceAll("w", "2").replaceAll("^h", "A").replaceAll("h", "2").replaceAll("r3", "R3").replaceAll("ry", "Ry").replaceAll("r", "2").replaceAll("l3", "L3").replaceAll("ly", "Ly").replaceAll("l", "2").replaceAll("j", "y").replaceAll("y3", "Y3").replaceAll("y", "2").replaceAll("2", "").replaceAll("3", "");
        return (replaceAll + SIX_1).substring(0, 6);
    }
}
