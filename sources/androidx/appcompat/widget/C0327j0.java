package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;
import p086e.C6679a;
import p280x0.C8292f;

/* renamed from: androidx.appcompat.widget.j0 */
public class C0327j0 extends Resources {
    private final Resources mResources;

    public C0327j0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return this.mResources.getAnimation(i);
    }

    public boolean getBoolean(int i) throws Resources.NotFoundException {
        return this.mResources.getBoolean(i);
    }

    public int getColor(int i) throws Resources.NotFoundException {
        return this.mResources.getColor(i);
    }

    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return this.mResources.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    public float getDimension(int i) throws Resources.NotFoundException {
        return this.mResources.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return this.mResources.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return this.mResources.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        return this.mResources.getDrawable(i);
    }

    public final Drawable getDrawableCanonical(int i) throws Resources.NotFoundException {
        return super.getDrawable(i);
    }

    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        Resources resources = this.mResources;
        ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
        return resources.getDrawableForDensity(i, i2, (Resources.Theme) null);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.mResources.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) throws Resources.NotFoundException {
        return this.mResources.getIntArray(i);
    }

    public int getInteger(int i) throws Resources.NotFoundException {
        return this.mResources.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return this.mResources.getLayout(i);
    }

    public Movie getMovie(int i) throws Resources.NotFoundException {
        return this.mResources.getMovie(i);
    }

    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        return this.mResources.getQuantityString(i, i2, objArr);
    }

    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return this.mResources.getQuantityText(i, i2);
    }

    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.mResources.getResourceEntryName(i);
    }

    public String getResourceName(int i) throws Resources.NotFoundException {
        return this.mResources.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.mResources.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.mResources.getResourceTypeName(i);
    }

    public String getString(int i) throws Resources.NotFoundException {
        return this.mResources.getString(i);
    }

    public String[] getStringArray(int i) throws Resources.NotFoundException {
        return this.mResources.getStringArray(i);
    }

    public CharSequence getText(int i) throws Resources.NotFoundException {
        return this.mResources.getText(i);
    }

    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return this.mResources.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.mResources.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        C6679a.m13045a(this.mResources, i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return this.mResources.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return this.mResources.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        return this.mResources.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return this.mResources.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.mResources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        Resources resources = this.mResources;
        ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
        return resources.getDrawable(i, theme);
    }

    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return this.mResources.getQuantityString(i, i2);
    }

    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        return this.mResources.getString(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.mResources.getText(i, charSequence);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.mResources.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return this.mResources.openRawResource(i, typedValue);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        Resources resources = this.mResources;
        ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
