package com.marvel999.learncustomview.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class DrawCircle(context: Context, attributeSet: AttributeSet): View(context, attributeSet){
    private var paint: Paint = Paint()

    init {
        paint.strokeWidth = 5f
        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawCircle(500f,500f, 200f, paint)
    }
}