package p460ue;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ImageSpan;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.etsy.android.R;
import com.etsy.android.lib.models.Manufacturer;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import org.apache.commons.lang3.text.WordUtils;

/* renamed from: ue.d */
public final class C13494d extends C13493c {

    /* renamed from: b */
    public Manufacturer f29525b;

    public C13494d(Manufacturer manufacturer) {
        this.f29525b = manufacturer;
    }

    /* renamed from: b */
    public final CharSequence mo36825b(Context context) {
        Resources resources = context.getResources();
        VectorDrawableCompat create = VectorDrawableCompat.create(resources, R.drawable.clg_icon_core_location_v1, context.getTheme());
        if (create != null) {
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.clg_icon_size_smaller);
            create.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
        }
        String capitalize = WordUtils.capitalize(this.f29525b.getName());
        String location = this.f29525b.getLocation();
        String trim = this.f29525b.getDescription().trim();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(capitalize);
        int length = capitalize.length();
        spannableStringBuilder.setSpan(new StyleKitSpan.BoldSpan(context), 0, length, 33);
        spannableStringBuilder.append("\n  ");
        int i = length + 2;
        spannableStringBuilder.setSpan(new ImageSpan(create), length + 1, i, 33);
        spannableStringBuilder.append(location);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(resources.getDimensionPixelSize(R.dimen.text_small)), i, location.length() + length + 3, 33);
        if (trim.length() > 0) {
            spannableStringBuilder.append("\n\n").append(trim);
        }
        return spannableStringBuilder;
    }
}
