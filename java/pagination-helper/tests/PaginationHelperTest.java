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

    @Test
    public void testPageItemCountEmptyCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Collections.emptyList(), 4);
        assertEquals("page item count for empty collection", -1, helper.pageItemCount(0));
    }

    @Test
    public void testPageItemCountZeroItemsPerPage() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 0);
        assertEquals("page item count for zero items per page", -1, helper.pageItemCount(0));
    }

    @Test
    public void testPageItemCountNonEmptyCollectionItemsPerPageBiggerThanCollectionSize() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 7);
        assertEquals("0 page item count for non empty collection & itemsPerPage > collection size", 6, helper.pageItemCount(0));
        assertEquals("1 page item count for non empty collection & itemsPerPage > collection size", -1, helper.pageItemCount(1));
    }

    @Test
    public void testPageItemCountNonEmptyCollectionItemsPerPageEqualsToCollectionSize() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 6);
        assertEquals("0 page item count for non empty collection & itemsPerPage == collection size", 6, helper.pageItemCount(0));
        assertEquals("1 page item count for non empty collection & itemsPerPage == collection size", -1, helper.pageItemCount(1));
    }

    @Test
    public void testPageItemCountNonEmptyCollectionItemsPerPageSmallerThanCollectionSize() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals("0 page item count for non empty collection & itemsPerPage == collection size", 4, helper.pageItemCount(0));
        assertEquals("1 page item count for non empty collection & itemsPerPage == collection size", 2, helper.pageItemCount(1));
        assertEquals("2 page item count for non empty collection & itemsPerPage == collection size", -1, helper.pageItemCount(2));
    }

    @Test
    public void testPageItemCountNonEmptyCollectionNegativeIndex() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals("0 page item count for non empty collection & negative index", -1, helper.pageItemCount(-1));
    }

    @Test
    public void testPageIndexNullCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(null, 4);
        assertEquals("page index for null collection", -1, helper.pageIndex(0));
    }

    @Test
    public void testPageIndexEmptyCollection() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Collections.emptyList(), 4);
        assertEquals("page index for empty collection", -1, helper.pageIndex(0));
    }

    @Test
    public void testPageIndexNonEmptyCollectionZeroItemsPerPage() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 0);
        assertEquals("page index for empty collection && zero itemsPerPage", -1, helper.pageIndex(0));
    }

    @Test
    public void testPageIndexNonEmptyCollectionItemsPerPageBiggerThanCollectionSize() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 7);
        assertEquals("0 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(0));
        assertEquals("1 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(1));
        assertEquals("2 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(2));
        assertEquals("3 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(3));
        assertEquals("4 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(4));
        assertEquals("5 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(5));
    }

    @Test
    public void testPageIndexNonEmptyCollectionIndexOutOfRange() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 7);
        assertEquals("-1 page index for non empty collection && itemsPerPage > collection size", -1, helper.pageIndex(-1));
        assertEquals("6  page index for non empty collection && itemsPerPage > collection size", -1, helper.pageIndex(6));
    }

    @Test
    public void testPageIndexNonEmptyCollectionItemsPerPageEqualToCollectionSize() throws Exception {
        PaginationHelper helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 6);
        assertEquals("0 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(0));
        assertEquals("1 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(1));
        assertEquals("2 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(2));
        assertEquals("3 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(3));
        assertEquals("4 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(4));
        assertEquals("5 page index for non empty collection && itemsPerPage > collection size", 0, helper.pageIndex(5));
    }
}