import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class PaginationHelperTest {

    @Test
    public void testItemCountNullCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(null, 4);
        assertEquals("items count for null collection", 0, helper.itemCount());
    }

    @Test
    public void testItemCountEmptyCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Collections.emptyList(), 4);
        assertEquals("items count for empty collection", 0, helper.itemCount());
    }

    @Test
    public void testItemCount() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals("items count for non empty collection", 6, helper.itemCount());
    }

    @Test
    public void testPageCountNullCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(null, 4);
        assertEquals("page count for null collection", 0, helper.pageCount());
    }

    @Test
    public void testPageCountEmptyCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Collections.emptyList(), 4);
        assertEquals("page count for empty collection", 0, helper.pageCount());
    }

    @Test
    public void testPageCountNonEmptyCollectionAndItemsPerPageBiggerThanCollectionSize() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 7);
        assertEquals("page count for non empty collection and itemsPerPage > collection size", 1, helper.pageCount());
    }

    @Test
    public void testPageCountNonEmptyCollectionAndItemsPerPageEqualsToCollectionSize() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 6);
        assertEquals("page count for non empty collection and itemsPerPage = collections size", 1, helper.pageCount());
    }

    @Test
    public void testPageCountNonEmptyCollectionAndItemsPerPageSmallerThanCollectionSize1() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals("page count for non empty collection and itemsPerPage (4) < collections size (6)", 2, helper.pageCount());
    }

    @Test
    public void testPageCountNonEmptyCollectionAndItemsPerPageSmallerThanCollectionSize2() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 2);
        assertEquals("page count for non empty collection and itemsPerPage (2) < collections size (6)", 3, helper.pageCount());
    }

    @Test
    public void testPageCountNonEmptyCollectionAndZeroItemsPerPage() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 0);
        assertEquals("page count for non empty collection and zero itemsPerPage", 0, helper.pageCount());
    }

    @Test
    public void testPageItemCountNullCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(null, 4);
        assertEquals("page item count for null collection", -1, helper.pageItemCount(0));
    }
}