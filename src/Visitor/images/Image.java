package Visitor.images;

import Visitor.visitors.ImageVisitor;

public interface Image {
    void accept(ImageVisitor visitor);
}
