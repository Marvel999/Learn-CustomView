package com.marvel999.learncustomview.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class DrawPoint(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    private val paint: Paint = Paint()

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(600, 400)
    }

    private fun initPaint() {
        paint.color = Color.BLACK
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 20f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        initPaint()
        canvas?.drawPoint(200f, 200f, paint)
        canvas?.drawPoints(floatArrayOf(100f, 100f, 100f, 130f, 100f, 160f), paint)
    }
}