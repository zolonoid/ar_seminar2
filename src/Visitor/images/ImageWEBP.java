package Visitor.images;

import Visitor.visitors.ImageVisitor;

public class ImageWEBP implements Image {
    @Override
    public void accept(ImageVisitor visitor) {
        visitor.visit(this);
    }
}
