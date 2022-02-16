package com.marvel999.learncustomview.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class DrawBasicShape(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    var paint = Paint()

    init {
        paint.color = Color.RED
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawPoints(floatArrayOf(100f, 100f, 150f, 150f), paint)
        paint.color = Color.BLACK
        canvas?.drawLines(floatArrayOf(130f, 100f, 300f,100f), paint)
        paint.color = Color.GREEN
        canvas?.drawRect(Rect(320,150,200,200), paint)
        paint.color = Color.GRAY
        canvas?.drawRoundRect(250f,250f,450f,450f,30f,30f, paint)
        paint.color = Color.BLUE
        canvas?.drawCircle(600f, 600f, 50f, paint)
        paint.color = Color.CYAN
        canvas?.drawOval(200f, 700f,400f, 750f, paint)


    }
}