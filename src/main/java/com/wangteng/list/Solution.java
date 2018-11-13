package com.wangteng.list;

/**
 * @Auther: wangteng
 * @Date: 2018/11/12 19:02
 * @Description:
 */
public class Solution {


    /**
     * 1-2-3-null
     * <p>
     * 3-2-1-null
     *
     * @param head
     * @return
     */
    private static ListNode reverse(ListNode head) {
        ListNode pReversedHead = null; //反转过后的单链表存储头结点
        ListNode pNode = head; //定义pNode指向pHead;
        ListNode pPrev = null; //定义存储前一个结点
        while(pNode != null){
            ListNode pNext = pNode.next; //定义pNext指向pNode的下一个结点
            if(pNext==null){ //如果pNode的下一个结点为空，则pNode即为结果
                pReversedHead = pNode;
            }
            pNode.next = pPrev; //修改pNode的指针域指向pPrev
            pPrev = pNode; //将pNode结点复制给pPrev
            pNode = pNext; //将pNode的下一个结点复制给pNode
        }


        return pReversedHead;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        node.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode reverse = reverse(node);
        while (reverse != null){
            System.out.println(reverse.val);
            reverse = reverse.next;

        }
    }

}
