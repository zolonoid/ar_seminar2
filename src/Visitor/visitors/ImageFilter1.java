package Visitor.visitors;

import Visitor.images.ImageJPEG;
import Visitor.images.ImagePNG;
import Visitor.images.ImageWEBP;

public class ImageFilter1 implements ImageVisitor {
    @Override
    public void visit(ImageJPEG image) {
        // Применяем фильтр для формата JPEG.
    }

    @Override
    public void visit(ImagePNG image) {
        // Применяем фильтр для формата PNG.
    }

    @Override
    public void visit(ImageWEBP image) {
        // Применяем фильтр для формата WEBP.
    }
}
