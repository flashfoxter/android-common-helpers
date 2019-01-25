package com.be.helpers;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleableRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;

import lombok.Getter;
import lombok.Setter;

public class UiCore {

/*    public static String getString(@StringRes int stringResId) {
        return getBaseContext().getString(stringResId);
    }

    public static String getString(@StringRes int stringResId, Object... args) {
        return getBaseContext().getString(stringResId, args);
    }

    public static @ColorInt
    int getColor(@ColorRes int colorResId) {
        return getBaseContext().getResources().getColor(colorResId);
    }*/

//

    @Getter
    @Setter
    protected static AppCompatActivity activity;

    public static String getString(@StringRes int stringResId) {
        return activity.getResources().getString(stringResId);
    }

    public static @ColorInt
    int getColorRuntime(@ColorRes int colorResId) {
        return activity.getResources().getColor(colorResId);
    }

    public static @ColorInt
    int getColor(Context context, @ColorRes int colorResId) {
        return context.getResources().getColor(colorResId);
    }

    public static Drawable getDrawable(Context context, @DrawableRes int drawableResId) {
        return ContextCompat.getDrawable(context, drawableResId);
    }

    public static int toPixels(float dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static TypedArray obtainAttributes(Context context, @Nullable AttributeSet attrs, @StyleableRes int[] styleRes) {
        return context.getTheme().obtainStyledAttributes(attrs, styleRes, 0, 0);
    }
}