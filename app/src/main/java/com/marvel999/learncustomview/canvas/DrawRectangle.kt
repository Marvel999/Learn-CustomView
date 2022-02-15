package com.marvel999.learncustomview.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class DrawRectangle(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {
    val paint = Paint()
    init {
        paint.color = Color.RED
        paint.strokeCap = Paint.Cap.ROUND
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 5f
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(600, 400)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRect(100f,100f, 300f,300f, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLUE
        canvas?.drawRect(310f, 301f, 400f, 310f, paint)
    }
}