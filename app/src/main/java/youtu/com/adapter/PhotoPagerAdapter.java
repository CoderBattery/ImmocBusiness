package youtu.com.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import androidx.viewpager.widget.PagerAdapter;

import com.youdu.vuandroidadsdk.okhttp.adutils.ImageLoaderUtil;

import java.util.ArrayList;


/**
 * Created by renzhiqiang on 16/8/31.
 */
public class PhotoPagerAdapter extends PagerAdapter {

    private Context mContext;

    private boolean mIsMatch;
    private ArrayList<String> mData;
    private ImageLoaderUtil mLoader;

    public PhotoPagerAdapter(Context context, ArrayList<String> list, boolean isMatch) {
        mContext = context;
        mData = list;
        mIsMatch = isMatch;
        mLoader = ImageLoaderUtil.getInstance(mContext);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public View instantiateItem(ViewGroup container, int position) {
        ImageView photoView;
//        if (mIsMatch) {
            photoView = new ImageView(mContext);
            photoView.setScaleType(ScaleType.FIT_XY);
//            photoView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(mContext,
//                            CourseDetailActivity.class);
//                    mContext.startActivity(intent);
//                }
//            });
//        } else {
//            photoView = new PhotoView(mContext);
//        }
        mLoader.displayImage(photoView, mData.get(position));
        container.addView(photoView, LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        return photoView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
