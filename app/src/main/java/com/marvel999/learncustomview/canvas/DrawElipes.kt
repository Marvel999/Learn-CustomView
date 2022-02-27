package com.marvel999.learncustomview.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class DrawElipes(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {
        private var paint: Paint = Paint()

        init {
            paint.strokeWidth = 5f
            paint.color = Color.BLACK
            paint.style = Paint.Style.STROKE
        }

        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)
            canvas?.drawOval(RectF(200f,200f,400f,400f), paint)
        }
}