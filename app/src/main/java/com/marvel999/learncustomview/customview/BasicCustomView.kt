package com.marvel999.learncustomview.customview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.View

/**
 * Calling formats of callback in custom view
 *
2022-02-15 03:25:31.842 3204-3204/com.marvel999.learncustomview E/BasicCustomView: onAttachedToWindow
2022-02-15 03:25:31.852 3204-3204/com.marvel999.learncustomview E/BasicCustomView: onMeasure
2022-02-15 03:25:31.873 3204-3204/com.marvel999.learncustomview E/BasicCustomView: onMeasure
2022-02-15 03:25:31.874 3204-3204/com.marvel999.learncustomview E/BasicCustomView: onSizeChanged
2022-02-15 03:25:31.874 3204-3204/com.marvel999.learncustomview E/BasicCustomView: onLayout
2022-02-15 03:25:31.879 3204-3204/com.marvel999.learncustomview E/BasicCustomView: onDraw

When fragment/activity is destroy/onDetached form window
2022-02-15 03:26:12.524 3204-3204/com.marvel999.learncustomview E/BasicCustomView: onDetachedFromWindow
 */
class BasicCustomView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    /** First call **/
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e("BasicCustomView", "onAttachedToWindow")
    }

    /** Second call **/
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(200, 200)
        MeasureSpec.getMode(widthMeasureSpec)
        Log.e("BasicCustomView", "onMeasure")
    }

    /** third call **/
    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Log.e("BasicCustomView", "onSizeChanged")
    }

    /** Fourth call */
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.e("BasicCustomView", "onLayout")
    }

    /** Fifth call */
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.e("BasicCustomView", "onDraw")
    }

    /** Sixth call */
    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.e("BasicCustomView", "onDetachedFromWindow")
    }
}