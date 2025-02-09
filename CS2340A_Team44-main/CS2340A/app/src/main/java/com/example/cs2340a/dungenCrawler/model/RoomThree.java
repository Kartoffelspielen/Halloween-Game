package com.example.cs2340a.dungenCrawler.model;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Parcel;

import com.example.cs2340a.R;

public class RoomThree extends Room {
    public RoomThree(int initialPlayerX, int initialPlayerY, Background bg, int roomID) {
        super(initialPlayerX, initialPlayerY, bg, 3);
    }

    protected RoomThree(Parcel in) {
        super(in);
    }


    public static final Creator<RoomThree> CREATOR = new Creator<RoomThree>() {
        @Override
        public RoomThree createFromParcel(Parcel in) {
            return new RoomThree(in);
        }

        @Override
        public RoomThree[] newArray(int size) {
            return new RoomThree[size];
        }
    };

    @Override
    public void draw(Canvas canvas, Resources resources) {
        /*
        super.setCollisionMap(new CollisionMap(1));
         */
        super.getBackground().createBitmap(super.getBackground().getPoint(), resources,
                R.drawable.room3);
        super.getCollisionMap().draw(canvas, resources);
        super.getBackground().draw(canvas, resources);
    }
}
