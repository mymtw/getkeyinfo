package com.etsy.android.lib.models;

import androidx.core.widget.NestedScrollView;
import com.etsy.android.lib.logger.C8694h;
import java.security.InvalidParameterException;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class BannerImage extends BaseFieldModel implements IFullImage {
    private final int OVERSIZE_THRESHOLD_PX = NestedScrollView.ANIMATED_SCROLL_GAP;
    private int mFullHeight = 1;
    private int mFullWidth = 1;
    public SortedMap<Integer, String> mImageUrls = new TreeMap();
    public SortedMap<Integer, String> mImageUrlsLandscape = new TreeMap();
    private boolean mIsLandscape = false;

    private int getKeyForWidth(int i, boolean z) {
        SortedMap<Integer, String> imageUrls = getImageUrls(z);
        if (imageUrls.size() <= 0) {
            return i;
        }
        int intValue = imageUrls.firstKey().intValue();
        for (Integer intValue2 : imageUrls.keySet()) {
            int intValue3 = intValue2.intValue();
            if (intValue3 > i) {
                return intValue3 - i <= 250 ? intValue3 : intValue;
            }
            intValue = intValue3;
        }
        return intValue;
    }

    private int parseYValueFromImageURL(String str) throws InvalidParameterException {
        int indexOf;
        int indexOf2 = str.indexOf(120);
        if (indexOf2 <= -1 || (indexOf = str.indexOf(46, indexOf2)) <= -1) {
            throw new InvalidParameterException();
        }
        try {
            return Integer.parseInt(str.substring(indexOf2 + 1, indexOf));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new InvalidParameterException();
        }
    }

    public String get4to3ImageUrlForPixelWidth(int i) {
        return getImageUrl();
    }

    public int getFullHeight() {
        return this.mFullHeight;
    }

    public String getFullHeightImageUrlForPixelWidth(int i) {
        return getImageUrlForPixelWidth(i, this.mIsLandscape);
    }

    public int getFullWidth() {
        return this.mFullWidth;
    }

    public int getImageColor() {
        return 0;
    }

    public String getImageUrl() {
        return getImageUrlForPixelWidth(0, false);
    }

    public String getImageUrlForPixelWidth(int i, boolean z) {
        int keyForWidth = getKeyForWidth(i, z);
        SortedMap<Integer, String> imageUrls = getImageUrls(z);
        if (imageUrls.containsKey(Integer.valueOf(keyForWidth))) {
            return imageUrls.get(Integer.valueOf(keyForWidth));
        }
        return null;
    }

    public SortedMap<Integer, String> getImageUrls(boolean z) {
        return z ? this.mImageUrlsLandscape : this.mImageUrls;
    }

    public BannerImage withDisplayWidth(int i, boolean z) {
        SortedMap<Integer, String> imageUrls = getImageUrls(z);
        if (imageUrls.containsKey(Integer.valueOf(i))) {
            String str = imageUrls.get(Integer.valueOf(i));
            try {
                this.mFullHeight = parseYValueFromImageURL(str);
                this.mFullWidth = i;
                this.mIsLandscape = z;
            } catch (InvalidParameterException unused) {
                C8694h hVar = C8694h.f19097a;
                hVar.mo21306a("InvalidParameter used to fetch image dimensions in withDisplayWidth: " + str);
            }
        }
        return this;
    }
}
