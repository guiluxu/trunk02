package com.wavenet.ding.qpps.utils.photo.util;

import android.graphics.Bitmap;

import java.io.IOException;
import java.io.Serializable;


public class ImageItem implements Serializable {
    public String imageId;
    public String thumbnailPath;
    public String imagePath;
    public boolean isSelected = false;
    private Bitmap bitmap;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Bitmap getBitmap() {
        if (bitmap == null) {
            try {
                if (imagePath.contains("http://")) {
                    bitmap = Bimp.netPicToBmp(imagePath);
                } else {
                    bitmap = Bimp.revitionImageSize(imagePath);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }


}
