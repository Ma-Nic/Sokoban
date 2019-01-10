package sokoban;

import java.awt.*;
import java.util.Iterator;


public class Grid implements Iterable {

    private MapElement[][] objectItems;  //Multiarray that sets up grid with the map elements.
    final int COLUMNS;  //Constant number of columns in grid
    final int ROWS;  //Constant number of rows in grid

  
    public Grid(int columns, int rows) {
    	/**
    	 * Set up the grid with parameters column and row setting the size.
    	 */
        COLUMNS = columns;  //initialise the columns int
        ROWS = rows; //initialise the row int
        objectItems = new MapElement[COLUMNS][ROWS];  //initialise the grid multiarray
    }

 
    static Point objectPoint(Point sourceLocation, Point delta) {
    	/**
    	 * Returns point from a starting object.
    	 */
        Point objectsPoint = new Point(sourceLocation);
        objectsPoint.translate((int) delta.getX(), (int) delta.getY());
        return objectsPoint;  //Returns the point from source
    }


    public Dimension getDimension() {
        return new Dimension(COLUMNS, ROWS);  //Returns grid size as a dimension
    }


    MapElement getObjectSource(Point source, Point delta) {
        return getObjectAt(objectPoint(source, delta)); //Gets the Object from MapElements class at a delta from the origin point.
    }


    public MapElement getObjectAt(int col, int row) throws ArrayIndexOutOfBoundsException {
        if (pointOutOfBounds(col, row)) {
            throw new ArrayIndexOutOfBoundsException(col+":"+row +"is outside the grid."); //Throws an exception when co-ords are not in grid.
        }

        return objectItems[col][row];  //Returns the x,y co-ordinates to the multi array.
    }



    public MapElement getObjectAt(Point p) {
        if (p == null) {
            throw new IllegalArgumentException("Null point.");
        }

        return getObjectAt((int) p.getX(), (int) p.getY());  //Returns the object item at the point where it is.
    }

   
    public boolean removeObjectAt(Point position) {
        return objectPlace(null, position);  //Removes object item from the grid.
    }



    public boolean objectPlace(MapElement itemObject, int x, int y) {
        if (pointOutOfBounds(x, y)) {
            return false;  //If object is not found at point x,y then return false
        }
        
        //Puts the objects into their locations on the grid.
        objectItems[x][y] = itemObject;
        return objectItems[x][y] == itemObject;
    }

  
    public boolean objectPlace(MapElement itemObject, Point p) {
        return p != null && objectPlace(itemObject, (int) p.getX(), (int) p.getY());  //Places objects at specified point.
    }

  
    private boolean pointOutOfBounds(int x, int y) {
        return (x < 0 || y < 0 || x >= COLUMNS || y >= ROWS);
        //checks to see if the point is outside the grid using x,y co-ords.
    }


    private boolean pointOutOfBounds(Point p) {
        return pointOutOfBounds(p.x, p.y);  //checks if point is outside of grid.
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(objectItems.length);

        for (MapElement[] itemObject : objectItems) {
            for (MapElement aGameObject : itemObject) {
                if (aGameObject == null) {
                    aGameObject = MapElement.DEBUG_OBJECT;
                }
                sb.append(aGameObject.getCharSymbol());
            }

            sb.append('\n');
        }

        return sb.toString();
    }


    @Override
    public Iterator<MapElement> iterator() {
        return new GridIterator();  //Returns an iterator
    }

    
    /**
     * Makes the interface for the grid. Assures that game objects are concurrent with the level in the grid.
     *
     */
    
    public class GridIterator implements Iterator<MapElement> {
        int row = 0;
        int column = 0;

        @Override
        public boolean hasNext() {
            return !(row == ROWS && column == COLUMNS);
        }

        @Override
        public MapElement next() {
            if (column >= COLUMNS) {
                column = 0;
                row++;
            }
            return getObjectAt(column++, row);
        }
    }
}