package Visitor.images;

import Visitor.visitors.ImageVisitor;

public class ImageJPEG implements Image {
    @Override
    public void accept(ImageVisitor visitor) {
        visitor.visit(this);
    }
}
