package de.keyboardsurfer.android.widget.crouton;

import android.content.Context;

import de.keyboardsurfer.android.widget.crouton.Style.Builder;
import de.keyboardsurfer.mobile.app.android.widget.crouton.R;

/**
 * Default styles to use as {@link de.keyboardsurfer.android.widget.crouton.Style} for a
 * {@link de.keyboardsurfer.android.widget.crouton.Crouton}.
 */
public class Styles {
  /**
   * Default style for errors.
   */
  private static Style sError;
  /**
   * Default style for warnings.
   */
  private static Style sWarning;
  /**
   * Default style for general information.
   */
  private static Style sInfo;
  /**
   * Default style for confirming an action.
   */
  private static Style sConfirm;

  /**
   * Constants that identify the related {@link de.keyboardsurfer.android.widget.crouton.Style}
   */
  public static final int ERROR = 3;
  public static final int WARNING = 2;
  public static final int INFO = 1;
  public static final int CONFIRM = 0;

  /**
   * Colors
   */
  private static final int holoRedLight = 0xffff4444;
  private static final int holoGreenLight = 0xff99cc00;
  private static final int holoBlueLight = 0xff33b5e5;
  private static final int holoYellowLight = 0xffffbb33;

  /**
   * Factory initializer
   * @param context the context from which this method is called.
   */
  public static void initStyles(Context context) {
    // Init text-size
    final float density = context.getResources().getDisplayMetrics().density;
    final int textSize = (int) (context.getResources().getDimension(R.dimen.crouton_text_size) / density);
    final int horizontalPaddingResId = R.dimen.crouton_horizontal_padding;

    // Init styles
    sError = new Builder()
      .setBackgroundColorValue(holoRedLight)
      .setTextSize(textSize)
      .setHorizontalPaddingDimensionResId(horizontalPaddingResId)
      .build();
    sWarning = new Builder()
      .setBackgroundColorValue(holoYellowLight)
      .setTextSize(textSize)
      .setHorizontalPaddingDimensionResId(horizontalPaddingResId)
      .build();
    sInfo = new Builder()
      .setBackgroundColorValue(holoBlueLight)
      .setTextSize(textSize)
      .setHorizontalPaddingDimensionResId(horizontalPaddingResId)
      .build();
    sConfirm = new Builder()
      .setBackgroundColorValue(holoGreenLight)
      .setTextSize(textSize)
      .setHorizontalPaddingDimensionResId(horizontalPaddingResId)
      .build();
  }

  public static Style getStyle(int which) {
    switch (which) {
      case ERROR:
        return sError;
      case WARNING:
        return sWarning;
      case INFO:
        return sInfo;
      case CONFIRM:
        return sConfirm;
      default:
        throw new IllegalStateException("There is no style " + which + ".");
    }
  }
}
