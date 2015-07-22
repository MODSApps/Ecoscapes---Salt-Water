package org.example.ecoscapes;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import org.example.ecoscapes.R;

/**
 * Created by Roelle on 7/15/2015.
 */
@SuppressWarnings("deprecation")
public class Fish extends Activity {

    //the images to display
    Integer[] imageIDs = {
            R.drawable.blue_chromis,
            R.drawable.blue_tang,
            R.drawable.cuban_hog_fish,
            R.drawable.docto_fish,
            R.drawable.pork_fish,
            R.drawable.yellow_head_wrassse,
            R.drawable.slippery_dick,
            R.drawable.seargent_major,
            R.drawable.pufferfish,
            R.drawable.dogfish,
            R.drawable.dusky_damsel_fish,
            R.drawable.spanish_hog_fish,
            R.drawable.turtle1


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fish);
        // Note that Gallery view is deprecated in Android 4.1---
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Toast.makeText(getBaseContext(), "pic" + (position + 1) + " selected",
                //       Toast.LENGTH_SHORT).show();
                // display the images selected
                ImageView imageView = (ImageView) findViewById(R.id.image1);
                imageView.setImageResource(imageIDs[position]);
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        private int itemBackground;

        public ImageAdapter(Context c) {
            context = c;
            // sets a grey background; wraps around the images
            TypedArray a = obtainStyledAttributes(R.styleable.MyGallery);
            itemBackground = a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground, 0);
            a.recycle();
        }

        // returns the number of images
        public int getCount() {
            {
                return imageIDs.length;
            }
        }
        // returns the ID of an item

        public Object getItem(int position) {
            return position;
        }

        // returns the ID of an item
        public long getItemId(int position) {
            return position;
        }

        // returns an ImageView view
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imageIDs[position]);
            imageView.setLayoutParams(new Gallery.LayoutParams(100, 100));
            imageView.setBackgroundResource(itemBackground);
            return imageView;
        }
    }
}