package RequiredTasks._5kyu.Task7;

import java.util.List;

public class PaginationHelper<I> {

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  private List<I> collection;
  private int itemsPerPage;
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
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
    int s = 0;
    if (collection.size() % itemsPerPage != 0)
      s = 1;
    return collection.size() / itemsPerPage + 1;
  }

  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    if (pageIndex < pageCount() - 1){
      return itemsPerPage;
    } else if (pageIndex == pageCount() - 1){
      return itemCount() % itemsPerPage;
    } else
      return -1;
  }
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    if (itemIndex  >= itemCount() || itemIndex < 0)
      return -1;
    else
      return itemIndex / itemsPerPage;
  }
}