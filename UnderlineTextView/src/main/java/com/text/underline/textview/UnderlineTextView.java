package com.text.underline.textview;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;
import static android.graphics.Paint.Style.STROKE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.port.underlinetextview.R;

@SuppressLint("AppCompatCustomView")
public class UnderlineTextView extends TextView {

    private int underlineColor;
    private int underlineWidth;

    private Paint paint;

    private float width;
    private float height;

    public UnderlineTextView(Context context) {
        super(context);
        underlineColor = Color.TRANSPARENT;
        underlineWidth = 0;
    }

    public UnderlineTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public UnderlineTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.UnderlineTextView, defStyleAttr, 0);
        underlineColor = typedArray.getColor(R.styleable.UnderlineTextView_underlineColor, Color.TRANSPARENT);
        underlineWidth = typedArray.getDimensionPixelSize(R.styleable.UnderlineTextView_underlineWidth, 0);
        typedArray.recycle();
        this.viewInit();
    }

    private void viewInit() {
        paint = new Paint(ANTI_ALIAS_FLAG);
        paint.setUnderlineText(true);
        paint.setStyle(STROKE);
        paint.setColor(underlineColor);
        paint.setStrokeWidth(underlineWidth);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0, height, width, height, paint);
    }
}
