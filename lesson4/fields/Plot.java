// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that Sara developed, compute
        // the total number of rows, then
        int rows = (int)((length - (radius * 2))/(radius * Math.sqrt(3)) + 1);
        // the number of even and odd rows,
        int oddRows = ((rows) / 2) + (rows % 2);
        int evenRows = rows / 2;
        // the number of columns in each even and odd row,
        int oddColumns = width / (2 * radius);
        int evenColumns = (width - radius) / (2 * radius);
        // and finally the total number of fields
        return( (oddRows * oddColumns) + (evenRows * evenColumns));
    }
}
