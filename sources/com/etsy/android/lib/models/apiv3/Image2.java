package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class Image2 {
    public static final int $stable = 8;
    private final String key;
    private final List<Source> sources;
    private final String url;

    public Image2() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public Image2(String str, String str2, List<Source> list) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "url");
        C19383o.m32797g(list, ResponseConstants.SOURCES);
        this.key = str;
        this.url = str2;
        this.sources = list;
    }

    public static /* synthetic */ Image2 copy$default(Image2 image2, String str, String str2, List<Source> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = image2.key;
        }
        if ((i & 2) != 0) {
            str2 = image2.url;
        }
        if ((i & 4) != 0) {
            list = image2.sources;
        }
        return image2.copy(str, str2, list);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.url;
    }

    public final List<Source> component3() {
        return this.sources;
    }

    public final Image2 copy(String str, String str2, List<Source> list) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "url");
        C19383o.m32797g(list, ResponseConstants.SOURCES);
        return new Image2(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image2)) {
            return false;
        }
        Image2 image2 = (Image2) obj;
        return C19383o.m32792b(this.key, image2.key) && C19383o.m32792b(this.url, image2.url) && C19383o.m32792b(this.sources, image2.sources);
    }

    public final String getKey() {
        return this.key;
    }

    public final List<Source> getSources() {
        return this.sources;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.sources.hashCode() + C0023f.m105e(this.url, this.key.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Image2(key=");
        h.append(this.key);
        h.append(", url=");
        h.append(this.url);
        h.append(", sources=");
        return C0070b.m186i(h, this.sources, ')');
    }

    @C17403o(generateAdapter = true)
    public static final class Source {
        public static final int $stable = 0;
        private final int height;
        private final String url;
        private final int width;

        public Source(int i, int i2, String str) {
            C19383o.m32797g(str, "url");
            this.width = i;
            this.height = i2;
            this.url = str;
        }

        public static /* synthetic */ Source copy$default(Source source, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = source.width;
            }
            if ((i3 & 2) != 0) {
                i2 = source.height;
            }
            if ((i3 & 4) != 0) {
                str = source.url;
            }
            return source.copy(i, i2, str);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final String component3() {
            return this.url;
        }

        public final Source copy(int i, int i2, String str) {
            C19383o.m32797g(str, "url");
            return new Source(i, i2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Source)) {
                return false;
            }
            Source source = (Source) obj;
            return this.width == source.width && this.height == source.height && C19383o.m32792b(this.url, source.url);
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.url.hashCode() + C0069a.m170a(this.height, Integer.hashCode(this.width) * 31, 31);
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Source(width=");
            h.append(this.width);
            h.append(", height=");
            h.append(this.height);
            h.append(", url=");
            return C0391c.m1057c(h, this.url, ')');
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Source(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Image2(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? EmptyList.INSTANCE : list);
    }
}
