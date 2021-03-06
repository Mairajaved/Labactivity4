package com.company;

public class Quadrilateral {{
    Point point1; // first endpoint
    Point point2; // second endpoint
    Point point3; // third endpoint
    Point point4; // fourth endpoint

    // eight-argument constructor
          double x1; double y1;double x2;double y2;
    double x3;double y3; double x4; double y4;
    { point1 = new Point( x1, y1 );
        point2 = new Point( x2, y2 );
        point3 = new Point( x3, y3 );
        point4 = new Point( x4, y4 );
    } // end eight-argument Quadrilateral constructor
    // return point1
    public Point getPoint1()
    {
        return point1;
    } // end method getPoint1
    // return point2
    public Point getPoint2()
    {
        return point2;
    } // end method getPoint2
    // return point3
    public Point getPoint3()
    {
        return point3;
    } // end method getPoint3
    // return point4
    public Point getPoint4()
    {
        return point4;
    } // end method getPoint4
    // return string representation of a Quadrilateral object
    public String toString()
    {
        return String.format( "%s:\n%s", "Coordinates of Quadrilateral are", getCoordinatesAsString() );
    } // end method toString

    // return string containing coordinates as strings
    public String getCoordinatesAsString()
    {
        return String.format("%s, %s, %s, %s\n", point1, point2, point3, point4 );
    } // end method getCoordinatesAsString
} // end class Quadrilateral




