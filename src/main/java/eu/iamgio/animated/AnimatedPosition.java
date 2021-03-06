package eu.iamgio.animated;

import eu.iamgio.animated.property.DoublePropertyWrapper;
import javafx.scene.Node;

/**
 * Node that animates its child's translate X and Y.
 * @author Giorgio Garofalo
 */
public class AnimatedPosition extends AnimatedMulti {

    public AnimatedPosition(Node child) {
        super(child, new DoublePropertyWrapper(child.translateXProperty()), new DoublePropertyWrapper(child.translateYProperty()));
    }
}
