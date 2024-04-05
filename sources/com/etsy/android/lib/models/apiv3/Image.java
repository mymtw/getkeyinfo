package com.etsy.android.lib.models.apiv3;

import android.graphics.Color;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.IFullImage;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p289y0.C8351c;
import p380ka.C12989a;

public class Image extends BaseFieldModel implements IFullImage {
    public static final Comparator<Source> SOURCE_COMPARATOR = new C12989a(0);
    public Integer brightness;
    public Integer hue;
    public String key;
    public Integer saturation;
    public List<Source> sources;
    public String url;

    public static class Source extends BaseModel {
        public int height;
        public String url;
        public int width;

        public Source() {
        }

        public int getHeight() {
            return this.height;
        }

        public String getUrl() {
            return this.url;
        }

        public int getWidth() {
            return this.width;
        }

        public void parseData(JsonParser jsonParser) throws IOException {
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                String currentName = jsonParser.getCurrentName();
                jsonParser.nextToken();
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    currentName.getClass();
                    char c = 65535;
                    switch (currentName.hashCode()) {
                        case -1221029593:
                            if (currentName.equals(ResponseConstants.HEIGHT)) {
                                c = 0;
                                break;
                            }
                            break;
                        case 116079:
                            if (currentName.equals("url")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 113126854:
                            if (currentName.equals(ResponseConstants.WIDTH)) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.height = jsonParser.getValueAsInt();
                            break;
                        case 1:
                            this.url = BaseModel.parseString(jsonParser);
                            break;
                        case 2:
                            this.width = jsonParser.getValueAsInt();
                            break;
                        default:
                            jsonParser.skipChildren();
                            break;
                    }
                }
            }
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        public Source(int i, int i2, String str) {
            this.width = i;
            this.height = i2;
            this.url = str;
        }
    }

    public Image() {
        this.key = "";
        this.url = "";
        this.sources = new ArrayList();
        this.hue = null;
        this.saturation = null;
        this.brightness = null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Source source, Source source2) {
        int i;
        int i2;
        if (source.getWidth() == source2.getWidth()) {
            i2 = source.getHeight();
            i = source2.getHeight();
        } else {
            i2 = source.getWidth();
            i = source2.getWidth();
        }
        return i2 - i;
    }

    public int generateLoadingColor() {
        Integer num;
        Integer num2;
        int i;
        int i2;
        Integer num3 = this.hue;
        int i3 = 0;
        if (num3 == null || num3.intValue() < 0 || this.hue.intValue() > 360 || (num = this.saturation) == null || num.intValue() < 0 || this.saturation.intValue() > 100 || (num2 = this.brightness) == null || num2.intValue() < 0 || this.brightness.intValue() > 100) {
            return 0;
        }
        float intValue = ((float) this.brightness.intValue()) / 100.0f;
        float intValue2 = (float) this.hue.intValue();
        ThreadLocal<double[]> threadLocal = C8351c.f18318a;
        float abs = (1.0f - Math.abs((intValue * 2.0f) - 1.0f)) * (((float) this.saturation.intValue()) / 100.0f);
        float f = intValue - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((intValue2 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) intValue2) / 60) {
            case 0:
                i3 = Math.round((abs + f) * 255.0f);
                i2 = Math.round((abs2 + f) * 255.0f);
                i = Math.round(f * 255.0f);
                break;
            case 1:
                i3 = Math.round((abs2 + f) * 255.0f);
                i2 = Math.round((abs + f) * 255.0f);
                i = Math.round(f * 255.0f);
                break;
            case 2:
                i3 = Math.round(f * 255.0f);
                i2 = Math.round((abs + f) * 255.0f);
                i = Math.round((abs2 + f) * 255.0f);
                break;
            case 3:
                i3 = Math.round(f * 255.0f);
                i2 = Math.round((abs2 + f) * 255.0f);
                i = Math.round((abs + f) * 255.0f);
                break;
            case 4:
                i3 = Math.round((abs2 + f) * 255.0f);
                i2 = Math.round(f * 255.0f);
                i = Math.round((abs + f) * 255.0f);
                break;
            case 5:
            case 6:
                i3 = Math.round((abs + f) * 255.0f);
                i2 = Math.round(f * 255.0f);
                i = Math.round((abs2 + f) * 255.0f);
                break;
            default:
                i2 = 0;
                i = 0;
                break;
        }
        return Color.rgb(C8351c.m16665g(i3), C8351c.m16665g(i2), C8351c.m16665g(i));
    }

    public String get4to3ImageUrlForPixelWidth(int i) {
        return pickBestImageSource(i, 0);
    }

    public Integer getBrightness() {
        return this.brightness;
    }

    public int getFullHeight() {
        if (this.sources.isEmpty()) {
            return 0;
        }
        List<Source> list = this.sources;
        return list.get(list.size() - 1).height;
    }

    public String getFullHeightImageUrlForPixelWidth(int i) {
        return pickBestImageSource(i, 0);
    }

    public int getFullWidth() {
        if (this.sources.isEmpty()) {
            return 0;
        }
        List<Source> list = this.sources;
        return list.get(list.size() - 1).width;
    }

    public Integer getHue() {
        return this.hue;
    }

    public int getImageColor() {
        return -1842209;
    }

    public String getKey() {
        return this.key;
    }

    public Integer getSaturation() {
        return this.saturation;
    }

    public List<Source> getSources() {
        return this.sources;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2021876808:
                if (str.equals(ResponseConstants.SOURCES)) {
                    c = 0;
                    break;
                }
                break;
            case -230491182:
                if (str.equals(ResponseConstants.SATURATION)) {
                    c = 1;
                    break;
                }
                break;
            case 103672:
                if (str.equals(ResponseConstants.HUE)) {
                    c = 2;
                    break;
                }
                break;
            case 106079:
                if (str.equals("key")) {
                    c = 3;
                    break;
                }
                break;
            case 116079:
                if (str.equals("url")) {
                    c = 4;
                    break;
                }
                break;
            case 648162385:
                if (str.equals(ResponseConstants.BRIGHTNESS)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                List<Source> parseArray = BaseModel.parseArray(jsonParser, Source.class);
                this.sources = parseArray;
                Collections.sort(parseArray, SOURCE_COMPARATOR);
                return true;
            case 1:
                this.saturation = Integer.valueOf(jsonParser.getIntValue());
                return true;
            case 2:
                this.hue = Integer.valueOf(jsonParser.getIntValue());
                return true;
            case 3:
                this.key = BaseModel.parseString(jsonParser);
                return true;
            case 4:
                this.url = BaseModel.parseString(jsonParser);
                return true;
            case 5:
                this.brightness = Integer.valueOf(jsonParser.getIntValue());
                return true;
            default:
                return false;
        }
    }

    public String pickBestImageSource(int i, int i2) {
        for (Source next : this.sources) {
            if (i <= next.getWidth() && i2 <= next.getHeight()) {
                return next.getUrl();
            }
        }
        return this.url;
    }

    public void setFullHeight(int i) {
    }

    public void setFullWidth(int i) {
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setSources(List<Source> list) {
        this.sources = list;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Image(String str, String str2, List<Source> list, Integer num, Integer num2, Integer num3) {
        this.key = "";
        this.url = "";
        new ArrayList();
        this.key = str;
        this.url = str2;
        this.sources = list;
        this.hue = num;
        this.saturation = num2;
        this.brightness = num3;
    }
}
