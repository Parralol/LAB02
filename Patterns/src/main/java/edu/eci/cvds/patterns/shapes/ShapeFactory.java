package edu.eci.cvds.patterns.shapes;

import javax.lang.model.element.QualifiedNameable;

import edu.eci.cvds.patterns.shapes.RegularShapeType;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    
    public static Shape create(RegularShapeType type){

        switch(type){

            case Triangle :
            return new Triangle()

            ;

            case Quadrilateral:
            return new Quadrilateral()
            ;

            case Pentagon:
            return new Pentagon();

            case Hexagon:
            return new Hexagon();
            ;
        }
        
    }
}
