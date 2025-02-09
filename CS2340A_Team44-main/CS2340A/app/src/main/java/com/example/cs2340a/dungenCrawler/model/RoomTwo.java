package com.example.cs2340a.dungenCrawler.model;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Parcel;

import com.example.cs2340a.R;

public class RoomTwo extends Room {

    public RoomTwo(int initialPlayerX, int initialPlayerY, Background bg, int roomID) {
        super(initialPlayerX, initialPlayerY, bg, 2);
    }

    protected RoomTwo(Parcel in) {
        super(in);
    }


    public static final Creator<RoomTwo> CREATOR = new Creator<RoomTwo>() {
        @Override
        public RoomTwo createFromParcel(Parcel in) {
            return new RoomTwo(in);
        }

        @Override
        public RoomTwo[] newArray(int size) {
            return new RoomTwo[size];
        }
    };

    @Override
    public void draw(Canvas canvas, Resources resources) {
        /*
        super.setCollisionMap(new CollisionMap(1));
         */
        super.getBackground().createBitmap(super.getBackground().getPoint(), resources,
                R.drawable.room2);
        super.getCollisionMap().draw(canvas, resources);
        super.getBackground().draw(canvas, resources);
    }
}
