package Visitor.visitors;

import Visitor.images.ImageJPEG;
import Visitor.images.ImagePNG;
import Visitor.images.ImageWEBP;

public interface ImageVisitor {
    void visit(ImageJPEG image);
    void visit(ImagePNG image);
    void visit(ImageWEBP image);
}
