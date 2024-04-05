package p415of;

import com.etsy.android.lib.models.apiv3.Image;
import java.util.List;

/* renamed from: of.m */
public interface C13184m extends C13186o {
    int getBackgroundColor();

    Image getBackgroundImage();

    String getBackgroundImageColorDark();

    String getBackgroundImageColorLight();

    C13186o getFooter();

    boolean getHasMatchingItemViewHeights();

    C13186o getHeader();

    C13186o getHeaderWithViewAll() {
        return null;
    }

    List<C13186o> getItems();

    C13186o getPageLink();

    boolean isHorizontal();

    boolean isNested();
}
