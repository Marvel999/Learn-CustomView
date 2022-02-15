package com.marvel999.learncustomview.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class DrawLine(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    val paint: Paint = Paint()

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(600, 400)
    }

    init {
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawColor(Color.CYAN)
        canvas?.drawLine(20f, 20f, 100f,100f, paint)
        paint.color = Color.RED
        canvas?.drawLine(200f, 200f, 350f, 200f, paint)
        paint.color = Color.BLUE
        canvas?.drawLines(floatArrayOf(200f, 250f, 300f, 250f, 200f, 300f, 300f, 300f), paint)
    }


}