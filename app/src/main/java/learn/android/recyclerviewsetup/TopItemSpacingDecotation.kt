package learn.android.recyclerviewsetup

import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView

class TopItemSpacingDecotation(private val padding: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
        super.getItemOffsets(outRect, itemPosition, parent)

//        outRect.top = padding
//        outRect.bottom = padding
        outRect.apply {
           set(padding, padding, padding, padding)
        }
    }
}