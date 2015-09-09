import java.util.Collections;
import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {

        this.collection = collection == null ? Collections.<I>emptyList() : collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return itemsPerPage == 0 ? 0 : (int) Math.ceil(itemCount() * 1.00 / itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex > pageCount() - 1){
            return -1;
        }
        return itemCount() - pageIndex * itemsPerPage > itemsPerPage ? itemsPerPage : itemCount() - pageIndex * itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex > itemCount() -1) {
            return -1;
        }
        return itemsPerPage == 0 ? -1 :itemIndex / itemsPerPage;
    }
}