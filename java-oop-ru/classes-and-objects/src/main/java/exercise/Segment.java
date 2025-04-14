package exercise;

// BEGIN
public class Segment {

    private final Point beginPoint;
    private final Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        int midX = (beginPoint.getX() + endPoint.getX());
        int midY = (beginPoint.getY() + endPoint.getY());
        return new Point(midX, midY);
    }
}
// END
