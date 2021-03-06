package com.hzy.sideslipdeletelayout

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager


/**
 * 解决滑动冲突的 ViewPager
 * 因为 ViewPager 和 SideslipDeleteLayout 都是水平方向滑动的控件。
 * 所以在一起使用时会有冲突，使用本控件(ResolveConflictViewPager)，可以在ViewPager的第一页使用左滑。在ViewPager的最后一页使用右滑菜单。
 * Created by ziye_huang on 2019/1/3.
 */
open class ResolveConflictViewPager : ViewPager {

    private var mLastX: Int = 0
    private var mLastY: Int = 0

    @JvmOverloads
    constructor(context: Context, attrs: AttributeSet? = null) : super(
        context,
        attrs
    )

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        val x = ev.x.toInt()
        val y = ev.y.toInt()
        var intercept = false
        when (ev.action) {
            MotionEvent.ACTION_DOWN -> {
            }
            MotionEvent.ACTION_MOVE -> if (isHorizontalScroll(x, y)) {
                //除了在第一页的手指向右滑 ， 最后一页的左滑，其他时刻都是父控件需要拦截事件
                intercept = if (isReactFirstPage() && isScrollRight(x)) {
                    //Log.e(TAG, "第一页的手指向右滑]");
                    false
                } else !(isReachLastPage() && isScrollLeft(x))
            } else {
            }
            MotionEvent.ACTION_UP -> {
            }
            else -> {
            }
        }

        mLastX = x
        mLastY = y

        return intercept || super.onInterceptTouchEvent(ev)
    }

    /**
     * 是否在水平滑动
     */
    private fun isHorizontalScroll(x: Int, y: Int): Boolean {
        return Math.abs(y - mLastY) < Math.abs(x - mLastX)
    }

    /**
     * 是否未到达最后一页
     */
    private fun isReachLastPage(): Boolean {
        val adapter = adapter
        return null != adapter && adapter.count - 1 == currentItem
    }

    /**
     * 是否在第一页
     */
    private fun isReactFirstPage(): Boolean {
        return currentItem == 0
    }

    /**
     * 是否左滑
     */
    private fun isScrollLeft(x: Int): Boolean {
        return x - mLastX < 0
    }

    /**
     * 是否右滑
     */
    private fun isScrollRight(x: Int): Boolean {
        return x - mLastX > 0
    }
}
