package com.marvel999.learncustomview.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.marvel999.learncustomview.R

class LearnCanvas(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    val paint = Paint()
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(200, 200)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawColor(Color.GREEN)
        paint.color = Color.BLACK
        paint.textSize = 80f
        paint.style = Paint.Style.FILL
//        paint.strokeWidth = 20f
        canvas?.drawText("1",(width-80f)/2f, (height+80f)/2f, paint)
    }
}