package com.albion.lists.removeDup;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;
import com.albion.core.Utils;

public class RemoveDupListTest {
    @DataProvider(name = "data01")
    public Object[][] data() {
        Integer[] i1 = {1,2};
        ListNode l1 = Utils.generateList(i1);


        return new Object[][] {  {l1} };
    }

    @Test(dataProvider = "data01")
    public void deleteDuplicatesTest2(ListNode head) {
      Solution2 s = new Solution2();
      ListNode h = s.deleteDuplicates(head);
      Utils.print(h);
    }
}
